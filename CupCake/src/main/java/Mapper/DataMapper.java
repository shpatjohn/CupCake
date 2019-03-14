package Mapper;

import DB.dbconnector;
import Data.user;
import Data.topping;
import Data.Bottom;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shpattt
 */
public class DataMapper {

    private dbconnector connector;

    /**
     * Get all the info from a specific user by using a string user to find the username of the user.
     * @param user
     * @return
     */
    public user getInfo(String user) {
        int iduser = 0;
        String username = "";
        String password = "";
        int balance = 0;
        try {
            this.connector = new dbconnector();
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE username = '" + user + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                iduser = rs.getInt("iduser");
                username = rs.getString("username");
                password = rs.getString("password");
                balance = rs.getInt("balance");

            }
        } catch (Exception e) {
        }
        return new user(iduser, username, password, balance);

    }

    /**
     * insert a user to the database.
     * @param username
     * @param password
     * @param balance
     */
    public void insertUser(String username, String password, int balance) {
        try {
            dbconnector connection = new dbconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "INSERT INTO user"
                    + "(username, password, balance) "
                    + "values" + "('" + username + "'," + "'" + password + "'," + "'" + balance + "');";

            stmt.executeUpdate(query);
        } catch (Exception e) {
        }

    }

    /**
     * get all the bottoms and prices into an arraylist.
     * @return
     */
    public ArrayList<Bottom> getBottom() {
        ArrayList<Bottom> bottomlist = new ArrayList<>();
        try {
            dbconnector connection = new dbconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "Select * from Bottoms;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Bottom b = new Bottom(rs.getString("bottom"), rs.getInt("price"));
                bottomlist.add(b);

            }

        } catch (Exception e) {
        }

        System.out.println(Arrays.toString(bottomlist.toArray()));
        return bottomlist;
    }

    /**
     * get all the toppings and prices into an arraylist.
     * @return
     */
    public ArrayList<topping> getTopping() {
        ArrayList<topping> toppinglist = new ArrayList<>();
        try {
            dbconnector connection = new dbconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "Select * from toppings;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                topping t = new topping(rs.getString("topping"), rs.getInt("price"));
                toppinglist.add(t);

            }

        } catch (Exception e) {
        }

        System.out.println(Arrays.toString(toppinglist.toArray()));
        return toppinglist;
    }

    /**
     * get a specific bottom.
     * @param bottom
     * @return
     */
    public Bottom getBot(String bottom) {
        String f = "";
        int p = 0;
        Bottom b = null;
        try {
            this.connector = new dbconnector();
            String query
                    = "SELECT * "
                    + "FROM Bottoms "
                    + "WHERE bottom = '" + bottom + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {

                f = rs.getString("bottom");
                p = rs.getInt("price");
            }
        } catch (Exception e) {
        }
        return new Bottom(f,p);
    }
    
    /**
     * get a specific topping.
     * @param topping
     * @return
     */
    public topping getTop(String topping) {
        String f = "";
        int p = 0;
        try {
            this.connector = new dbconnector();
            String query
                    = "SELECT * "
                    + "FROM toppings "
                    + "WHERE topping = '" + topping + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                f = rs.getString("topping");
                p = rs.getInt("price");
            }
        } catch (Exception e) {
        }
        return new topping(f,p);
    }

    /**
     * set a balance of a user.
     * @param b
     * @param username
     * @return
     */
    public int setBala(int b, String username) {
        
        int bala = 0;
        try {
            this.connector = new dbconnector();
            String query
                    = "UPDATE user "
                    + "SET balance = " + b + " WHERE username='" + username +"';"; 
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);

           
        } catch (Exception e) {
        }
        return bala;
    }

}
