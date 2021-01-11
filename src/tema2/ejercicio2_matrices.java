package tema2;

public class ejercicio2_matrices {
	public static void main(String[] args) {
		int matriz[][]=new int [10][10];
		int numero =0;
		int multiplicando=1;
		for(int s=0;s<10;s++) {
			numero++;
			for(int a=0;a<10;a++) {
				matriz[s][a]=numero*multiplicando;
				multiplicando++;
			}
	}
		for(int d=0;d<10;d++) {
			System.out.println("");
			for(int f=0;f<10;f++) {
				System.out.print(matriz[d][f]+" ");
		}
		}
}
}