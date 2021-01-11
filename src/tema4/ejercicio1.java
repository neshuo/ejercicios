package tema4;
import java.util.Scanner;

public class ejercicio1 {

	public static int mult(int J, int G) {
		int multiplicacion=J*G;
		return multiplicacion;
	}
	

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int J=leer.nextInt();
		System.out.println("introduce el segundo numero");
		int G=leer.nextInt();

		int Y=mult(J,G);
		System.out.println(Y);
	}

}
