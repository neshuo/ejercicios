package tema4;

import java.util.Scanner;

public class ejercicio3 {

	public static double minimo(double a, double b) {
		double min;
		if(a<b) {
			min=a;
		}
		else{
			min=b;
		}
		return min;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el primer numero");
		double J=leer.nextInt();
		System.out.println("introduce el segundo numero");
		double G=leer.nextInt();
		
		double x=minimo(J, G);
		System.out.println(x);
	}

}
