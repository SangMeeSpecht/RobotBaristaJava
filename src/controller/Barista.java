package controller;
import java.util.*; 
import model.Inventory;
import model.Menu;
import model.Drink;
import view.View;


public class Barista {
    private Inventory inventory;
    private Menu menu;
    private View view;
  
    public Barista(){
        Menu menuData = new Menu();
        Inventory inventoryData = new Inventory();
        View view = new View();
    
        this.inventory = inventoryData;
        this.menu = menuData;
        this.view = view;
    }
    
    public void run(){
        view.renderInventoryMenu(inventory, menu);
        
        Scanner input = new Scanner(System.in);
        String stringInput = input.next();
        
        while (true){
            if(stringInput.equals("q") || stringInput.equals("Q")){
                break;
            } else {
                userInput(stringInput);  
                stringInput = input.next();
            }
        }
    }
    
    private void userInput(String input){
        if(input.equals("r") || input.equals("R")){
            restock();
        } else if(input.matches("^\\d+$") && (Integer.valueOf(input) > 0 && Integer.valueOf(input) <= menu.menu.size())){
            orderDrink(input);
        } else {
            view.renderInvalidChoice(input);
        }
        view.renderInventoryMenu(inventory, menu);
    }
    
    private void orderDrink(String input){
        Drink drink = menu.findDrink(Integer.valueOf(input));
        if(drink.drinkAvailability()){
            dispense(drink);
        } else {
            view.renderOutOfStock(drink.name);
        }
    }
    
    private void restock(){
        inventory.restockInventory();
        menu.reinstateDrinks();
    }
    
    private void dispense(Drink drink){
        inventory.useIngredients(drink);
        menu.disableDrinks(inventory);
        view.renderDispenseDrink(drink.name);
    }
}
