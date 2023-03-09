package EjerciciosClase3;

public class EjercicioB {

	public static void main(String[] args) {
		/* EJERCICIO B:
		 * Dados 3 numeros y un orden (CRECIENTE O DECRECIENTE) que ordene los mismos y los retorne en un vector de 3
		 */
		int vectorDe3[] = new int[]{ 75, 500, 66};
		int vectorOrdenado [] = new int [3];
		
		for (int i = 0; i < vectorDe3.length; i++) {
			if (vectorDe3[i] > vectorOrdenado[2]) {
				vectorOrdenado[0] = vectorOrdenado[1];
				vectorOrdenado[1] = vectorOrdenado[2];
				vectorOrdenado[2] = vectorDe3[i];
			} else if (vectorDe3[i] > vectorOrdenado[1]){
				vectorOrdenado[0] = vectorOrdenado[1];
				vectorOrdenado[1] = vectorDe3[i];
			} else if (vectorDe3[i] < vectorOrdenado[1]) {
				vectorOrdenado[0] = vectorDe3[i];
			} 
		}
		System.out.println(vectorOrdenado[0]);
		System.out.println(vectorOrdenado[1]);
		System.out.println(vectorOrdenado[2]);
	}

}
