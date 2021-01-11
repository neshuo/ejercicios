package tema4;
import java.util.Scanner;
public class calculadora {
	
	
	public static int mult(int J, int G) {
		int multiplicacion=J*G;
		return multiplicacion;
	}
	public static int suma(int a, int b) {
		int res=a+b;
		return res;
	}
	public static int resta(int J,int G) {
		int res=J-G;
		return res;
	}
	public static int division(int J, int G) {
		int div=J/G;
		return div;
	}
	
	public static void main(String[]args ) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int J=leer.nextInt();
		System.out.println("introduce el segundo numero");
		int G=leer.nextInt();
		
		int x = suma(J, G);
		int y =mult(J,G); 
		int z =resta(J,G);
		int w =division(J,G);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
}
