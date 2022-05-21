/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_system;

/**
 *
 * @author NOOR ALJUBEH + MAI HASHLAMOON + HALA ABU SHARCK
 */
public class Account extends Bank {

    private String name;
    private double balance;
    private int card;
    private String exp;
    private String pass;

    /**
     * @constructor default
     */
    public Account(){
        super();
        this.name = "";
        this.balance = 40;
        this.card = 0;
        this.exp = "";
        this.pass = "";
    }

    /**
     * @constructor with specified values
     */
    public Account(String name,double balance, int card, String exp, String pass){

        this.name = name;
        this.balance = balance;
        this.card = card;
        this.exp = exp;
        this.pass = pass;
    }

    /**
     * @return name of customer
     */
    public String getName(){

        return name;
    }

    /**
     * @return card number
     */
    public int getCardNum(){

        return card;
    }

    /**
     *@return expiration date
     */
    public String getExpDate(){

        return exp;
    }

    /**
     * @return password
     */
    public String getPassword(){

        return pass;
    }

    /**
     *@param balance money in account
     *@precondition balance > 0
     *@postcondition new balance for account
     */
    public void setBalance(double balance){

        this.balance = balance;

    }


    /**
     * @return balance
     */
    public double getBalance(){

        return balance;
    }

    /**
     * @return String combined of account info
     */
    public String toString(){
        return String.format("Customer: Name: %s  Card: %s Expiration Date:%s Password:%s", getName(), getCardNum(), getExpDate(), getPassword());
    }

}
