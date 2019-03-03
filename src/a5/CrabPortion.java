package a5;

// Create a new CrabPortion subclass that extends the IngredientPortionImpl superclass
public class CrabPortion extends IngredientPortionImpl {
	
	// constructor
	public CrabPortion (double amount) {
		 super (new Crab(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new CrabPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new CrabPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}


