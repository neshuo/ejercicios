package tema4;

import java.util.Scanner;

public class ejercicio10 {
	public static int dia(int a) {
		int dia;
		if(0<a) {
			if(a<=30) {
				dia=1;
			}
			else {
				dia=0;
			}
		}
		else {
			dia=0;
		}
		return dia;
	}
	public static int mes(int b) {
		int mes;
		if(b>0) {
			if(b<=12) {
				mes=1;
			}
			else {
				mes=0;
			}
		}
		else {
			mes=0;
		}
		return mes;
	}
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce dia/mes/año numeros");
		int J=leer.nextInt();
		int G=leer.nextInt();
		int H=leer.nextInt();
		
		int x=dia(J);
		if (x==1) {
			int y=mes(G);
			if(y==1) {
				System.out.println("es correcta");
			}
			else {
				System.out.println("es incorrecta");
			}
		}
		else {
			System.out.println("es incorrecta");
		}
		
		
	}

}
