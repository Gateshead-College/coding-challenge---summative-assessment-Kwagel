package MenusAndControllers;

public class StocksMenuView {
    public static void displayStockMenu(){
        System.out.println(Colours.ANSI_GREEN + "Stocks Menu");
        System.out.println("-------------------");
        System.out.println("1 - View Stock");
        System.out.println("2 - Update Stock");
        System.out.println("3 - Add New Stock");
        System.out.println("4 - Remove Stock");
        System.out.println("5 - Return to Main Menu");
        System.out.println("-------------------");
        StocksMenuController.parseChoice();
    }
}
