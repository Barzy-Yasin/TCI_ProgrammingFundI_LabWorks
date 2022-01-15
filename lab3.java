// Developed by: Barzy Yasin Karim 

public class lab3 {

	public static void main(String[] args) {
		System.out.println("Developed by: Barzy Yasin Karim\n");
	//  Ex1
		System.out.print("-Lab3_Ex1st:\n");
		int x=5;
		int y=4;
		x--;
		x++;
		++x;
		x=x+y;
		y=(5 * x ++) / 3;
		System.out.println ("The value of x is : " + x );
		System.out.println ("The value of y is : " + y );
		System.out.println ("The value of y/x is : " + y/x );
		System.out.println ("The value of y%x is : " + y%x); 

	//  Ex2
		System.out.print("\n-Lab3_Ex2nd:\n");
		int x1=1;
		x1+=2;
		System.out.println ("The value of x is : " + x1 );
		x1 *=2;
		System.out.println("The value of x is : " + x1 );
		++x1;
		System.out.println ("The value of x is : " + x1 );
		x1/=2;
		System.out.println ("The value of x is : " + x1 );
		
	//  Ex3
		System.out.print("\n-Lab3_Ex3rd:\n");
		int x2=5,y2=3;
		x2+=2;
		x2 *=2;
		y2=x2++;
		x2/=2;
		x2/=y2;
		System.out.println("The value of x is: " + x2 + " \nThe value of y is: " + y2);

	//  Ex4
		System.out.print("\n-Lab3_Ex4th:\n");
		int x3=5,y3=3,z=0;
		x3+=2;
		x3*=2;
		y3=x3++;
		x3/=2;
		x3/=y3;
		z=2* ++x3;
		System.out.println("The value of z is :" + z );

	//  Ex4
		System.out.print("\n-Lab3_Ex5th:\n");
		System.out.print("(5 > 3) && (8 > 5)= ");
		System.out.println((5 > 3) && (8 > 5));
		System.out.print("(5 > 3) && (8 < 5)= ");
		System.out.println((5 > 3) && (8 < 5));
		System.out.print("(5 < 3) || (8 > 5)= ");
		System.out.println((5 < 3) || (8 > 5));
		System.out.print("(5 > 3) || (8 > 5)= ");
		System.out.println((5 > 3) || (8 > 5));
		System.out.print("!(5 == 3)= ");
		System.out.println(!(5 == 3));
		System.out.print("!(5 > 3)= ");
		System.out.println(!(5 > 3));
		

	}

}
