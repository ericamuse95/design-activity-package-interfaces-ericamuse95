package com.kenzie.app;

/* Define your objects here
Interfaces:
* Customer
* Payment

Abstract Classes:
* OrderSystem
* Order
* Menu
* MenuItem

 */

import java.awt.*;
import java.util.ArrayList;

interface Customer {
    void createProfile(String userID);
    void updateProfile(String userID);
    void login(String userID, String password);
}

interface Payment{
    private void confirmPayment(double total){};
    private void printReceipt(){};
}

//abstract class OrderSystem
abstract class OrderSystem{
    //properties
    public ArrayList<Menu> menuList;
    public String paymentOption;
    public String currentOrder;
    public String currentCustomer;

    //abstract methods
    public abstract void selectMenu(String menu);
    public abstract void makePayment(Order order);
}

abstract class Order{
    public ArrayList<MenuItem> items;
    public double total;
    public String status;

    //abstract methods
    public abstract void addItem(int itemID);
    public abstract void removeItem(int itemID);
    public abstract double getTotal();

}

abstract class Menu{
    public String name;
    public ArrayList<MenuItem> items;

    //abstract methods
    public abstract void displayMenu();
    public abstract void addItem(int itemID);
    public abstract void removeItem(int itemID);

}
abstract class MenuItem{
    private int itemID;
    private String name;
    private double price;
    private String availability;

    //abstract methods
    public abstract double getPrice();
    public abstract void setPrice(double price);
    public abstract void removeItem(int itemID);
}