package tema4;
import java.util.Scanner;
public class ejerciciorepaso {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int  matriz[][]=new int [4][4];
        boolean salir = false;
        int opcion;
		int fila,columna;
		int filasuma = 0,columnasuma= 0,diagonalP=0,diagonalS=0,media=0;
		
		do {

			 System.out.println("Menu");
	            System.out.println("1. Rellenar Matriz");
	            System.out.println("2. Sumar fila");
	            System.out.println("3. Sumar columna");
	            System.out.println("4. Suma diagonal principal");
	            System.out.println("5. Suma diagonal inversa");
	            System.out.println("6. Media elementos");
	            System.out.println("7. Salir");
	            System.out.println("Elije una opcion");
	            opcion = leer.nextInt();
	           switch(opcion) {
	           case 1:
	        	   for(int s=0;s<4;s++) {
	        		   for(int a=0;a<4;a++) {
	        			   System.out.println("introduce un nuevo numero");
	        			   matriz[s][a]=leer.nextInt();
	        		   }
	        	   }
	        	   break;
	           case 2:
	        	   System.out.println("selecciona fila");
	        	   fila=leer.nextInt();
	        	   if(fila>3) {
	        		   System.out.println("error");
	        	   }
	        	   else {
	        		  for(int a=0;a<4;a++) {
	        			  filasuma=matriz[fila][a]+filasuma;
	        		  }
	        		  System.out.println(filasuma);
	        	   }
	        	   break;
	        	 
	           case 3:
	        	   System.out.println("selecciona columna");
	        	   columna=leer.nextInt();c
	        	   if(columna>3) {
	        		   System.out.println("error");
	        	   }
	        	   else {
	        		  for(int a=0;a<4;a++) {
	        			  columnasuma=matriz[a][columna]+columnasuma;
	        		  }
	        		  System.out.println(columnasuma);
	        	   }
	           case 4:
	        	   diagonalP=matriz[0][0]+matriz[1][1]+matriz[2][2]+matriz[3][3];
	        	   System.out.println(diagonalP);
	           case 5:
	        	   diagonalS=matriz[3][0]+matriz[2][1]+matriz[1][2]+matriz[0][3];
	        	   System.out.println(diagonalS);
	           case 6:
	        	   for(int s=0;s<4;s++) {
	        		   for(int a=0;a<4;a++) {
	        			   media=media+matriz[s][a];
	        		   }
	        	   }
	           case 7:
	        	   break;
	           }
		} 
		while (!salir);
	}
	}
		


