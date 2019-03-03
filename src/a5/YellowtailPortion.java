package a5;

// Create a new YellowtailPortion subclass that extends the InrgedientPortionImpl superclass
public class YellowtailPortion extends IngredientPortionImpl{

	// Initialize a constructor that takes in a double amount and creates a new YellowtailPortion object
	public YellowtailPortion (double amount) {
		 super (new Yellowtail(), amount);
	}
	
	
	// Implement method combine 
	// input: IngredientPortion object
	// Output: if other is same Ingredient, outputs new IngredientPortion with amounts combined, otherwise returns current object
	public IngredientPortion combine (IngredientPortion other) {
		IngredientPortion currentPortion = new YellowtailPortion (this.getAmount());
		
		if (other == null) {
			return currentPortion;
		} else if (!(other.getIngredient().equals(currentPortion.getIngredient()))) {
			throw new RuntimeException ("The ingredient must match the ingredient of the current portion"); 
		} else {
			return new YellowtailPortion(other.getAmount() + currentPortion.getAmount());
			
		}	
	}

}

