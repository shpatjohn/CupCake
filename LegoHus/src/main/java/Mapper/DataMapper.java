/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import DB.DBconnector;
import Data.PlaceAnOrder;
import Data.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author shpattt
 */
public class DataMapper {
    private DBconnector connector;
    
    
    public User getInfo(String e) {
        int userid = 0;
        String email = "";
        String password = "";
        try {
            this.connector = new DBconnector();
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE email = '" + e + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                userid = rs.getInt("userid");
                email = rs.getString("email");
                password = rs.getString("password");
                

            }
        } catch (Exception ex) {
        }
        return new User(userid, email, password);

    }
        public void insertUser(String email, String password) {
        try {
            DBconnector connection = new DBconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "INSERT INTO user"
                    + "(email, password) "
                    + "values" + "('" + email + "'," + "'" + password + "');";

            stmt.executeUpdate(query);
        } catch (Exception e) {
        }

    }
        public void createOrder(int user_id, int height, int width, int length) {
        try {
            DBconnector connection = new DBconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "INSERT INTO orders"
                    + "(user_id, height, width, length) "
                    + "values" + "('" + user_id + "','" + height + "','" + width + "','" + length + "');";

            stmt.executeUpdate(query);
        } catch (Exception e) {
        }
    }
        public ArrayList<PlaceAnOrder> getOrders(int user_id){
        ArrayList<PlaceAnOrder> orders = new ArrayList<PlaceAnOrder>(); //String query = "SELECT * FROM `orders` WHERE user_id = ? ORDER BY id DESC";

        try {
            DBconnector connection = new DBconnector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "Select * from orders WHERE user_id =" +  user_id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            
          
            int height = 0;
            int width = 0;
            int length = 0;

            while (rs.next()) {
                height = rs.getInt("height");
                width = rs.getInt("width");
                length = rs.getInt("length");
                orders.add(new PlaceAnOrder(height, width, length));
            }

        }
        }catch (Exception e) {
            
        }
       
        return orders;
    

        }
}

