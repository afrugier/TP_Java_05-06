package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * @author pc
 *
 */
public interface IPizzaDao {
	Pizza[] findAllPizzas();
	/**
	 * @param pizza
	 * @return
	 */
	boolean saveNewPizza(Pizza pizza);
	/**
	 * @param codePizza
	 * @param pizza
	 * @return
	 */
	boolean updatePizza(String codePizza, Pizza pizza);
	/**
	 * @param codePizza
	 * @return
	 */
	boolean deletePizza(String codePizza);
}
