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

public class ClienteDeBibliotecaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression bibliotecaidBibliotecaId;
	public final AssociationExpression bibliotecaidBiblioteca;
	
	public ClienteDeBibliotecaDetachedCriteria() {
		super(orm.ClienteDeBiblioteca.class, orm.ClienteDeBibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		bibliotecaidBibliotecaId = new StringExpression("ORM_BibliotecaidBiblioteca.idBiblioteca", this.getDetachedCriteria());
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this.getDetachedCriteria());
	}
	
	public ClienteDeBibliotecaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ClienteDeBibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		bibliotecaidBibliotecaId = new StringExpression("ORM_BibliotecaidBiblioteca.idBiblioteca", this.getDetachedCriteria());
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public BibliotecaDetachedCriteria createBibliotecaidBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("ORM_BibliotecaidBiblioteca"));
	}
	
	public ClienteDeBiblioteca uniqueClienteDeBiblioteca(PersistentSession session) {
		return (ClienteDeBiblioteca) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ClienteDeBiblioteca[] listClienteDeBiblioteca(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
	}
}

