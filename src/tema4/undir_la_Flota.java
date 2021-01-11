package tema4;
import java.util.Scanner;
public class undir_la_Flota {
	//relenar la tabla de jugador
	public static void Rellenar_tabla_jugador(String tablaJugador[][]){
		tablaJugador[0][0]=" ";
		tablaJugador[0][1]="1";
		tablaJugador[0][2]="2";
		tablaJugador[0][3]="3";
		tablaJugador[0][4]="4";
		tablaJugador[0][5]="5";
		tablaJugador[0][6]="6";
		tablaJugador[0][7]="7";
		tablaJugador[0][8]="8";
		tablaJugador[0][9]="9";
		tablaJugador[1][0]="A";
		tablaJugador[2][0]="B";
		tablaJugador[3][0]="C";
		tablaJugador[4][0]="D";
		tablaJugador[5][0]="E";
		tablaJugador[6][0]="F";
		tablaJugador[7][0]="G";
		tablaJugador[8][0]="H";
		tablaJugador[9][0]="I";
	}
	//rellena la tabla
	public static String Rellenar_tabla(int b) {
		String x= "-" ;
		return x;
	}
	
	public static void insertar_portaviones(String[][]tablaMaquina) {
		int a;
		int b;
		int c=0;
		//busca donde colocar el portaviones
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
		//busca donde colocar el buque
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
		//busca donde colocar el acorazado
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
		//todas las variables
		Scanner leer= new Scanner (System.in);
		String tablaJugador[][]=new String [11][11];
		String tablaMaquina[][]=new String [10][10];	
		int Intentos=0;
		int L=0;
		int B=0;
		int Z=0;
		int P=0;
		int disparitos=0;
		int disp=0;
		
		//elegir dificultad
		System.out.println("elige la dificultad con la que deseas jugar:");
		System.out.println("1.fácil");
		System.out.println("2.medio");
		System.out.println("3.Difícil");
		int dificultad=leer.nextInt();
		if(dificultad==1) {
			disparitos=23;
			Intentos=50;
			L=5;
			B=3;
			Z=1;
			P=1;
		}
		if(dificultad==2) {
			disparitos=14;
			Intentos=30;
			L=2;
			B=1;
			Z=1;
			P=1;
		}
		if(dificultad==3) {
			disparitos=4;
			Intentos=20;
			L=1;
			B=1;
		}
		
		
		
		//rellenar tablas de la maquina
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
				System.out.print(tablaJugador[a][b]);
				System.out.print(" ");
			}
			System.out.println("");
		}

		//disparos
	while(Intentos>0) {
		System.out.println("introducir la x(numero)");
		int x=leer.nextInt();
		System.out.println("introducir la Y(letra");
		char y=leer.next().charAt(0);
		int laY=0;
		
		//sistema de igualar tableros
		x=x-1;
		if(y=='A') {
			laY=0;
		}
		if(y=='B') {
			laY=1;
		}
		if(y=='C') {
			laY=2;
		}
		if(y=='D') {
			laY=3;
		}
		if(y=='E') {
			laY=4;
		}
		if(y=='F') {
			laY=5;
		}
		if(y=='G') {
			laY=6;
		}
		if(y=='H') {
			laY=7;
		}
		if(y=='I') {
			laY=8;
		}
		//sistema de acierto o fallo en los disparos
		if(tablaMaquina[laY][x]=="p") {
			tablaJugador[laY+1][x+1]="x";
			disp++;
		}
		if(tablaMaquina[laY][x]=="B") {
			tablaJugador[laY+1][x+1]="x";
			disp++;
		}
		if(tablaMaquina[laY][x]=="L") {
			tablaJugador[laY+1][x+1]="x";
			disp++;
		}
		if(tablaMaquina[laY][x]=="Z") {
			tablaJugador[laY+1][x+1]="x";
			disp++;
		}

		else {
			tablaJugador[laY+1][x+1]="A";
		}
		Intentos--;
		//sistema de cuenta sta ganar
		if(disp==disparitos) {
			System.out.println("has ganado");
			break;
		}
		//printea la tabla cada intento
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++) {
				System.out.print(tablaJugador[a][b]);
				System.out.print(" ");
			}
		 System.out.println();
		}
		//derrota sin intentos
	if(Intentos==0) {
		System.out.println("has perdido");
	}
	}
	}
	}
