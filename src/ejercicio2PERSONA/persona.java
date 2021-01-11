package ejercicio2PERSONA;
import java.util.Scanner;
public class persona {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		datos persona1=new datos();
		datos persona2=new datos();
		
		System.out.println("introduce el DNI de la primera persona");
		persona1.DNI=leer.toString();
		System.out.println("introduce nombre de la primera persona");
		persona1.nombre=leer.toString();
		System.out.println("introduce el apellido de la primera persona");
		persona1.apellidos=leer.toString();
		System.out.println("introduce la edad de la primera persona");
		persona1.edad=leer.nextInt();
		
		System.out.println("introduce el DNI de la segunda persona");
		persona2.DNI=leer.toString();
		System.out.println("introduce nombre de la segunda persona");
		persona2.nombre=leer.toString();
		System.out.println("introduce el apellido de la segunda persona");
		persona2.apellidos=leer.toString();
		System.out.println("introduce la edad de la segunda persona");
		persona2.edad=leer.nextInt();
		
		System.out.println(persona1.nombre + persona1.apellidos +"de DNI"+ persona1.DNI);
		if(persona1.edad<18) {
			System.out.print("es menor de edad");
		}
		else {
			System.out.print("es mayor de edad");
		}
		
		System.out.println(persona2.nombre + persona2.apellidos +"de DNI"+ persona2.DNI);
		if(persona2.edad<18) {
			System.out.print("es menor de edad");
		}
		else {
			System.out.print("es mayor de edad");
		}
	}
	
	

}
