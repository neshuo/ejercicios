package ClasePersona;

class persona {
	//atributos
	String nombre;
	String apellido;
	int edad;
	float altura;
	char genero;
	double peso;
	
	
	//acciones
	public void caminar() {
		System.out.println("estoy caminando");
	}
	public void correr() {
		System.out.println(nombre + "esta corriendo");
	}
	public void dormir() {
		System.out.println("estoy durmiendo");
	}
	public void comer() {
		System.out.println("estoy comiendo");
	}
	public void listar() {
		System.out.println("soy " +nombre +" "+apellido +" tengo "+edad +" años"+" mido "+altura+" cm "+"soy "+genero+" y peso "+peso+"  kg");
	}
}


