package tema2;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		
		int suma=0 
		int numeros[];
		numeros=new int [19];
		             
	    for(int a=0; a<=20; a++) {
	    	System.out.println("introduce un numero:");
	    	numeros [a]= leer.nextInt();
	    }
	    for(int b=0; b<=20 b++) {
	    	suma= numeros[b]+suma;
	    }
	    System.out.println(suma);
	}

}
