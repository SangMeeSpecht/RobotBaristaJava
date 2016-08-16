package model;
import java.util.ArrayList;

public class Drink {
    public String name;
	ArrayList<Recipe> recipe;
	public Boolean availability;
  	
	public Drink(String name, ArrayList<Recipe> recipe, Boolean availability){
	    this.name = name;
		this.recipe = recipe;
		this.availability = availability;
	}
	
	public String price(ArrayList<Ingredient> inventory){
	   Float price = 0f;
	   for(int i = 0; i < recipe.size(); i++){
	      for(int i2 = 0; i2 < inventory.size(); i2++){
	          if(recipe.get(i).name == inventory.get(i2).ingredient){
	               price += recipe.get(i).unit * inventory.get(i2).price;
	          }
	      } 
	   }
	   return formatPrice(price);
	}
	
	private String formatPrice(Float price){
	    return String.format("%.2f", price);
	}
	
    public boolean drinkAvailability(){
        if(availability == true){
            return true;
        } else {
            return false;
        }
    }
    
    public void disableDrink(){
       availability = false; 
    }

    public void reinstateDrink(){
        availability = true;
    }
}
