package tema2;
import java.util.Scanner;
public class cadena_de_texto_5 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introducir frase");
		String str1= leer.nextLine();
		int salida;
		int I=0;
		int F=str1.length();
		str1=str1.replace(" ", "");
		while(I<=F) {
			if(str1.charAt(I)!=str1.charAt(F)){
				if(F==I) {
					System.out.println("es palindomo");
				}
			}
			else {
				System.out.println("no es palindromo");
				break;
			}
		}
}
}
