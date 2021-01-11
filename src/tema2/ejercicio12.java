package tema2;
import java.util.Scanner;
public class ejercicio12 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int Raid [];
		Raid= new int[9];
		String varia="a";
		int V;
		int P;
		
		while(varia!="c") {
			System.out.println("a.Mostrar Valores");
			System.out.println("b.Introducir valor");
			System.out.println("c.Salir");	
			varia=leer.nextLine();
			
			switch (varia)
			{
			case "a":
				for(int d=0;d<Raid.length;d++) {
					System.out.println(Raid[d]);
				}
				break;
			case "b":
				System.out.println("introducir numero:");
				V=leer.nextInt();
				System.out.println("introducir posicion:");
				P=leer.nextInt();
				
				Raid[P]=V;
				break;
			case "c":
				return;
			}
		}
		
	}

}
