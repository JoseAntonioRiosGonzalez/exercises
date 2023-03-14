/* STATEMENT: Ask the user to enter the expenses incurred during the 7 days of a week, day by day.
Later, return on the screen the number of days that he has had expenses equal to or greater than 100 euros. */

import java.util.Scanner;

public class ExpensesInAWeek {
    public static void main(String[] args){

        double bills[] = new double[7];
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter the expenses you have made each day for a week: ");
            for(int i=0; i<bills.length; i++){

                System.out.println("Expense "+(i+1) + " : ");
                bills[i]=sc.nextDouble();
            }
            int k=0;
            int total=0;
            System.out.println("Expenses equal or over 100€: ");
            while(k<bills.length){
                if (bills[k]>=100){
                    System.out.println("€" + bills[k]);
                total++;
                }
                    k++;
            }
        System.out.println("The number of days that you have spent more than 100 € have been: "+ total);


    }
}
