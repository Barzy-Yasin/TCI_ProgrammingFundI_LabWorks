// Developed by: Barzy Yasin Karim 

import java.util.Scanner;
public class lab5 {
	public static void main(String args[]) {
		System.out.println("Developed by: Barzy Yasin Karim\n");
		Scanner sc = new Scanner(System.in);

	// ex1
		System.out.println("\nEx1: Positive vs Negative");
		// scanner to input your number).
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (num > 0)
			System.out.println(num + " is Positve +.");
		else if (num < 0)
			System.out.println(num + " is Negative -.");
		else
			System.out.println(num + " is Zero.");

	// ex2
		System.out.println("\nEx2: Even or Odd");
		System.out.print("Enter the number: ");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0)
			System.out.println(num1 + " is Even.");
		else
			System.out.println(num1 + " is Odd.");

	// ex3
		System.out.println("\nEx3: Marks Classification");
		System.out.print("Enter mark 1: ");
		int mark1 = sc.nextInt();

		System.out.print("Enter mark 2: ");
		int mark2 = sc.nextInt();

		System.out.print("Enter mark 3: ");
		int mark3 = sc.nextInt();

		System.out.print("Enter mark 4: ");
		int mark4 = sc.nextInt();

		int total = mark1 + mark2 + mark3 + mark4;
		double avg = total / 4;
		System.out.println("\nThe average is: " + avg);

		if (avg <= 100 && avg >= 85)
			System.out.println("*** Grade A ***");
		else if (avg < 85 && avg >= 65)
			System.out.println("*** Grade B ***");
		else if (avg < 65 && avg >= 50)
			System.out.println("Grade C ***");
		else if (avg < 50 && avg > 40)
			System.out.println("*** Grade D ***");
		else
			System.out.println("*** Invalid value ***");

	// ex4		
		System.out.println("\nEx4: Maximum Number");

		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int n3 = sc.nextInt();

		if (n1 == n2 && n1 == n3 && n2 == n3)
			System.out.println(" both number are 0 ");
		else if (n1 > n2 && n1 > n3)
			System.out.println(" 1st number is max= " + n1);
		else if (n2 > n3)
			System.out.println(" 2nd number is max= " + n2);
		else
			System.out.println(" 3rd number is max= " + n3);
	}
}







