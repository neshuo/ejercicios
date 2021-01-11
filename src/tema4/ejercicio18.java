package tema4;
import java.util.Scanner;
public class ejercicio18 {
	public static int caracter(int a) {
		char X;
		String texto="TRWAGMYFPDXBNJZSQVHLCKE";
		X=texto.charAt(a);
		return X;
	}
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce su DNI:");
		int N=leer.nextInt();
		N=N%23;
		char x=(char) caracter(N);
		System.out.println(x);

	}

}
