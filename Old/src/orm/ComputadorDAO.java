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

public class ComputadorDAO {
	public static Computador loadComputadorByORMID(String idComputador) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadComputadorByORMID(session, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador getComputadorByORMID(String idComputador) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getComputadorByORMID(session, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByORMID(String idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadComputadorByORMID(session, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador getComputadorByORMID(String idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getComputadorByORMID(session, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByORMID(PersistentSession session, String idComputador) throws PersistentException {
		try {
			return (Computador) session.load(orm.Computador.class, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador getComputadorByORMID(PersistentSession session, String idComputador) throws PersistentException {
		try {
			return (Computador) session.get(orm.Computador.class, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByORMID(PersistentSession session, String idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Computador) session.load(orm.Computador.class, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador getComputadorByORMID(PersistentSession session, String idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Computador) session.get(orm.Computador.class, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComputador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryComputador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComputador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryComputador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador[] listComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador[] listComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComputador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Computador as Computador");
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
	
	public static List queryComputador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Computador as Computador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Computador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador[] listComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComputador(session, condition, orderBy);
			return (Computador[]) list.toArray(new Computador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador[] listComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComputador(session, condition, orderBy, lockMode);
			return (Computador[]) list.toArray(new Computador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Computador[] computadors = listComputadorByQuery(session, condition, orderBy);
		if (computadors != null && computadors.length > 0)
			return computadors[0];
		else
			return null;
	}
	
	public static Computador loadComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Computador[] computadors = listComputadorByQuery(session, condition, orderBy, lockMode);
		if (computadors != null && computadors.length > 0)
			return computadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Computador as Computador");
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
	
	public static java.util.Iterator iterateComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Computador as Computador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Computador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador createComputador() {
		return new orm.Computador();
	}
	
	public static boolean save(orm.Computador computador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(computador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Computador computador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(computador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Computador computador)throws PersistentException {
		try {
			if (computador.getIdBiblioteca() != null) {
				computador.getIdBiblioteca().computador.remove(computador);
			}
			
			orm.SolicitudComputador[] lSolicitudComputadors = computador.solicitudComputador.toArray();
			for(int i = 0; i < lSolicitudComputadors.length; i++) {
				lSolicitudComputadors[i].setIdComputador(null);
			}
			return delete(computador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Computador computador, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (computador.getIdBiblioteca() != null) {
				computador.getIdBiblioteca().computador.remove(computador);
			}
			
			orm.SolicitudComputador[] lSolicitudComputadors = computador.solicitudComputador.toArray();
			for(int i = 0; i < lSolicitudComputadors.length; i++) {
				lSolicitudComputadors[i].setIdComputador(null);
			}
			try {
				session.delete(computador);
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
	
	public static boolean refresh(orm.Computador computador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(computador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Computador computador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(computador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Computador loadComputadorByCriteria(ComputadorCriteria computadorCriteria) {
		Computador[] computadors = listComputadorByCriteria(computadorCriteria);
		if(computadors == null || computadors.length == 0) {
			return null;
		}
		return computadors[0];
	}
	
	public static Computador[] listComputadorByCriteria(ComputadorCriteria computadorCriteria) {
		return computadorCriteria.listComputador();
	}
}
