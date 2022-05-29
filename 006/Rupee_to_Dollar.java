// Input currency in rupees and output in USD.

import java.util.*;

public class Rupee_to_Dollar{
    public static void main(String[] args){

        double currency_in_rupees, currency_in_dollars, dollar_value;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of currency in rupees: ");
        currency_in_rupees = scan.nextDouble();

        System.out.println("Enter the value of one dollar in rupees: ");
        dollar_value = scan.nextDouble();

        currency_in_dollars = currency_in_rupees / dollar_value;

        System.out.println("Value of currency in dollar is " + currency_in_dollars);
    }
}
