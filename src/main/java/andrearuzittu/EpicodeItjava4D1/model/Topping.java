package andrearuzittu.EpicodeItjava4D1.model;

public class Topping {
	private String name;
	private double price;
	private int calories;

	public Topping(String name, double price, int calories) {
		this.name = name;
		this.price = price;
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

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Topping: " + name + ", Price: " + price + " EUR, Calories: " + calories;
	}

}
