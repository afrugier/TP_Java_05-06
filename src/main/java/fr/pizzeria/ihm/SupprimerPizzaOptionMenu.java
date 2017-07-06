package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDao;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	static Scanner questionAjout = new Scanner(System.in).useLocale(Locale.US);
	
	@Override
	public String getLibelle() {
		return "4. Supprimer une pizza";
	}

	@Override
	public boolean execute() {
		
		System.out.println("Veuillez Choisir la pizza à supprimer");
		
		System.out.println("(99 pour abandonner)");
		String codePizza = questionAjout.next();
		if (!codePizza.equals("99")) {

			for (int i = 0; i < PizzaDao.listePizza.length; i++) {
				if (codePizza.equals(PizzaDao.listePizza[i].getCode())) {
					PizzaDao.listePizza[i] = null;
					System.out.println("Pizza Supprimée !");
					break;
				}
			}

			System.out.println("");

		}
		return false;
	}

	@Override
	public String getTitle() {
		return "Suppression d’une pizza";
	}

}
