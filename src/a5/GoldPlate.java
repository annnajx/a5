package a5;

//Create a GoldPlate subclass that extends the PlateImpl superclass
public class GoldPlate extends PlateImpl {

	// Initialize a constructor that takes in a Sushi object and price and creates a new GoldPlate object
	
	public GoldPlate(Sushi contents, double price) throws PlatePriceException, IllegalArgumentException {
		
		super (contents, Plate.Color.GOLD, price);
		
		
		
	}
}
