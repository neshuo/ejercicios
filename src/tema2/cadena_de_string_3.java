package tema2;
import java.util.Scanner;
public class cadena_de_string_3 {
	public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	System.out.println("Introduce nombre");
	String str1=leer.nextLine();
	System.out.println("Introduce 1r apellido");
	String str2=leer.nextLine();
	System.out.println("Introduce 2n apellido");
	String str3=leer.nextLine();
	String st1=str1.toUpperCase();
	String st2=str2.toUpperCase();
	String st3=str3.toUpperCase();
	System.out.print(st1.substring(0, 3));
	System.out.print(st2.substring(0, 3));
	System.out.print(st3.substring(0, 3));

	}

}
