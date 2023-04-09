package EjerciciosClase5;

public class Carrito {
	
	private int num;
	private Cliente clie;
	private double montoCompra;
	
	public Carrito(int num, Cliente clie) {
		this.num=num;
		this.clie=clie;
	}
	
	public int dameNum() {
		return num;
	}
	
	public double dameMontoCompra() {
		return montoCompra;
	}
	
	public void mostrarMontoCompra(double monto) {
		montoCompra=monto;
		System.out.println("Monto total de la compra $"+montoCompra);
	}

}
