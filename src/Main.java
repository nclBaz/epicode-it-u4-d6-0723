import entities.User;
import exceptions.InvalidStringException;
import exceptions.NumberLessThanZeroException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		// *********************************************** ECCEZIONI UNCHECKED *****************************
/*		int[] numbers = {1,2,3,4,5,6};
		int index = 10;
		if(index <= numbers.length -1 ) System.out.println(numbers[10]); // <-- ArrayIndexOutOfBoundsException

		String input = "o1h23hi23h";
		//System.out.println(Integer.parseInt(input)); // <-- NumberFormatException

		String qualcosa = "Qualcosa";
		qualcosa = null;

		if(qualcosa != null)  System.out.println(qualcosa.length()); // <-- NullPointerException

		int num1 = 2;
		int num2 = 0;

		// System.out.println(num1 / num2); // <-- ArithmeticException

		print("qualcosa");

		System.out.println("CIAO");*/

		// *********************************************** ECCEZIONI CHECKED *****************************
/*		try {
			Thread.sleep(2000);
			System.out.println("CIAO");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/

		// ************************************************* CUSTOM EXCEPTIONS ************************************

		//throw new NumberLessThanZeroException(-1);


/*		User u = new User("Aldo", "Baglio");
		try {
			u.setName("a");
		} catch (InvalidStringException | NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Errore generico");
		}

		System.out.println("CIAO");*/

/*		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Dammi il primo numero");
			int primo = input.nextInt();
			System.out.println("Dammi il secondo");
			int secondo = input.nextInt();
			System.out.println("Il risultato è : " + (primo / secondo));
		} catch (ArithmeticException ex) {
			System.err.println("Non puoi dividere per zero");
		} catch (InputMismatchException ex) {
			System.err.println("Non hai inserito un numero!");
		}
		finally {
			input.close();
			// Lo scanner verrà chiuso correttamente sia in caso di errore che no
		}*/

		logger.info("CIAO");
		logger.error("KABOOOOOOOOOOOOOM");


	}
/*
	public static void print(String stringa){
		System.out.println(stringa);
		// print(stringa); // <-- StackOverflowError
	}*/
}