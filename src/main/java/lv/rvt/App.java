package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;
        Statistics statistics = new Statistics();


        while (num != -1) {
            num = Integer.valueOf(scanner.nextLine());
            statistics.addNumber(num);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.sum2());
        System.out.println("Sum of odd numbers: " + statistics.sum1());
    }
}
