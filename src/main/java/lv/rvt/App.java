package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) throws Exception{
        BufferedReader reader = Utils.getReader("person.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String line;

        Person pers1 = new person(parts[0], parts[1], parts[2], parts[3]);
        persons.add(pers1);
        reader.readLine();
        while ((line = reader.readLine()) != null ) {
            
        }
        reader.close();
        
    }
}
