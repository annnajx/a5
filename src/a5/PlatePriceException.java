package a5;

// Create a new checked exception class PlatePriceException
public class PlatePriceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Declare private field
	private double illegalPrice;
	
	
	// Initialize a constructor that takes in a price and returns an exception message
	public PlatePriceException(double platePrice) {
		super("Illegal plate price");
		illegalPrice = platePrice;
	}
	
	
	// a getter method that returns the illegal plate price
	public double getIllegalPrice() {
		return illegalPrice;
	}

}
