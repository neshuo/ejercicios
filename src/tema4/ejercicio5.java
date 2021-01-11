package tema4;

import java.util.Scanner;

public class ejercicio5 {
	public static double millas_a_kilometros(double a) {
		double millas=a;
		millas=millas * 160934/100000;
		return millas;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el numero");
		double J=leer.nextInt();

		double x=millas_a_kilometros(J);
		System.out.println(x);
	}

}
