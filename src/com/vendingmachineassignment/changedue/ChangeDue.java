package com.vendingmachineassignment.changedue;

public class ChangeDue {

    public static void changeOut(int change){
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        while (change >= 25){
            quarters = quarters + 1;
            change = change - 25;
        }
        while (change >= 10){
            dimes = dimes + 1;
            change = change - 10;
        }
        while (change >= 5){
            nickels = nickels + 1;
            change = change - 5;
        }

        // to see the change, print it to the console perhaps
        System.out.printf("\nHere's your change:\n%d quarters, %d dimes, %d nickels and %d pennies!",
                quarters, dimes, nickels, change);
    }
}
