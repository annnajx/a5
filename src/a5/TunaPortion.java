package a5;

// Create a new TunaPortion subclass that extends the IngredientPortionImpl superclass
public class TunaPortion extends IngredientPortionImpl {
	
	// Initialize a constructor that takes in a double amount and creates a new TunaPortion object
	public TunaPortion (double amount) {
		 super (new Tuna(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new TunaPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new TunaPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}


