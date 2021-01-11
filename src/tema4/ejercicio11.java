package tema4;

import java.util.Scanner;

public class ejercicio11 {
	public static int mult(int b) {
		int mult;
		int c=0;
		mult=b*c;
		c++;
		return mult;
	}
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int N=leer.nextInt();
		System.out.println("la tabla de"+N);
		for(int a=0;a<=10;a++) {
			int x=mult(N);
			System.out.println(a+ "x" +N+ "=");
			System.out.println(x);
		}

	}

}
