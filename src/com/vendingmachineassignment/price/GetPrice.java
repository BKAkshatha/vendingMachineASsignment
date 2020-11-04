package com.vendingmachineassignment.price;

public class GetPrice {
    public static int retrievePrice(int menuChoice){
        if (menuChoice == 1)
            return 125;
        if (menuChoice == 2)
            return 130;
        if (menuChoice == 3)
            return 150;
        if (menuChoice == 4)
            return 185;
        else return 0;
    }
}
