package fr.pizzeria.ihm;

import fr.pizzeria.dao.IPizzaDao;

public abstract class OptionMenu {
	
	public OptionMenu(){
	}

	public abstract String getLibelle();
	public abstract String getTitle();
	public abstract boolean execute(IPizzaDao Dao);
}
