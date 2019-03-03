package a5;

import java.util.ArrayList;


/// Create a Roll class that implements the Sushi interface
public class Roll implements Sushi {
	
	// Provide private fields
	private String name;
	private IngredientPortion[] rollIngs;
	
	
	// Create a constructor that will make a new Roll object
	public Roll(String name, IngredientPortion[] rollIngs) {
		
		IngredientPortion[] clone = rollIngs.clone();
		
		if (name.equals(null)) {
			throw new RuntimeException("Name cannot be null");
		}
		if (clone.equals(null)) {
			throw new RuntimeException("Ingredients cannot be null");
		}
		if(clone.length == 0) {
			throw new RuntimeException("Ingredients array must have a length greater than zero");
		}
		for (int i = 0; i < clone.length; i++) {
			if (clone[i] .equals(null)) {
				throw new RuntimeException("Ingredients values cannot be null");
			}
		}
		
		
		// Check for repeated Ingredient types and combine them
		
		// Create an array list to hold the original roll Ingredients and a new one to hold the result
		ArrayList<IngredientPortion> originalIngs = new ArrayList<IngredientPortion>();
		
		for (int i = 0; i < clone.length; i++) {
			originalIngs.add(clone[i]);
		}
		
		ArrayList<IngredientPortion> resultIngs = new ArrayList<IngredientPortion>();
		
		
		// Check for duplicates in the original rollIngs and combine them accordingly into the resultIngs array
		for (int a = 0; a < originalIngs.size(); a++) {
			boolean duplicate = false;
			for (int b = 0; b < resultIngs.size(); b++) {
				
				if (originalIngs.get(a).getName() .equals(resultIngs.get(b).getName())) {
					resultIngs.set(b, resultIngs.get(b).combine(originalIngs.get(a)));
					duplicate = true;
				}
			}
			if (!duplicate) {
				resultIngs.add(originalIngs.get(a));
			}
	}
		
		
		
		// Check for at least 0.1 ounces of seaweed
		
		double seaweedSum = 0;
		
		for (int c = 0; c < resultIngs.size(); c++) {
			IngredientPortion ing = resultIngs.get(c);
			String ingName = ing.getName();
			if (ingName.equals("seaweed")) {
				seaweedSum += ing.getAmount();
			}
		}
		
		// add at least 0.1 ounces of seaweed if there is not enough 
		if (seaweedSum < 0.1) {
			resultIngs.add(new SeaweedPortion(0.1 - seaweedSum));
		}
		
		// Convert resultIngs from an array list to an array
		IngredientPortion[] resultIngsArray = new IngredientPortion[resultIngs.size()];
				
		for (int i = 0; i < resultIngs.size(); i++) {
			resultIngsArray[i] = resultIngs.get(i);
		}
		this.name = name;
		this.rollIngs = resultIngsArray;
	}

	
	
	// Implement the Sushi interface methods
	
	// returns the name of the roll
	public String getName() {
		return name;
	}

	// returns the ingredients of the roll
	public IngredientPortion[] getIngredients() {
		return rollIngs.clone();
	}

	// returns the calories of the roll
	public int getCalories() {
		double calories = 0;
		IngredientPortion[] clone = rollIngs.clone();
		for (int i = 0; i < clone.length; i++) {
			IngredientPortion ing = clone[i];
			calories += ing.getCalories();
		}
		return (int) (calories + 0.5);
	}
	
	// returns the cost of the roll
	public double getCost() {
		double cost = 0;
		IngredientPortion[] clone = rollIngs.clone();
		for (int i = 0; i < clone.length; i++) {
			IngredientPortion ing = clone[i];
			cost += ing.getCost();
		}
		return Math.round(cost * 100.0) / 100.0;
	}
	
	// returns a boolean based on whether the roll has rice or not
	public boolean getHasRice() {
		IngredientPortion[] clone = rollIngs.clone();
		for (int i = 0; i < clone.length; i++) {
			IngredientPortion ing = clone[i];
			if (ing.getIsRice()) {
				return true;
			}
	}
	return false;
	}

	// returns a boolean based on whether the roll has shellfish or not
	public boolean getHasShellfish() {
		boolean shell = true;
		IngredientPortion[] clone = rollIngs.clone();
		for (int i = 0; i < clone.length; i++) {
			IngredientPortion ing = clone[i];
			if (!ing.getIsShellfish()) {
				shell = false;
			}
	}
	return shell;
	}

	// returns a boolean based on whether the roll is vegetarian or not
	public boolean getIsVegetarian() {
		boolean is_veg = true;
		IngredientPortion[] clone = rollIngs.clone();
		for (int i = 0; i < clone.length; i++) {
			IngredientPortion ing = clone[i];
			if (!ing.getIsVegetarian()) {
				is_veg = false;
			}
	}
	return is_veg;
	}

	

};
