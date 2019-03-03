package a5;

// Create interface for Plate

public interface Plate {
	
	// Declare enumeration types for different colors of plates
	public enum Color {RED, GREEN, BLUE, GOLD}
	
	// List appropriate methods
	Sushi getContents(); 
	Sushi removeContents(); 
	void setContents(Sushi s) throws PlatePriceException; 
	boolean hasContents(); double getPrice(); 
	Plate.Color getColor(); 
	double getProfit(); 

}
