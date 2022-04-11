package com.gl.javafsd.paymoney.transaction;

import java.util.Scanner;

// to build the UI for the PayMoney
public class TransactionUI {
    Scanner input;
    int sizeOfTransaction;
    int [] transactions;
    int numberOfTargets;
    int target;

    public TransactionUI(){
        input =new Scanner(System.in);
    }

    // method to get the inputs from the user
    public void inputFromUser(){
        System.out.println("Enter the size of transaction array");
        sizeOfTransaction= input.nextInt();
        transactions = new int[sizeOfTransaction];
        System.out.println("Enter the values of array");
        for (int i=0;i<sizeOfTransaction;i++){
            transactions[i]=input.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        numberOfTargets= input.nextInt();
        // loop used to take different targets as per the number entered by user
        for (int targetCounter=0;targetCounter<numberOfTargets;targetCounter++){
            System.out.println("Enter the value of target");
            target=input.nextInt();
            //calling function for calculating and printing output for the entered target
            getOutput(transactions,target);
        }
    }

    // method for calculating and printing output
    public static void getOutput(int [] transactions, int dailyTarget){
        TargetAchievementCalculator calculator=new TargetAchievementCalculator(transactions,dailyTarget);
        calculator.calculate();
        calculator.printOutcome();
    }
}
