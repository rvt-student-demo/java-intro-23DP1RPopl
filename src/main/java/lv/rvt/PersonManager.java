package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.io.FileReader;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> persons = new ArrayList<>();
        Person person1 = new Person("Maija");
        persons.add(person1);
        return persons;
    }
    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        writer .write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }
}
