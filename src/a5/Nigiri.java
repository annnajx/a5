package a5;

// Create a Nigiri class that implements the Sushi interface
public class Nigiri implements Sushi {
	
	// Declare private fields
	private String name;
	private IngredientPortion[] ingredients;
	
	
	// Define enumeration types
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	
	// Make a constructor that takes in a NigiriType and creates a new Nigiri object
	public Nigiri(NigiriType type) {
		
		if (type == NigiriType.TUNA) {
			IngredientPortion ing = new TunaPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[2];
			ingArray[0] = ing;
			ingArray[1] = new RicePortion(0.5);
			this.ingredients = ingArray;
			this.name = "tuna nigiri";
		} else if (type == NigiriType.YELLOWTAIL) {
			IngredientPortion ing = new YellowtailPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[2];
			ingArray[0] = ing;
			ingArray[1] = new RicePortion(0.5);
			this.ingredients = ingArray;
			this.name = "yellowtail nigiri";
		} else if (type == NigiriType.EEL) {
			IngredientPortion ing = new EelPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[2];
			ingArray[0] = ing;	
			ingArray[1] = new RicePortion(0.5);
			this.ingredients = ingArray;
			this.name = "eel nigiri";
		} else if (type == NigiriType.CRAB) {
			IngredientPortion ing = new CrabPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[2];
			ingArray[0] = ing;	
			ingArray[1] = new RicePortion(0.5);
			this.ingredients = ingArray;
			this.name = "crab nigiri";
		} else if (type == NigiriType.SHRIMP) {
			IngredientPortion ing = new ShrimpPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[2];
			ingArray[0] = ing;	
			ingArray[1] = new RicePortion(0.5);
			this.ingredients = ingArray;
			this.name = "shrimp nigiri";
		}
		
	}
	
	
	
	// Implement the Sushi interface methods
	
	// returns the name of the Nigiri
	public String getName() {
		return name;
	}

	// returns the ingredients of the Nigiri
	public IngredientPortion[] getIngredients() {
		return ingredients;
	}

	// returns the calories of the Nigiri
	public int getCalories() {
		int calories = 0;
		for (int i = 0; i < ingredients.length; i++) {
			IngredientPortion ing = ingredients[i];
			calories += (int) Math.round(ing.getCalories());
		}
		return calories;
	}

	// returns the cost of the Nigiri
	public double getCost() {
		double cost = 0;
		for (int i = 0; i < ingredients.length; i++) {
			IngredientPortion ing = ingredients[i];
			cost += ing.getCost();
		}
		return cost;
	}
	
	// returns a boolean of whether the Nigiri has rice or not
	public boolean getHasRice() {
		boolean rice = true;
		for (int i = 0; i < ingredients.length; i++) {
			IngredientPortion ing = ingredients[i];
			if (!ing.getIsRice()) {
				rice = false;
			}
		}
		return rice;
	}

	// returns a boolean of whether the Nigiri has shellfish or not
	public boolean getHasShellfish() {
		boolean shellfish = true;
		for (int i = 0; i < ingredients.length; i++) {
			IngredientPortion ing = ingredients[i];
			if (!ing.getIsShellfish()) {
				shellfish = false;
			}
		}
		return shellfish;
	}

	// returns a boolean of whether the Nigiri is vegetarian or not
	public boolean getIsVegetarian() {
		boolean veg = true;
		for (int i = 0; i < ingredients.length; i++) {
			IngredientPortion ing = ingredients[i];
			if (!ing.getIsVegetarian()) {
				veg = false;
			}
		}
		return veg;
	}

}
