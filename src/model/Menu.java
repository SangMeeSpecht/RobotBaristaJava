package model;
import java.util.ArrayList;

public class Menu {
    public ArrayList<Drink> menu;
    
    public Menu(){
        Database data = new Database();
        this.menu = data.menu();
    }
    
    public Drink findDrink(Integer number){
        return menu.get(number - 1);
    }
    
    public void reinstateDrinks(){
        for(int i = 0; i < menu.size(); i++){
            if(menu.get(i).availability == false){
                menu.get(i).reinstateDrink();
            }
        }
    }
    
    public void disableDrinks(Inventory inventory){
        for(int i = 0; i < menu.size(); i++){
            for(int i2 = 0; i2 < menu.get(i).recipe.length; i2++){
                for(int i3 = 0; i3 < inventory.inventory.size(); i3++){
                    if(inventory.inventory.get(i3).ingredient == menu.get(i).recipe[i2].name){
                        if(inventory.inventory.get(i3).count < menu.get(i).recipe[i2].unit){
                            menu.get(i).disableDrink();
                        }
                    }
                }
            }
        }
    }
}
