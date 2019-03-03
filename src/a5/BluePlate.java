package a5;

//Create a BluePlate subclass that extends the PlateImpl superclass
public class BluePlate extends PlateImpl {
	
	// Initialize a constructor that takes in a Sushi object and creates a new BluePlate object
		public BluePlate(Sushi contents) throws PlatePriceException {
			
			super (contents, Plate.Color.BLUE, 4);
			
			if (contents.getCost() > 4) {
				throw new PlatePriceException(4);
			}
			
		}

}



