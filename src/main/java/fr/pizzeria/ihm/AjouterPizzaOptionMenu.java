package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {

	static Scanner questionAjout = new Scanner(System.in).useLocale(Locale.US);
	
	@Override
	public String getLibelle() {
		return "2. Ajouter une nouvelle pizza";
	}

	@Override
	public boolean execute(IPizzaDao dao) {
		System.out.println("Veuillez saisir le code");
		String codePizza = questionAjout.next();

		System.out.println("Veuillez saisir le nom (sans espace)");
		String nomPizza = questionAjout.next();

		System.out.println("Veuillez saisir le prix");
		double prixPizza = questionAjout.nextDouble();

		for (int i = 0; i < dao.findAllPizzas().length; i++) {

			if (dao.findAllPizzas()[i] == null) {

				Pizza pizza = new Pizza(i, codePizza, nomPizza, prixPizza);
				dao.saveNewPizza(pizza);

				System.out.println("Pizza Ajouté !");
				System.out.println("");
				break;
			}
		}
		return false;
	}

	@Override
	public String getTitle() {
		return "Ajout d’une nouvelle pizza";
	}
}
