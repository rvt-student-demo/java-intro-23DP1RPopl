package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


public class App 
{
    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++){
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height){
        for (int h = 0 ; h < height; h++){
            printStars(width);
            
        }
    }
    public static void printTriangle(int size){
        for (int i = 0 ; i < size ; i++){
            printStars(i + 1);
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);
    }
}
