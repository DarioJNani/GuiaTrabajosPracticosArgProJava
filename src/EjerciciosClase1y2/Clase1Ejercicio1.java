package EjerciciosClase1y2;

public class Clase1Ejercicio1 {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		while(numeroInicio<=numeroFin) {
			if(numeroInicio % 2 == 0) {
			int esPar = numeroInicio;
			System.out.println(esPar);
			numeroInicio = numeroInicio + 1;
			} else {
				numeroInicio = numeroInicio +1;
			}
		}
	}

}
