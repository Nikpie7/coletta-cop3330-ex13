/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the principal amount? " );
        int P = Integer.parseInt( scan.nextLine() );
        System.out.print( "What is the rate? " );
        double r = Double.parseDouble( scan.nextLine() );
        System.out.print( "What is the number of years? " );
        int t = Integer.parseInt( scan.nextLine() );
        System.out.print( "What is the number of times the interest is compounded per year? " );
        int n = Integer.parseInt( scan.nextLine() );

        double A = P * Math.pow((1 + (r/100.0)/n), n*t);

        System.out.println("$" + P + " invested at " + r + "% for " + t + " years compounded " + n + " times per year is $" + String.format("%.2f", A) + ".");
    }
}
