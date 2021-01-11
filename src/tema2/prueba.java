package tema2;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int M= (int) (5+Math.random()*(10-5+1));
		int S= (int) (5+Math.random()*(10-5+1));
		int t1=1;
		int t2=1;
		int p5=1;
		int r5;

		System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
    			+ "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
    			+ "explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n"
    			+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
    			+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
    			+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar");
    	        System.out.println("el factorial de ");
    			System.out.print(M);
    			System.out.print(" y el factorial de ");
    			System.out.print(S);
    			System.out.print(". ¿Qué valor debe introducir?");
    			for(int j=1;j<=M;j++) {
    				t1=t1*j;
    			}
    			
    			for(int g=1;g<=S;S++) {
    				t2=t2*g;
    			}
    			
    			r5=t1+t2;
    			System.out.println(r5);
    			if(r5==p5) {
    				System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"      
    				+ "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
    				+ "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
    				+ "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
    				+ "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
    				+ "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
    				+ "imperio.\n"
    				+ "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
					 System.out.println("gracias por jugar :D");
		

		
		
		

		 }
	
	}
}
