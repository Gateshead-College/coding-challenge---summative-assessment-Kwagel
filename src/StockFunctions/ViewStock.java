package StockFunctions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ViewStock {
    

    public static void printStock(int id)  {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\stocksRecord.txt")));
        ) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (Integer.parseInt(data[0]) == id) {
                    
                    System.out.println(Colours.ANSI_GREEN + "ID: [" + data[0] + "] - Manufacturer [" + data[1] + "] - Name [" + data[2] + "] Price [" + data[3] + "] -  Stock [" + data[4] + "]" + Colours.ANSI_RESET);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void displayStocks() {
//        Hardcoding stock
        System.out.println(Colours.ANSI_BLACK + "SMV.displayStocks called(). Displaying all stock..." + Colours.ANSI_RESET);
//        Looping through stock to display them
        for (int i = 0; i <  LoadStock.stocks.size(); i++ ){
            printStock(i);
        }
    }
    
}
