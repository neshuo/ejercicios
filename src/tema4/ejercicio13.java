package tema4;

import java.util.Scanner; 

public class ejercicio13 {
	
	public static double desc(double a, double b) {
		double desc;
		desc= a-b ;
		desc=(desc*a)/100;
		return desc;
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("intruduzca el precio del objeto sin descuento");
		double S=leer.nextInt();
		System.out.println("introducir el precio del objeto con descuento");
		double D=leer.nextInt();
		double x= desc(S,D);
		
		System.out.println("el descuento es del"+x+"%");
	}

}
