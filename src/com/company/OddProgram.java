package com.company;
import java.util.Scanner;
import java.lang.*;
import java.lang.Math.*;
public class OddProgram {
    public static void main(String[]args) {
        String input = "Random text";
        int strLength = input.length();
        System.out.println(strLength);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int radius = reader.nextInt();
        Double area = Math.PI * (radius * radius);
        Double circ = 2 * Math.PI * radius;
        System.out.printf("The area of the circle  given the radius: " + radius + " is %.2f", area);
        System.out.printf(" and the circumference is: %.2f\n", circ);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text to be reversed: ");
        String text = scan.next();
        System.out.println(text);
        StringBuilder newText = new StringBuilder("AA");
        System.out.println(newText);
        for (int i = 4; i<=0; i--) {
            newText.append(text.charAt(i));
            System.out.println(newText);
        }


    }
}
