package com.company;
import java.util.Scanner;
import java.lang.*;
import java.lang.Math.*;

/**
 * @author Ted Asare
 * 86942021
 * @author Kwaku Bobie Osei-Tutu
 * 94422021
 */
public class circAreaCircumference {            //method for outputting the area and circumference for the
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);    //method for accepting input
        System.out.println("Enter a number: ");
        int radius = reader.nextInt();              //assigning an integer to the input
        Double area = Math.PI * (radius * radius);  //calculating the area
        Double circ = 2 * Math.PI * radius;         //calculating the circumference
        System.out.printf("The area of the circle  given the radius: " + radius + " is %.2f", area);
        System.out.printf(" and the circumference is: %.2f\n", circ);
        reader.close();
    }
}
