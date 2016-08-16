package model;
import java.util.ArrayList;

public class Inventory {
    public ArrayList<Ingredient> inventory;
    
    public Inventory(){
        Database data = new Database();
        this.inventory = data.inventory();
    }
    
    public void restockInventory(){
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).count != 10){
                inventory.get(i).restock();
            }
        }
    }
    
    public void useIngredients(Drink drink){
        for(int i = 0; i < drink.recipe.length; i++){
            for(int i2 = 0; i2 < inventory.size(); i2++){
                if(inventory.get(i2).ingredient == drink.recipe[i].name){
                    inventory.get(i2).useIngredient(drink.recipe[i].unit);
                }
            }
        }
    }
}
