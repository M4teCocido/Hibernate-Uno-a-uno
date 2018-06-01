package datos;
import java.util.GregorianCalendar;
import funciones.Funciones;
import datos.Contacto;

public class Cliente {
	private long idCliente;
	private String apellido;
	private String nombre;
	private int dni;
	private GregorianCalendar fechaDeNacimiento;
	private boolean baja;
	private Contacto contacto;
	
	public Cliente() {};
	
	public Cliente(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.baja = false;
	}
	
	public long getIdCliente() {
		return this.idCliente;
	}
	
	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public GregorianCalendar getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public boolean isBaja() {
		return this.baja;
	}
	
	public void setBaja(boolean baja) {
		this.baja = baja;
	}
	
	public Contacto getContacto() {
		return this.contacto;
	}
	
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", fechaDeNacimiento=" + Funciones.traerFechaCorta(fechaDeNacimiento) + ", baja=" + baja + ", contacto=" + contacto + "]";
	}
}
