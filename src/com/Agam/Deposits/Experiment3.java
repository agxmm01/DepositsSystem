package com.Agam.Deposits;
import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Choose the Deposit Type : ");
            System.out.println("1. Fixed Deposit (FD) ");
            System.out.println("2. Recurring Deposits (RD) ");
            System.out.println("Press 9 to exit");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Depositor's name : ");
                    String name = input.next();
                    System.out.print("Enter the principle amount : ");
                    double fdPrinciple = input.nextDouble();
                    System.out.print("Enter Rate of Interest in % :");
                    double fdROI = input.nextDouble();
                    System.out.print("Enter duration in months : ");
                    int fdTime = input.nextInt();

                    Deposits fd = new FixedDeposits(name, fdPrinciple, fdROI, fdTime);
                    fd.display();
                    System.out.printf("The interest on the amount is : %.2f", fd.calculateInterest());
                    break;


                case 2:
                    System.out.print("Enter Depositor Name: ");
                    String rdName = input.nextLine();
                    System.out.print("Enter Monthly Installment: ");
                    double rdInstallment = input.nextDouble();
                    System.out.print("Enter Rate of Interest (in %): ");
                    double rdRate = input.nextDouble();
                    System.out.print("Enter Duration (in months): ");
                    int rdDuration = input.nextInt();

                    Deposits rd = new ReccuringDeposits(rdName, rdRate, rdDuration, rdInstallment);
                    rd.display();
                    System.out.printf("The interest on the amount is : %.2f", rd.calculateInterest());
                    break;

                case 9 :
                    System.exit(0);

                default:
                    System.out.println("Invalid choice ! Try again. Choose between 1 and 2");
            }
            input.close();
        } while (choice != 9);
    }
}
