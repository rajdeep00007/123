package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class TrianglePatternPractices {

    public static void main(String[] args) {
        // write your code here
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scann.nextInt();
        decreasedTriangle(n);
            System.out.println();
        increasedTriangle(n);
            System.out.println();
        hillTriangle(n);
            System.out.println();
        reverseIncreasedTriangle(n);
            System.out.println();
        reverseHillTriangle(n);
    }

    public static void decreasedTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void increasedTriangle(int b) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void hillTriangle(int c) {

        for (int i = 1; i <= c; i++) {
            for (int j = i; j <= c; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public  static void reverseIncreasedTriangle(int d){
        for(int i=1; i<=d; i++)
        {
            for(int j=i; j<=d; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseHillTriangle(int e){

        for(int i=1; i<=e; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("  ");
            }
            for(int j=i; j<e; j++)
            {
                System.out.print("* ");
            }
            for(int j=i; j<=e; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


