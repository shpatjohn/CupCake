package Data.Mappers;


import Logic.Exceptions.LoginException;
import Data.User;
import DB.Connector;
import DB.DBConnector;
import Data.Carport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Younes
 */
public class UserMapper {
      private Connector connector;
   
    
    public User getUser(String email) throws SQLException {
        
        
        String email_ = "";
        String password = "";
        String role = "";

        try {
            PreparedStatement statement = DBConnector.connection().prepareStatement(email);
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE email = '" + email + "';";
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                email_ = rs.getString("email");
                password = rs.getString("password");
                role = rs.getString("role");
            }
            
        } catch (Exception e) {
        }
        return new User(email_,password, role);
    }
    
    
    public static void createUser( User user ) throws LoginException, ClassNotFoundException {
       try {
            String SQL = "";
            PreparedStatement statement = DBConnector.connection().prepareStatement(user.getEmail());
            String role = user.getRole();
            String query = "";
            if(role.equalsIgnoreCase("customer"))
            query
                    = "INSERT INTO user(username, password, email, role) "
                    + "VALUES ('" + user.getPassword() + "', " + user.getEmail() + ", customer);";
            statement.executeUpdate(query);
            
            if(role.equalsIgnoreCase("employee"))
            query
                    = "INSERT INTO user(username, password, email, role) "
                    + "VALUES ('" + user.getPassword() + "', " + user.getEmail() + ", employee);";
            statement.executeUpdate(query);
            

        } catch (SQLException e) {
        }
    }

    public static User loginUser( String email, String password ) throws LoginException {
        try {
            Connection con = DBConnector.connection();
            String SQL = "SELECT role, role FROM user "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String e = rs.getString("email");
                String role = rs.getString( "role" );
       
                
                User user = new User(email, password,role);
               
                return user;
            } else {
                throw new LoginException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginException(ex.getMessage());
        }
    }
    public User getInfo(String e) {
        
        String email = "";
        String password = "";
        String role = "";
        try {
            this.connector = new Connector();
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE email = '" + e + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
             
                email = rs.getString("email");
                password = rs.getString("password");
                role = rs.getString("role");
                

            }
        } catch (Exception ex) {
        }
        return new User(email, password,role);

    }
        public void insertUser(String email, String password) {
        try {
            Connector connection = new Connector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "INSERT INTO user"
                    + "(email, password) "
                    + "values" + "('" + email + "'," + "'" + password + "');";

            stmt.executeUpdate(query);
        } catch (Exception e) {
        }

    }
       public ArrayList<Carport> getShit() {
        ArrayList<Carport> carlist = new ArrayList<>();
        try {
            Connector connection = new Connector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "Select * from carport;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                //Carport car = new Carport(rs.getInt("length"), rs.getInt("width"), rs.getString("roofstyle"), rs.getInt("incline"));
               // carlist.add(car);

            }

        } catch (Exception e) {
        }

        System.out.println(Arrays.toString(carlist.toArray()));
        return carlist;
    }
       
       public static void main(String[] args) {
       
      
      
    }
    }
