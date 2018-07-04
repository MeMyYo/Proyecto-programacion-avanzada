/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jorge(Universidad de La Frontera)
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class LibroDAO {
	public static Libro loadLibroByORMID(String codigo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadLibroByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro getLibroByORMID(String codigo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getLibroByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByORMID(String codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadLibroByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro getLibroByORMID(String codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getLibroByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByORMID(PersistentSession session, String codigo) throws PersistentException {
		try {
			return (Libro) session.load(orm.Libro.class, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro getLibroByORMID(PersistentSession session, String codigo) throws PersistentException {
		try {
			return (Libro) session.get(orm.Libro.class, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByORMID(PersistentSession session, String codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Libro) session.load(orm.Libro.class, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro getLibroByORMID(PersistentSession session, String codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Libro) session.get(orm.Libro.class, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLibro(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryLibro(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLibro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryLibro(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro[] listLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro[] listLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLibro(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Libro as Libro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLibro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Libro as Libro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Libro", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro[] listLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLibro(session, condition, orderBy);
			return (Libro[]) list.toArray(new Libro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro[] listLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLibro(session, condition, orderBy, lockMode);
			return (Libro[]) list.toArray(new Libro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Libro[] libros = listLibroByQuery(session, condition, orderBy);
		if (libros != null && libros.length > 0)
			return libros[0];
		else
			return null;
	}
	
	public static Libro loadLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Libro[] libros = listLibroByQuery(session, condition, orderBy, lockMode);
		if (libros != null && libros.length > 0)
			return libros[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Libro as Libro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Libro as Libro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Libro", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro createLibro() {
		return new orm.Libro();
	}
	
	public static boolean save(orm.Libro libro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(libro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Libro libro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(libro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Libro libro)throws PersistentException {
		try {
			if (libro.getIdEstante() != null) {
				libro.getIdEstante().libro.remove(libro);
			}
			
			if (libro.getIdCategoria() != null) {
				libro.getIdCategoria().libro.remove(libro);
			}
			
			orm.SolicitudLibro[] lSolicitudLibros = libro.solicitudLibro.toArray();
			for(int i = 0; i < lSolicitudLibros.length; i++) {
				lSolicitudLibros[i].setCodigoLibro(null);
			}
			orm.EntregaDeLibro[] lEntregaDeLibros = libro.entregaDeLibro.toArray();
			for(int i = 0; i < lEntregaDeLibros.length; i++) {
				lEntregaDeLibros[i].setLibrocodigo(null);
			}
			orm.Autores[] lAutoress = libro.autores.toArray();
			for(int i = 0; i < lAutoress.length; i++) {
				lAutoress[i].setLibrocodigo(null);
			}
			return delete(libro);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Libro libro, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (libro.getIdEstante() != null) {
				libro.getIdEstante().libro.remove(libro);
			}
			
			if (libro.getIdCategoria() != null) {
				libro.getIdCategoria().libro.remove(libro);
			}
			
			orm.SolicitudLibro[] lSolicitudLibros = libro.solicitudLibro.toArray();
			for(int i = 0; i < lSolicitudLibros.length; i++) {
				lSolicitudLibros[i].setCodigoLibro(null);
			}
			orm.EntregaDeLibro[] lEntregaDeLibros = libro.entregaDeLibro.toArray();
			for(int i = 0; i < lEntregaDeLibros.length; i++) {
				lEntregaDeLibros[i].setLibrocodigo(null);
			}
			orm.Autores[] lAutoress = libro.autores.toArray();
			for(int i = 0; i < lAutoress.length; i++) {
				lAutoress[i].setLibrocodigo(null);
			}
			try {
				session.delete(libro);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Libro libro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(libro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Libro libro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(libro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Libro loadLibroByCriteria(LibroCriteria libroCriteria) {
		Libro[] libros = listLibroByCriteria(libroCriteria);
		if(libros == null || libros.length == 0) {
			return null;
		}
		return libros[0];
	}
	
	public static Libro[] listLibroByCriteria(LibroCriteria libroCriteria) {
		return libroCriteria.listLibro();
	}
}
