package lv.rvt.semestris2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

import lv.rvt.semestris2.Engine;


public class App {
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }   
}