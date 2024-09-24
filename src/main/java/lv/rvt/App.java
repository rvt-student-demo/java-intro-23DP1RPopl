package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scanner.nextLine());

        
        
        if (number > -1 && number < 5000 ) {
            System.out.println("No tax!");
        }
        else if (number > 4999 && number < 25000 ) {
            double tax = 100 + (number - 5000) * 0.08;
            System.out.println(tax);
        }
        else if (number > 24999 && number < 55000 ) {
            double tax = 1700 + (number - 25000) * 0.10;
            System.out.println(tax);
        }
        else if (number > 54999 && number < 200000 ) {
            double tax = 4700 + (number - 55000) * 0.12;
            System.out.println(tax);
        }
        else if (number > 199999 && number < 1000000 ) {
            double tax = 22100 + (number - 2000) * 0.15;
            System.out.println(tax);
        }
        else if (number > 999999) {
            double tax = 142100 + (number - 1000000) * 0.17;
            System.out.println(tax);
        }
        else {
            
            System.out.println("impossible!" );
        }
        
    }
}
