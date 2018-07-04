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

public class LibroDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public LibroDetachedCriteria() {
		super(orm.Libro.class, orm.LibroCriteria.class);
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this.getDetachedCriteria());
		disponibilidad = new StringExpression("disponibilidad", this.getDetachedCriteria());
		fechaDeAdquisicion = new TimeExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaDeEdicion = new TimeExpression("fechaDeEdicion", this.getDetachedCriteria());
		edicion = new StringExpression("edicion", this.getDetachedCriteria());
		editor = new StringExpression("editor", this.getDetachedCriteria());
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this.getDetachedCriteria());
		fechaUltimaSolicitud = new TimeExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		colorTapa = new StringExpression("colorTapa", this.getDetachedCriteria());
		estadoDeterioro = new StringExpression("estadoDeterioro", this.getDetachedCriteria());
		idioma = new StringExpression("idioma", this.getDetachedCriteria());
		idEstanteId = new StringExpression("idEstante.idEstante", this.getDetachedCriteria());
		idEstante = new AssociationExpression("idEstante", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public LibroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LibroCriteria.class);
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this.getDetachedCriteria());
		disponibilidad = new StringExpression("disponibilidad", this.getDetachedCriteria());
		fechaDeAdquisicion = new TimeExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaDeEdicion = new TimeExpression("fechaDeEdicion", this.getDetachedCriteria());
		edicion = new StringExpression("edicion", this.getDetachedCriteria());
		editor = new StringExpression("editor", this.getDetachedCriteria());
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this.getDetachedCriteria());
		fechaUltimaSolicitud = new TimeExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		colorTapa = new StringExpression("colorTapa", this.getDetachedCriteria());
		estadoDeterioro = new StringExpression("estadoDeterioro", this.getDetachedCriteria());
		idioma = new StringExpression("idioma", this.getDetachedCriteria());
		idEstanteId = new StringExpression("idEstante.idEstante", this.getDetachedCriteria());
		idEstante = new AssociationExpression("idEstante", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public EstanteDetachedCriteria createIdEstanteCriteria() {
		return new EstanteDetachedCriteria(createCriteria("idEstante"));
	}
	
	public CategoriaDetachedCriteria createIdCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("idCategoria"));
	}
	
	public orm.SolicitudLibroDetachedCriteria createSolicitudLibroCriteria() {
		return new orm.SolicitudLibroDetachedCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public orm.EntregaDeLibroDetachedCriteria createEntregaDeLibroCriteria() {
		return new orm.EntregaDeLibroDetachedCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public orm.AutoresDetachedCriteria createAutoresCriteria() {
		return new orm.AutoresDetachedCriteria(createCriteria("ORM_Autores"));
	}
	
	public Libro uniqueLibro(PersistentSession session) {
		return (Libro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Libro[] listLibro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Libro[]) list.toArray(new Libro[list.size()]);
	}
}

