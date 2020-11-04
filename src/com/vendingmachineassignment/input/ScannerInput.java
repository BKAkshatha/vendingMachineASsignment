package com.vendingmachineassignment.input;

import java.util.Scanner;

public class ScannerInput {

    public static int getMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\nPlease enter your selection:"
                + "\n1: Snickers \t 125"
                + "\n2: Reeses Cup \t 130"
                + "\n3: Doritoes \t 150"
                + "\n4: Pepsi \t 185"
                + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;
    }
}
