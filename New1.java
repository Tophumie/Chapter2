import java.util.Scanner;

public class New1{

	public static void main(String... args){
		int a = 7 +3 * 6 /2 - 1;
		int b = 2 % 2 + 2 * 2 -2 / 2;
		int c = (3 * 9 * (3 + (9 * 3 / (3))));

		//Exercise 2.13
		System.out.printf("%d%n%d%n%d%n", a, b, c);

		//Exercise 2.14
		Scanner value = new Scanner(System.in);
		System.out.println("\n12 34");
		System.out.print("12 34");
		System.out.printf("%n%s","12 34");

		//Exercise 2.15
		System.out.print("\ninput first integer=");
		int Number1 = value.nextInt();

		System.out.print("input second integer=");
		int Number2 = value.nextInt();

		int Add = Number1 + Number2;
		System.out.printf("Add = %d%n", Add);

		int Product = Number1 * Number2;
		System.out.printf("Product = %d%n", Product);

		int Difference = Number1 - Number2;
		System.out.printf("Difference = %d%n", Difference);
		
		int Division = Number1 / Number2;
		System.out.printf("Division = %d%n", Division);



		//Exercise 2.16
		System.out.print("\nenter first digit:");
		int FirstDigit = value.nextInt();

		System.out.print("enter second digit:");
		int SecondDigit = value.nextInt();

		if(FirstDigit > SecondDigit){
		System.out.print("FirstDigit is larger than SecondDigit");
		}

		if(FirstDigit < SecondDigit){
		System.out.print("FirstDigit is smaller than SecondDigit");
		}

		if(FirstDigit == SecondDigit){
		System.out.print("FirstDigit is equal to SecondDigit");
		}


		//Exercise 2.17
		System.out.print("\nEnter first number:");
		int FirstNumber = value.nextInt();

		System.out.print("Enter second number:");
		int SecondNumber = value.nextInt();

		System.out.print("Enter third number:");
		int thirdNumber = value.nextInt();

		Add = FirstNumber + SecondNumber;
		System.out.printf("Add1 = %d%n", Add1);

		Add = FirstNumber + SecondNumber + ThirdNumber;
		int Average = Add1/3;
		
		System.out.printf("Average = %d%n", Average);

		int Mutilpy = FirstNumber * SecondNumber;
		System.out.printf("Multiply = %d%n", Multiply);

		int Biggest = 0;
		int Smallest = 0;

		if(FirstNumber > SecondNumber && FirstNumber > ThirdNumber){
		System.out.printf("FirstNumber is the largest");
		}

		if(FirstNumber < SecondNumber && FirstNumber < ThirdNumber){
		System.out.printf("FirstNumber is the Smallest");
		}

		if(SecondNumber > firstNumber && SecondNumber > ThirdNumber){
		System.out.printf("SecondNumber is the largest");
		}

		if(SecondNumber < FirstNumber && SecondNumber < ThirdNumber){
		System.out.printf("SecondNumber is the Smallest");
		}
	
		if(ThirdNumber > FirstNumber && ThirdNumber > SecondNumber){
		System.out.printf("ThirdNumber is the largest");
		}

		if(ThirdNumber < FirstNumber && ThirdNumber < SecondNumber){
		System.out.printf("ThirdNumber is the smallest");
		}
	}

}

