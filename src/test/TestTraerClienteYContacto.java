package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYContacto {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		long idCliente = 1;
		Cliente c = abm.traerContactoYCliente(idCliente);
		System.out.println(c.toString());
	}
}
