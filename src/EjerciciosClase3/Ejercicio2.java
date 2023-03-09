package EjerciciosClase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		String jugadores = " cristian bertero, claudio bossa, dario nani, esteban migliore, rodrigo campos, agustin demaria, fernando zalazar, laureano calvo, nicolas cordoba, nahuel rosina, cristian martin, franco daniele, joaquin leyria, mauro godoy, leonel villalba, ariel ibarra";
		//System.out.println(jugadores.toUpperCase());
		
		String[] listaJugadores = jugadores.split(",");
		for (int i = 0; i < listaJugadores.length; i++)
		System.out.println(listaJugadores[i].toUpperCase());
	}
}
