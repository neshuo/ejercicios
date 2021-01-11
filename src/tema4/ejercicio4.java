package tema4;
import java.util.Scanner;
public class ejercicio4 {

	public static int signo(int a) {
		int signo;
		if(a<0) {
			signo=-1;
		}
		if(a>0) {
			signo=1;
		}
		else{
			signo=0;
		}
		return signo;
	}
	
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el numero");
		int J=leer.nextInt();
		
		int x=signo(J);
		System.out.println(x);
	}

}
