package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, choose your command: ");
        System.out.println("show - shows all persons");
        System.out.println("add - add a person");
        System.out.println("exit - exit");
        System.out.println("help - help");
        
        
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
            
                System.out.println("--------------------------------------------------");
                System.out.printf("| %-10s | %-4s | %-6s | %-6s | %-15s |\n", 
                                  "Name", "Age", "Weight", "Height", "Body mass index");
                System.out.println("--------------------------------------------------");
            
                for (Person person : persons) {
                    System.out.printf("| %-10s | %-3d | %-6.2f | %-6.2f | %-15.2f |\n",
                                      person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.bodyMassIndex());
                }
            
                System.out.println("--------------------------------------------------");
            }
            
            else if (command.equals("add")){
                System.out.println("Please enter name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter weight: ");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Please enter height: ");
                int height = Integer.valueOf(scanner.nextLine()); 
                
                Person person = new Person(name, age, weight, height);
                PersonManager.addPerson(person);
            }
            else if (command.equals("help")){
                System.out.println("Hello, choose your command: ");
                System.out.println("show - shows all persons");
                System.out.println("add - add a person");
                System.out.println("exit - exit");
                System.out.println("help - help");
            }
            else if (command.equals("exit")){
                System.out.println("Thanks, bye bye!");
                break;
            }
    }
}
}