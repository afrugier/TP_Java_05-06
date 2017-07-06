package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;

/**
 * @author pc
 * Fait la liste des pizzas situer dans le tableau listePizza
 *
 */
public class ListerPizzaOptionMenu extends OptionMenu {

	@Override
	public String getLibelle() {
		return "1. Lister les pizzas";
	}

	@Override
	public boolean execute() {
		for (int i = 0; i < PizzaDao.listePizza.length; i++) {

			if (PizzaDao.listePizza[i] != null) {

				// for (int j = 0; j < listePizza[i].length; j++) {
				// System.out.print(listePizza[i][j] + " ");
				// }
				System.out.print(PizzaDao.listePizza[i].getCode() + " -> " + PizzaDao.listePizza[i].getNom() + " ("
						+ PizzaDao.listePizza[i].getPrix() + ") ");

				System.out.println("");
			}
		}

		System.out.println("");

		return false;
	}

	@Override
	public String getTitle() {
		return "Liste des pizzas";
	}

}
