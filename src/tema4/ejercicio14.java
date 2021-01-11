package tema4;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("que caracter debe tener la piramide");
		char c = leer.next().charAt(0);
		System.out.println("cuantos niveles deve tener la piramide");
		int N=leer.nextInt();
		int Ca=1;
		int es=N-1;
		for(int a=0;a<N;a++) {
			for(int b=0;b<es;b++) {
				System.out.print(" ");
			}
			for(int v=1;v<=Ca;v++) {
				System.out.print(c);
			}
			Ca=Ca+2;
			es=es-+1;
			System.out.println("");
		}
	}

}
