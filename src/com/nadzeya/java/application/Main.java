package com.nadzeya.java.application;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease, enter who am I:\n");
        String input = in.nextLine();
        System.out.println("\nHi, my name is Nadzeya and I am " + input);
    }
}
