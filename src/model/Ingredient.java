package model;

public class Ingredient {
    public String ingredient;
	public Integer count;
	private Integer countMax;
	Float price;
  	
	public Ingredient(String ingredient, Integer count, Float price) {
	    this.ingredient = ingredient;
		this.count = count;
		this.countMax = 10;
		this.price = price;
	}
	
    public void useIngredient(Integer subtrahend){
        count -= subtrahend;
    }

    public void restock(){
        count = countMax;
    }
}
