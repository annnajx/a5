package a5;

// Create a RedPlate subclass that extends the PlateImpl superclass
public class RedPlate extends PlateImpl {
	
	// Initialize a constructor that takes in a Sushi object and creates a new RedPlate object
	public RedPlate(Sushi contents) throws PlatePriceException {
		
		super (contents, Plate.Color.RED, 1);
		
		
		
	}

}
