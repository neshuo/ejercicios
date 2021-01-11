package tema4;

public class ejercicio15 {
	public static double suma(double a) {
		double suma=0;
		suma=suma+a;
		return suma;
	}
	
	public static double media(double b) {
		double media=0;
		media=media+b;
		return media;
	}

	public static void main(String[] args) {
		double numeros[]=new double [100];
		for(int a=0; a<numeros.length;a++) {
			numeros[a]=a;
			double x= suma(numeros[a]);
			double media= media(numeros[a]);
			media =media/100;
			if(a==numeros.length-1) {
				System.out.println("la suma es:"+x);
				System.out.println("la media es:"+media);
			}
		}
	}
}
