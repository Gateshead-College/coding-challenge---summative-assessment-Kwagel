package StockFunctions;

import java.util.Scanner;

public class FindItem {
    public static int findItem()  {
        System.out.println(Colours.ANSI_BLACK + "FindItem.findItem() called. Finding item...." + Colours.ANSI_RESET);
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        if (choice < LoadStock.stocks.size() && choice >= 0) {
            System.out.println("You have selected:");
            ViewStock.printStock(choice);
            System.out.println(Colours.ANSI_RED + "Please confirm your choice by re-entering stock ID..." + Colours.ANSI_RESET);
            if (Integer.parseInt(new Scanner(System.in).nextLine()) == choice) {
                return choice;
            } else {
                System.out.println("Incorrect ID, returning...");
                return -1;
            }
            
        }
        
        System.out.println("Not Valid Item. Returning...");
        return -1;
    }
    
}
