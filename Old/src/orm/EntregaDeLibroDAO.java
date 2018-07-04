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

public class EntregaDeLibroDAO {
	public static EntregaDeLibro loadEntregaDeLibroByORMID(int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByORMID(session, idDevolucion, clienteRUN, librocodigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEntregaDeLibroByORMID(session, idDevolucion, clienteRUN, librocodigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByORMID(session, idDevolucion, clienteRUN, librocodigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEntregaDeLibroByORMID(session, idDevolucion, clienteRUN, librocodigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(PersistentSession session, int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new orm.EntregaDeLibro();
			entregadelibro.setIdDevolucion(idDevolucion);
			entregadelibro.setORM_ClienteRUN(clienteRUN);
			entregadelibro.setORM_Librocodigo(librocodigo);
			
			return (EntregaDeLibro) session.load(orm.EntregaDeLibro.class, entregadelibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(PersistentSession session, int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new orm.EntregaDeLibro();
			entregadelibro.setIdDevolucion(idDevolucion);
			entregadelibro.setORM_ClienteRUN(clienteRUN);
			entregadelibro.setORM_Librocodigo(librocodigo);
			
			return (EntregaDeLibro) session.get(orm.EntregaDeLibro.class, entregadelibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(PersistentSession session, int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new orm.EntregaDeLibro();
			entregadelibro.setIdDevolucion(idDevolucion);
			entregadelibro.setORM_ClienteRUN(clienteRUN);
			entregadelibro.setORM_Librocodigo(librocodigo);
			
			return (EntregaDeLibro) session.load(orm.EntregaDeLibro.class, entregadelibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(PersistentSession session, int idDevolucion, orm.Cliente clienteRUN, orm.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new orm.EntregaDeLibro();
			entregadelibro.setIdDevolucion(idDevolucion);
			entregadelibro.setORM_ClienteRUN(clienteRUN);
			entregadelibro.setORM_Librocodigo(librocodigo);
			
			return (EntregaDeLibro) session.get(orm.EntregaDeLibro.class, entregadelibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEntregaDeLibro(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEntregaDeLibro(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntregaDeLibro as EntregaDeLibro");
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
	
	public static List queryEntregaDeLibro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntregaDeLibro as EntregaDeLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntregaDeLibro", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntregaDeLibro(session, condition, orderBy);
			return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntregaDeLibro(session, condition, orderBy, lockMode);
			return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByQuery(session, condition, orderBy);
		if (entregaDeLibros != null && entregaDeLibros.length > 0)
			return entregaDeLibros[0];
		else
			return null;
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		if (entregaDeLibros != null && entregaDeLibros.length > 0)
			return entregaDeLibros[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntregaDeLibro as EntregaDeLibro");
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
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntregaDeLibro as EntregaDeLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntregaDeLibro", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro createEntregaDeLibro() {
		return new orm.EntregaDeLibro();
	}
	
	public static boolean save(orm.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.EntregaDeLibro entregaDeLibro)throws PersistentException {
		try {
			orm.Cliente clienteRUN = entregaDeLibro.getClienteRUN();
			if (entregaDeLibro.getClienteRUN() != null) {
				entregaDeLibro.getClienteRUN().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_ClienteRUN(clienteRUN);
			
			orm.Libro librocodigo = entregaDeLibro.getLibrocodigo();
			if (entregaDeLibro.getLibrocodigo() != null) {
				entregaDeLibro.getLibrocodigo().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_Librocodigo(librocodigo);
			
			return delete(entregaDeLibro);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.EntregaDeLibro entregaDeLibro, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Cliente clienteRUN = entregaDeLibro.getClienteRUN();
			if (entregaDeLibro.getClienteRUN() != null) {
				entregaDeLibro.getClienteRUN().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_ClienteRUN(clienteRUN);
			
			orm.Libro librocodigo = entregaDeLibro.getLibrocodigo();
			if (entregaDeLibro.getLibrocodigo() != null) {
				entregaDeLibro.getLibrocodigo().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_Librocodigo(librocodigo);
			
			try {
				session.delete(entregaDeLibro);
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
	
	public static boolean refresh(orm.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByCriteria(EntregaDeLibroCriteria entregaDeLibroCriteria) {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByCriteria(entregaDeLibroCriteria);
		if(entregaDeLibros == null || entregaDeLibros.length == 0) {
			return null;
		}
		return entregaDeLibros[0];
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByCriteria(EntregaDeLibroCriteria entregaDeLibroCriteria) {
		return entregaDeLibroCriteria.listEntregaDeLibro();
	}
}
