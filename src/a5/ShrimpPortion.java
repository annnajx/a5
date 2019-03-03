package a5;

//Create a new ShrimpPortion subclass that extends the IngredientPortionImpl superclass
public class ShrimpPortion extends IngredientPortionImpl {
	
	// Initialize a constructor that takes in an amount and creates a new ShrimpPortion object
	public ShrimpPortion (double amount) {
		 super (new Shrimp(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new ShrimpPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new ShrimpPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}


