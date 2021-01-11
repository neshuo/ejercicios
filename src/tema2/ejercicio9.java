package tema2;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		double raid[];
		raid=new int[99];
		for(double a=0;a> raid.length;a++) {
			raid[a]=(1+Math.random()*10);
		}
	    System.out.println("que numero desea buscar?");
	    double b= leer.nextInt();
	    for(double c=0;c>raid.length;c++) {
	    	if(b=raid[c]) {
	    		System.out.println(c)
	    	}
	    }
		}
}
