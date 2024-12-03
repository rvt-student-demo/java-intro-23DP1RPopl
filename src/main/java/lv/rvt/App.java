package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      

    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = Helper.getReader("person.csv");

        String line;
        reader.readLine();

        int ageSum = 0;
        int ageCount = 0;
  

        while ((line = reader.readLine()) != null) {

            String[] parts = line.split(", ");

            System.out.println("Name: "+ parts[0] + ", age: "+ parts[1]);

            ageSum += Integer.valueOf(parts[1]);
            ageCount++;
            
        }
        System.out.println(1.0* ageSum / ageCount);
    }

}