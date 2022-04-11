package com.gl.javafsd.paymoney.transaction;

public class TargetAchievementCalculator {

    private int [] transactions;
    private int dailyTarget;
    private boolean dailyTargetStatus;
    private int transactionCounter;

    // constructor to pre-set values of dailyTargetStatus and transactionCounter and
    // get value of transactions and dailyTarget
    public TargetAchievementCalculator(int [] transactions, int dailyTarget){
        this.transactions =transactions;
        this.dailyTarget=dailyTarget;
        this.transactionCounter=0;
        this.dailyTargetStatus=false;
    }

    //method to find whether target was achieved and after how many transactions
    public void calculate(){
        //stores updated value of target after each transaction
        int tempCounter=dailyTarget;
        for (int index=0;index<transactions.length;index++){
            //keeps count of transactions
            transactionCounter++;
            tempCounter-=transactions[index];
            //checks if the target has been achieved or crossed
            if(tempCounter<=0)
            {
                //successful achievement of target stored as status
                dailyTargetStatus=true;
                break;
            }
        }
    }


    // prints the outcome of the program based on the value of status
    public void printOutcome(){
        //successful message
        if(dailyTargetStatus)
        {
            System.out.println("Target of "+dailyTarget+" achieved after "+transactionCounter+" transactions.");
        }
        // failure message
        else
        {
            System.out.println("Given target of "+dailyTarget+" is not achieved.");
        }
        System.out.println("-----------------------------------------------------------------------");
    }

}
