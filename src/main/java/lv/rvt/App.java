package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadit savu vardu");

        String vard = scanner.nextLine();
        
        System.out.println("Ievadit savu uzvard");

        String uzvard = scanner.nextLine();
        
        System.out.println("Ievadit savu gruppu");
        
        String grup = scanner.nextLine();

        System.out.println(vard + " " + uzvard + " " + grup);
    }
}