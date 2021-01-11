package tema4;
import java.util.Scanner;
public class ejercicio17 {
	public static int primos(int a) {
		int w=0;
		for(int i=2;i<a;i++) {
			if (a%i==0) {
				w=1;
				break;
			}
			else {
				w=0;
			}
		}
		return w;
	}

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		while(1==1) {
		System.out.println("introduce un numero, El 0 finaliza el programa");
		int N=leer.nextInt();
		if (N==0) {
			break;
		}
		int x=primos(N);
		if(N==1) {
			System.out.println("no es primo");
		}
		if(x==0) {
			System.out.println("no es primo");
		}
		if(x==1) {
			System.out.println("es primo");
		}
	}

}
}