package com.vendingmachineassignment.insertmoney;

import java.util.Scanner;

public class MoneyManagement {

    public static int moneyInserted(int Price){
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
        money = keyboard.nextInt();
        while (money < Price){
            System.out.println("Please insert sufficient funds");
            money = money + keyboard.nextInt();
        }
        return money - Price ;
    }
}
