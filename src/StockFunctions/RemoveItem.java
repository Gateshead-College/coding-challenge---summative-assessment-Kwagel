package StockFunctions;

import java.io.IOException;

public class RemoveItem {
    public static void removeItem() throws IOException {
        System.out.println(Colours.ANSI_BLACK + "RemoveItem.removeItem() called. Remove item..." + Colours.ANSI_RESET);
        System.out.println(Colours.ANSI_RED + "Which item would you like to remove from stock?" + Colours.ANSI_RESET);
        int ItemToRemove = FindItem.findItem();
        if (ItemToRemove >= 0) {
            LoadStock.stocks.remove(ItemToRemove);
            LoadStock.writeToRecord();
            System.out.println("Item successfully removed!");
        } else {
            System.out.println("Not a valid item!. Returning to main menu...");
        }
    }
    
}
