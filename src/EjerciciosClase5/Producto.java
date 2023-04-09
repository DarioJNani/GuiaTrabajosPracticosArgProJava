package EjerciciosClase5;


public class Producto {
	
	String nombre;
	String descripcion;
	int codigo;
	double precio;
	String vencimiento;
	
	
	public Producto(String nom, String descr, int cod, double prec, String vence) {
		nombre=nom;
		descripcion=descr;
		codigo=cod;
		precio=prec;
		vencimiento=vence;
	}
	
	public String nom_prod() {
		return nombre;
	}
	
	public String descr_prod() {
		return descripcion;
	}
	
	public int cod_prod() {
		return codigo;
	}
	
	public double prec_prod() {
		return precio;
	}
	
	public String vence_prod() {
		return vencimiento;
	}
	
	public void mostrarProducto() {
		System.out.println("Productos: "+"/n"+"Nombre: "+nombre+" | Codigo: "+codigo+"/n"+"Precio: "+precio+" | Descripcion: "+descripcion);
	}

}
