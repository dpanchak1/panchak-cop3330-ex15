/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is your username? ");
        String useless=input.nextLine();
        System.out.print("What is the password? ");
        String password=input.nextLine();
        if(password.equals("abc123"))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you.");
        }
    }
}
