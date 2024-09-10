package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        System.err.println("Ievada pirmaja skaitla");

        String input1 = scanner.nextLine();

        int result1 = Integer.valueOf(input1);

        System.err.println("Ievada otraja skaitla");

        String input2 = scanner.nextLine();

        int result2 = Integer.valueOf(input2);

        System.err.println(result1 * result2);
    }
}