package com.gl.javafsd.traveller.currencyspend;

public class Main {

    // this method creates an object of class "CurrencyDenominationsUI" and prints the output
    public static void main(String[] args) {
        CurrencyDenominationsUI ui= new CurrencyDenominationsUI();
        // takes input from the user
        ui.inputFromUser();
        //determines and prints the output
        ui.getOutput();
    }
}
