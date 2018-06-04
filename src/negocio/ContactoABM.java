package negocio;

import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;

public class ContactoABM {
	
	ContactoDao dao = new ContactoDao();
	
	public int agregar(String email, String movil, String fijo, Cliente cliente) {
		Contacto c = new Contacto(email, movil, fijo, cliente);
		return dao.agregar(c);
	}
	
	public void modificar(Contacto c) {
		dao.actualizarContacto(c);
	}
	
	public void eliminar(long idContacto)throws Exception {
		Contacto c = dao.traerContacto(idContacto);
		if(c == null)throw new Exception("El Contacto que desea eliminar no existe.");
		dao.eliminarContacto(c);
	}
	
	public Contacto traerContacto(long idContacto)throws Exception {
		Contacto c = dao.traerContacto(idContacto);
		if(c == null) throw new Exception("El contacto que selecciono no existe.");
		return c;
	}
	
}
