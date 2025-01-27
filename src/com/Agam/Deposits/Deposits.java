package com.Agam.Experiments;

public class Deposits {
    public String depositorName;
    protected double principle;
    protected double rateofInterest;
    protected int duration;

    public Deposits(String depositorName, double principle, double rateofInterest, int duration) {
        this.depositorName= depositorName;
        this.principle = principle;
        this.rateofInterest = rateofInterest;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Depositor : " + depositorName);
        System.out.println("Principal Amount : " + principle);
        System.out.println("Rate of Interest : " + rateofInterest + " %");
        System.out.println("Duration : " + duration + " months");
    }

    public double calculateInterest() {
        return 0; // To be overridden by Polymorphism
    }


}
