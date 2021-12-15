package StockFunctions;

import Models.Stock;

import java.util.Scanner;

public class AddNewItem {
    public static void addItem() {
        System.out.println(Colours.ANSI_BLACK + "AddNewItem.addItem() called. Printing stock..." + Colours.ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        System.out.println(Colours.ANSI_RED + "Please input manufacturer...");
        String manufacturer = scanner.nextLine();
        System.out.println("Please input name of product...");
        String name = scanner.nextLine();
        System.out.println( "Please input price...");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input initial stock..." + Colours.ANSI_RESET);
        int numberInStock = Integer.parseInt(scanner.nextLine());
        LoadStock.stocks.add(new Stock(manufacturer,name,price,numberInStock));
        LoadStock.writeToRecord();
        System.out.println("Stock added:");
        ViewStock.printStock( LoadStock.stocks.size()-1);
    }
    
}
