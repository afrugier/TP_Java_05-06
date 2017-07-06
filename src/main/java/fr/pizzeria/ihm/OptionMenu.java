package fr.pizzeria.ihm;

public abstract class OptionMenu {
	
	public OptionMenu(){
	}

	public abstract String getLibelle();
	public abstract String getTitle();
	public abstract boolean execute();
}
