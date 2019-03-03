package a5;

// Create a new EelPortion  subclass that extends the IngredientPortionImpl superclass
public class EelPortion extends IngredientPortionImpl {
	
	// constructor
	public EelPortion (double amount) {
		 super (new Eel(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new EelPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new EelPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}


