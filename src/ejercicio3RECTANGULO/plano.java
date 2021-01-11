package ejercicio3RECTANGULO;

class plano {
	int X;
	int Y;
	int X2;
	int Y2;
	double area;
	double perimetro;
	public void listar() {
		System.out.println("("+X+","+Y+")"+"("+X2+","+Y2+")");
		System.out.println("el area es:"+ area);
		System.out.println("el perimetro es:"+perimetro);
	}
}
