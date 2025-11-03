package com.bank.util;

public class InterestCalculator {
    // Simple interest
    public static double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100.0;
    }

    // Compound interest using Math.pow (to be used with static import in main)
    public static double calculateCompoundInterest(double P, double R, double T) {
        return P * (Math.pow((1 + R/100.0), T)) - P;
    }
}
