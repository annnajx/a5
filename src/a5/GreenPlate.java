package a5;

//Create a GreenPlate subclass that extends the PlateImpl superclass
public class GreenPlate extends PlateImpl {
	
	// Initialize a constructor that takes in a Sushi object and creates a new GreenPlate object
	public GreenPlate(Sushi contents) throws PlatePriceException {
		
		super (contents, Plate.Color.GREEN, 2);
		
		
		
	}

}
