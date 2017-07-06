package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public class ModifierPizzaOptionMenu extends OptionMenu {

	static Scanner questionAjout = new Scanner(System.in).useLocale(Locale.US);

	@Override
	public String getLibelle() {
		return "3. Mettre à jour une pizza";
	}

	@Override
	public boolean execute(IPizzaDao dao) {

		System.out.println("Veuillez Choisir la pizza à modifier");

		System.out.println("(99 pour abandonner)");
		String codePizza = questionAjout.next();

		if (!codePizza.equals("99")) {

			System.out.println("Veuillez saisir le nouveau code");
			String newCodePizza = questionAjout.next();

			System.out.println("Veuillez saisir le nouveau nom (sans espace)");
			String newNomPizza = questionAjout.next();

			System.out.println("Veuillez saisir le nouveau prix");
			double newPrixPizza = questionAjout.nextDouble();

			for (int i = 0; i < dao.findAllPizzas().length; i++) {
				if (codePizza.equals(dao.findAllPizzas()[i].getCode())) {
					dao.findAllPizzas()[i].setCode(newCodePizza);
					dao.findAllPizzas()[i].setNom(newNomPizza);
					dao.findAllPizzas()[i].setPrix(newPrixPizza);
					break;
				}
			}
			System.out.println("Pizza Modifiée !");
			System.out.println("");
		}
		return false;
	}

	@Override
	public String getTitle() {
		return "Mise à jour d’une pizza";
	}

}
