package Models;

import Functions.Colours;
import Functions.LoadStock;
import MainMenu.LoginController;

public class Stock {
    
    private int ProductID;
    private String manufacturer;
    private String name;
    private double price;
    private int numberInStock;

 
    public Stock( String manufacturer, String name, double price, int numberInStock) {
        ProductID = LoadStock.getStocks().size();
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.numberInStock = numberInStock;
    }
    
    public int getProductID() {
        return ProductID;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return numberInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public void addQuantity(int stockChange) {
        if (numberInStock >= stockChange) {
            this.numberInStock += stockChange;
            System.out.println(Colours.ANSI_BLUE + "Successfully changed number in stock!");
        } else{
            System.out.println("You cant remove items that we dont have...");
        }
       
    }
    
    
}
