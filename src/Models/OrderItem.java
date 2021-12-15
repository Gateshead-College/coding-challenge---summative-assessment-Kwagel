package Models;
import MenusAndControllers.MainMenuController;
import StockFunctions.LoadStock;

public class OrderItem {
    private int ProductID;
    private int Quantity;
    
    public OrderItem(int productID, int quantity) {
        ProductID = productID;
        Quantity = quantity;
    }
    
    public int getProductID() {
        return ProductID;
    }
    public String getProductName(){
        for (int i = 0 ; i < LoadStock.getStocks().size();i++){
            if (getProductID() == LoadStock.getStocks().get(i).getProductID()){
                return LoadStock.getStocks().get(i).getName();
            }
        }
        return "";
    }
    public double getUnitCost(){
        for (int i = 0 ; i < LoadStock.getStocks().size();i++){
            if (getProductID() == LoadStock.getStocks().get(i).getProductID()){
                return LoadStock.getStocks().get(i).getPrice();
            }
        }
        return -1;
    }
    public double getTotalCostOI(){
        for (int i = 0 ; i < LoadStock.getStocks().size();i++){
            if (getProductID() == LoadStock.getStocks().get(i).getProductID()){
                return getQuantity() * getUnitCost();
            }
        }
        return -1;
    }
    public int getQuantity() {
        return Quantity;
    }
    
}
