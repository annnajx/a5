package a5;

// Create a new RicePortion subclass that extends the IngredientPortionImpl superclass
public class RicePortion extends IngredientPortionImpl {
	
	// Initialize a constructor that takes in an amount and creates a new RicePortion object
	public RicePortion (double amount) {
		 super (new Rice(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new RicePortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new RicePortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}


