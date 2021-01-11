package tema2;
import java.util.Scanner;
public class cadena_de_texto_2 {

	public static void main(String[] args) {
		Scanner leer=new Scanner (System.in);
		System.out.println("introduce la primera string");
		String str1=new String (leer.nextLine());
		System.out.println("introducir la segunda string");
		String str2=new String (leer.nextLine());
		System.out.println("contando caracteres");
		boolean Salida=str1.equals(str2);
		System.out.println(Salida);
		System.out.println("sin contar caracteres");
		boolean salida=str1.equalsIgnoreCase(str2);
		System.out.println(salida);
	}

}
