package a5;

//Create a new SeaweedPortion subclass that extends the IngredientPortionImpl superclass

public class SeaweedPortion extends IngredientPortionImpl {
	
	// Initialize a constructor that takes in an amount and creates a new SeaweedPortion object
	public SeaweedPortion (double amount) {
		 super (new Seaweed(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new SeaweedPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new SeaweedPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}

