package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int end = 101;

        int numberFromUser = Integer.valueOf(scanner.nextLine());

        for (int i = numberFromUser; i < end; i++) {
            System.out.println(i);
        }
        
    }
}
