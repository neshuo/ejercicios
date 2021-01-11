package tema2;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[]args) {
		Scanner leer=new Scanner(System.in);
		
		double altura[];
		altura = new double[9];
		double media=0;
		double mayor=0
		double menor=0
		
		
		for(double a=0; a<altura.length;a++) {
			System.out.println("introduce una altura:");
			altura[a]=leer.nextInt();
			media=media+altura[a];
		}
		for(double a=0;a<=9;a++) {
			if mayor<altura[a] {
					mayor==altura[a];
			}
			if menor>altura[a] {
				menor==altura[a];
			}		
		System.out.println("el mayor es:");
		System.out.print(mayor);
		System.out.println("el menor es:");
		System.out.print(menor);
		System.out.println("la media es:");
		System.out.print(media);
		
		
	}
}