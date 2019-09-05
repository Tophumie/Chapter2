import java.util.Scanner;
   public class Multiplication {


	public static void main(String[] args){

	    Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter first integer");
		int number1 = input.nextInt();

		System.out.println("Enter second integer");
		int number2 = input.nextInt();

		int multiply = number1 * number2;
		
		System.out.printf("multiply is %d%n", multiply);
	
	}
}
