package model;
import java.util.ArrayList;

public class Database {
    public ArrayList<Ingredient> inventory(){        
        ArrayList<Ingredient> inventory = new ArrayList<Ingredient>();
        inventory.add(new Ingredient("Cocoa", 10, 0.90f));
        inventory.add(new Ingredient("Coffee", 10, 0.75f));
        inventory.add(new Ingredient("Cream", 10, 0.25f));
        inventory.add(new Ingredient("Decaf Coffee", 10, 0.75f));
        inventory.add(new Ingredient("Espresso", 10, 1.10f));
        inventory.add(new Ingredient("Foamed Milk", 10, 0.35f));
        inventory.add(new Ingredient("Steamed Milk", 10, 0.35f));
        inventory.add(new Ingredient("Sugar", 10, 0.25f));
        inventory.add(new Ingredient("Whipped Cream", 10, 1.00f));
        
        return inventory;
    }
    
    public ArrayList<Drink> menu(){
    	ArrayList<Recipe> cA = new ArrayList<Recipe>();
        cA.add(new Recipe("Espresso", 3));
        Drink caffeAmericano = new Drink("Caffe Americano", cA, true);
        
        ArrayList<Recipe> cL = new ArrayList<Recipe>();
        cL.add(new Recipe("Espresso", 2));
        cL.add(new Recipe("Steamed Milk", 1));
        Drink caffeLatte = new Drink("Caffe Latte", cL, true);
        
        ArrayList<Recipe> cM = new ArrayList<Recipe>();
        cM.add(new Recipe("Espresso", 1));
        cM.add(new Recipe("Cocoa", 1));
        cM.add(new Recipe("Steamed Milk", 1));
        cM.add(new Recipe("Whipped Cream", 1));
        Drink caffeMocha = new Drink("Caffe Mocha", cM, true);
      
        ArrayList<Recipe> cP = new ArrayList<Recipe>();
        cP.add(new Recipe("Espresso", 2));
        cP.add(new Recipe("Steamed Milk", 1));
        cP.add(new Recipe("Foamed Milk", 1));
        Drink cappuccino = new Drink("Cappuccino", cP, true);
      
        ArrayList<Recipe> cF = new ArrayList<Recipe>();
        cF.add(new Recipe("Coffee", 3));
        cF.add(new Recipe("Sugar", 1));
        cF.add(new Recipe("Cream", 1));
        Drink coFfee = new Drink("Coffee", cF, true);
        
        ArrayList<Recipe> dC = new ArrayList<Recipe>();
        dC.add(new Recipe("Decaf Coffee", 3));
        dC.add(new Recipe("Sugar", 1));
        dC.add(new Recipe("Cream", 1));
        Drink deCafCoffee = new Drink("Decaf Coffee", dC, true);
        
        ArrayList<Drink> menu = new ArrayList<Drink>();
        menu.add(caffeAmericano);
        menu.add(caffeLatte);
        menu.add(caffeMocha);
        menu.add(cappuccino);
        menu.add(coFfee);
        menu.add(deCafCoffee);
        
        return menu;
    }
}
