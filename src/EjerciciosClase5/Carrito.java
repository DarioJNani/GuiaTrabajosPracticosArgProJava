package EjerciciosClase5;

public class Carrito {
	
	private int num;
	private Cliente clie;
	private double montoCompra;
	
	public Carrito(int num, Cliente clie) {
		this.num=num;
		this.setClie(clie);
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
	

	
	public void hacerDescuentoCliente(double monto) {
		
		montoCompra=monto;
		double descuento15=monto*0.15;
		monto=monto-descuento15;
		System.out.println("Descuento de cliente VIP -$"+descuento15+"\nMonto final de la compra  $"+monto);
	}
	
	public void hacerDescuentoPago(double monto) {
		
		montoCompra=monto;
		if(monto>4000) {
			double descuento15=500;
			monto=monto-descuento15;			
			System.out.println("Descuento por pago efectivo -$"+descuento15+"\nMonto final de la compra  $"+monto);
		}else {
			System.out.println("Para obtener un descuento\nel monto de la compra debe ser\nmayor a $4000\nMonto final de la compra  $"+monto);
		}
	}

	/**
	 * @return the clie
	 */
	public Cliente getClie() {
		return clie;
	}

	/**
	 * @param clie the clie to set
	 */
	public void setClie(Cliente clie) {
		this.clie = clie;
	}

}
