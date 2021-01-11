package tema2;
import java.util.Scanner;
public class ejercicio3_Matrizes {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int superiores=0;
		int iguales=0;
		int inferiores=0;
		System.out.println("Introducir numero de filas");
		int N= leer.nextInt();
		System.out.println("Introducir numero de columnas");
		int M=leer.nextInt();
		int matriz[][]=new int [N][M];
		for(int s=0;s<N;s++) {
			for(int a=0;a<M;a++) {
				System.out.println("numero de la casilla"+" "+s+" "+a);
				int Z=leer.nextInt();
				matriz[s][a]=Z;
			}
		}
		for(int d=0;d<N;d++) {
			System.out.println("");
			for(int f=0;f<M;f++) {
				if(matriz [N][M]<0) {
					inferiores++;
				} 
				if(matriz [N][M]>0) {
					superiores++;
				}
				else {
					iguales++;
				}
		}
		}
		System.out.println("los inferiores son"+inferiores);
		System.out.println("los iguales son"+iguales);
		System.out.println("los superiores son"+superiores);
	}
}
