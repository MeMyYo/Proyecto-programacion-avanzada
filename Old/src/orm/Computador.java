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

public class Computador {
	public Computador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_COMPUTADOR_SOLICITUDCOMPUTADOR) {
			return ORM_solicitudComputador;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_COMPUTADOR_IDBIBLIOTECA) {
			this.idBiblioteca = (orm.Biblioteca) owner;
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
	
	private String idComputador;
	
	private String marca;
	
	private java.util.Date fechaDeAdquisicion;
	
	private java.util.Date fechaUltimaSolicitud;
	
	private orm.Biblioteca idBiblioteca;
	
	private java.util.Set ORM_solicitudComputador = new java.util.HashSet();
	
	public void setIdComputador(String value) {
		this.idComputador = value;
	}
	
	public String getIdComputador() {
		return idComputador;
	}
	
	public String getORMID() {
		return getIdComputador();
	}
	
	public void setMarca(String value) {
		this.marca = value;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setFechaDeAdquisicion(java.util.Date value) {
		this.fechaDeAdquisicion = value;
	}
	
	public java.util.Date getFechaDeAdquisicion() {
		return fechaDeAdquisicion;
	}
	
	public void setFechaUltimaSolicitud(java.util.Date value) {
		this.fechaUltimaSolicitud = value;
	}
	
	public java.util.Date getFechaUltimaSolicitud() {
		return fechaUltimaSolicitud;
	}
	
	public void setIdBiblioteca(orm.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.computador.remove(this);
		}
		if (value != null) {
			value.computador.add(this);
		}
	}
	
	public orm.Biblioteca getIdBiblioteca() {
		return idBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdBiblioteca(orm.Biblioteca value) {
		this.idBiblioteca = value;
	}
	
	private orm.Biblioteca getORM_IdBiblioteca() {
		return idBiblioteca;
	}
	
	private void setORM_SolicitudComputador(java.util.Set value) {
		this.ORM_solicitudComputador = value;
	}
	
	private java.util.Set getORM_SolicitudComputador() {
		return ORM_solicitudComputador;
	}
	
	public final orm.SolicitudComputadorSetCollection solicitudComputador = new orm.SolicitudComputadorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_COMPUTADOR_SOLICITUDCOMPUTADOR, orm.ORMConstants.KEY_SOLICITUDCOMPUTADOR_IDCOMPUTADOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdComputador());
	}
	
}
