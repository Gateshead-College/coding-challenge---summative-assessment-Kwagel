package Models;

import MainMenu.LoginController;

public class Account {
    private String username;
    private String password;
    private String forename;
    private String surname;
    private int employeeID;
    private boolean isAdmin;
 
    
    public Account(String username, String password, String forename, String surname,  boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.employeeID = LoginController.getAccounts().size();
        this.isAdmin = isAdmin;
    }
    
    public Account(String username, String password, String forename, String surname, int employeeID, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.isAdmin = isAdmin;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getForename() {
        return forename;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setForename(String forename) {
        this.forename = forename;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    
}
