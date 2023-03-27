package EjerciciosClase4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros separados por un espacio, luego presiona enter");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		
		char letra = '0';
		do {
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Ahora ingrese 'a' para orden ascendente o 'd' para orden descendente, para finalizar presiona enter");
		String string = scn2.nextLine();
		letra = string.charAt(0);
		} while 
			(letra != 'a' & letra != 'd');
		
		ordenar(num1, num2, num3, letra);
	}
		static void ordenar(int num1, int num2, int num3, char letra) {
			
			int vectorOrdenado [] = new int [3];
			
			if (num1 > num2 & num2 > num3) {
				vectorOrdenado[2] = num3;
				vectorOrdenado[1] = num2;
				vectorOrdenado[0] = num1;
			} else if (num1 > num2 & num2 < num3 & num1 > num3){
				vectorOrdenado[2] = num2;
				vectorOrdenado[1] = num3;
				vectorOrdenado[0] = num1;
			} else if (num2 > num1 & num1 > num3) {
				vectorOrdenado[2] = num3;
				vectorOrdenado[1] = num1;
				vectorOrdenado[0] = num2;
			} else if (num2 > num1 & num1 < num3 & num2 > num3) {
				vectorOrdenado[2] = num1;
				vectorOrdenado[1] = num3;
				vectorOrdenado[0] = num2;
			} else if (num3 > num1 & num1 > num2) {
				vectorOrdenado[2] = num2;
				vectorOrdenado[1] = num1;
				vectorOrdenado[0] = num3;
			} else if (num3 > num2 & num1 < num2 & num3 > num1) {
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
			}	
		}
	}
