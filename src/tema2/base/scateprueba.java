package tema2;

public class scateprueba {

	public static void main(String[] args) {
		// Para imprimir una nueva linea con una misma instrucción se utiliza \n
		  
		  System.out.println("Juan\nVictor\nAlfonso\nEnrique");
		  System.out.print("\n");
		  System.out.println();		  
		  		/*  
		  		 	Juan
					Victor
					Alfonso
					Enrique
					
					 
		  		*/
		  
//Para enviar un retorno de carro se utiliza \r
		  
		  System.out.println("Lunes\rMartes, Miércoles"); 
		  System.out.print("\n");
		  System.out.println();
		    
		  		/*
		  		   Lunes
				   Martes, Miércoles
				   
				   
		  		 */

//Para borrar un caracter de la izquierda se utiliza \b (SOLO EN MODO ADMINISTRADOR)
		  
		  System.out.println("Lunes\bMartes");
		  System.out.print("\n");
		  System.out.println();
		  
		  	/*
		   		LuneMartes
		   		
		   		
		  	 */
		  
//Para tabular se utiliza \t
		  
		  System.out.println("\tLunes\tMartes\tMiércoles");
		  System.out.println("\tDilluns\tDimarts\tDimecres");
		  System.out.println("\tMonday\tTuesday\tWednesday");
		  
		  System.out.print("\n");
		  System.out.println();
		  
		  /*		  	
		  	Lunes		Martes		Miércoles
			Dilluns	Dimarts	Dimecres
			Monday		Tuesday	Wednesday
		  
		  
		  */
		  
// Para imprimir comillas dobles en un String se utiliza \" y comillas simples \'
		  
		  System.out.println("\"Lunes\",\"Martes\",\'Miércoles\'");
		  System.out.print("\n");
		  System.out.println();
		  
		  /*
		  "Lunes","Martes",'Miércoles'
		  
		  
		  */
		  //Para imprimir una diagonal inversa se utiliza \\
		  
		  System.out.println("Pagina:\\ http://iesbenigaslo.es \\");
		  
		  /*
		  Pagina:\ http://iesbenigaslo.es \

		  */  
	}

}
