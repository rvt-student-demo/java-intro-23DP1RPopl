package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int numberFromUser = Integer.valueOf(scanner.nextLine());
        while (true) {
            if (numberFromUser == 0){
                break;
            }
            printText();
            numberFromUser = numberFromUser - 1;
        }
    }
    public static void printText() {
     System.out.println("In a hole in the ground there lived a method");       
    }
}
