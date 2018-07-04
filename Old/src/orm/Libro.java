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

public class Libro {
	public Libro() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_LIBRO_SOLICITUDLIBRO) {
			return ORM_solicitudLibro;
		}
		else if (key == orm.ORMConstants.KEY_LIBRO_ENTREGADELIBRO) {
			return ORM_entregaDeLibro;
		}
		else if (key == orm.ORMConstants.KEY_LIBRO_AUTORES) {
			return ORM_autores;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_LIBRO_IDESTANTE) {
			this.idEstante = (orm.Estante) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_LIBRO_IDCATEGORIA) {
			this.idCategoria = (orm.Categoria) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String codigo;
	
	private String nombre;
	
	private int numeroDePaginas;
	
	private String disponibilidad;
	
	private java.sql.Time fechaDeAdquisicion;
	
	private java.sql.Time fechaDeEdicion;
	
	private String edicion;
	
	private String editor;
	
	private int vecesSolicitado;
	
	private java.sql.Time fechaUltimaSolicitud;
	
	private String colorTapa;
	
	private String estadoDeterioro;
	
	private String idioma;
	
	private orm.Estante idEstante;
	
	private orm.Categoria idCategoria;
	
	private java.util.Set ORM_solicitudLibro = new java.util.HashSet();
	
	private java.util.Set ORM_entregaDeLibro = new java.util.HashSet();
	
	private java.util.Set ORM_autores = new java.util.HashSet();
	
	public void setCodigo(String value) {
		this.codigo = value;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getORMID() {
		return getCodigo();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNumeroDePaginas(int value) {
		this.numeroDePaginas = value;
	}
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public void setDisponibilidad(String value) {
		this.disponibilidad = value;
	}
	
	public String getDisponibilidad() {
		return disponibilidad;
	}
	
	public void setFechaDeAdquisicion(java.sql.Time value) {
		this.fechaDeAdquisicion = value;
	}
	
	public java.sql.Time getFechaDeAdquisicion() {
		return fechaDeAdquisicion;
	}
	
	public void setFechaDeEdicion(java.sql.Time value) {
		this.fechaDeEdicion = value;
	}
	
	public java.sql.Time getFechaDeEdicion() {
		return fechaDeEdicion;
	}
	
	public void setEdicion(String value) {
		this.edicion = value;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEditor(String value) {
		this.editor = value;
	}
	
	public String getEditor() {
		return editor;
	}
	
	public void setVecesSolicitado(int value) {
		this.vecesSolicitado = value;
	}
	
	public int getVecesSolicitado() {
		return vecesSolicitado;
	}
	
	public void setFechaUltimaSolicitud(java.sql.Time value) {
		this.fechaUltimaSolicitud = value;
	}
	
	public java.sql.Time getFechaUltimaSolicitud() {
		return fechaUltimaSolicitud;
	}
	
	public void setColorTapa(String value) {
		this.colorTapa = value;
	}
	
	public String getColorTapa() {
		return colorTapa;
	}
	
	public void setEstadoDeterioro(String value) {
		this.estadoDeterioro = value;
	}
	
	public String getEstadoDeterioro() {
		return estadoDeterioro;
	}
	
	public void setIdioma(String value) {
		this.idioma = value;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdEstante(orm.Estante value) {
		if (idEstante != null) {
			idEstante.libro.remove(this);
		}
		if (value != null) {
			value.libro.add(this);
		}
	}
	
	public orm.Estante getIdEstante() {
		return idEstante;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdEstante(orm.Estante value) {
		this.idEstante = value;
	}
	
	private orm.Estante getORM_IdEstante() {
		return idEstante;
	}
	
	public void setIdCategoria(orm.Categoria value) {
		if (idCategoria != null) {
			idCategoria.libro.remove(this);
		}
		if (value != null) {
			value.libro.add(this);
		}
	}
	
	public orm.Categoria getIdCategoria() {
		return idCategoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdCategoria(orm.Categoria value) {
		this.idCategoria = value;
	}
	
	private orm.Categoria getORM_IdCategoria() {
		return idCategoria;
	}
	
	private void setORM_SolicitudLibro(java.util.Set value) {
		this.ORM_solicitudLibro = value;
	}
	
	private java.util.Set getORM_SolicitudLibro() {
		return ORM_solicitudLibro;
	}
	
	public final orm.SolicitudLibroSetCollection solicitudLibro = new orm.SolicitudLibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LIBRO_SOLICITUDLIBRO, orm.ORMConstants.KEY_SOLICITUDLIBRO_CODIGOLIBRO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_EntregaDeLibro(java.util.Set value) {
		this.ORM_entregaDeLibro = value;
	}
	
	private java.util.Set getORM_EntregaDeLibro() {
		return ORM_entregaDeLibro;
	}
	
	public final orm.EntregaDeLibroSetCollection entregaDeLibro = new orm.EntregaDeLibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LIBRO_ENTREGADELIBRO, orm.ORMConstants.KEY_ENTREGADELIBRO_LIBROCODIGO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Autores(java.util.Set value) {
		this.ORM_autores = value;
	}
	
	private java.util.Set getORM_Autores() {
		return ORM_autores;
	}
	
	public final orm.AutoresSetCollection autores = new orm.AutoresSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LIBRO_AUTORES, orm.ORMConstants.KEY_AUTORES_LIBROCODIGO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodigo());
	}
	
}
