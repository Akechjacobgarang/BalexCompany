/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balexcompany;

/**
 *
 * @author PRINT 24 LF
 */
public class BalexCompany {
    private static final double MINIMUM_WAGE = 8.0;
    private static final int MAX_WORK_HOURS = 60;

    public static void calculatePay(double basePay, double hoursWorked) {
        // Check for minimum wage
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay cannot be less than minimum wage");
            return;
        }

        // Check for maximum wage
        if (hoursWorked > MAX_WORK_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_WORK_HOURS);
            return;
        }

        double regularPay = Math.min(hoursWorked, 40) * basePay;
        double overtimePay = Math.max(hoursWorked - 40, 0) * basePay * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        // Main method to test the calculatePay method
        // Empoyee 1
        calculatePay(7.5, 35.0);
        // Empoyee 2
        calculatePay(8.20, 47.0);
        // Empoyee 3
        calculatePay(10.0, 73.0); 
    
    }
}

