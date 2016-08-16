package model;

public class Menu {
    public Drink[] menu;
    
    public Menu(){
        Database data = new Database();
        this.menu = data.menu();
    }
    
    public Drink findDrink(Integer number){
        return menu[number - 1];
    }
    
    public void reinstateDrinks(){
        for(int i = 0; i < menu.length; i++){
            if(menu[i].availability == false){
                menu[i].reinstateDrink();
            }
        }
    }
    
    public void disableDrinks(Inventory inventory){
        for(int i = 0; i < menu.length; i++){
            for(int i2 = 0; i2 < menu[i].recipe.length; i2++){
                for(int i3 = 0; i3 < inventory.inventory.length; i3++){
                    if(inventory.inventory[i3].ingredient == menu[i].recipe[i2].name){
                        if(inventory.inventory[i3].count < menu[i].recipe[i2].unit){
                            menu[i].disableDrink();
                        }
                    }
                }
            }
        }
    }
}
