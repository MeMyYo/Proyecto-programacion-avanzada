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

public class Pais {
	public Pais() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PAIS_CIUDAD) {
			return ORM_ciudad;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String idPais;
	
	private String nombre;
	
	private java.util.Set ORM_ciudad = new java.util.HashSet();
	
	public void setIdPais(String value) {
		this.idPais = value;
	}
	
	public String getIdPais() {
		return idPais;
	}
	
	public String getORMID() {
		return getIdPais();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Ciudad(java.util.Set value) {
		this.ORM_ciudad = value;
	}
	
	private java.util.Set getORM_Ciudad() {
		return ORM_ciudad;
	}
	
	public final orm.CiudadSetCollection ciudad = new orm.CiudadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PAIS_CIUDAD, orm.ORMConstants.KEY_CIUDAD_IDPAIS, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPais());
	}
	
}
