package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecreasingCounter aba = new DecreasingCounter(2);
        DecreasingCounter counter = new DecreasingCounter(100);

        aba.printValue();

        aba.decrement();
        aba.printValue();

        aba.decrement();
        aba.printValue();

        aba.decrement();
        aba.printValue();


        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
        }
}
