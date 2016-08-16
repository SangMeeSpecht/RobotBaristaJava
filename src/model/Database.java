package model;
import java.util.ArrayList;

public class Database {
    public ArrayList<Ingredient> inventory(){
//        Ingredient cocoa =        new Ingredient("Cocoa", 10, 0.90f);
//        Ingredient coffee =       new Ingredient("Coffee", 10, 0.75f);
//        Ingredient cream =        new Ingredient("Cream", 10, 0.25f);
//        Ingredient decafCoffee =  new Ingredient("Decaf Coffee", 10, 0.75f);
//        Ingredient espresso =     new Ingredient("Espresso", 10, 1.10f);
//        Ingredient foamedMilk =   new Ingredient("Foamed Milk", 10, 0.35f);
//        Ingredient steamedMilk =  new Ingredient("Steamed Milk", 10, 0.35f);
//        Ingredient sugar =        new Ingredient("Sugar", 10, 0.25f);
//        Ingredient whippedCream = new Ingredient("Whipped Cream", 10, 1.00f);
        
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
    
    public Drink[] menu(){
        Recipe[] cA = new Recipe[1];
        cA[0] = new Recipe("Espresso", 3);
        Drink caffeAmericano = new Drink("Caffe Americano", cA, true);
        
        Recipe[] cL = new Recipe[2];
        cL[0] = new Recipe("Espresso", 2);
        cL[1] = new Recipe("Steamed Milk", 1);
        Drink caffeLatte = new Drink("Caffe Latte", cL, true);
        
        Recipe[] cM = new Recipe[4];
        cM[0] = new Recipe("Espresso", 1);
        cM[1] = new Recipe("Cocoa", 1);
        cM[2] = new Recipe("Steamed Milk", 1);
        cM[3] = new Recipe("Whipped Cream", 1);
        Drink caffeMocha = new Drink("Caffe Mocha", cM, true);
      
        Recipe[] cP = new Recipe[3];
        cP[0] = new Recipe("Espresso", 2);
        cP[1] = new Recipe("Steamed Milk", 1);
        cP[2] = new Recipe("Foamed Milk", 1);
        Drink cappuccino = new Drink("Cappuccino", cP, true);
      
        Recipe[] cF = new Recipe[3];
        cF[0] = new Recipe("Coffee", 3);
        cF[1] = new Recipe("Sugar", 1);
        cF[2] = new Recipe("Cream", 1);
        Drink coFfee = new Drink("Coffee", cF, true);
        
        Recipe[] dC = new Recipe[3];
        dC[0] = new Recipe("Decaf Coffee", 3);
        dC[1] = new Recipe("Sugar", 1);
        dC[2] = new Recipe("Cream", 1);
        Drink deCafCoffee = new Drink("Decaf Coffee", dC, true);
        
        Drink[] menu = new Drink[6];
        menu[0] = caffeAmericano;
        menu[1] = caffeLatte;
        menu[2] = caffeMocha;
        menu[3] = cappuccino;
        menu[4] = coFfee;
        menu[5] = deCafCoffee;
        
        return menu;
    }
}
