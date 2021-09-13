/*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kamila Hollerbach
         */

package com.company;
import java.util.Scanner;

import java.util.*;

        public class Main {


            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the first number? ");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number? ");
                int num2 = sc.nextInt();

                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            }
        }


