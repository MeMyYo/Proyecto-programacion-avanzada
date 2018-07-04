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

public class BibliotecaDAO {
	public static Biblioteca loadBibliotecaByORMID(String idBiblioteca) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByORMID(session, idBiblioteca);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca getBibliotecaByORMID(String idBiblioteca) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getBibliotecaByORMID(session, idBiblioteca);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByORMID(String idBiblioteca, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByORMID(session, idBiblioteca, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca getBibliotecaByORMID(String idBiblioteca, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getBibliotecaByORMID(session, idBiblioteca, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByORMID(PersistentSession session, String idBiblioteca) throws PersistentException {
		try {
			return (Biblioteca) session.load(orm.Biblioteca.class, idBiblioteca);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca getBibliotecaByORMID(PersistentSession session, String idBiblioteca) throws PersistentException {
		try {
			return (Biblioteca) session.get(orm.Biblioteca.class, idBiblioteca);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByORMID(PersistentSession session, String idBiblioteca, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Biblioteca) session.load(orm.Biblioteca.class, idBiblioteca, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca getBibliotecaByORMID(PersistentSession session, String idBiblioteca, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Biblioteca) session.get(orm.Biblioteca.class, idBiblioteca, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBiblioteca(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryBiblioteca(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBiblioteca(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryBiblioteca(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca[] listBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listBibliotecaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca[] listBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listBibliotecaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBiblioteca(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Biblioteca as Biblioteca");
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
	
	public static List queryBiblioteca(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Biblioteca as Biblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Biblioteca", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca[] listBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBiblioteca(session, condition, orderBy);
			return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca[] listBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBiblioteca(session, condition, orderBy, lockMode);
			return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Biblioteca[] bibliotecas = listBibliotecaByQuery(session, condition, orderBy);
		if (bibliotecas != null && bibliotecas.length > 0)
			return bibliotecas[0];
		else
			return null;
	}
	
	public static Biblioteca loadBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Biblioteca[] bibliotecas = listBibliotecaByQuery(session, condition, orderBy, lockMode);
		if (bibliotecas != null && bibliotecas.length > 0)
			return bibliotecas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateBibliotecaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateBibliotecaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Biblioteca as Biblioteca");
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
	
	public static java.util.Iterator iterateBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Biblioteca as Biblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Biblioteca", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca createBiblioteca() {
		return new orm.Biblioteca();
	}
	
	public static boolean save(orm.Biblioteca biblioteca) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Biblioteca biblioteca) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Biblioteca biblioteca)throws PersistentException {
		try {
			if (biblioteca.getIdCiudad() != null) {
				biblioteca.getIdCiudad().biblioteca.remove(biblioteca);
			}
			
			orm.Estante[] lEstantes = biblioteca.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdBiblioteca(null);
			}
			orm.Computador[] lComputadors = biblioteca.computador.toArray();
			for(int i = 0; i < lComputadors.length; i++) {
				lComputadors[i].setIdBiblioteca(null);
			}
			orm.SalaDeLectura[] lSalaDeLecturas = biblioteca.salaDeLectura.toArray();
			for(int i = 0; i < lSalaDeLecturas.length; i++) {
				lSalaDeLecturas[i].setIdBiblioteca(null);
			}
			orm.ClienteDeBiblioteca[] lClienteDeBibliotecas = biblioteca.clienteDeBiblioteca.toArray();
			for(int i = 0; i < lClienteDeBibliotecas.length; i++) {
				lClienteDeBibliotecas[i].setBibliotecaidBiblioteca(null);
			}
			orm.Funcionario[] lFuncionarios = biblioteca.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdBiblioteca(null);
			}
			return delete(biblioteca);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Biblioteca biblioteca, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (biblioteca.getIdCiudad() != null) {
				biblioteca.getIdCiudad().biblioteca.remove(biblioteca);
			}
			
			orm.Estante[] lEstantes = biblioteca.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdBiblioteca(null);
			}
			orm.Computador[] lComputadors = biblioteca.computador.toArray();
			for(int i = 0; i < lComputadors.length; i++) {
				lComputadors[i].setIdBiblioteca(null);
			}
			orm.SalaDeLectura[] lSalaDeLecturas = biblioteca.salaDeLectura.toArray();
			for(int i = 0; i < lSalaDeLecturas.length; i++) {
				lSalaDeLecturas[i].setIdBiblioteca(null);
			}
			orm.ClienteDeBiblioteca[] lClienteDeBibliotecas = biblioteca.clienteDeBiblioteca.toArray();
			for(int i = 0; i < lClienteDeBibliotecas.length; i++) {
				lClienteDeBibliotecas[i].setBibliotecaidBiblioteca(null);
			}
			orm.Funcionario[] lFuncionarios = biblioteca.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdBiblioteca(null);
			}
			try {
				session.delete(biblioteca);
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
	
	public static boolean refresh(orm.Biblioteca biblioteca) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Biblioteca biblioteca) throws PersistentException {
		try {
			orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Biblioteca loadBibliotecaByCriteria(BibliotecaCriteria bibliotecaCriteria) {
		Biblioteca[] bibliotecas = listBibliotecaByCriteria(bibliotecaCriteria);
		if(bibliotecas == null || bibliotecas.length == 0) {
			return null;
		}
		return bibliotecas[0];
	}
	
	public static Biblioteca[] listBibliotecaByCriteria(BibliotecaCriteria bibliotecaCriteria) {
		return bibliotecaCriteria.listBiblioteca();
	}
}
