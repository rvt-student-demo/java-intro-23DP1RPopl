package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int suma = 0;

        while (true) {

            System.out.println("Give a number:");

            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }

            if (numberFromUser != 0) {
                number = number + 1;
            }
            suma = suma + numberFromUser;


        }
        System.out.println("Number of numbers:" + number);
        System.out.println("Sum of the numbers:" + suma  );


        
        
        
    }
}
