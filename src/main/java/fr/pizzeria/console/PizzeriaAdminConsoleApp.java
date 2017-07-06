package fr.pizzeria.console;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

/**
 * @author pc
 *
 */
public class PizzeriaAdminConsoleApp {
	static Pizza[] listePizza = new Pizza[50];

	/**
	 * Initialisation du tableau listePizza
	 */
	public static void initPizza() {

		Pizza pep = new Pizza(0, "PEP", "Pépéroni", 12.50);
		Pizza mar = new Pizza(1, "MAR", "Margherita", 14.00);
		Pizza rei = new Pizza(2, "REI", "La reine", 11.50);
		Pizza fro = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		Pizza can = new Pizza(4, "CAN", "La cannibale", 12.50);
		Pizza sav = new Pizza(5, "SAV", "La savoyarde", 13.00);
		Pizza ori = new Pizza(6, "ORI", "L'orientale", 13.50);
		Pizza ind = new Pizza(7, "IND", "L'indienne", 14.00);

		listePizza[0] = pep;
		listePizza[1] = mar;
		listePizza[2] = rei;
		listePizza[3] = fro;
		listePizza[4] = can;
		listePizza[5] = sav;
		listePizza[6] = ori;
		listePizza[7] = ind;
	}

	/**
	 * @param args
	 * 
	 *  Affiche le menu de la pizzeria 
	 *  Gére les different choix de menu
	 * 
	 */
	public static void main(String[] args) {
		initPizza();

		int choixPizza = 0;
		do {

			System.out.println("***** Pizzeria Administration *****");

			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			Scanner choix = new Scanner(System.in);
			choixPizza = choix.nextInt();

			switch (choixPizza) {
			case 1:
				System.out.println("Liste des pizzas");
				listerLesPizza();
				break;
			case 2:
				System.out.println("Ajout d’une nouvelle pizza");
				ajoutPizza();
				break;
			case 3:
				System.out.println("Mise à jour d’une pizza");
				majPizza();
				break;
			case 4:
				System.out.println("Suppression d’une pizza");
				SupprPizza();
				break;
			case 99:
				System.out.println("Aurevoir :-(");
				break;
			default:
				break;
			}
		} while (choixPizza != 99);
	}

	/**
	 * Fait la liste des pizzas situer dans le tableau listePizza
	 */
	public static void listerLesPizza() {
		for (int i = 0; i < listePizza.length; i++) {

			if (listePizza[i] != null) {

				// for (int j = 0; j < listePizza[i].length; j++) {
				// System.out.print(listePizza[i][j] + " ");
				// }
				System.out.print(listePizza[i].getCode() + " -> " + listePizza[i].getNom() + " (" + listePizza[i].getPrix() + ") ");

				System.out.println("");
			}
		}

		System.out.println("");
	}

	/**
	 * Ajoute une pizza au tableau listePizza
	 */
	public static void ajoutPizza() {

		System.out.println("Veuillez saisir le code");
		Scanner code = new Scanner(System.in);
		String codePizza = code.next();

		System.out.println("Veuillez saisir le nom (sans espace)");
		Scanner nom = new Scanner(System.in);
		String nomPizza = nom.next();

		System.out.println("Veuillez saisir le prix");
		Scanner prix = new Scanner(System.in).useLocale(Locale.US);
		double prixPizza = prix.nextDouble();

		for (int i = 0; i < listePizza.length; i++) {

			if (listePizza[i] == null) {

				listePizza[i] = new Pizza( i, codePizza, nomPizza, prixPizza );

				System.out.println("Pizza Ajouté !");
				System.out.println("");
				break;
			}
		}
	}

	/**
	 * Modifie une pizza du tableau listePizza
	 */
	public static void majPizza() {
		listerLesPizza();
		System.out.println("Veuillez Choisir la pizza à modifier");
		System.out.println("(99 pour abandonner)");
		Scanner code = new Scanner(System.in);
		String codePizza = code.next();
		if (!codePizza.equals("99")) {

			System.out.println("Veuillez saisir le nouveau code");
			Scanner newCode = new Scanner(System.in);
			String newCodePizza = newCode.next();

			System.out.println("Veuillez saisir le nouveau nom (sans espace)");
			Scanner newNom = new Scanner(System.in);
			String newNomPizza = newNom.next();

			System.out.println("Veuillez saisir le nouveau prix");
			Scanner newPrix = new Scanner(System.in).useLocale(Locale.US);
			double newPrixPizza = newPrix.nextDouble();

			for (int i = 0; i < listePizza.length; i++) {
				if (codePizza.equals(listePizza[i].getCode())) {
					listePizza[i].setCode(newCodePizza);
					listePizza[i].setNom(newNomPizza);
					listePizza[i].setPrix(newPrixPizza);
					break;
				}
			}
			System.out.println("Pizza Modifiée !");
			System.out.println("");
		}

	}

	/**
	 * Supprime une Pizza du tableau listePizza
	 */
	public static void SupprPizza() {
		listerLesPizza();
		System.out.println("Veuillez Choisir la pizza à supprimer");
		System.out.println("(99 pour abandonner)");
		Scanner code = new Scanner(System.in);
		String codePizza = code.next();
		if (!codePizza.equals("99")) {

			for (int i = 0; i < listePizza.length; i++) {
				if (codePizza.equals(listePizza[i].getCode())) {
					listePizza[i] = null;
					System.out.println("Pizza Supprimée !");
					break;
				}
			}

			System.out.println("");

		}
	}
}
