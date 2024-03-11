public class Main {
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


	}

	public static void print(String stringa){
		System.out.println(stringa);
		// print(stringa); // <-- StackOverflowError
	}
}