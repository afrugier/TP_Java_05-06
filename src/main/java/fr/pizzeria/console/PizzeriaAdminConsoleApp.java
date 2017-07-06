package fr.pizzeria.console;

import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.ihm.Menu;

/**
 * @author pc
 *
 */
public class PizzeriaAdminConsoleApp {
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		PizzaDao.init();
		
		Menu menu = new Menu();
		menu.manage();

	}		
}
