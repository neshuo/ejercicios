package tema2;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("numero de repeticiones");
		int N=leer.nextInt();
		System.out.println("numero a repetir");
		int a=leer.nextInt();
		System.out.println("incremento");
		int b =leer.nextInt();
		
		int raid[];
		raid=new int[--N];
		
		for(int c=0; a<raid.length;c++) {
			System.out.println(a);
			a=a+b;
		}
		
	}

}
