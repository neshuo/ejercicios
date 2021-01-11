package tema4;
import java.util.Scanner;
public class ejercicio19 {
	
	public static int calc(int a, int b, int c) {
		int r=0;
		a=a*a;
		b=b*b;
		c=c*c;
		int d=a+b;
		if (d==c) {
			r=1;
		}
		else {
			r=0;
		}
		
		return r;
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce los tres valores de la equacion");
		int A=leer.nextInt();
		int B=leer.nextInt();
		int C=leer.nextInt();
		
		int x=calc(A,B,C);
		if(x==1) {
			System.out.println("cumple la norma de pitagoras");
		}
		else {
			System.out.println("no cmple la norma de pitagoras");
		}
	}

}
