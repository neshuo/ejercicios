package tema2;
import java.util.Scanner;
public class ejercicio4_Matrices {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int alumno=0;
		double media1 =0, superior1= 0, inferior1 =0;
		double media2 =0, superior2= 0, inferior2 =0;
		double media3 =0, superior3= 0, inferior3 =0;
		double media4 =0, superior4= 0, inferior4 =0;
		double media5 =0, superior5= 0, inferior5 =0;
		double matriz[][]=new double [4][5];
		for(int s=0;s<4;s++) {
			int alum;
			alum++;
			for(int a=0;a<5;a++) {
				System.out.println("nota del alumno"+alum);
				int Z=leer.nextInt();
				matriz[s][a]=Z;
			}
		}
			for(int a=0;a<5;a++ ) {
			int s=0;
			
				//alumno 1

				matriz[1][a]=superior1;
					if(matriz[1][a]>superior1) {
						matriz[1][a]=superior1;
					}
				matriz[1][a]=inferior1;
					if(matriz[1][a]<inferior1) {
						matriz[1][a]=inferior1;
					}
					media1=media1+matriz[1][a];
				
				//alumno 2
				
				matriz[2][a]=superior2;
					if(matriz[2][a]>superior2) {
						matriz[2][a]=superior2;
					}
				matriz[2][a]=inferior2;
					if(matriz[2][a]<inferior2) {
						matriz[2][a]=inferior2;
					}
					media2=media2+matriz[1][a];
				
				//alumno3
					
				matriz[3][a]=superior3;
					if(matriz[3][a]>superior3) {
						matriz[3][a]=superior3;
					}
				matriz[3][a]=inferior3;
					if(matriz[3][a]<inferior3) {
						matriz[3][a]=inferior3;
					}
					media3=media3+matriz[3][a];
					
					
				//alumno 4
				
				matriz[4][a]=superior4;
					if(matriz[4][a]>superior4) {
						matriz[4][a]=superior4;
					}
				matriz[0][a]=inferior4;
					if(matriz[4][a]<inferior4) {
						matriz[4][a]=inferior4;
					}
					media4=media4+matriz[4][a];
					
			}
			media1=media1/5;
			media2=media2/5;
			media3=media3/5;
			media4=media4/5;
		}

	}

