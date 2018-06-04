package test;

import java.util.GregorianCalendar;

import negocio.ClienteABM;

public class TestAgregarCliente {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		GregorianCalendar date = new GregorianCalendar(1984, 05, 06);
		long id = abm.agregarCliente("Hernandez", "Jorge", 13597534, date);
		System.out.println(abm.traerCliente(id));
	}

}
