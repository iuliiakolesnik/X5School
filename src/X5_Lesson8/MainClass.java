package X5_Lesson8;
/*
import java.io.IOException;

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
}*/

//STEP 1. Import required packages

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public class MainClass {

    //  Database credentials


    public static void main(String[] argv) throws SQLException {

      /*  try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }*/

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


       /* String table = "Account";
        String dbUrl = "jdbc:postgresql://localhost/Account";
        String user = "postgres";
        String pass = "Pummel!1";

        AccountServiceImpl accountService = new AccountServiceImpl(dbUrl, user, pass);
        accountService.printInfo();

        try {
            accountService.operation();
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }*/
    }
}