package dao;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import datos.Contacto;

public class ContactoDao {
	
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos: " + he);
	}
	
	public int agregar(Contacto objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();
		}
		return id;
	}
	
	public void actualizarContacto(Contacto objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();
		}
	}
	
	public void eliminarContacto(Contacto objeto) {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();	
		}
	}
	
	public Contacto traerContacto(long idContacto) {
		Contacto objeto = null;
		try {
			iniciaOperacion();
			objeto = (Contacto) session.get(Contacto.class, idContacto);
			tx.commit();
		}finally{
			session.close();
		}
		return objeto;
	}
	
}
