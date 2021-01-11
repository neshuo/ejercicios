package ejercicio1PUNTO;

public class plano {
	public static void main(String[] args) {
		punto punto1=new punto();
		punto1.X=5;
		punto1.Y=0;
		punto punto2=new punto();
		punto2.X=10;
		punto2.Y=10;
		punto punto3=new punto();
		punto3.X=-3;
		punto3.Y=7;
		
		punto1.listar();
		punto2.listar();
		punto3.listar();
	}
}
