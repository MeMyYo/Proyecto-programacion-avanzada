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

public class BibliotecaCriteria extends AbstractORMCriteria {
	public final StringExpression idBiblioteca;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final StringExpression propietario;
	public final IntegerExpression numeroDeTelefono;
	public final StringExpression correoElectronico;
	public final StringExpression idCiudadId;
	public final AssociationExpression idCiudad;
	public final CollectionExpression estante;
	public final CollectionExpression computador;
	public final CollectionExpression salaDeLectura;
	public final CollectionExpression clienteDeBiblioteca;
	public final CollectionExpression funcionario;
	
	public BibliotecaCriteria(Criteria criteria) {
		super(criteria);
		idBiblioteca = new StringExpression("idBiblioteca", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		propietario = new StringExpression("propietario", this);
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this);
		correoElectronico = new StringExpression("correoElectronico", this);
		idCiudadId = new StringExpression("idCiudad.idCiudad", this);
		idCiudad = new AssociationExpression("idCiudad", this);
		estante = new CollectionExpression("ORM_Estante", this);
		computador = new CollectionExpression("ORM_Computador", this);
		salaDeLectura = new CollectionExpression("ORM_SalaDeLectura", this);
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this);
		funcionario = new CollectionExpression("ORM_Funcionario", this);
	}
	
	public BibliotecaCriteria(PersistentSession session) {
		this(session.createCriteria(Biblioteca.class));
	}
	
	public BibliotecaCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public CiudadCriteria createIdCiudadCriteria() {
		return new CiudadCriteria(createCriteria("idCiudad"));
	}
	
	public orm.EstanteCriteria createEstanteCriteria() {
		return new orm.EstanteCriteria(createCriteria("ORM_Estante"));
	}
	
	public orm.ComputadorCriteria createComputadorCriteria() {
		return new orm.ComputadorCriteria(createCriteria("ORM_Computador"));
	}
	
	public orm.SalaDeLecturaCriteria createSalaDeLecturaCriteria() {
		return new orm.SalaDeLecturaCriteria(createCriteria("ORM_SalaDeLectura"));
	}
	
	public orm.ClienteDeBibliotecaCriteria createClienteDeBibliotecaCriteria() {
		return new orm.ClienteDeBibliotecaCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
	}
	
	public orm.FuncionarioCriteria createFuncionarioCriteria() {
		return new orm.FuncionarioCriteria(createCriteria("ORM_Funcionario"));
	}
	
	public Biblioteca uniqueBiblioteca() {
		return (Biblioteca) super.uniqueResult();
	}
	
	public Biblioteca[] listBiblioteca() {
		java.util.List list = super.list();
		return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
	}
}

