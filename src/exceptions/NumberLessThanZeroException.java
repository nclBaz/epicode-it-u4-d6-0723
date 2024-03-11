package exceptions;

public class NumberLessThanZeroException extends RuntimeException {
	// Se estendo RuntimeException, sto creando una UNCHECKED EXCEPTION
	public NumberLessThanZeroException(int wrongNumber){

		super("Il numero " + wrongNumber + " è minore di zero!");
	}
}
