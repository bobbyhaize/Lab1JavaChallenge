package com.company;
import java.util.Scanner;
/**
 * @author Ted Asare
 * 86942021
 * @author Kwaku Bobie Osei-Tutu
 * 94422021
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String input = reader.nextLine();
        String reverse="";
        for(int i = input.length() - 1; i>=0; i--) {
            reverse = reverse + input.charAt(i);		//concatenates to reversed string starting from the last index of the input
        }
        System.out.print("Reversed: " + reverse );
        reader.close();
    }
}
