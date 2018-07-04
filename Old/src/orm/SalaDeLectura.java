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

public class SalaDeLectura {
	public SalaDeLectura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_SALADELECTURA_REGISTROSALALECTURA) {
			return ORM_registroSalaLectura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_SALADELECTURA_IDBIBLIOTECA) {
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
	
	private String idSala;
	
	private int capacidad;
	
	private String nombre;
	
	private orm.Biblioteca idBiblioteca;
	
	private java.util.Set ORM_registroSalaLectura = new java.util.HashSet();
	
	public void setIdSala(String value) {
		this.idSala = value;
	}
	
	public String getIdSala() {
		return idSala;
	}
	
	public String getORMID() {
		return getIdSala();
	}
	
	public void setCapacidad(int value) {
		this.capacidad = value;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setIdBiblioteca(orm.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.salaDeLectura.remove(this);
		}
		if (value != null) {
			value.salaDeLectura.add(this);
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
	
	private void setORM_RegistroSalaLectura(java.util.Set value) {
		this.ORM_registroSalaLectura = value;
	}
	
	private java.util.Set getORM_RegistroSalaLectura() {
		return ORM_registroSalaLectura;
	}
	
	public final orm.RegistroSalaLecturaSetCollection registroSalaLectura = new orm.RegistroSalaLecturaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SALADELECTURA_REGISTROSALALECTURA, orm.ORMConstants.KEY_REGISTROSALALECTURA_SALADELECTURAIDSALA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdSala());
	}
	
}
