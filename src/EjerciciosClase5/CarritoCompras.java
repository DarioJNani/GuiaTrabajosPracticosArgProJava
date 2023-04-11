package EjerciciosClase5;

import java.time.LocalDate;

public class CarritoCompras {
	
	
	public static void main(String[] args) {
		Producto prod1 = new Producto("FERNET", "FERNET BRANCA 750cc", 0002465, 998.56, "03/11/2023");
		Producto prod2 = new Producto("GASEOSA", "COCA-COLA 2250cc", 0102344, 623, "21/05/2024");
		Producto prod3 = new Producto("HIELO", "BOLSA HIELO COLDMAN 3kg", 0000273, 155.13, "15/07/2023");
		
		Cliente per1=new Cliente(29309986,"Ariel Nani","Roque Sáenz Peña 135","3532498910","arielnani@gmail.com", true, false, true);
		Cliente per2=new Cliente(30246315,"Natali Nani","Mariano Moreno 168","3532417704","nanidario23@gmail.com", false, true, false);
		Cliente per3=new Cliente(14325615,"Marta Sasia");//sobrecargadeconstructores
		Cliente per4=new Cliente(30246315,"Jose Lopez","Calle Publica 123","3512344197","joselopez@gmail.com", false, false, true);
	
		Carrito carro = new Carrito(40, per4);
		
		System.out.println(carro.getClie()+"\n");
		
		ItemCarrito cargaItem[] = new ItemCarrito[3];
		cargaItem[0] = new ItemCarrito(carro, prod1, 2);
		cargaItem[1] = new ItemCarrito(carro, prod2, 4);
		cargaItem[2] = new ItemCarrito(carro, prod3, 1);
		cargaItem[0].dameLista();
		double monto = mostrarCompras(cargaItem, carro, carro.getClie());
		carro.mostrarMontoCompra(monto);
		//me gustaria en esta parte poder invocar directamente al cliente pasado por paramero cuando inicializamos Carrito
		//para que de este modo, solo tengamos que elegir el cliente solo una vez y no repetir codigo.
		if (per4.dameTipo()) {
			carro.hacerDescuentoCliente(monto);
			System.out.println("func");
		}else if(per4.damePago()){
			carro.hacerDescuentoPago(monto);
		}else if(per4.dameBanco()) {
			DescuentoPorcentajeConTope desc=new DescuentoPorcentajeConTope();
			desc.descuentoPorcentajeConTope(monto, per4.dameBanco());
		}
		
	}
	
	
	public static double mostrarCompras(ItemCarrito cargaItem[], Carrito carro, Cliente per4) {
		
		double suma = 0;
		for (ItemCarrito item : cargaItem) {
			item.mostrarItem();
			suma = suma + item.dameMontoItem();
		}
		return suma;
	}
}
