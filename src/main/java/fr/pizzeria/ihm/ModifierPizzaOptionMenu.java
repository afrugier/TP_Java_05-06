package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu {

	static Scanner questionAjout = new Scanner(System.in).useLocale(Locale.US);

	/* (non-Javadoc)
	 * @see fr.pizzeria.ihm.OptionMenu#getLibelle()
	 */
	@Override
	public String getLibelle() {
		return "3. Mettre à jour une pizza";
	}

	/* (non-Javadoc)
	 * @see fr.pizzeria.ihm.OptionMenu#execute(fr.pizzeria.dao.IPizzaDao)
	 */
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

			Pizza pizza = new Pizza(newCodePizza,newNomPizza,newPrixPizza);
			dao.updatePizza(codePizza, pizza);
					
			System.out.println("Pizza Modifiée !");
			System.out.println("");
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.pizzeria.ihm.OptionMenu#getTitle()
	 */
	@Override
	public String getTitle() {
		return "Mise à jour d’une pizza";
	}

}
