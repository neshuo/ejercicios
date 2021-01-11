package ejercicio4ARTICULO;

class articulo {
	String Nombre;
	double precio;
	int IVA=21;
	int cuantosQuedan;
	double precioIVA= precio*21/100;
	
	public void listar(){
		System.out.println(Nombre+"-"+precio+"IVA:21% PVP:"+precioIVA);
	}
}
