package EjerciciosClase4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		String mostrarNumeros = "C:\\Users\\Dario Jose\\eclipse-workspace\\GuiaEjerciciosPracticos\\NumerosASumar.txt";
		
		System.out.println("Los numeros del archivo son:");
		for(String numeros : Files.readAllLines(Paths.get(mostrarNumeros))) {
			System.out.println(numeros);
		}
		
		File archivo = new File("C:\\Users\\Dario Jose\\eclipse-workspace\\GuiaEjerciciosPracticos\\NumerosASumar.txt");
		int resultado = 0;
		String suma = "+";
		String multi = "*";
		Scanner numeros = new Scanner(archivo);
		System.out.println("Si desea sumar presione +, para multiplicar presione *, luego presione enter");
		Scanner sumaMulti = new Scanner(System.in);
		String operacion = sumaMulti.nextLine();
		
		 {
			
			if(operacion.equals(suma)) {
				operacion = "Suma";
				while(numeros.hasNextInt()) {
					resultado = resultado + numeros.nextInt();	
				}
			} else if(operacion.equals(multi)) {
				resultado = resultado + 1;
				operacion = "Multiplicacion";
				while(numeros.hasNextInt()) {
					resultado = resultado *numeros.nextInt();
				}				
			}
		}
		System.out.println("El resultado de la "+operacion+" es "+resultado);
	}
}
