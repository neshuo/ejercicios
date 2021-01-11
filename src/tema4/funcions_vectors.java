import java.util.Arrays;
import java.util.Scanner;
public class funcions_vectors {

	
	public static void instrucciones() {
		
		System.out.println("introduce dos numeros para comenzar");
		
	}
	public static int vector1(int a, int b) {
		int numero1=0;
		if(a<b) {
			numero1=(int) (a+Math.random()*(b-a+1));
		}
		else {
			numero1=(int) (b+Math.random()*(a-b+1));
		}
		return numero1;
	}
	public static int vector2(int a,int b) {
		int numero2=0;
		if(a<b) {
			for (int v=a;v<=b;v++) {
				numero2=numero2+v;
			}
		}
		else {
			for (int v=b;v<=a;v++) {
				numero2=numero2+v;
			}
		}
		return numero2;
	}
	public static int vector3(int a,int b) {
		int numero3=1;
		if(a<b) {
			for (int v=a;v<=b;v++) {
				numero3=numero3*v;
			}
		}
		else {
			for (int v=b;v<=a;v++) {
				numero3=numero3*v;
			}
		}
		return numero3;
	}
	public static int minimo(int a) {
		int minimo=a;
		if(minimo>a) {
			minimo=a;
		}
		else {
			
		}
		return minimo;
	}
	public static int maximo(int a) {
		int maximo=a;
		if(maximo<a) {
			maximo=a;
		}
		else {
			
		}
		return maximo;
	}
	public static int primo(int a) {
		int primo=0;
		for(int v=2;v<a;v++) {
			if(a%v==0) {
				break;
			}
			if(v==a-1) {
				primo=v;
			}
	}
	return primo;
	}
	
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int x=leer.nextInt();
		int y=leer.nextInt();
		
		int vector1 []=new int [19];
		int vector2 []=new int [19];
		int vector3 []=new int [19];
		int vector4 []=new int [59];
		int vector5 []=new int [59];
		int minimo=0;
		int maximo=0;
		int primo=0;
		
		int q=vector1.length+vector1.length;
		int p=vector1.length+vector1.length+vector1.length;
		
		
		
		System.out.println("Funció que crea un vector de 20 elements entre els numeros aleatoris. Mostrar per pantalla.");
		for(int a=0;a<vector1.length;a++) {
			vector1[a]=vector1(x,y);
			System.out.println(vector1[a]);
		}
		System.out.println("Funció que crea un vector de 20 elements on cada valor es la suma de tots els numeros entre els dos aleatoris. Mostrar per pantalla.");
		for (int a=0;a<vector2.length;a++) {
			vector2[a]=vector2(x,y);
			System.out.println(vector2);
		}
		System.out.println(" Funció que crea un vector de 20 elements on cada valor es el producte de tots els numeros entre els dos aleatoris. Mostrar per pantalla.");
		for(int a=0;a<vector3.length;a++) {
			vector3[a]=vector3(x,y);
			System.out.println(vector3[a]);
		}
		System.out.println("Crear un vecor resultant de combinar els tres anteriors. Mostrar per pantalla.");
		for (int a=0;a<vector1.length;a++) {
			vector4[a]=vector1(x,y);
			System.out.println(vector4[a]);
		}
		for (int a=vector1.length;a<q;a++) {
			vector4[a]=vector2(x,y);
			System.out.println(vector4[a]);
		}
		for (int a=q+1;a<p;a++) {
			vector4[a]=vector3(x,y);
			System.out.println(vector4[a]);
		}
		System.out.println("funció que ordene el vector de forma ascendent.");
		Arrays.sort(vector4);
		for (int a=0;a<p;a++) {
			System.out.println(vector4[a]);
		}
		System.out.println("maximo");
		for(int a=0;a<p;a++) {
			minimo=minimo(vector4[a]);	
		}
		System.out.println(minimo);
		System.out.println("minimo");
		for(int a=0;a<p;a++) {
			maximo=maximo(vector4[a]);	
		}
		System.out.println(maximo);
		for(int a=0;a<p;a++) {
			primo=primo(vector4[a]);
			System.out.println(primo);
		}
	}
}


