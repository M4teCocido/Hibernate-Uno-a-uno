package datos;

public class Contacto {
	
	private long idContacto;
	private String email;
	private String movil;
	private String fijo;
	private Cliente cliente;
	
	public Contacto() {}
	
	public Contacto(String email, String movil, String fijo, Cliente cliente) {
		this.email = email;
		this.movil = movil;
		this.fijo = fijo;
		this.cliente = cliente;
	}
	
	public long getIdContacto() {
		return this.idContacto;
	}
	
	protected void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMovil() {
		return this.movil;
	}
	
	public void setMovil(String movil) {
		this.movil = movil;
	}
	
	public String getFijo() {
		return this.fijo;
	}
	
	public void setFijo(String fijo) {
		this.fijo = fijo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "[Email = " + email + ", movil = " + movil + ", fijo = " + fijo
				+ ", cliente = " + cliente + "]";
	}
}
