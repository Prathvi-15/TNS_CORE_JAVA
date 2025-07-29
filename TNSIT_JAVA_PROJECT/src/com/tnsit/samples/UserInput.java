package com.tnsif.samples;

import java.util.Scanner;

public class UserInput{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Hello " + name);
        System.out.println("Enter your Phone Number:");
        String ph= sc.nextLine();

        System.out.println("Phone Number " + ph);
    }
}
