package com.Agam.Experiments;

public class FixedDeposits extends Deposits{
    public FixedDeposits(String depositorName, double principle, double rateofInterest, int duration) {
        super(depositorName, principle, rateofInterest, duration);
    }

    @Override
    public double calculateInterest() {
        return (principle * rateofInterest * duration) / (12 * 100);
    }
}

