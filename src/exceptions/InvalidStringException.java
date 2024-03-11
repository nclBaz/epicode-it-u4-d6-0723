package exceptions;

public class InvalidStringException extends Exception {
	// Se estendo Exception, sto creando una CHECKED EXCEPTION
	public InvalidStringException(String stringa){
		super("La stringa " + stringa + " non è corretta!");
	}
}
