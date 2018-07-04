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

public class EstanteDAO {
	public static Estante loadEstanteByORMID(String idEstante) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByORMID(session, idEstante);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante getEstanteByORMID(String idEstante) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEstanteByORMID(session, idEstante);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByORMID(String idEstante, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByORMID(session, idEstante, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante getEstanteByORMID(String idEstante, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEstanteByORMID(session, idEstante, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByORMID(PersistentSession session, String idEstante) throws PersistentException {
		try {
			return (Estante) session.load(orm.Estante.class, idEstante);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante getEstanteByORMID(PersistentSession session, String idEstante) throws PersistentException {
		try {
			return (Estante) session.get(orm.Estante.class, idEstante);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByORMID(PersistentSession session, String idEstante, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estante) session.load(orm.Estante.class, idEstante, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante getEstanteByORMID(PersistentSession session, String idEstante, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estante) session.get(orm.Estante.class, idEstante, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstante(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEstante(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstante(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEstante(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante[] listEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEstanteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante[] listEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEstanteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstante(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estante as Estante");
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
	
	public static List queryEstante(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estante as Estante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estante", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante[] listEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstante(session, condition, orderBy);
			return (Estante[]) list.toArray(new Estante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante[] listEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstante(session, condition, orderBy, lockMode);
			return (Estante[]) list.toArray(new Estante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estante[] estantes = listEstanteByQuery(session, condition, orderBy);
		if (estantes != null && estantes.length > 0)
			return estantes[0];
		else
			return null;
	}
	
	public static Estante loadEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estante[] estantes = listEstanteByQuery(session, condition, orderBy, lockMode);
		if (estantes != null && estantes.length > 0)
			return estantes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEstanteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEstanteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estante as Estante");
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
	
	public static java.util.Iterator iterateEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estante as Estante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estante", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante createEstante() {
		return new orm.Estante();
	}
	
	public static boolean save(orm.Estante estante) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estante estante) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estante estante)throws PersistentException {
		try {
			if (estante.getIdBiblioteca() != null) {
				estante.getIdBiblioteca().estante.remove(estante);
			}
			
			if (estante.getIdCategoria() != null) {
				estante.getIdCategoria().estante.remove(estante);
			}
			
			orm.Libro[] lLibros = estante.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdEstante(null);
			}
			return delete(estante);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estante estante, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estante.getIdBiblioteca() != null) {
				estante.getIdBiblioteca().estante.remove(estante);
			}
			
			if (estante.getIdCategoria() != null) {
				estante.getIdCategoria().estante.remove(estante);
			}
			
			orm.Libro[] lLibros = estante.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdEstante(null);
			}
			try {
				session.delete(estante);
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
	
	public static boolean refresh(orm.Estante estante) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estante estante) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estante loadEstanteByCriteria(EstanteCriteria estanteCriteria) {
		Estante[] estantes = listEstanteByCriteria(estanteCriteria);
		if(estantes == null || estantes.length == 0) {
			return null;
		}
		return estantes[0];
	}
	
	public static Estante[] listEstanteByCriteria(EstanteCriteria estanteCriteria) {
		return estanteCriteria.listEstante();
	}
}
