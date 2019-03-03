package a5;

// Create a class for sashimi that implements the Sushi interface 
public class Sashimi implements Sushi {
	
	// Declare private fields
	private String name;
	private IngredientPortion[] ingredients;
	
	// Define enumeration types
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	// Create a constructor that takes in a SashimiType and creates a new Sashimi object
	public Sashimi(SashimiType type) {
		
		if (type == SashimiType.TUNA) {
			IngredientPortion ing = new TunaPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[1];
			ingArray[0] = ing;
			this.ingredients = ingArray;
			this.name = "tuna sashimi";
		} else if (type == SashimiType.YELLOWTAIL) {
			IngredientPortion ing = new YellowtailPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[1];
			ingArray[0] = ing;
			this.ingredients = ingArray;
			this.name = "yellowtail sashimi";
		} else if (type == SashimiType.EEL) {
			IngredientPortion ing = new EelPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[1];
			ingArray[0] = ing;	
			this.ingredients = ingArray;
			this.name = "eel sashimi";
		} else if (type == SashimiType.CRAB) {
			IngredientPortion ing = new CrabPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[1];
			ingArray[0] = ing;
			this.name = "crab sashimi";
			this.ingredients = ingArray;
		} else if (type == SashimiType.SHRIMP) {
			IngredientPortion ing = new ShrimpPortion(0.75);
			IngredientPortion[] ingArray = new IngredientPortion[1];
			ingArray[0] = ing;
			this.ingredients = ingArray;
			this.name = "shrimp sashimi";
		}
		
	}
	
	

	// Implement the Sushi interface methods
	
	// returns the sashimi name
	public String getName() {
		return name;
	}

	// returns the ingredients in the sashimi
	public IngredientPortion[] getIngredients() {
		return ingredients;
	}

	// returns the calories of the sashimi
	public int getCalories() {
		IngredientPortion ing = ingredients[0];
		return (int) Math.round(ing.getCalories());
	}

	// returns the cost of the sashimi
	public double getCost() {
		IngredientPortion ing = ingredients[0];
		return ing.getCost();
	}

	// returns a boolean of whether the sashimi has rice or not
	public boolean getHasRice() {
		IngredientPortion ing = ingredients[0];
		return ing.getIsRice();
	}

	// returns a boolean of whether the sashimi has shellfish or not
	public boolean getHasShellfish() {
		IngredientPortion ing = ingredients[0];
		return ing.getIsShellfish();
	}

	// returns a boolean of whether the sashimi is vegetarian or not
	public boolean getIsVegetarian() {
		IngredientPortion ing = ingredients[0];
		return ing.getIsVegetarian();
	}

}
