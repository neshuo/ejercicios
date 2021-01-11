package tema4;

import java.util.Scanner;

public class ejercico8 {
	public static double sumatorio(double a) {
		double suma=0;
		for(int i=1;i<=a;i++) {
			suma=suma+i;
		}
			
		return suma;
	}
	
	public static double productorio(double a) {
		double prod=1;
		for(int i=1;i<=a;i++) {
			prod=prod*i;
		}
		return prod;
	}
	
	public static double intermedio(double a) {
		double inter=0;
		inter=a/2;
		return inter;
	}
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce un numero");
		double J=leer.nextInt();

		double x=sumatorio(J);
		double y=productorio(J);
		double z=intermedio(J);
		System.out.println("el sumatorio");
		System.out.println(x);
		System.out.println("el producto");
		System.out.println(y);
		System.out.println("el valor intermedio");
		System.out.println(z);

	}

}
