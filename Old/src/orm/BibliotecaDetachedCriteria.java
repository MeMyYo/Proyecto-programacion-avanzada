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

public class BibliotecaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public BibliotecaDetachedCriteria() {
		super(orm.Biblioteca.class, orm.BibliotecaCriteria.class);
		idBiblioteca = new StringExpression("idBiblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new StringExpression("idCiudad.idCiudad", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		computador = new CollectionExpression("ORM_Computador", this.getDetachedCriteria());
		salaDeLectura = new CollectionExpression("ORM_SalaDeLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.BibliotecaCriteria.class);
		idBiblioteca = new StringExpression("idBiblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new StringExpression("idCiudad.idCiudad", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		computador = new CollectionExpression("ORM_Computador", this.getDetachedCriteria());
		salaDeLectura = new CollectionExpression("ORM_SalaDeLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
	}
	
	public CiudadDetachedCriteria createIdCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("idCiudad"));
	}
	
	public orm.EstanteDetachedCriteria createEstanteCriteria() {
		return new orm.EstanteDetachedCriteria(createCriteria("ORM_Estante"));
	}
	
	public orm.ComputadorDetachedCriteria createComputadorCriteria() {
		return new orm.ComputadorDetachedCriteria(createCriteria("ORM_Computador"));
	}
	
	public orm.SalaDeLecturaDetachedCriteria createSalaDeLecturaCriteria() {
		return new orm.SalaDeLecturaDetachedCriteria(createCriteria("ORM_SalaDeLectura"));
	}
	
	public orm.ClienteDeBibliotecaDetachedCriteria createClienteDeBibliotecaCriteria() {
		return new orm.ClienteDeBibliotecaDetachedCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
	}
	
	public orm.FuncionarioDetachedCriteria createFuncionarioCriteria() {
		return new orm.FuncionarioDetachedCriteria(createCriteria("ORM_Funcionario"));
	}
	
	public Biblioteca uniqueBiblioteca(PersistentSession session) {
		return (Biblioteca) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Biblioteca[] listBiblioteca(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
	}
}

