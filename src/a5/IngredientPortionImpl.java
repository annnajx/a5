package a5;

//Create a parent IngredientPortionImpl class that implements the IngredientPortion interface
 abstract public class IngredientPortionImpl implements IngredientPortion {
	
	// Declare private fields
	protected Ingredient ingredient;
	protected double amount;
	
	// Create a constructor
	
	public IngredientPortionImpl (Ingredient ingredient, double amount) {
		if (amount <= 0) {
			throw new RuntimeException ("Amount must be greater than zero");
		} else {
		this.ingredient = ingredient;
		this.amount = amount;
		}
	}
	
	// Implement methods from the interface
	
	// Returns the Ingredient object
	public Ingredient getIngredient() {
		return ingredient;
	}
	
	// returns the name of the ingredient portion
	public String getName() {
		return ingredient.getName();
	}
	
	// returns the amount of the ingredient portion
	public double getAmount() {
		return amount;
	}

	// returns the calorie amount of the ingredient portion
	public double getCalories() {
		return ingredient.getCaloriesPerOunce() * amount;
	}

	// returns the cost of the ingredient portion
	public double getCost() {
		return ingredient.getPricePerOunce() * amount;
	}

	// returns a boolean of whether the ingredient portion is vegetarian or not
	public boolean getIsVegetarian() {
		return ingredient.getIsVegetarian();
	}

	// returns a boolean of whether the ingredient portion has rice or not
	public boolean getIsRice() {
		return ingredient.getIsRice();
	}

	// returns a boolean of whether the ingredient portion has shellfish or not
	public boolean getIsShellfish() {
		return ingredient.getIsShellfish();
	}

	// abstract method used to combine two ingredient portions together
	abstract public IngredientPortion combine(IngredientPortion other);
}
