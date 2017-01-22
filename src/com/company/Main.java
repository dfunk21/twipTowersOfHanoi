package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);
        System.out.println("Welcome to the Towers of Hanoi simulator!\nEnter the number of disks" +
                " you would like to play with (up to and non-inclusive of 64).\nI will print out the instructions for you!\n" +
                "WARNING: If an extremely high number of discs is inputted, program will not run sufficiently!!!!!");
        int user = sb.nextInt();
        TowersOfHanoi toh = new TowersOfHanoi();

        System.out.println("Instructions:");
        toh.solve(user, "1", "2", "3");


    }
}
