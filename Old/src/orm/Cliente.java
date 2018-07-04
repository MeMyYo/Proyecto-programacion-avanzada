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

public class Cliente {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CLIENTE_SOLICITUDCOMPUTADOR) {
			return ORM_solicitudComputador;
		}
		else if (key == orm.ORMConstants.KEY_CLIENTE_SOLICITUDLIBRO) {
			return ORM_solicitudLibro;
		}
		else if (key == orm.ORMConstants.KEY_CLIENTE_ENTREGADELIBRO) {
			return ORM_entregaDeLibro;
		}
		else if (key == orm.ORMConstants.KEY_CLIENTE_REGISTROSALALECTURA) {
			return ORM_registroSalaLectura;
		}
		else if (key == orm.ORMConstants.KEY_CLIENTE_CLIENTEDEBIBLIOTECA) {
			return ORM_clienteDeBiblioteca;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CLIENTE_IDCIUDAD) {
			this.idCiudad = (orm.Ciudad) owner;
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
	
	private String RUN;
	
	private String nombre;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private String genero;
	
	private java.util.Date fechaDeNacimiento;
	
	private String estadoDeTrabajo;
	
	private String areaDeInteres;
	
	private java.util.Date fechaUltimaSolicitud;
	
	private int diasDeAtraso = 0;
	
	private Integer numeroDeCelular;
	
	private Integer numeroDeTelefono;
	
	private String correoElectronico;
	
	private orm.Ciudad idCiudad;
	
	private java.util.Set ORM_solicitudComputador = new java.util.HashSet();
	
	private java.util.Set ORM_solicitudLibro = new java.util.HashSet();
	
	private java.util.Set ORM_entregaDeLibro = new java.util.HashSet();
	
	private java.util.Set ORM_registroSalaLectura = new java.util.HashSet();
	
	private java.util.Set ORM_clienteDeBiblioteca = new java.util.HashSet();
	
	public void setRUN(String value) {
		this.RUN = value;
	}
	
	public String getRUN() {
		return RUN;
	}
	
	public String getORMID() {
		return getRUN();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidoPaterno(String value) {
		this.apellidoPaterno = value;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public void setApellidoMaterno(String value) {
		this.apellidoMaterno = value;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setFechaDeNacimiento(java.util.Date value) {
		this.fechaDeNacimiento = value;
	}
	
	public java.util.Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setEstadoDeTrabajo(String value) {
		this.estadoDeTrabajo = value;
	}
	
	public String getEstadoDeTrabajo() {
		return estadoDeTrabajo;
	}
	
	public void setAreaDeInteres(String value) {
		this.areaDeInteres = value;
	}
	
	public String getAreaDeInteres() {
		return areaDeInteres;
	}
	
	public void setFechaUltimaSolicitud(java.util.Date value) {
		this.fechaUltimaSolicitud = value;
	}
	
	public java.util.Date getFechaUltimaSolicitud() {
		return fechaUltimaSolicitud;
	}
	
	public void setDiasDeAtraso(int value) {
		this.diasDeAtraso = value;
	}
	
	public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	
	public void setNumeroDeCelular(int value) {
		setNumeroDeCelular(new Integer(value));
	}
	
	public void setNumeroDeCelular(Integer value) {
		this.numeroDeCelular = value;
	}
	
	public Integer getNumeroDeCelular() {
		return numeroDeCelular;
	}
	
	public void setNumeroDeTelefono(int value) {
		setNumeroDeTelefono(new Integer(value));
	}
	
	public void setNumeroDeTelefono(Integer value) {
		this.numeroDeTelefono = value;
	}
	
	public Integer getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	
	public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setIdCiudad(orm.Ciudad value) {
		if (idCiudad != null) {
			idCiudad.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
		}
	}
	
	public orm.Ciudad getIdCiudad() {
		return idCiudad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdCiudad(orm.Ciudad value) {
		this.idCiudad = value;
	}
	
	private orm.Ciudad getORM_IdCiudad() {
		return idCiudad;
	}
	
	private void setORM_SolicitudComputador(java.util.Set value) {
		this.ORM_solicitudComputador = value;
	}
	
	private java.util.Set getORM_SolicitudComputador() {
		return ORM_solicitudComputador;
	}
	
	public final orm.SolicitudComputadorSetCollection solicitudComputador = new orm.SolicitudComputadorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_SOLICITUDCOMPUTADOR, orm.ORMConstants.KEY_SOLICITUDCOMPUTADOR_CLIENTERUN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_SolicitudLibro(java.util.Set value) {
		this.ORM_solicitudLibro = value;
	}
	
	private java.util.Set getORM_SolicitudLibro() {
		return ORM_solicitudLibro;
	}
	
	public final orm.SolicitudLibroSetCollection solicitudLibro = new orm.SolicitudLibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_SOLICITUDLIBRO, orm.ORMConstants.KEY_SOLICITUDLIBRO_CLIENTERUN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_EntregaDeLibro(java.util.Set value) {
		this.ORM_entregaDeLibro = value;
	}
	
	private java.util.Set getORM_EntregaDeLibro() {
		return ORM_entregaDeLibro;
	}
	
	public final orm.EntregaDeLibroSetCollection entregaDeLibro = new orm.EntregaDeLibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_ENTREGADELIBRO, orm.ORMConstants.KEY_ENTREGADELIBRO_CLIENTERUN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_RegistroSalaLectura(java.util.Set value) {
		this.ORM_registroSalaLectura = value;
	}
	
	private java.util.Set getORM_RegistroSalaLectura() {
		return ORM_registroSalaLectura;
	}
	
	public final orm.RegistroSalaLecturaSetCollection registroSalaLectura = new orm.RegistroSalaLecturaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_REGISTROSALALECTURA, orm.ORMConstants.KEY_REGISTROSALALECTURA_CLIENTERUN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ClienteDeBiblioteca(java.util.Set value) {
		this.ORM_clienteDeBiblioteca = value;
	}
	
	private java.util.Set getORM_ClienteDeBiblioteca() {
		return ORM_clienteDeBiblioteca;
	}
	
	public final orm.ClienteDeBibliotecaSetCollection clienteDeBiblioteca = new orm.ClienteDeBibliotecaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_CLIENTEDEBIBLIOTECA, orm.ORMConstants.KEY_CLIENTEDEBIBLIOTECA_CLIENTERUN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getRUN());
	}
	
}
