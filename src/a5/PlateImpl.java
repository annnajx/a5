package a5;


// Create a PlateImpl class that implements the Plate interface
public class PlateImpl implements Plate {

	// Declare fields
	
	protected Sushi contents;
	protected Plate.Color color;
	protected double price;
	
	
	
	// Initialize a constructor 
	// input: Sushi, Color, double
	// output: a new PlateImpl object
	
	public PlateImpl (Sushi contents, Plate.Color color, double price) throws PlatePriceException, IllegalArgumentException {
		if (contents == null) {
			this.contents = null;
			this.price = price;
			this.color = color;
		} else if (price < contents.getCost()) {
			throw new PlatePriceException(price);
		} if (color == Plate.Color.GOLD && price < 5 ) {
			throw new IllegalArgumentException();
		}
		else {
		this.contents = contents;
		this.price = price;
		this.color = color;
	}
	}
	
	
	
	
	// Implement methods from the Plate interface
	
	// returns the contents of the plate, returns null if plate is empty
	public Sushi getContents() {
		if (contents == null) {
			return null;
		} else {
			return contents;
		}
	}

	
	// if plate is empty, returns null
	// if plate is not empty, empties contents of plate and returns prior contents
	public Sushi removeContents() {
		if (contents == null) {
			return null;
		} else {
			Sushi oldContents = contents;
			contents = null;
			return oldContents;
		}
	}

	
	// method to set the contents of a plate, checks for exceptions as needed
	// input: Sushi object
	// output: sets contents of current plate as the passed in Sushi object 
	public void setContents(Sushi s) throws PlatePriceException {
		if (s == null) {
			throw new IllegalArgumentException();
		} else {
		if (price <= s.getCost()) {
			throw new PlatePriceException(price);
		} else {
			contents = s;
		}
		}
	}

	
	// returns a boolean based on whether the plate has sushi on it or not
	public boolean hasContents() {
		if (contents == null) {
			return false;
		} else {
			return true;
		}
	}

	
	// returns the price of the plate
	public double getPrice() {
		return price;
	}

	
	// returns the color of the plate
	public Color getColor() {
		return color;
	}

	
	// returns the difference between plate price and the sushi on it
	// returns 0 if plate is empty
	public double getProfit() {
		if (contents == null) {
		return 0;
		} else {
		return Math.round((price - contents.getCost()) * 100.0) / 100.0;
		}
	}		

}
