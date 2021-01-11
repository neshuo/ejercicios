package tema4;

import java.util.Scanner;

public class ejercicio7 {
	public static double area(double a, double b) {
		double area=a;
		area= (a*b)/2;
		return area;
	}
	
	public static double perimetro(double a, double b) {
		double per;
		per=a+b+Math.sqrt((a*a)+(b*b));
		return per;
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce la base");
		double J=leer.nextInt();
		System.out.println("introduce la altura");
		double G=leer.nextInt();

		double x=area(J,G);
		double y=perimetro(J,G);
		System.out.println("el area es");
		System.out.println(x);
		System.out.println("el perimetro es");
		System.out.println(y);

	}

}
