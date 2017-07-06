package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoire implements IPizzaDao{

	public Pizza[] listePizza = new Pizza[50];

	public PizzaDaoMemoire() {

		listePizza[0] = new Pizza(0, "PEP", "Pépéroni", 12.50);
		listePizza[1] = new Pizza(1, "MAR", "Margherita", 14.00);
		listePizza[2] = new Pizza(2, "REI", "La reine", 11.50);
		listePizza[3] = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		listePizza[4] = new Pizza(4, "CAN", "La cannibale", 12.50);
		listePizza[5] = new Pizza(5, "SAV", "La savoyarde", 13.00);
		listePizza[6] = new Pizza(6, "ORI", "L'orientale", 13.50);
		listePizza[7] = new Pizza(7, "IND", "L'indienne", 14.00);
	}

	public Pizza[] findAllPizzas() {
		return listePizza;
	}

	public boolean saveNewPizza(Pizza pizza) {
		
		for (int i = 0; i < findAllPizzas().length; i++) {

			if (findAllPizzas()[i] == null) {

				findAllPizzas()[i] = new Pizza(i, pizza.getCode(), pizza.getNom(), pizza.getPrix());
				break;
			}
		}
		
		return false;
	}

	public boolean updatePizza(String codePizza, Pizza pizza) {
		return false;
	}

	public boolean deletePizza(String codePizza) {
		return false;
	}

}
