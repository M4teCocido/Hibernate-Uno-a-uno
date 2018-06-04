package test;

import datos.Contacto;
import negocio.ContactoABM;

public class TestModificarContacto {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ContactoABM abm = new ContactoABM();
		long id = 1;
		Contacto c = abm.traerContacto(id);
		System.out.println(c.toString());
		c.setEmail("rodrigohernandez6684@gmail.com");
		abm.modificar(c);
		System.out.println(c.toString());
	}

}
