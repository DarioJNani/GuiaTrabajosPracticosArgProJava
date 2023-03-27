package EjerciciosClase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		String jugadores = " cristian bertero, claudio bossa, dario nani, esteban migliore, rodrigo campos, agustin demaria, fernando zalazar, laureano calvo, nicolas cordoba, nahuel rosina, cristian martin, franco daniele, joaquin leyria, mauro godoy, leonel villalba, ariel ibarra";
		String[] listaJugadores = jugadores.split(",");
		System.out.println("El contenido del archivo sera el siguiente:"+"\n");
		for (int i = 0; i < listaJugadores.length; i++)
		System.out.println(listaJugadores[i].toUpperCase());
		
		String jugadoresEspaciados = jugadores.replace(",", "\n");
		Files.writeString(Paths.get("C:\\Users\\Dario Jose\\eclipse-workspace\\GuiaEjerciciosPracticos\\archEjerc3Clase4"),jugadoresEspaciados.toUpperCase());
				
	}

}
