package X5_Lesson7;

import java.io.IOException;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String fileInfo = "./src/resources/accountInfo";
        AccountServiceImpl accountService = new AccountServiceImpl(fileInfo);
        accountService.printInfo();
        try {
            accountService.operation();
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

