//Developed by: Barzy Yasin Karim

import java.util.Scanner;
public class lab4 {
	public static void main(String[] args) {
		System.out.println("Developed by: Barzy Yasin Karim\n");
		Scanner sc = new Scanner(System.in);
	//  Ex1
		System.out.print("-Lab4_Ex1st:\n");
		System.out.print("Enter 1st number: ");
		long no1 = sc.nextLong();
		System.out.print("Enter 2nd number: ");
		long no2 = sc.nextLong();
		System.out.print("Enter 3rd number: ");
		long no3 = sc.nextLong();
		System.out.print("Enter 4th number: ");
		long no4 = sc.nextLong();
		System.out.print("Enter 5th number: ");
		long no5 = sc.nextLong();
		long total = no1 + no2 + no3 + no4 + no5;
		long avg = total/5;
		System.out.println("The average of these 5 numbers is: "+ avg);

	//  Ex2
		System.out.print("\n-Lab4_Ex2nd:\n");
		System.out.print("please enter your name: ");
		String name = sc.next();
		System.out.print("Enter your gender: ");
		String gender = sc.next();
		System.out.print("Enter your age: ");
		String age = sc.next();
		System.out.print("Enter your address: ");
		String addr = sc.next();
		System.out.print("Enter your phone no.: +964 ");
		String phone = sc.next();
		System.out.println("\nYour name is: "+ name);
		System.out.println("Your gender is: "+ gender);
		System.out.println("Your age is: "+ age);
		System.out.println("Your phone no. is: +964"+ phone) ;
		System.out.println("Your address is: "+ addr);

	//  Ex3
		System.out.print("\n-Lab4_Ex3rd:\n");
		System.out.print("Enter the 1st float number: ");
		float f1 = sc.nextFloat();
		System.out.print("Enter the 2nd float number: ");
		float f2 = sc.nextFloat();
		float ftemp = 0.0f;
		ftemp = f1;
		f1 = f2;
		f2 = ftemp;
		System.out.println("after swapping this two float number we will get: ");
		System.out.println("The 1st float number: "+ f1);
		System.out.println("The 2nd float number: "+ f2);

	//  Ex4:  the area of circle.
		System.out.print("\n-Lab4_Ex4th:\n");
		final double pi = 22/7;
		System.out.print("Please enter the circle radius: ");
		double radius = sc.nextDouble();
		double area = radius * radius * pi;
		System.out.print("The circle area is: "+ area);
		System.out.println(",  with the radius of: "+ radius);
	}
}
