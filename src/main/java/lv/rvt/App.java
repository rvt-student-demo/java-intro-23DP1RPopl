package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;


public class App 
{      
    public static void main(String[] args) {
        Person paul = new Person("Paul", 24);
        Person ada = new Person("Ada");
    
        System.out.println(paul);
        System.out.println(ada);
    }
}