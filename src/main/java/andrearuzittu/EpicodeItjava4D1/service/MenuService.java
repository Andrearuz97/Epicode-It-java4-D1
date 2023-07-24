package andrearuzittu.EpicodeItjava4D1.service;

import java.util.ArrayList;
import java.util.List;

import andrearuzittu.EpicodeItjava4D1.model.Drink;
import andrearuzittu.EpicodeItjava4D1.model.Franchise;
import andrearuzittu.EpicodeItjava4D1.model.Pizza;
import andrearuzittu.EpicodeItjava4D1.model.Topping;

public class MenuService {
	private List<Pizza> pizzas;
	private List<Topping> toppings;
	private List<Drink> drinks;
	private Franchise franchise;

	public MenuService() {

		pizzas = new ArrayList<>();
		toppings = new ArrayList<>();
		drinks = new ArrayList<>();

		franchise = new Franchise(10.0);
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	public void addDrink(Drink drink) {
		drinks.add(drink);
	}

	public void setFranchisePrice(double price) {
		franchise.setPrice(price);
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public List<Drink> getDrinks() {
		return drinks;
	}

	public double getFranchisePrice() {
		return franchise.getPrice();
	}
}
