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
}
