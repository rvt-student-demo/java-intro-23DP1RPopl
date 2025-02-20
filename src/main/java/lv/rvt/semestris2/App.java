package lv.rvt.semestris2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.nio.file.StandardOpenOption;
import java.util.*;
import lv.rvt.semestris2.ConsoleColors;
import lv.rvt.semestris2.Engine;


public class App {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            if (i < 10) {
                System.out.println(ConsoleColors.GREEN_BACKGROUND);
            } else if (i == 10) {
                System.out.println(ConsoleColors.BLACK_BACKGROUND);
            }          
        }
        System.out.println(ConsoleColors.RESET);
    }
}