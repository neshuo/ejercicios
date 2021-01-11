package tema4;

import java.util.Scanner;

public class ejercicio12 {
	
	public static double canv(double a) {
		double canv;
		canv=a/1.60934;
		
		return canv;
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		double K=leer.nextInt();
		double x=canv(K);
		System.out.println(K+"kilometros son"+x+"millas");
	}

}
