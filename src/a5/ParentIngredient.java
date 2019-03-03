package a5;

// Create a superclass for all Ingredient objects that implements the Ingredient interface
public class ParentIngredient implements Ingredient {
	
	// Declare private fields
	private String name;
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;
	
	// Make a constructor that takes in the required fields and constructs a new Ingredient object
	public ParentIngredient(String name, double pricePerOunce, int caloriesPerOunce, boolean isVegetarian, boolean isRice, boolean isShellfish) {
		this.name = name;
		this.pricePerOunce = pricePerOunce;
		this.caloriesPerOunce = caloriesPerOunce;
		this.isVegetarian = isVegetarian;
		this.isRice = isRice;
		this.isShellfish = isShellfish;
		}

	
	// Implement the Ingredient interface methods
	
		// returns the name of the ingredient
		public String getName() {
			return name;
		}

		// returns the calories per dollar of the ingredient
		public double getCaloriesPerDollar() {
			return (caloriesPerOunce / pricePerOunce);
		}

		// returns the calories per ounce of the ingredient
		public int getCaloriesPerOunce() {
			return caloriesPerOunce;
		}

		// returns the price per ounce of the ingredient
		public double getPricePerOunce() {
			return pricePerOunce;
		}

		// takes in an Ingredient object and returns a boolean based on whether the object equals the current object
		public boolean equals(Ingredient other) {
			String otherName = other.getName();
			int otherCalories = other.getCaloriesPerOunce();
			double otherPrice = other.getPricePerOunce();
			
			if ((otherName .equals(name)) && otherCalories == caloriesPerOunce) {
				if ((otherPrice - 0.1 == pricePerOunce) || (otherPrice + 0.1 == pricePerOunce) || otherPrice == pricePerOunce) {
					return true;
				} else {
					return false;
				}
				
			} else {
				return false;
			}
		}

		// returns a boolean based on whether the ingredient is vegetarian or not
		public boolean getIsVegetarian() {
			return isVegetarian;
		}

		// returns a boolean based on whether the ingredient has rice or not
		public boolean getIsRice() {
			return isRice;
		}
		
		// returns a boolean based on whether the ingredient has shellfish or not
		public boolean getIsShellfish() {
			return isShellfish;
		}

	}


