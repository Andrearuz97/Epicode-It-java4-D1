package andrearuzittu.EpicodeItjava4D1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import andrearuzittu.EpicodeItjava4D1.config.AppConfig;
import andrearuzittu.EpicodeItjava4D1.model.Drink;
import andrearuzittu.EpicodeItjava4D1.model.Pizza;
import andrearuzittu.EpicodeItjava4D1.model.Topping;
import andrearuzittu.EpicodeItjava4D1.service.MenuService;

public class EpicodeItJava4D1Application {

	public static void main(String[] args) {
		SpringApplication.run(EpicodeItJava4D1Application.class, args);

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(acac.getBean("getSaluto"));
		System.out.println(acac.getBean("getRisposta"));
		MenuService menuService = acac.getBean(MenuService.class);

		Pizza margherita = new Pizza("Margherita", 8.5, "Standard", false, false, 2000);
		menuService.addPizza(margherita);

		menuService.addTopping(new Topping("Prosciutto", 1.5, 50));

		menuService.addDrink(new Drink("Acqua", 1.0, 0));
		menuService.addDrink(new Drink("Coke", 3.0, 100));

		menuService.setFranchisePrice(10.0);

		System.out.println("Menu:");
		System.out.println("Pizze: " + menuService.getPizzas());
		System.out.println("Toppings: " + menuService.getToppings());
		System.out.println("Bevande: " + menuService.getDrinks());
		System.out.println("Prezzo Franchise: " + menuService.getFranchisePrice());

		acac.close();
	}
}
