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
            if (number == 0){
                a = 0;
            }  
        }
        int sum = numbers.get(1) + numbers.get(2);
    
        System.out.println(sum);
    }

}
