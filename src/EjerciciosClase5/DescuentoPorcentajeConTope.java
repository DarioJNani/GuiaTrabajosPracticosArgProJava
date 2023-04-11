package EjerciciosClase5;

public class DescuentoPorcentajeConTope {
	
	public void descuentoPorcentajeConTope(double monto, boolean banco) {
		
		double descuento20=monto*0.20;
		if(descuento20>10000) {
			descuento20=10000;
			monto=monto-descuento20;
			System.out.println("Maximo descuento alcanzado de cliente BANCOR -$"+descuento20+"\nMonto final de la compra  $"+monto);
		}else {
			monto=monto-descuento20;
			System.out.println("Descuento de cliente BANCOR -$"+descuento20+"\nMonto final de la compra  $"+monto);
		}
		
	}

}
