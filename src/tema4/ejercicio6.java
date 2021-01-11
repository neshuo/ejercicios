package tema4;

import java.util.Scanner;

public class ejercicio6 {
	public static double iva(double a) {
		double iva=a;
		iva=iva * 121/100;
		return iva;
	}

	public static void main(String[] args) {

		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el precio 1");
		double J=leer.nextInt();

		double x=iva(J);
		System.out.println(x);
		
	}

}
