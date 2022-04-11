package com.gl.javafsd.traveller.currencyspend;

import java.util.Scanner;

public class CurrencyDenominationsUI {
    Scanner input;
    private int [] denominations;
    private int payAmount;
    private int sizeOfDenominations;

    //constructor
    public CurrencyDenominationsUI(){
        input = new Scanner(System.in);
    }

    //method to get inputs from the user
    public void inputFromUser(){
        System.out.println("Enter the size of currency denominations");
        sizeOfDenominations= input.nextInt();
        denominations= new int[sizeOfDenominations];
        System.out.println("Enter the currency denominations value");
        for (int i=0;i<sizeOfDenominations;i++){
            denominations[i]=input.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        payAmount= input.nextInt();
    }

    // method to print the output based on the given input
    public void getOutput(){
        CurrencyDenominationsDeterminator determinator= new CurrencyDenominationsDeterminator( denominations,payAmount);
        determinator.determine();
    }
}
