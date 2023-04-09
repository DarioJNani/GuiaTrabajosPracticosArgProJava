package EjerciciosClase5;

public class ItemCarrito {
	
	private Producto pto;
	private Carrito num;
	private int can;
	private double montoItem;
	
	public ItemCarrito(Carrito numero, Producto prod, int cant) {
		num=numero;
		pto=prod;
		can=cant;
		montoItem=pto.prec_prod()*can;
	}
	
	public double dameMontoItem() {
		return montoItem;
	}
	
	public int dameCantidad() {
		return can;
	}
	
	public void mostrarItem() {
		System.out.println(can+"\t$"+pto.prec_prod()+"\t$"+montoItem+"   "+"\t"+pto.nom_prod());
	}
	
	public void dameLista() {
		System.out.println("Cant\tPrecio\tSubTotal\tProducto");
	}

}
