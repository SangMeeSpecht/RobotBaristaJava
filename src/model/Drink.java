package model;

public class Drink {
    public String name;
	Recipe[] recipe;
	public Boolean availability;
  	
	public Drink(String name, Recipe[] recipe, Boolean availability){
	    this.name = name;
		this.recipe = recipe;
		this.availability = availability;
	}
	
	public String price(Ingredient[] inventory){
	   Float price = 0f;
	   for(int i = 0; i < recipe.length; i++){
	      for(int x = 0; x < inventory.length; x++){
	          if(recipe[i].name == inventory[x].ingredient){
	               price += recipe[i].unit * inventory[x].price;
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
