package a5;

// Create an interface for Sushi with appropriate methods
public interface Sushi {
	String getName();
	IngredientPortion[] getIngredients();
	int getCalories();
	double getCost();
	boolean getHasRice();
	boolean getHasShellfish();
	boolean getIsVegetarian();

}
