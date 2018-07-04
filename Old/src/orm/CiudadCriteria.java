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

public class CiudadCriteria extends AbstractORMCriteria {
	public final StringExpression idCiudad;
	public final IntegerExpression nombre;
	public final StringExpression idPaisId;
	public final AssociationExpression idPais;
	public final CollectionExpression cliente;
	public final CollectionExpression biblioteca;
	public final CollectionExpression funcionario;
	
	public CiudadCriteria(Criteria criteria) {
		super(criteria);
		idCiudad = new StringExpression("idCiudad", this);
		nombre = new IntegerExpression("nombre", this);
		idPaisId = new StringExpression("idPais.idPais", this);
		idPais = new AssociationExpression("idPais", this);
		cliente = new CollectionExpression("ORM_Cliente", this);
		biblioteca = new CollectionExpression("ORM_Biblioteca", this);
		funcionario = new CollectionExpression("ORM_Funcionario", this);
	}
	
	public CiudadCriteria(PersistentSession session) {
		this(session.createCriteria(Ciudad.class));
	}
	
	public CiudadCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public PaisCriteria createIdPaisCriteria() {
		return new PaisCriteria(createCriteria("idPais"));
	}
	
	public orm.ClienteCriteria createClienteCriteria() {
		return new orm.ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public orm.BibliotecaCriteria createBibliotecaCriteria() {
		return new orm.BibliotecaCriteria(createCriteria("ORM_Biblioteca"));
	}
	
	public orm.FuncionarioCriteria createFuncionarioCriteria() {
		return new orm.FuncionarioCriteria(createCriteria("ORM_Funcionario"));
	}
	
	public Ciudad uniqueCiudad() {
		return (Ciudad) super.uniqueResult();
	}
	
	public Ciudad[] listCiudad() {
		java.util.List list = super.list();
		return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
	}
}

