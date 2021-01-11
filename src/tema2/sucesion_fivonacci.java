package tema2;
import java.util.Scanner;
public class sucesion_fivonacci {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("numero de repeticiones");
		int a=leer.nextInt();
		int variable2=1;
		int fivonacci=1;
	
		System.out.println("la sucesion es:");
		for(int i=0;i<a;i++) {
			fivonacci=fivonacci+variable2;
			variable2=fivonacci-variable2;
			System.out.println(fivonacci);
		}
	}
}
