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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AutorCriteria extends AbstractORMCriteria {
	public final StringExpression idAutor;
	public final StringExpression nombre;
	public final TimeExpression fechaDeNacimiento;
	public final StringExpression genero;
	public final StringExpression apellidoPaterno;
	public final StringExpression apellidoMaterno;
	public final CollectionExpression autores;
	
	public AutorCriteria(Criteria criteria) {
		super(criteria);
		idAutor = new StringExpression("idAutor", this);
		nombre = new StringExpression("nombre", this);
		fechaDeNacimiento = new TimeExpression("fechaDeNacimiento", this);
		genero = new StringExpression("genero", this);
		apellidoPaterno = new StringExpression("apellidoPaterno", this);
		apellidoMaterno = new StringExpression("apellidoMaterno", this);
		autores = new CollectionExpression("ORM_Autores", this);
	}
	
	public AutorCriteria(PersistentSession session) {
		this(session.createCriteria(Autor.class));
	}
	
	public AutorCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public orm.AutoresCriteria createAutoresCriteria() {
		return new orm.AutoresCriteria(createCriteria("ORM_Autores"));
	}
	
	public Autor uniqueAutor() {
		return (Autor) super.uniqueResult();
	}
	
	public Autor[] listAutor() {
		java.util.List list = super.list();
		return (Autor[]) list.toArray(new Autor[list.size()]);
	}
}

