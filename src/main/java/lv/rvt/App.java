package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while(a == 1){
            int number = Integer.valueOf(scanner.nextLine());
            numbers.add(number);
            if (number == -1){
                a = 0;
            }  
        }
        System.out.print("From where? ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int number2 = Integer.valueOf(scanner.nextLine());
        for (int i = number1; i <= number2; i++){
            int number = numbers.get(i);
            System.out.println(number);
        }
    }

}
