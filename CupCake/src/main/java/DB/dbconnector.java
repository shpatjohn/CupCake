 package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author shpattt
 */
public class dbconnector {

    private Connection connection = null;
	
    private static final String IP = "127.0.0.1";
    private static final String PORT = "3306";

    /**
     * "DATABASE" which database to connect.
     * "USERNAME" username of the owner.
     * "password" password of the owner.
     */
    public static final String DATABASE = "cupcake";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "johnjohn";

    /**
     * Connecting magic.
     * @throws SQLException
     */
    public dbconnector() throws SQLException {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        Properties props = new Properties();
        props.put("user", USERNAME);
        props.put("password", PASSWORD);
        props.put("allowMultiQueries", true);
        props.put("useUnicode", true);
        props.put("useJDBCCompliantTimezoneShift", true);
        props.put("useLegacyDatetimeCode", false);
        props.put("serverTimezone", "CET");
        this.connection = DriverManager.getConnection(url, props);
        System.out.println("Connection correctly established to the database: " + DATABASE);
    }
     catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }
     }
     
    /**
     * 
     * @return
     */
    public Connection getConnection() {
        return this.connection;
    }
}
    
