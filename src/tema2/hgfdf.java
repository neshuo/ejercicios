package tema2;
import java.util.Scanner;
import java.awt.event.KeyEvent;
public class hgfdf {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		//variables
		
		//1 prueba
		int S1= (int) (Math.random()*(10+1));
		int S2= (int) (20+Math.random()*(30-20+1));
		int p1=0;
		
		//2 prueba
		int d1= (int) (1+Math.random()*(7-1+1));
		int d2= (int) (8+Math.random()*(12-8+1));
		int p2=1;
		
		
		//3 prueba
		double N= (double) (50+Math.random()*(100-50+1));
		double p3=1;
		
		//4 prueba
		int P= (int) (10+Math.random()*(100-10+1));
		int resto=0;
		int p4=0;
		
		//5 prueba
		int M= (int) (5+Math.random()*(10-5+1));
		int S= (int) (5+Math.random()*(10-5+1));
		int t1=1;
		int t2=1;
		int p5;
		
		//resultados
		int r1;
		int r2;
		int r3;
		int r4 = 0;
		int r5;
		//bucles
		
		
		//etapes
		
		//etapa 1(inicio)
		System.out.println("=== STAR WARS C\u00d3DIGOS SECRETOS ===");
		System.out.println("Hace   mucho   tiempo,   en   una   galaxia   muy,   muy   lejana...   La   Princesa   Leia,\n"
		         +   "LukeSkywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robadaen una misi\u00f3n\n" 
				 +   "secreta para infiltrarse en otra estrella de la muerte que el imperio est\u00e1 construyendo para destruirla.\n");
		System.out.println("(Presiona Intro para continuar)"); 
	
		//etapa 2(primer problema)
		String comenzar ="";
		 do{
		    comenzar  = leer.nextLine();
		    System.out.println(comenzar);
		 }
		 while(!comenzar.equals("")); 
		 System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al");
		 System.out.print("Sistema "); 
		 System.out.print( S1 );
		 System.out.print(" en el sector ");
		 System.out.print(S2 );
		 System.out.print(", pero el sistema de navegaci�n est� estropeado y el\n"
		 		+ "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
		 		+ "Chewbacca, piloto experto, se da cuenta que falta el cuarto n�mero de la serie.\n"
		 		+ "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
		 		+ "calcular el sumatorio entre el n� del sistema y el n� del sector (ambos inclusive).\n"
		 		+ "�Qu� debe introducir?");
		 r1=leer.nextInt();
		 for (int V=S1;V<=S2;V++) {
			 p1=p1+V;
		 }
		 if(p1==r1) {
			 //etapa  3(segundo problema)
			System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
					+ "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
					+ "la intenci�n de pasar desapercibidos. De repente suena el comunicador. �Aqu�n");
					System.out.println("agente de espaciopuerto ");
					System.out.print(d1);
					System.out.print(" contactando con nave imperial ");
					System.out.print(d2);
					System.out.print(". No est�n destinados\n"
					+ "en este sector. �Qu� hacen aqu�?�. Han Solo coge el comunicador e improvisa. �Eh�\n"
					+ "tenemos un fallo en el� eh� condensador de fluzo... Solicitamos permiso para\n"
					+ "atracar y reparar la nave�. El agente, que no se anda con tonter�as, responde\n"
					+ "�Proporcione c�digo de acceso o abriremos fuego�. Han Solo ojea r�pidamente el\n"
					+ "manual del piloto que estaba en la guantera y da con la p�gina correcta. El c�digo\n"
					+ "es el productorio entre el n� del agente y el n� de la nave (ambos inclusive).\n"
					+ "�Cu�l es el c�digo?");
					r2=leer.nextInt();
					for(int A=d1;A<=d2;A++) {
						p2=p2*A;
					}
					if(p2==r2) {
						//etapa 4(tercer problema)
						System.out.println("Han Solo proporciona el c�digo correcto. Atracan en la estrella de la muerte, se\n"
								+ "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
								+ "desapercibidos y bajan. Ahora deben averiguar en qu� nivel de los ");
								System.out.print(N);
								System.out.print(" existentes se\n"
								+ "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
								+ "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
							    + "introducir una clave de acceso. Entonces recuerda la informaci�n que le proporcion�\n"
								+ "Lando Calrissian �La clave de acceso a los planos de la nave es el factorial de N/10\n"
								+ "(redondeando N hacia abajo), donde N es el n� de niveles�.\n"
								+ "�Cual es el nivel correcto?");
								r3=leer.nextInt();
								N=Math.floor((N)/10);
								for(double n=1;n<=N;n++) {
									p3=p3*n;
								}
								if(r3==p3) {
									//etapa 5(cuarto problema)
									System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
											+ "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
											+ "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
											+ "verificar si el n�mero ");
									System.out.print(P);
								    System.out.print(" Sys es primo o no. Si es primo introduce un 1, si no lo es\n"
											+ "introduce un 0.");
								    for(int z=2;z<=P;z++) {
								    	resto=P%z;
								    	if(resto==0) {
								    		p4=0;
								    		break;
								    	}
								    	if(z==P) {
								    		p4=1;
								    		break;
								    	}
								    }
								    r4=leer.nextInt();
								    }
								    if(p4==r4) {
								    	System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
								    			+ "programe el temporizador y salir de all� corriendo. Necesita programarlo para que\n"
								    			+ "explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n"
								    			+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
								    			+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
								    			+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar");
								    	        System.out.println("el factorial de ");
								    			System.out.print(M);
								    			System.out.print(" y el factorial de ");
								    			System.out.print(S);
								    			System.out.print(". �Qu� valor debe introducir?");
								    			p5=leer.nextInt();
								    			for(int j=1;j<=M;j++) {
								    				t1=t1*j;
								    			}
								    			
								    			for(int g=1;g<=S;S++) {
								    				t2=t2*g;
								    			}
								    			
								    			r5=t1+t2;
								    			if(r5==p5) {
								    				System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"      
								    				+ "sonar las alarmas. Salen de all� corriendo, no hay tiempo que perder. La nave se\n"
								    				+ "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
								    				+ "consiguen llegar a la nave y salir de all� a toda prisa. A medida que se alejan\n"
								    				+ "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
								    				+ "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
								    				+ "imperio.\n"
								    				+ "�Has salvado la galaxia gracias a la Fuerza Jedi de las matem�ticas! Enhorabuena ;D");
													 System.out.println("gracias por jugar :D");
								    			}
								    			else {
													 System.out.println("Ese no era el c�digo correcto� La misi�n ha sido un fracaso�\n"
																+ "Todav�a no eres un Maestro Jedi de las Matem�ticas. �Vuelve a intentarlo!");
														 System.out.println("gracias por jugar :D");
								    			}
								    			
								    			
								    }
							
								    else {
										 System.out.println("Ese no era el c�digo correcto� La misi�n ha sido un fracaso�\n"
													+ "Todav�a no eres un Maestro Jedi de las Matem�ticas. �Vuelve a intentarlo!");
											 System.out.println("gracias por jugar :D");
								    }
					}
								
								
								else {
									 System.out.println("Ese no era el c�digo correcto� La misi�n ha sido un fracaso�\n"
												+ "Todav�a no eres un Maestro Jedi de las Matem�ticas. �Vuelve a intentarlo!");
										 System.out.println("gracias por jugar :D");
								}}
					
		 
					else {
						 System.out.println("Ese no era el c�digo correcto� La misi�n ha sido un fracaso�\n"
									+ "Todav�a no eres un Maestro Jedi de las Matem�ticas. �Vuelve a intentarlo!");
							 System.out.println("gracias por jugar :D");
					}
		 

			}
}