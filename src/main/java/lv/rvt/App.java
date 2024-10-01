package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int record = 0;
        System.out.println("Give numbers:");
        int pos = 0;
        int neg = 0;
        while (true) {
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == -1 ) {
                break;
            }
            if (numberFromUser % 2 == 0) {
                pos += 1;
            } else {
                neg += 1;
            }
            sum += numberFromUser;
            record += 1;

        }
        int average = sum / record;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + record);
        System.out.println("Average: " + average);
        System.out.println("Even: " + pos);
        System.out.println("Odd: " + neg);

    }
}
