package tema2;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("introducir primer numero:");
		int numero1= leer.nextInt();
		System.out.println("introducir segundo numero");
		int numero2= leer.nextInt();
		
		if(numero1<numero2) {
			int a=numero2-numero1;
			int raid[];
			raid=new int[a+1];
			for (int g =0;g<=a;g++) {
				raid[g]=numero1;
				System.out.println(raid[g]);
				numero1++;
			}
		}
		else {
			int a=numero1-numero2;
			int raids[]=new int[a+1];
			for(int h=0;h<=a;h--) {
				raids[h]=numero1;
				System.out.println(raids[h]);
				numero1--;
			}
			
		}
	}

}
