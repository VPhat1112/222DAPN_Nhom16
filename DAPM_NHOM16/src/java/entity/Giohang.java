/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class Giohang {
    private int AccountID;
    private int productID;
    private long cartID;
    private int Amount;
    private int Number;

    public Giohang() {
    }

    public Giohang(int AccountID, int productID, long cartID, int Amount, int Number) {
        this.AccountID = AccountID;
        this.productID = productID;
        this.cartID = cartID;
        this.Amount = Amount;
        this.Number = Number;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
    
    
    
}
