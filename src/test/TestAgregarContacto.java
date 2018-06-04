package test;

import negocio.ClienteABM;
import negocio.ContactoABM;
import datos.Cliente;


public class TestAgregarContacto {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ClienteABM abm1 = new ClienteABM();
		ContactoABM abm = new ContactoABM();
		long idCliente = 3;
		Cliente c = abm1.traerCliente(idCliente);
		System.out.println(c.toString());
		int id = abm.agregar("destapacioneschp@gamil.edu.ar", "11-1111-1111", "011-1111-1111", c);
		System.out.println(abm.traerContacto(id));
	}
}
