package X5_Lesson7;

import java.io.IOException;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        int accountId, amount;
        String fileInfo = "./src/resources/accountInfo";

        AccountServiceImpl accountService = new AccountServiceImpl(fileInfo);

        ArrayList<Account> accountArrayList = accountService.getAccountList();

        for (Account account : accountArrayList) {
            account.printInfo();
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter operation: ");
        String operation = reader.nextLine();
        try {
            switch (operation) {
                case "balance":
                    System.out.println("Enter accountID: ");
                    accountId = reader.nextInt();
                    accountService.balance(accountId);
                    break;
                case "withdraw":
                    System.out.println("Enter accountID and Amount ");
                    accountId = reader.nextInt();
                    amount = reader.nextInt();
                    accountService.withdraw(accountId, amount);
                    accountService.balance(accountId);
                    break;
                case "deposit":
                    System.out.println("Enter accountID and Amount ");
                    accountId = reader.nextInt();
                    amount = reader.nextInt();
                    accountService.deposit(accountId, amount);
                    accountService.balance(accountId);
                    break;
                case "transfer":
                    System.out.println("Enter accountID from and account to and Amount ");
                    int accountIdFrom = reader.nextInt();
                    int accountIdTo = reader.nextInt();
                    amount = reader.nextInt();
                    accountService.transfer(accountIdFrom, accountIdTo, amount);
                    accountService.balance(accountIdFrom);
                    accountService.balance(accountIdTo);
                    break;
                default:
                    System.out.print("Вы допустили ошибку при вводе знака операции, попробуйте еще раз. ");
            }
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

