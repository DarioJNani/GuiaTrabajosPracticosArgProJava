package EjerciciosClase3;

public class EjercicioC {

	public static void main(String[] args) {
		int numeros[] = {22, 345, 7, 55, 369, 82, 11, 624, 46, 99};
		int numeroX = 80;
		int sumatoria = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numeroX) {
				sumatoria = sumatoria + numeros[i];
			}
		} System.out.println(sumatoria);
	}

}
