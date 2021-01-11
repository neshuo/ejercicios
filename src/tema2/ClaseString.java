package tema2;

public class ClaseString {

	public static void main(String[] args) {
		//sting basico
		
		//declarar strings
		String str1=new String("este es el 1 string");
		String str2=new String("este es el 2 string");
		String str3=new String("este es el 2 string");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(" \n\n\n ************************* ");
		System.out.println(" *** CONTAR CARACTERES *** ");
		System.out.println(" *************************\n\n\n ");
		
		//dice la cantidad de ncaracteres
		System.out.println("este es el 1 string".length());
		
		//dice el caracter que seleccionamos la posicion
		System.out.println("este es el 1 string".charAt(2));
		
		//dice desde un caracter hasta el final
		System.out.println("este es el 1 string".substring(5));
		
		//dice desde un punto hasta otro punto
		System.out.println("este es el 1 string".substring(5,10));

		System.out.println(" \n\n\n ************************ ");
		System.out.println(" *** COMPARAR STRINGS *** ");
		System.out.println(" ************************\n\n\n ");
		
		//junta dos cadenas
		String s1 = "quiero";
		String s2 = " morirme";
		System.out.println(s1.concat(s2));
		
		//dice la primera posicion de una palabra
		String s="quiero morirme";
		int salida=s.indexOf("morirme");
		System.out.println(salida);
		
		//dice la  primera posicion donde aparece el caracter
		
		salida=s.lastIndexOf('a');
		
		//compara dos strings
		boolean morirme="morirme".contentEquals("morirme");
		System.out.println(morirme="morirme".contentEquals("Morirme"));
		
		//compara string ignorando mayusculas y minusculas
		System.out.println(morirme="morirme".contentEqualsIgnoreCase("morirme"));
		System.out.println(morirme="morirme".contentEqualsIgnoreCase("Morirme"));
		
		//comparan caracteres iguales
		int zzz;
		System.out.println(zzz = s1.compareTo(s));

		//compara caracteres iguales con mayusculas y minusculas
		int zzzz;
		System.out.println(zzzz=s1.compareToIgnoreCase(s));
		
		System.out.println(" \n\n\n *********************** ");
		System.out.println(" *** EDITOR DE TEXTO *** ");
		System.out.println(" ***********************\n\n\n ");
		
		//cambia todo a minusculas
		String palabra;
		String palabra2;
		String palabra3;
		String palabra4;
		String palabra5;
		
		System.out.println(palabra=" MarICon ");
		System.out.println(palabra2=palabra.toLowerCase());
		
		//cambia todo a mayusculas
		System.out.println(palabra3 = palabra.toUpperCase());
		
		//elimina espacios de extremos
		System.out.println(palabra4 = palabra.trim());
		
		//Remplaza letras por otras
		System.out.println(palabra5= palabra.replace('I' ,'Y'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
