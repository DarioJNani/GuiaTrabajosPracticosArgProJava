package EjerciciosClase5;

public class Cliente {
	
	public Cliente(int dni, String nombre, String dire, String cel, String correo, boolean clienteVip) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.dire=dire;
		this.cel=cel;
		this.correo=correo;
		clienteVip= true;
	}
	
	public Cliente(int dni, String nombre) {
		
		this(dni, nombre, "Por defecto","351000000", "correoclientex@gmail.com", false);
	}
	
	//metodos getters
	public int dameDni() {
		return dni;
	}
	public String dameNom() {
		return nombre;
	}
	public String dameInfo() {
		return dire +"/n" + cel +"/n" + correo;
	}
	public boolean dameTipo() {
		return clienteVip;
	}
	
	private int dni;
	private String nombre;
	private String dire;
	private String cel;
	private String correo;
	private boolean clienteVip;
	

}
