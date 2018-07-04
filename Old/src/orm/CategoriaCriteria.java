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

public class CategoriaCriteria extends AbstractORMCriteria {
	public final StringExpression idCategoria;
	public final IntegerExpression nombre;
	public final CollectionExpression estante;
	public final CollectionExpression libro;
	
	public CategoriaCriteria(Criteria criteria) {
		super(criteria);
		idCategoria = new StringExpression("idCategoria", this);
		nombre = new IntegerExpression("nombre", this);
		estante = new CollectionExpression("ORM_Estante", this);
		libro = new CollectionExpression("ORM_Libro", this);
	}
	
	public CategoriaCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria.class));
	}
	
	public CategoriaCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public orm.EstanteCriteria createEstanteCriteria() {
		return new orm.EstanteCriteria(createCriteria("ORM_Estante"));
	}
	
	public orm.LibroCriteria createLibroCriteria() {
		return new orm.LibroCriteria(createCriteria("ORM_Libro"));
	}
	
	public Categoria uniqueCategoria() {
		return (Categoria) super.uniqueResult();
	}
	
	public Categoria[] listCategoria() {
		java.util.List list = super.list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

