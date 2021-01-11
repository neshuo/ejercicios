package tema4;
import java.util.Scanner;
public class hundir_la_flota {
	public static void Rellenar_tabla_jugador(String tablaJugador[][]){
		tablaJugador[0][0]=" ";
		tablaJugador[0][1]="1";
		tablaJugador[0][2]="2";
		tablaJugador[0][3]="3";
		tablaJugador[0][4]="4";
		tablaJugador[0][5]="1";
		tablaJugador[0][6]="5";
		tablaJugador[0][7]="6";
		tablaJugador[0][8]="7";
		tablaJugador[0][9]="8";
		tablaJugador[0][10]="9";
		tablaJugador[1][0]="A";
		tablaJugador[2][0]="B";
		tablaJugador[3][0]="C";
		tablaJugador[4][0]="D";
		tablaJugador[5][0]="E";
		tablaJugador[6][0]="F";
		tablaJugador[7][0]="G";
		tablaJugador[8][0]="H";
		tablaJugador[9][0]="I";
		tablaJugador[10][0]="J";
	}
	public static String Rellenar_tabla(int b) {
		String x= "-" ;
		return x;
	}
	public static void insertar_portaviones(String[][]tablaMaquina) {
		int a;
		int b;
		int c=0;
		while(c==0) {
			a=(int) (Math.random() * (4+1));
			b=(int) (Math.random() * (9+1));
		if(tablaMaquina[a][b]=="-" && tablaMaquina[a+1][b]=="-" &&  tablaMaquina[a+2][b]=="-" && tablaMaquina[a+3][b]=="-" && tablaMaquina[a+4][b]=="-") {
		tablaMaquina[a][b]="P";
		tablaMaquina[a+1][b]="P";
		tablaMaquina[a+2][b]="P";
		tablaMaquina[a+3][b]="P";
		tablaMaquina[a+4][b]="P";
		c++;
		}
		}
	}
	public static void insertar_lancha(String tablaMaquina[][]) {
		int a;
		int b;
		int c=0;
		while(c==0) {
			b=(int) (Math.random() * (9+1));
			a=(int) (Math.random() * (9+1));
		if(tablaMaquina[a][b]=="-") {
		tablaMaquina[a][b]="L";
		c++;
		}
		}
	}
	public static void insertar_buque(String[][]tablaMaquina) {
		int a;
		int b;
		int c=0;
		while(c==0) {
			a=(int) (Math.random() * (9+1));
			b=(int) (Math.random() * (7+1));
		if(tablaMaquina[a][b]=="-" && tablaMaquina[a][b+1]=="-" && tablaMaquina[a][b+2]=="-") {
		tablaMaquina[a][b]="B";
		tablaMaquina[a][b+1]="B";
		tablaMaquina[a][b+2]="B";
		c++;
		}
		}
	}
	public static void insertar_acorazado(String[][]tablaMaquina) {
		int a;
		int b;
		int c=0;
		while(c==0) {
			a=(int) (Math.random() * (9+1));
			b=(int) (Math.random() * (6+1));
		if(tablaMaquina[a][b]=="-" && tablaMaquina[a][b+1]=="-" && tablaMaquina[a][b+2]=="-" && tablaMaquina[a][b+3]=="-") {
		tablaMaquina[a][b]="Z";
		tablaMaquina[a][b+1]="Z";
		tablaMaquina[a][b+2]="Z";
		tablaMaquina[a][b+3]="Z";
		c++;
		}
		}
	}
	public static void main(String[] args) {
		Scanner leer= new Scanner (System.in);
		String tablaJugador[][]=new String [11][11];
		String tablaMaquina[][]=new String [10][10];
		int L=5;
		int B=3;
		int Z=1;
		int P=1;
		for(int a=0;a<10;a++) {
			for(int b=0;b<10;b++) {
				tablaMaquina[a][b]=Rellenar_tabla(b);
			}
		}
		while (L>0) {
			insertar_lancha(tablaMaquina);
			L--;
		}
		while (B>0) {
			insertar_buque(tablaMaquina);
			B--;
		}
		while (Z>0) {
			insertar_acorazado(tablaMaquina);
			Z--;
		}
		while (P>0) {
			insertar_portaviones(tablaMaquina);
			P--;
		}
		
		for(int a=1;a<11;a++){
			for(int b=1;b<11;b++) {
				tablaJugador[a][b]=Rellenar_tabla(b);
			}
		}
			Rellenar_tabla_jugador(tablaJugador);
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++) {
				System.out.print(tablaMaquina[a][b]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
	}

}
