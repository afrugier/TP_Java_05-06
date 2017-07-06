package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDao;

public class ModifierPizzaOptionMenu extends OptionMenu {

	static Scanner questionAjout = new Scanner(System.in).useLocale(Locale.US);
	
	@Override
	public String getLibelle() {
		return "3. Mettre à jour une pizza";
	}

	@Override
	public boolean execute() {
		
		
		
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

			for (int i = 0; i < PizzaDao.listePizza.length; i++) {
				if (codePizza.equals(PizzaDao.listePizza[i].getCode())) {
					PizzaDao.listePizza[i].setCode(newCodePizza);
					PizzaDao.listePizza[i].setNom(newNomPizza);
					PizzaDao.listePizza[i].setPrix(newPrixPizza);
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
