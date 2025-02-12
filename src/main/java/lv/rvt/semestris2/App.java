package lv.rvt.semestris2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

import lv.rvt.semestris2.Engine;


public class App {
    public static void main(String[] args) {
        
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
}
    }
}