package andrearuzittu.EpicodeItjava4D1.model;

public class Pizza {
	private String name;
	private double price;
	private String size;
	private boolean hasToppings;
	private boolean hasSpecialCombination;
	private long calories;

	public Pizza(String name, double price, String size, boolean hasToppings, boolean hasSpecialCombination,
			long calories) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.hasToppings = hasToppings;
		this.hasSpecialCombination = hasSpecialCombination;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isHasToppings() {
		return hasToppings;
	}

	public void setHasToppings(boolean hasToppings) {
		this.hasToppings = hasToppings;
	}

	public boolean isHasSpecialCombination() {
		return hasSpecialCombination;
	}

	public void setHasSpecialCombination(boolean hasSpecialCombination) {
		this.hasSpecialCombination = hasSpecialCombination;
	}

	public long getCalories() {
		return calories;
	}

	public void setCalories(long calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Pizza: " + name + " (" + size + "), Price: " + price + " EUR, Calories: " + calories + " Calories";
	}
}
