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

public class LibroCriteria extends AbstractORMCriteria {
	public final StringExpression codigo;
	public final StringExpression nombre;
	public final IntegerExpression numeroDePaginas;
	public final StringExpression disponibilidad;
	public final TimeExpression fechaDeAdquisicion;
	public final TimeExpression fechaDeEdicion;
	public final StringExpression edicion;
	public final StringExpression editor;
	public final IntegerExpression vecesSolicitado;
	public final TimeExpression fechaUltimaSolicitud;
	public final StringExpression colorTapa;
	public final StringExpression estadoDeterioro;
	public final StringExpression idioma;
	public final StringExpression idEstanteId;
	public final AssociationExpression idEstante;
	public final StringExpression idCategoriaId;
	public final AssociationExpression idCategoria;
	public final CollectionExpression solicitudLibro;
	public final CollectionExpression entregaDeLibro;
	public final CollectionExpression autores;
	
	public LibroCriteria(Criteria criteria) {
		super(criteria);
		codigo = new StringExpression("codigo", this);
		nombre = new StringExpression("nombre", this);
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this);
		disponibilidad = new StringExpression("disponibilidad", this);
		fechaDeAdquisicion = new TimeExpression("fechaDeAdquisicion", this);
		fechaDeEdicion = new TimeExpression("fechaDeEdicion", this);
		edicion = new StringExpression("edicion", this);
		editor = new StringExpression("editor", this);
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this);
		fechaUltimaSolicitud = new TimeExpression("fechaUltimaSolicitud", this);
		colorTapa = new StringExpression("colorTapa", this);
		estadoDeterioro = new StringExpression("estadoDeterioro", this);
		idioma = new StringExpression("idioma", this);
		idEstanteId = new StringExpression("idEstante.idEstante", this);
		idEstante = new AssociationExpression("idEstante", this);
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this);
		idCategoria = new AssociationExpression("idCategoria", this);
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this);
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this);
		autores = new CollectionExpression("ORM_Autores", this);
	}
	
	public LibroCriteria(PersistentSession session) {
		this(session.createCriteria(Libro.class));
	}
	
	public LibroCriteria() throws PersistentException {
		this(orm.ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public EstanteCriteria createIdEstanteCriteria() {
		return new EstanteCriteria(createCriteria("idEstante"));
	}
	
	public CategoriaCriteria createIdCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("idCategoria"));
	}
	
	public orm.SolicitudLibroCriteria createSolicitudLibroCriteria() {
		return new orm.SolicitudLibroCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public orm.EntregaDeLibroCriteria createEntregaDeLibroCriteria() {
		return new orm.EntregaDeLibroCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public orm.AutoresCriteria createAutoresCriteria() {
		return new orm.AutoresCriteria(createCriteria("ORM_Autores"));
	}
	
	public Libro uniqueLibro() {
		return (Libro) super.uniqueResult();
	}
	
	public Libro[] listLibro() {
		java.util.List list = super.list();
		return (Libro[]) list.toArray(new Libro[list.size()]);
	}
}

