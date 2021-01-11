package tema4;
import java.util.Scanner;
public class ejercicio16 {
	
	public static int rellenar(int a) {
		int r;
			r= (int) Math.random() ;
		return r;
	}
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("tamaño de raid");
		int N=leer.nextInt();
		N=N-1;
		int numeros[]=new int [N];
		for (int i=0;i<numeros.length; i++) {
			int x=rellenar(N);
			numeros[i]=x;
		}
	}

}
