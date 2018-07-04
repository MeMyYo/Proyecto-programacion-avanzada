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

public class EstanteCriteria extends AbstractORMCriteria {
	public final StringExpression idEstante;
	public final IntegerExpression capacidadAproximada;
	public final StringExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final StringExpression idCategoriaId;
	public final AssociationExpression idCategoria;
	public final CollectionExpression libro;
	
	public EstanteCriteria(Criteria criteria) {
		super(criteria);
		idEstante = new StringExpression("idEstante", this);
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this);
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this);
		idCategoria = new AssociationExpression("idCategoria", this);
		libro = new CollectionExpression("ORM_Libro", this);
	}
	
	public EstanteCriteria(PersistentSession session) {
		this(session.createCriteria(Estante.class));
	}
	
	public EstanteCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
	public CategoriaCriteria createIdCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("idCategoria"));
	}
	
	public orm.LibroCriteria createLibroCriteria() {
		return new orm.LibroCriteria(createCriteria("ORM_Libro"));
	}
	
	public Estante uniqueEstante() {
		return (Estante) super.uniqueResult();
	}
	
	public Estante[] listEstante() {
		java.util.List list = super.list();
		return (Estante[]) list.toArray(new Estante[list.size()]);
	}
}

