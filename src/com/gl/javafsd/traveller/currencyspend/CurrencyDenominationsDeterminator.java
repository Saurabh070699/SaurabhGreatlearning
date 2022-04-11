package com.gl.javafsd.traveller.currencyspend;

public class CurrencyDenominationsDeterminator {
    private int [] denominations;
    private int payAmount;

    private int [] resultDenominationArray;
    private int [] resultDenominationCountArray;

    // constructor to take denomination array and amount to be paid from the user
    // also creates two arrays to store denominations and their frequency/count
    public CurrencyDenominationsDeterminator(int [] denominations, int payAmount){
        this.denominations= denominations;
        this.payAmount= payAmount;
        this.resultDenominationArray= new int[this.denominations.length];
        this.resultDenominationCountArray= new int[this.denominations.length];
    }

    public void determine(){
        //sorting the entered denominations in descending order
        bubbleSort(denominations);
        // stores balance left after considering each denomination
        int balanceAmount=payAmount;
        //stores the number of denominations
        int noOfDenominations= denominations.length;
        int index=0;
        int resultIndex=0;
        while (index<noOfDenominations){

            // stores quotient and remainder for the denomination present at position=index
            int quotient = balanceAmount/denominations[index];
            int remainder= balanceAmount% denominations[index];
            // checks if the current denomination can be used to make the payment i.e non-zero quotient
            if (quotient!=0)
            {
                int temp= (quotient*denominations[index]);
                // new balance left to be paid using other denominations
                balanceAmount-= temp ;

                // storing the denomination value and it's count in the arrays
                resultDenominationArray[resultIndex]= denominations[index];
                resultDenominationCountArray[resultIndex++]=quotient;

                //checking if the amount left to be paid is zero and breaking the loop if successful
                if (remainder==0)
                {
                    if(balanceAmount==0)
                    {
                        printSuccessMessage(resultIndex);
                        break;
                    }
                }
            }
        // assuming that the denominations are in such a way that any amount can be paid (given in question)
            else
            {
                // breaking the loop when both quotient and remainder are zero
                if (remainder==0){
                    break;
                }
            }
            index++;
        }
    }

    // bubble sort logic to arrange given input in descending order
    public static void bubbleSort(int [] array){
        int length= array.length;
        int temp;
        for (int i=0; i<length;i++){
            for (int j=1;j<(length-i);j++){
                if (array[j-1]<array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    // printing the denominations and their count/frequency
    public void printSuccessMessage(int index){
        System.out.println("Your payment approach in order to give min no of notes will be-");
        for (int i=0; i<index;i++){
            System.out.println(resultDenominationArray[i]+":"+resultDenominationCountArray[i]);
        }
    }
}
