package EjerciciosClase1y2;

public class Clase1Ejercicio2d {

	public static void main(String[] args) {
		float ingresosMensuales = 489000;
		int cantidadVehiculos = 2;
		int cantidadInmuebles = 0;
		boolean capacidadEconomica = false;
		if((ingresosMensuales >= 489093) || (cantidadVehiculos >= 3) || (cantidadInmuebles >= 3) || (capacidadEconomica == true)) {
			System.out.print("Pertenece al segmento de ingresos altos.");
		} else {
			System.out.print("Felicitaciones, puede recibir el beneficio del subsidio.");
		}

	}

}
