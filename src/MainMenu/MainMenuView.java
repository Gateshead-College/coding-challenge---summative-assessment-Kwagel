package MainMenu;

import StockFunctions.Colours;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuView {
    
    public static void displayMenu() throws IOException {
        System.out.println(Colours.ANSI_BLACK + "mmv.displayMenu() called. Displaying main menu...");
        System.out.println(Colours.ANSI_GREEN + "Main Menu" );
        System.out.println("-----------------");
        System.out.println( "1 - View Stock" );
        System.out.println( "2 - Update Stock" );
        System.out.println( "3 - Add New Stock" );
        System.out.println( "4 - Remove Stock" );
        System.out.println( "5 - Current Account Settings" );
        System.out.println(Colours.ANSI_RED + "Please choose an option..." +  Colours.ANSI_RESET);
        MainMenuController mmc = new MainMenuController();
        mmc.parseChoice(Integer.parseInt(new Scanner(System.in).nextLine()));
    }
    
    
}
