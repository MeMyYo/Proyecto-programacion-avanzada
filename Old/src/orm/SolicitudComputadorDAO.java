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

public class SolicitudComputadorDAO {
	public static SolicitudComputador loadSolicitudComputadorByORMID(int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByORMID(session, idSolicitud, clienteRUN, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudComputadorByORMID(session, idSolicitud, clienteRUN, idComputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByORMID(session, idSolicitud, clienteRUN, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudComputadorByORMID(session, idSolicitud, clienteRUN, idComputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(PersistentSession session, int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new orm.SolicitudComputador();
			solicitudcomputador.setIdSolicitud(idSolicitud);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			solicitudcomputador.setORM_IdComputador(idComputador);
			
			return (SolicitudComputador) session.load(orm.SolicitudComputador.class, solicitudcomputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(PersistentSession session, int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new orm.SolicitudComputador();
			solicitudcomputador.setIdSolicitud(idSolicitud);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			solicitudcomputador.setORM_IdComputador(idComputador);
			
			return (SolicitudComputador) session.get(orm.SolicitudComputador.class, solicitudcomputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(PersistentSession session, int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new orm.SolicitudComputador();
			solicitudcomputador.setIdSolicitud(idSolicitud);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			solicitudcomputador.setORM_IdComputador(idComputador);
			
			return (SolicitudComputador) session.load(orm.SolicitudComputador.class, solicitudcomputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(PersistentSession session, int idSolicitud, orm.Cliente clienteRUN, orm.Computador idComputador, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new orm.SolicitudComputador();
			solicitudcomputador.setIdSolicitud(idSolicitud);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			solicitudcomputador.setORM_IdComputador(idComputador);
			
			return (SolicitudComputador) session.get(orm.SolicitudComputador.class, solicitudcomputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudComputador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudComputador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SolicitudComputador as SolicitudComputador");
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
	
	public static List querySolicitudComputador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SolicitudComputador as SolicitudComputador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudComputador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySolicitudComputador(session, condition, orderBy);
			return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySolicitudComputador(session, condition, orderBy, lockMode);
			return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByQuery(session, condition, orderBy);
		if (solicitudComputadors != null && solicitudComputadors.length > 0)
			return solicitudComputadors[0];
		else
			return null;
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		if (solicitudComputadors != null && solicitudComputadors.length > 0)
			return solicitudComputadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SolicitudComputador as SolicitudComputador");
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
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SolicitudComputador as SolicitudComputador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudComputador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador createSolicitudComputador() {
		return new orm.SolicitudComputador();
	}
	
	public static boolean save(orm.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.SolicitudComputador solicitudComputador)throws PersistentException {
		try {
			orm.Cliente clienteRUN = solicitudComputador.getClienteRUN();
			if (solicitudComputador.getClienteRUN() != null) {
				solicitudComputador.getClienteRUN().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_ClienteRUN(clienteRUN);
			
			orm.Computador idComputador = solicitudComputador.getIdComputador();
			if (solicitudComputador.getIdComputador() != null) {
				solicitudComputador.getIdComputador().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_IdComputador(idComputador);
			
			return delete(solicitudComputador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.SolicitudComputador solicitudComputador, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Cliente clienteRUN = solicitudComputador.getClienteRUN();
			if (solicitudComputador.getClienteRUN() != null) {
				solicitudComputador.getClienteRUN().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_ClienteRUN(clienteRUN);
			
			orm.Computador idComputador = solicitudComputador.getIdComputador();
			if (solicitudComputador.getIdComputador() != null) {
				solicitudComputador.getIdComputador().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_IdComputador(idComputador);
			
			try {
				session.delete(solicitudComputador);
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
	
	public static boolean refresh(orm.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByCriteria(SolicitudComputadorCriteria solicitudComputadorCriteria) {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByCriteria(solicitudComputadorCriteria);
		if(solicitudComputadors == null || solicitudComputadors.length == 0) {
			return null;
		}
		return solicitudComputadors[0];
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByCriteria(SolicitudComputadorCriteria solicitudComputadorCriteria) {
		return solicitudComputadorCriteria.listSolicitudComputador();
	}
}
