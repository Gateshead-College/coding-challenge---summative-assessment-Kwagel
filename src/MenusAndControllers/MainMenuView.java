package MenusAndControllers;

import java.util.Scanner;

public class MainMenuView {
    
    public static void displayMenu() {
//        display main menu screen,
        System.out.println(Colours.ANSI_BLACK + "mmv.displayMenu() called. ");
        System.out.println(Colours.ANSI_GREEN + "Main Menu");
        System.out.println("-------------------");
        System.out.println("1 - Stocks");
        System.out.println("2 - Orders");
        System.out.println("3 - Current Account Settings");
        System.out.println("0 - Exit");
        System.out.println("-------------------");
        System.out.println(Colours.ANSI_RED + "Please choose an option..." + Colours.ANSI_RESET);
        MainMenuController mmc = new MainMenuController();
        mmc.parseMainMenuChoice(Integer.parseInt(new Scanner(System.in).nextLine()));
    }
    
    
}
