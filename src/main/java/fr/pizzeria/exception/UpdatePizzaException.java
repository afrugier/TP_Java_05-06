package fr.pizzeria.exception;

public class UpdatePizzaException extends Exception {
	public UpdatePizzaException() {
        super();
    }

	public UpdatePizzaException(String message) {
		super(message);
	}
}
