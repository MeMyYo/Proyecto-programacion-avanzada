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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idCategoria;
	public final IntegerExpression nombre;
	public final CollectionExpression estante;
	public final CollectionExpression libro;
	
	public CategoriaDetachedCriteria() {
		super(orm.Categoria.class, orm.CategoriaCriteria.class);
		idCategoria = new StringExpression("idCategoria", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.CategoriaCriteria.class);
		idCategoria = new StringExpression("idCategoria", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public orm.EstanteDetachedCriteria createEstanteCriteria() {
		return new orm.EstanteDetachedCriteria(createCriteria("ORM_Estante"));
	}
	
	public orm.LibroDetachedCriteria createLibroCriteria() {
		return new orm.LibroDetachedCriteria(createCriteria("ORM_Libro"));
	}
	
	public Categoria uniqueCategoria(PersistentSession session) {
		return (Categoria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria[] listCategoria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

