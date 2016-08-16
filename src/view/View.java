package view;
import model.Inventory;
import model.Menu;

public class View {
    public void renderInventoryMenu(Inventory inventory, Menu menu){
        renderInventory(inventory);
        renderMenu(menu, inventory);
    }
    
    public void renderDispenseDrink(String drink){
        System.out.println("Dispensing: " + drink);
    }
    
    public void renderOutOfStock(String drink){
        System.out.println("Out of stock: " + drink);
    }
    
    public void renderInvalidChoice(String input){
        System.out.println("Invalid selection: " + input);
    }    
    
    private void renderMenu(Menu menu, Inventory inventory){
        int drinkNumber = 1;
  	    System.out.println("Menu:");
   	    for(int i = 0; i < menu.menu.length; i++){
   		    System.out.println(drinkNumber + ", " + menu.menu[i].name + ", " + "$" + menu.menu[i].price(inventory.inventory) + ", " + menu.menu[i].availability);
   		    drinkNumber += 1;
	    }
    }
    
    private void renderInventory(Inventory inventory){
  	    System.out.println("Inventory:");
   	    for(int i = 0; i < inventory.inventory.size(); i++){
   		    System.out.println(inventory.inventory.get(i).ingredient + ", " + inventory.inventory.get(i).count);
	    }
    }
}
