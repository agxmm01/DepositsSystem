package com.Agam.Experiments;

public class ReccuringDeposits extends Deposits{
    private double monthlyInstallment;

    public ReccuringDeposits(String depositorName, double rateofInterest, int duration, double monthlyInstallment) {
        super(depositorName,0, rateofInterest, duration);
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public double calculateInterest() {
        double totalAmount = 0;
        for (int i = 0; i < duration; i++) {
            totalAmount += monthlyInstallment * (1 + (rateofInterest/100) * (duration - i ) / 12);
        }
        return totalAmount;
    }

    @Override
    public void display() {
        System.out.println("Depositor Name : " + depositorName);
        System.out.println("Monthly Installment : " + monthlyInstallment);
        System.out.println("Rate of Interest : " + rateofInterest);
        System.out.println("Duration : " + duration + " months ");
    }
}
