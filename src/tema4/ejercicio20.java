package tema4;
import java.util.Scanner;
public class ejercicio20 {
	
	public static int mult(int a, int i) {
		int G;
		G=a*i;
		
		return G;
		
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introsduce el numero sobre el que se va a hacer la tabla de multiplicar");
		int N=leer.nextInt();
		for (int i=0;i<=10;i++) {
			int X=mult(N,i);
			System.out.println(N+" por "+i+" es igual a "+X);
		}
	}

}
