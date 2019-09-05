import java.util.Scanner;
public class  Multiples{
	public static void main(String [] args){
		Scanner safe = new Scanner(System.in);

		System.out.print("input first integer: ");
		int number1 = safe.nextInt();


		System.out.print("input second integer: ");
		int number2 = safe.nextInt();

		if(number1 % number2 == 0){

			System.out.printf("%d is a multiple of %d%n", number1, number2);
	
		}

		if(number1 % number2 != 0){

			System.out.printf("%d is not a multiple of %d%n", number1, number2);
	
		}
	}
}


		