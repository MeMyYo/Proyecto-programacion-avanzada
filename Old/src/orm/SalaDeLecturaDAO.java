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

public class SalaDeLecturaDAO {
	public static SalaDeLectura loadSalaDeLecturaByORMID(String idSala) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSalaDeLecturaByORMID(session, idSala);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura getSalaDeLecturaByORMID(String idSala) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSalaDeLecturaByORMID(session, idSala);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByORMID(String idSala, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSalaDeLecturaByORMID(session, idSala, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura getSalaDeLecturaByORMID(String idSala, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSalaDeLecturaByORMID(session, idSala, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByORMID(PersistentSession session, String idSala) throws PersistentException {
		try {
			return (SalaDeLectura) session.load(orm.SalaDeLectura.class, idSala);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura getSalaDeLecturaByORMID(PersistentSession session, String idSala) throws PersistentException {
		try {
			return (SalaDeLectura) session.get(orm.SalaDeLectura.class, idSala);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByORMID(PersistentSession session, String idSala, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SalaDeLectura) session.load(orm.SalaDeLectura.class, idSala, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura getSalaDeLecturaByORMID(PersistentSession session, String idSala, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SalaDeLectura) session.get(orm.SalaDeLectura.class, idSala, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySalaDeLectura(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySalaDeLectura(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySalaDeLectura(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySalaDeLectura(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura[] listSalaDeLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSalaDeLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura[] listSalaDeLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSalaDeLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySalaDeLectura(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SalaDeLectura as SalaDeLectura");
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
	
	public static List querySalaDeLectura(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SalaDeLectura as SalaDeLectura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SalaDeLectura", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura[] listSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySalaDeLectura(session, condition, orderBy);
			return (SalaDeLectura[]) list.toArray(new SalaDeLectura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura[] listSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySalaDeLectura(session, condition, orderBy, lockMode);
			return (SalaDeLectura[]) list.toArray(new SalaDeLectura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSalaDeLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSalaDeLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SalaDeLectura[] salaDeLecturas = listSalaDeLecturaByQuery(session, condition, orderBy);
		if (salaDeLecturas != null && salaDeLecturas.length > 0)
			return salaDeLecturas[0];
		else
			return null;
	}
	
	public static SalaDeLectura loadSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SalaDeLectura[] salaDeLecturas = listSalaDeLecturaByQuery(session, condition, orderBy, lockMode);
		if (salaDeLecturas != null && salaDeLecturas.length > 0)
			return salaDeLecturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSalaDeLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSalaDeLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSalaDeLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSalaDeLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SalaDeLectura as SalaDeLectura");
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
	
	public static java.util.Iterator iterateSalaDeLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SalaDeLectura as SalaDeLectura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SalaDeLectura", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura createSalaDeLectura() {
		return new orm.SalaDeLectura();
	}
	
	public static boolean save(orm.SalaDeLectura salaDeLectura) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(salaDeLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.SalaDeLectura salaDeLectura) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(salaDeLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.SalaDeLectura salaDeLectura)throws PersistentException {
		try {
			if (salaDeLectura.getIdBiblioteca() != null) {
				salaDeLectura.getIdBiblioteca().salaDeLectura.remove(salaDeLectura);
			}
			
			orm.RegistroSalaLectura[] lRegistroSalaLecturas = salaDeLectura.registroSalaLectura.toArray();
			for(int i = 0; i < lRegistroSalaLecturas.length; i++) {
				lRegistroSalaLecturas[i].setSalaDeLecturaidSala(null);
			}
			return delete(salaDeLectura);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.SalaDeLectura salaDeLectura, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (salaDeLectura.getIdBiblioteca() != null) {
				salaDeLectura.getIdBiblioteca().salaDeLectura.remove(salaDeLectura);
			}
			
			orm.RegistroSalaLectura[] lRegistroSalaLecturas = salaDeLectura.registroSalaLectura.toArray();
			for(int i = 0; i < lRegistroSalaLecturas.length; i++) {
				lRegistroSalaLecturas[i].setSalaDeLecturaidSala(null);
			}
			try {
				session.delete(salaDeLectura);
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
	
	public static boolean refresh(orm.SalaDeLectura salaDeLectura) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(salaDeLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.SalaDeLectura salaDeLectura) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(salaDeLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SalaDeLectura loadSalaDeLecturaByCriteria(SalaDeLecturaCriteria salaDeLecturaCriteria) {
		SalaDeLectura[] salaDeLecturas = listSalaDeLecturaByCriteria(salaDeLecturaCriteria);
		if(salaDeLecturas == null || salaDeLecturas.length == 0) {
			return null;
		}
		return salaDeLecturas[0];
	}
	
	public static SalaDeLectura[] listSalaDeLecturaByCriteria(SalaDeLecturaCriteria salaDeLecturaCriteria) {
		return salaDeLecturaCriteria.listSalaDeLectura();
	}
}
