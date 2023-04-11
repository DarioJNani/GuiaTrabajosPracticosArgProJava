package EjerciciosClase5;

public class Cliente {
	
	public Cliente(int dni, String nombre, String dire, String cel, String correo, boolean clienteVip, boolean pago, boolean bancor) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.dire=dire;
		this.cel=cel;
		this.correo=correo;
		this.clienteVip=clienteVip;
		this.pago=pago;
		this.bancor=bancor;
	}
	
	public Cliente(int dni, String nombre) {
		
		this(dni, nombre, "Por defecto","351000000", "correoclientex@gmail.com", false, false, true);
	}
	
	//metodos getters
	public int dameDni() {
		return dni;
	}
	public String dameNom() {
		return nombre;
	}
	public String dameInfo() {
		return dire +"**" + cel +"**" + correo;
	}
	public boolean dameTipo() {
		return clienteVip;
	}
	public boolean damePago() {
		return pago;
	}
	public boolean dameBanco() {
		return bancor;
	}
	
	private int dni;
	private String nombre;
	private String dire;
	private String cel;
	private String correo;
	private boolean clienteVip;
	private boolean pago;
	private boolean bancor;
	
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nDNI: "+dni+"\nTel: "+cel;
	}
}
