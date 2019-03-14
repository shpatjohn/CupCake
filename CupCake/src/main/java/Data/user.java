package Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shpattt
 */
public class user {
    private int iduser;
    private String username;
    private String password;
    private int balance;
    

    @Override
    public String toString() {
        return "user{" + "iduser=" + iduser + ", username=" + username + ", password=" + password + ", balance=" + balance + '}';
    }

    /**
     * get a username.
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set a username.
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get a password.
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set a password.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get a balance.
     * @return
     */
    public int getBalance() {
        return balance;
    }

    /**
     * set a balance.
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * constructor. User has an id, username, password and a balance
     * @param iduser
     * @param username
     * @param password
     * @param balance
     */
    public user(int iduser,String username, String password, int balance) {
        this.iduser = iduser;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public int getUser_id() {
        return iduser;
    }

    /**
     *
     * @param iduser
     */
    public void setUser_id(int iduser) {
        this.iduser = iduser;
    }
    
}
