package tema2;
import java.util.Scanner;
public class ejercicio5_matrices {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int mhombres=0;
		int mmujeres=0;
		System.out.println("introducir numero de trabajadores");
		int N=leer.nextInt();
		int matriz[][]=new int [N][2];
		
		for(int s=0;s<2;s++) {
			if(s==0) {
				for(int a=0;a<N;a++) {
					System.out.println("genero de los trabajadores en 0(mujer) 1(hombre)");
					int Z=leer.nextInt();
					matriz[0][a]=Z;
				}
			}
			if(s==1) {
				for(int a=0;a<N;a++) {
					System.out.println("cobro de dicha persona");
					int H=leer.nextInt();
					matriz[1][a]=H;
				}
			}
		}
		for(int i=0;i<N;i++) {
			if (matriz[0][i]==0) {
				mmujeres=mmujeres+matriz[1][i];
			}
			if (matriz[0][i]==1) {
				mhombres=mhombres+matriz[1][i];
			}
		}
		mhombres=mhombres/N;
		mmujeres=mmujeres/N;
		
		System.out.println("salario medio de mujeres");
		System.out.println(mmujeres);
		System.out.println("salario medio de hombres");
		System.out.println(mhombres);
		
		
		
	}
}
