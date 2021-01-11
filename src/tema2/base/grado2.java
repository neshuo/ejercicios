package tema2;
import java.util.Scanner;
public class grado2 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
				
		//variable
	
		System.out.println("introduce la variable A");
		double A = leer.nextInt();
		System.out.println("introduce la variable B");
		double B = leer.nextInt();
		System.out.println("introduce la variable C");
	    double C = leer.nextInt();
	    double PrimeraSolucion=0;
	    double SegundaSolucion=0;
	    
	    //codigo
	    
	    if(A == 0) {
	    	System.out.println("no tiene solucion");
	    }
	    else {
	    	if((B*B) < (4*A*C)) {
	    		System.out.println("no tiene solucion");
	    	}
	    	else {
	    		PrimeraSolucion= -B;
	    		PrimeraSolucion= PrimeraSolucion+Math.sqrt((B*B)-(4*A*C));
	    		PrimeraSolucion= PrimeraSolucion/(2*A);
	    		System.out.println("La Primera solucion es:");
	    		System.out.print(PrimeraSolucion);
	    		System.out.println("");
	    		SegundaSolucion= -B;
	    		SegundaSolucion= SegundaSolucion-Math.sqrt((B*B)-(4*A*C));
	    		SegundaSolucion= SegundaSolucion/(2*A);
	    		System.out.println("La Segunda solucion es:");
	    		System.out.print(SegundaSolucion);
	    		
	    	}
	    }
		
		
		
		
		
		
		
		
		
		
	}
	

}
