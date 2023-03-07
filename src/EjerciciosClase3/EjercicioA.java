package EjerciciosClase3;

public class EjercicioA {

	public static void main(String[] args) {
		/*String texto1 = "Hola!";
		String texto2 = "Chau!";
		String saludoDoble = texto1 + " y " + texto2;
		
		System.out.println(saludoDoble);
		System.out.println(saludoDoble.length());
		System.out.println(texto2.length());
		System.out.println(texto1.length());
		
		String mayuscula = saludoDoble.toUpperCase();
		System.out.println(mayuscula);
		System.out.println(mayuscula.length());
		System.out.println(mayuscula.replace("Y CHAU!", "BUEN DIA!"));*/
		
		/* EJERCICIO A:
		 	Dado un string y una letra, que cuente la cantidad de apariciones de la letra en el string.
		 */
		
		String contarLetras = "Aca hay varias a";
		int a = 0;
		if (contarLetras.contains("a")) {
			a = 1;
		}
		for(int i = 0; i < contarLetras.length(); i++) {
			if (contarLetras.charAt(i) == 'a') {
				a++;
				
			}
		}
		System.out.println(a);
	}

}
