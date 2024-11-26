package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10); // Sleep for 10 milliseconds to mimic real-time progress
            } catch (Exception e) {
                System.err.println("Timer interrupted");
            }
        }
    }
}
