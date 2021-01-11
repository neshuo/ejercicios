package ejercicio4ARTICULO;
import java.util.Scanner;
public class almacen {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		articulo articulo1=new articulo();
		
		articulo1.Nombre=leer.toString();
		articulo1.precio=leer.nextDouble();
		articulo1.cuantosQuedan=leer.nextInt();

	}

}
