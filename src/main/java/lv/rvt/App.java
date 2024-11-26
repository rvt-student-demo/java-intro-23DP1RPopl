package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      

    public static void main(String[] args) {
        Counter counter = new Counter(10); 
        System.out.println("Initial value: " + counter.value()); 

        counter.increase(); 
        System.out.println("After increase: " + counter.value()); 

        counter.increase(5); 
        System.out.println("After increasing by 5: " + counter.value()); 

        counter.decrease(); 
        System.out.println("After decrease: " + counter.value()); 

        counter.decrease(3); 
        System.out.println("After decreasing by 3: " + counter.value()); 

        counter.increase(-2); 
        System.out.println("After invalid increase: " + counter.value()); 

        counter.decrease(-4); 
        System.out.println("After invalid decrease: " + counter.value()); 
    }

}