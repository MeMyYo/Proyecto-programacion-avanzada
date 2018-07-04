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

public class ComputadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idComputador;
	public final StringExpression marca;
	public final DateExpression fechaDeAdquisicion;
	public final DateExpression fechaUltimaSolicitud;
	public final StringExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final CollectionExpression solicitudComputador;
	
	public ComputadorDetachedCriteria() {
		super(orm.Computador.class, orm.ComputadorCriteria.class);
		idComputador = new StringExpression("idComputador", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this.getDetachedCriteria());
	}
	
	public ComputadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ComputadorCriteria.class);
		idComputador = new StringExpression("idComputador", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createIdBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("idBiblioteca"));
	}
	
	public orm.SolicitudComputadorDetachedCriteria createSolicitudComputadorCriteria() {
		return new orm.SolicitudComputadorDetachedCriteria(createCriteria("ORM_SolicitudComputador"));
	}
	
	public Computador uniqueComputador(PersistentSession session) {
		return (Computador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Computador[] listComputador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Computador[]) list.toArray(new Computador[list.size()]);
	}
}

