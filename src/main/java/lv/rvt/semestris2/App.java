package lv.rvt.semestris2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

import lv.rvt.semestris2.Engine;


public class App {
    public static void main(String[] args) {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }   
}