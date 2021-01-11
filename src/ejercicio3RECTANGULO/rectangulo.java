package ejercicio3RECTANGULO;

public class rectangulo {

	public static void main(String[] args) {
		plano rectangulo1=new plano();
		plano rectangulo2=new plano();
		
		rectangulo1.X=0;
		rectangulo1.Y=0;
		rectangulo1.X2=5;
		rectangulo1.Y2=5;
		
		rectangulo2.X=7;
		rectangulo2.Y=9;
		rectangulo2.X2=2;
		rectangulo2.Y2=3;
		
		rectangulo1.perimetro=rectangulo1.X-rectangulo1.X2*2+rectangulo1.Y-rectangulo1.Y2*2;
		rectangulo1.area=rectangulo1.X-rectangulo1.X2*rectangulo1.Y-rectangulo1.Y2;
		
		rectangulo2.perimetro=rectangulo2.X-rectangulo2.X2*2+rectangulo2.Y-rectangulo2.Y2*2;
		rectangulo2.area=rectangulo2.X-rectangulo2.X2*rectangulo2.Y-rectangulo2.Y2;
		
		
		
		rectangulo1.listar();
		rectangulo2.listar();
		
		
		
	}

}
