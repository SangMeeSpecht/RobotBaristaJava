package model;

public class Ingredient {
    public String ingredient;
	public Integer count;
	private static final Integer COUNT_MAX = 10;
	Float price;
  	
	public Ingredient(String ingredient, Integer count, Float price) {
	    this.ingredient = ingredient;
		this.count = count;
		this.price = price;
	}
	
    public void useIngredient(Integer subtrahend){
        count -= subtrahend;
    }

    public void restock(){
        count = COUNT_MAX;
    }
}
