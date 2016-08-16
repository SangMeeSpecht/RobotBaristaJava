package model;

public class Inventory {
    public Ingredient[] inventory;
    
    public Inventory(){
        Database data = new Database();
        this.inventory = data.inventory();
    }
    
    public void restockInventory(){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i].count != 10){
                inventory[i].restock();
            }
        }
    }
    
    public void useIngredients(Drink drink){
        for(int i = 0; i < drink.recipe.length; i++){
            for(int i2 = 0; i2 < inventory.length; i2++){
                if(inventory[i2].ingredient == drink.recipe[i].name){
                    inventory[i2].useIngredient(drink.recipe[i].unit);
                }
            }
        }
    }
}
