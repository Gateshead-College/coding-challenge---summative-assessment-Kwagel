package StockFunctions;

import java.io.IOException;
import java.util.Scanner;

public class UpdateItem {
    public static void updateItem() throws IOException {
        System.out.println(Colours.ANSI_BLACK + "UpdateItem.updateItem() called. Printing stock..." + Colours.ANSI_RESET);
        ViewStock.displayStocks();
        System.out.println(Colours.ANSI_RED + "Which item do you want to update?");
        int chosenItem = FindItem.findItem();
        if( chosenItem >= 0){
            System.out.println(Colours.ANSI_RED + "How many would you like to adjust it by? (positive or negative number)");
            int inputtedAmount = Integer.parseInt(new Scanner(System.in).nextLine());
            LoadStock.stocks.get(chosenItem).addQuantity(inputtedAmount);
            LoadStock.writeToRecord();
        }
    }
}
