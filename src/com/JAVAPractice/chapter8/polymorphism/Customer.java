package com.JAVAPractice.chapter8.polymorphism;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        initCustomer();
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }

    public String getCustomerName() {
        return customerName;
    }

    public int setcustomerID(int customerID) {
        this.customerID = customerID;
        return customerID;
    }

    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return  customerName;
    }
}
