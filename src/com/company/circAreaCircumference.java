package com.company;

import java.util.Scanner;
import java.lang.*;
import java.lang.Math.*;
public class circAreaCircumference {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int radius = reader.nextInt();
        Double area = Math.PI * (radius * radius);
        Double circ = 2 * Math.PI * radius;
        System.out.printf("The area of the circle  given the radius: " + radius + " is %.2f", area);
        System.out.printf(" and the circumference is: %.2f\n", circ);
        reader.close();
    }
}
