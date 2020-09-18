package X5_Lesson7;

import java.util.*;
import java.io.*;

public class AccountServiceImpl implements AccountService {

    private ArrayList<Account> accountList = new ArrayList<Account>();

    public AccountServiceImpl(String file) throws IOException {
        File f = new File(file);
        BufferedReader reader = new BufferedReader(new FileReader(f));

        String bufLine;

        while ((bufLine = reader.readLine()) != null) {
            String[] accountInfo = bufLine.split("\n");
            for (String line : accountInfo) {
                String[] accountSubInfo = line.split(",");
                this.accountList.add(new Account(Integer.parseInt(accountSubInfo[0]), accountSubInfo[1], Integer.parseInt(accountSubInfo[2])));
            }
        }
    }

    public ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    public void printInfo() {
        for (Account account : this.accountList) {
            account.printInfo();
        }
    }

    public boolean checkAccount(int accountId) {
        boolean finded = false;
        for (Account account : this.accountList) {
            if (account.getId() == accountId) {
                finded = true;
            }
        }
        return finded;
    }

    public int getBalance(int accountId) {
        int balance = 0;
        for (Account account : this.accountList) {
            if (account.getId() == accountId) {
                balance = account.getAmount();
            }
        }
        return balance;
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (!checkAccount(accountId) || getBalance(accountId) - amount < 0) {
            if (!checkAccount(accountId)) {
                throw new UnknownAccountException("Unknown holder");
            } else {
                throw new NotEnoughMoneyException("Not Enough Money");
            }
        } else {
            for (Account account : accountList) {
                if (account.getId() == accountId) {
                    account.setAmount(account.getAmount() - amount);
                }
            }
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        if (!checkAccount(accountId)) {
            throw new UnknownAccountException("Unknown holder");
        } else {
            for (Account account : this.accountList) {
                if (account.getId() == accountId) {
                    System.out.println("Balance for holder " + account.getHolder() + " is " + account.getAmount());
                }
            }
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (!checkAccount(accountId) || amount == 0) {
            if (!checkAccount(accountId)) {
                throw new UnknownAccountException("Unknown holder");
            } else {
                throw new NotEnoughMoneyException("Not Enough Money");
            }
        } else {
            for (Account account : accountList) {
                if (account.getId() == accountId) {
                    account.setAmount(account.getAmount() + amount);
                }
            }
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        withdraw(from, amount);
        deposit(to, amount);
    }

    public void operation() throws NotEnoughMoneyException, UnknownAccountException {
        int accountId, amount;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter operation (balance, withdraw, deposit, transfer): ");
        String operation = reader.nextLine();

        switch (operation) {
            case "balance":
                System.out.println("Enter accountID: ");
                accountId = reader.nextInt();
                balance(accountId);
                break;
            case "withdraw":
                System.out.println("Enter accountID and Amount ");
                accountId = reader.nextInt();
                amount = reader.nextInt();
                withdraw(accountId, amount);
                balance(accountId);
                break;
            case "deposit":
                System.out.println("Enter accountID and Amount ");
                accountId = reader.nextInt();
                amount = reader.nextInt();
                deposit(accountId, amount);
                balance(accountId);
                break;
            case "transfer":
                System.out.println("Enter accountID from and account to and Amount ");
                int accountIdFrom = reader.nextInt();
                int accountIdTo = reader.nextInt();
                amount = reader.nextInt();
                transfer(accountIdFrom, accountIdTo, amount);
                balance(accountIdFrom);
                balance(accountIdTo);
                break;
            default:
                System.out.println("Please try again. We don't recognize operation.");
                operation();
        }

    }
}
