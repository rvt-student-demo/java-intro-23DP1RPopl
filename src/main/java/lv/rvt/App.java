package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = Utils.getReader("person.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String line;
        reader.readLine(); 

        while ((line = reader.readLine()) != null) {
            line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0].trim();
            int age = Integer.valueOf(parts[1].trim());
            Integer height = Integer.valueOf(parts[2].trim());
            Integer weight = Integer.valueOf(parts[3].trim());
            Person pers1 = new Person(name, age, height, weight);
            persons.add(pers1);
        }

        for (Person person : persons) {
            System.out.println(person);
        }
        
        
}
}
