package tema2;

public class ejercicio1_Matrices {

	public static void main(String[] args) {
		int Matriz[][]=new int[5][5];
		int numero=0;
			for(int s=0;s<5;s++) {
				for(int a=0;a<5;a++) {
					numero++;
					Matriz[s][a]=numero;
				}
			}
			for(int d=0;d<5;d++) {
					System.out.println("");
					for(int f=0;f<5;f++)
						System.out.print(Matriz[d][f]+" ");
				}
			}
		}
	

