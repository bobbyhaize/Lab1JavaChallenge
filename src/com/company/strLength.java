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
public class strLength {
    public static void main(String[]args) {
        String input = "Random text";       //assigning the String to a variable
        int strLength = 0;      		//Counter for the number of characters initialized to zero.
        for (int i=0; i < input.length(); i++) {    //finding the length of the assigned variable
			strLength++;
		}
        System.out.println(strLength);
        }
    }
