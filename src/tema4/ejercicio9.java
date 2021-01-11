package tema4;

import java.util.Scanner;

public class ejercicio9 {
	public static int dos(int a, int b) {
		int dos;
		if (a<b) {
			dos=b;
		}
		else {
			dos=a;
		}
		return dos;
	}
	
	public static int fin(int c, int d) {
		int fin;
		if(c>d){
			fin=c;
		}
		else {
			fin=d;
		}
		return fin;
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce tres numeros");
		int J=leer.nextInt();
		int G=leer.nextInt();
		int H=leer.nextInt();
		
		int x=dos(J,G);
		int y=fin(x,H);
		System.out.println("el numero mayor es");
		System.out.println(y);
		
		
	}

}
