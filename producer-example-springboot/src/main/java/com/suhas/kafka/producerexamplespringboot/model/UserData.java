package com.suhas.kafka.producerexamplespringboot.model;


public class UserData {
    private String customerName;
    private double amountDeposited;
    private double goldInGrams;

    public UserData(String customerName, double amountDeposited, double goldInGrams) {
        this.customerName = customerName;
        this.amountDeposited = amountDeposited;
        this.goldInGrams = goldInGrams;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmountDeposited() {
        return amountDeposited;
    }

    public void setAmountDeposited(double amountDeposited) {
        this.amountDeposited = amountDeposited;
    }

    public double getGoldInGrams() {
        return goldInGrams;
    }

    public void setGoldInGrams(double goldInGrams) {
        this.goldInGrams = goldInGrams;
    }
}
