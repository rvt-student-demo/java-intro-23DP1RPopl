package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class App 
{
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while(a == 1){
            String vard = scanner.nextLine();
            wordList.add(vard);
            if (vard == ""){
                a = 0;
            }  
        }

    
        System.out.println(wordList.get(2));
    }

}
