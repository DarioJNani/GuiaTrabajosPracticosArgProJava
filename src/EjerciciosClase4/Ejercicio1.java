package EjerciciosClase4;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		ordenar(6, 15, 3, 'a');
	}
	
	static void ordenar(int num1, int num2, int num3, char letra) {
		
		int vectorOrdenado [] = new int [3];
		
		if (num1 > num2 & num2 > num3) {
			vectorOrdenado[2] = num3;
			vectorOrdenado[1] = num2;
			vectorOrdenado[0] = num1;
		} else if (num1 > num2 & num2 < num3){
			vectorOrdenado[2] = num2;
			vectorOrdenado[1] = num3;
			vectorOrdenado[0] = num1;
		} else if (num2 > num1 & num1 > num3) {
			vectorOrdenado[2] = num3;
			vectorOrdenado[1] = num1;
			vectorOrdenado[0] = num2;
		} else if (num2 > num1 & num1 < num3) {
			vectorOrdenado[2] = num1;
			vectorOrdenado[1] = num3;
			vectorOrdenado[0] = num2;
		} else if (num3 > num1 & num1 > num2) {
			vectorOrdenado[2] = num2;
			vectorOrdenado[1] = num1;
			vectorOrdenado[0] = num3;
		} else if (num3 > num2 & num1 < num2) {
			vectorOrdenado[2] = num1;
			vectorOrdenado[1] = num2;
			vectorOrdenado[0] = num3;
		}
		
		if (letra == 'd') {
			System.out.println(vectorOrdenado[0]);
			System.out.println(vectorOrdenado[1]);
			System.out.println(vectorOrdenado[2]);
		} else if (letra == 'a') {
			System.out.println(vectorOrdenado[2]);
			System.out.println(vectorOrdenado[1]);
			System.out.println(vectorOrdenado[0]);
		} else {
			System.out.println("Especifique letra 'a' para orden ascendente o letra 'd' para orden descendente");
		}
		
	}
}
