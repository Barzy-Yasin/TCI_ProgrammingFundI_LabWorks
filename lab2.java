// Developed by: Barzy Yasin Karim 

public class lab2 {
	public static void main(String[] args) {
		System.out.println("Developed by: Barzy Yasin Karim\n");
	//  Ex1
		System.out.print("-Lab2_Ex1st:\n");
		double length = 22.4, width = 50.9, area=0;
		area = length*width;
		System.out.println("The rectangle Length and Width= " + length +" , "+ width + " accordingly." );
		System.out.println("The rule of rectangle area= Length x Width");
		System.out.println("The area of the rectangle is equal to= " + area +".");
				
	//  Ex2
		System.out.print("\n-Lab2_Ex2nd:\n");		
		int x=0, y=0;
		x = 2;
		y = 5;
		double z = x*y-(7-4)/3;
		System.out.println("The result is= " + z);

	//	Ex3
		System.out.print("\n-Lab2_Ex3rd:\n");		
		double D1 = 14.8, D2 = 5.3;
		double add=0, sub = 0, mul, div;
		add = D1 + D2;
		sub = D1 - D2;
		mul = D1 * D2;
		div = D1 / D2;
		System.out.println("  " + D1 +" + "+ D2 + "= " + add) ;
		System.out.println("  " + D1 +" - "+ D2 + "= " + sub) ;
		System.out.println("  " + D1 +" * "+ D2 + "= " + mul) ;
		System.out.println("  " + D1 +" / "+ D2 + "= " + div) ;
		
	//	Ex4
		System.out.print("\n-Lab2_Ex4th:\n");
		double var1 = 3 + 5;
		double var2 = var1 / 4;
		int var3 = 3 + 5;
		int var4 = var3 / 4;
		System.out.println(var2+ "   " +var4);
		
	//	Ex5
		System.out.print("\n-Lab2_Ex5th:\n");
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (10>2);
		boolean b4 = (10==2);
		System.out.println("Value of boolean variable b1 is: " + b1);
		System.out.println("Value of boolean variable b2 is: " + b2);
		System.out.println("Value of boolean variable b3 is: " + b3);
		System.out.println("Value of boolean variable b4 is: " + b4);		
	}
}






