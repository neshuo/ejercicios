package tema2;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//variables
		

		System.out.println("numero de raids:");
		int a= leer.nextInt();
		System.out.println("numero a repetir:");
		int b= leer.nextInt();
		int raid[];
		raid= new int[a];
		
		for(int c=0;c<=a;c++) {
			raid[c]=b;
		}
		for(int d=0; d<=a;d++) {
			System.out.println(raid[d]);
		}
				
	}

}
