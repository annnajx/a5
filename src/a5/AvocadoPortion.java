package a5;

// Create a AvocadoPortion subclass that extends the IngredientPortionImpl superclass
public class AvocadoPortion extends IngredientPortionImpl {
	
	// Constructor
	public AvocadoPortion (double amount) {
		 super (new Avocado(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new AvocadoPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new AvocadoPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}
