package StockFunctions;

import Models.Stock;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadStock {
    static ArrayList<Stock> stocks = new ArrayList<>();
    
    public static ArrayList<Stock> getStocks() {
        return stocks;
    }
    
    public static void loadStock() {
//        Hardcoding stock
        System.out.println(Colours.ANSI_BLACK + "LoadStock.loadStock() called. Loading initial stock..." + Colours.ANSI_RESET);
        stocks.add(new Stock("Royal Kludge", "RK84 Pro", 90.44, 12));
        stocks.add(new Stock("Glorious", "GMMK Pro", 128.53, 25));
        stocks.add(new Stock("Royal Kludge", "RK84", 60.29, 22));
        stocks.add(new Stock("Mode", "Mode80", 346.99, 5));
        stocks.add(new Stock("Keychron", "K8", 52.15, 51));
        stocks.add(new Stock("Keychron", "Q1", 127.73, 1));
    }
    
    public static void writeToRecord() throws IOException {
        System.out.println(Colours.ANSI_BLACK + "LoadStock.writeToRecord() called. Loading initial stock..." + Colours.ANSI_RESET);
        try (BufferedWriter stockRecord = new BufferedWriter(new FileWriter("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\stocksRecord.txt"))) {
            for (Stock s : stocks) {
                stockRecord.write(s.getProductID() + "," + s.getManufacturer() + "," + s.getName() + "," + s.getPrice() + "," + s.getQuantity() + "\n");
            }
        }
    }
  
    public static void readFromRecord() throws IOException {
        System.out.println(Colours.ANSI_BLACK + "LoadStock.readFromRecord() called. Reading from record..." + Colours.ANSI_RESET);
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\stocksRecord.txt")))) {
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int productID = Integer.parseInt(data[0]);
                String manufacturer = data[1];
                String name = data[2];
                double price = Double.parseDouble(data[3]);
                int numberInStock = Integer.parseInt(data[4]);
                System.out.println(Colours.ANSI_GREEN + "ID: [" + productID + "] - Manufacturer [" + manufacturer + "] - Name [" + name + "] Price [" + price + "] -  Stock [" + numberInStock + "]");
                
            }
        }
    }
    

}