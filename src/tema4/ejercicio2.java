package tema4;
import java.util.Scanner;
public class ejercicio2 {

	public static int EsMayordeEdad(int a) {
		int resultado=a;
		return resultado;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int J=leer.nextInt();
		int x=EsMayordeEdad(J);
		if(x<18) {
			System.out.println("es menor");
		}
		else {
			System.out.println("es maor de edad");
		}
	}

}
