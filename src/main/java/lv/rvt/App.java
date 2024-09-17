package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int number = Integer.valueOf(scanner.nextLine());

        
        if (number < 0) {
            System.out.println("impossible!" );
        }
        else if (number > -1 && number < 50 ) {
            System.out.println("failed");
        }
        else if (number > 49 && number < 60 ) {
            System.out.println("1");
        }
        else if (number > 59 && number < 70 ) {
            System.out.println("2");
        }
        else if (number > 69 && number < 80 ) {
            System.out.println("3");
        }
        else if (number > 79 && number < 90 ) {
            System.out.println("4");
        }
        else if (number > 89 && number < 101 ) {
            System.out.println("1");
        }
        else if (number > 100) {
            
            System.out.println("incredible!" );
        }
        
       





    }
    

}

