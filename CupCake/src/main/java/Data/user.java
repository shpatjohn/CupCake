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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public user(int iduser,String username, String password, int balance) {
        this.iduser = iduser;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public int getUser_id() {
        return iduser;
    }

    public void setUser_id(int iduser) {
        this.iduser = iduser;
    }
    
}
