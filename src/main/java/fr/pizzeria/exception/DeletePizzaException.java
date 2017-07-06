package fr.pizzeria.exception;

public class DeletePizzaException extends Exception {
	public DeletePizzaException() {
        super();
    }

	public DeletePizzaException(String message) {
		super(message);
	}
}
