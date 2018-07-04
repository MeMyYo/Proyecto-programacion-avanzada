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

public class CiudadDAO {
	public static Ciudad loadCiudadByORMID(String idCiudad) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCiudadByORMID(session, idCiudad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(String idCiudad) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getCiudadByORMID(session, idCiudad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(String idCiudad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCiudadByORMID(session, idCiudad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(String idCiudad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getCiudadByORMID(session, idCiudad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(PersistentSession session, String idCiudad) throws PersistentException {
		try {
			return (Ciudad) session.load(orm.Ciudad.class, idCiudad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(PersistentSession session, String idCiudad) throws PersistentException {
		try {
			return (Ciudad) session.get(orm.Ciudad.class, idCiudad);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(PersistentSession session, String idCiudad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciudad) session.load(orm.Ciudad.class, idCiudad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(PersistentSession session, String idCiudad, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciudad) session.get(orm.Ciudad.class, idCiudad, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryCiudad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryCiudad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
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
	
	public static List queryCiudad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciudad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCiudad(session, condition, orderBy);
			return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCiudad(session, condition, orderBy, lockMode);
			return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ciudad[] ciudads = listCiudadByQuery(session, condition, orderBy);
		if (ciudads != null && ciudads.length > 0)
			return ciudads[0];
		else
			return null;
	}
	
	public static Ciudad loadCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ciudad[] ciudads = listCiudadByQuery(session, condition, orderBy, lockMode);
		if (ciudads != null && ciudads.length > 0)
			return ciudads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
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
	
	public static java.util.Iterator iterateCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciudad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad createCiudad() {
		return new orm.Ciudad();
	}
	
	public static boolean save(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ciudad ciudad)throws PersistentException {
		try {
			if (ciudad.getIdPais() != null) {
				ciudad.getIdPais().ciudad.remove(ciudad);
			}
			
			orm.Cliente[] lClientes = ciudad.cliente.toArray();
			for(int i = 0; i < lClientes.length; i++) {
				lClientes[i].setIdCiudad(null);
			}
			orm.Biblioteca[] lBibliotecas = ciudad.biblioteca.toArray();
			for(int i = 0; i < lBibliotecas.length; i++) {
				lBibliotecas[i].setIdCiudad(null);
			}
			orm.Funcionario[] lFuncionarios = ciudad.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdCiudad(null);
			}
			return delete(ciudad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ciudad ciudad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ciudad.getIdPais() != null) {
				ciudad.getIdPais().ciudad.remove(ciudad);
			}
			
			orm.Cliente[] lClientes = ciudad.cliente.toArray();
			for(int i = 0; i < lClientes.length; i++) {
				lClientes[i].setIdCiudad(null);
			}
			orm.Biblioteca[] lBibliotecas = ciudad.biblioteca.toArray();
			for(int i = 0; i < lBibliotecas.length; i++) {
				lBibliotecas[i].setIdCiudad(null);
			}
			orm.Funcionario[] lFuncionarios = ciudad.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdCiudad(null);
			}
			try {
				session.delete(ciudad);
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
	
	public static boolean refresh(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByCriteria(CiudadCriteria ciudadCriteria) {
		Ciudad[] ciudads = listCiudadByCriteria(ciudadCriteria);
		if(ciudads == null || ciudads.length == 0) {
			return null;
		}
		return ciudads[0];
	}
	
	public static Ciudad[] listCiudadByCriteria(CiudadCriteria ciudadCriteria) {
		return ciudadCriteria.listCiudad();
	}
}
