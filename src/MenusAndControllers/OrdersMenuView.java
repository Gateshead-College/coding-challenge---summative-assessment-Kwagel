package MenusAndControllers;


public class OrdersMenuView {
    public static void displayOrdersMenu() {
        System.out.println(Colours.ANSI_BLACK + "OMV.displayOrdersMenu() called. ");
        System.out.println(Colours.ANSI_GREEN + "Orders Menu");
        System.out.println("-------------------");
        System.out.println("1 - Create New Order");
        System.out.println("2 - View Existing Orders");
        System.out.println("0 - Return to Main Menu" + Colours.ANSI_RESET);
        System.out.println("-------------------");
        OrdersMenuController.parseOrderMenuChoice();
    }
    
   
    
}
