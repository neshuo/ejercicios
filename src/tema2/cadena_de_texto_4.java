package tema2;
import java.util.Scanner;
public class cadena_de_texto_4 {

	public static void main(String[] args) {
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("introducir frase a analizar:");
		String str1=leer.nextLine();
		for(int x=0;x<str1.length();x++) {
			 if (str1.charAt(x)=='a'){
				 a++;
			 }
			 if (str1.charAt(x)=='e') {
				 e++;
			 }
			 if (str1.charAt(x)=='i') {
				 i++;
			 }
			 if (str1.charAt(x)=='o') {
				 o++;
			 }
			 if (str1.charAt(x)=='u'){ 
				 u++;
			 }
	     }
		System.out.println("Hay tantas a");
		System.out.println(a);
		System.out.println("Hay tantas e");
		System.out.println(e);
		System.out.println("Hay tantas i");
		System.out.println(i);
		System.out.println("Hay tantas o");
		System.out.println(o);
		System.out.println("Hay tantas u");
		System.out.println(u);
		
}
	}
