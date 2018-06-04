package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	
	ClienteDao dao = new ClienteDao();
	
	public Cliente traerCliente(long idCliente)throws Exception {
		Cliente c = dao.traerCliente(idCliente);
		if(c == null) throw new Exception("No existe un cliente con id: " + idCliente);
		return c;
	}
	
	public Cliente traerCliente(int dni)throws Exception {
		Cliente c = dao.traerCliente(dni);
		if(c == null) throw new Exception("No existe un cliente con dni: " + dni);
		return c;
	}
	
	public Cliente traerContactoYCliente(long idCliente)throws Exception {
		Cliente c = dao.traerClienteYContacto(idCliente);
		if(c == null)throw new Exception("El cliente que esta buscando no existe. ID: " + idCliente);
		return c;
	}
	
	public int agregarCliente(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento)throws Exception {
		Cliente c = dao.traerCliente(dni);
		if(c != null) throw new Exception("Ya existe un cliente con dni: " + dni);
		c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c)throws Exception {
		Cliente cAux = dao.traerCliente(c.getDni());
		if(cAux != null && cAux.getIdCliente() != c.getIdCliente()) throw new Exception("Ya existe un cliente con dni: " + c.getDni());
		dao.actualizar(c);
	}
	
	public void eliminarCliente(long idCliente)throws Exception {
		Cliente c = dao.traerCliente(idCliente);
		if(c == null) throw new Exception("El cliente que quiere eliminar no existe. ID: " + idCliente);
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
}
