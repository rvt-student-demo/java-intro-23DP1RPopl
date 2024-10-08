package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void printSpaces(int number){
        for (int i = 0; i < number;i++){
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
    }

    public static void printTriangleTwo(int size){
     for (int si = 1; si < size + 1 ; si++){
        printSpaces(size - si);
        printStars(si);
        System.out.println("");
     } 
 }
 public static void christmasTree(int height){
    for (int he = 1; he < height + 1 ; he++){
        printSpaces(height - he);
        printStars(he);
        printStars(he-1);
        System.out.println("");
     } 
     printSpaces(height - 2);
     printStars(3);
     System.out.println("");
     printSpaces(height - 2);
     printStars(3);
     System.out.println("");
     
 }
    public static void main(String[] args) {
        printTriangleTwo(4);
        christmasTree(4);
        christmasTree(10);
    }

}
