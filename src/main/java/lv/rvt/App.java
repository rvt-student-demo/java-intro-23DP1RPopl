package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        if (number > number2) {
            System.out.println("Greater number is: " + number );
        }
        else if (number < number2) {
            System.out.println("Greater number is: " + number2 );
        }
        else {
            System.out.println("The numbers are equal!" );
        }
        
       





    }
    

}

