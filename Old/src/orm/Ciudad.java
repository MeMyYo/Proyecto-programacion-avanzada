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

public class Ciudad {
	public Ciudad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CIUDAD_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == orm.ORMConstants.KEY_CIUDAD_BIBLIOTECA) {
			return ORM_biblioteca;
		}
		else if (key == orm.ORMConstants.KEY_CIUDAD_FUNCIONARIO) {
			return ORM_funcionario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CIUDAD_IDPAIS) {
			this.idPais = (orm.Pais) owner;
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
	
	private String idCiudad;
	
	private int nombre;
	
	private orm.Pais idPais;
	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	private java.util.Set ORM_biblioteca = new java.util.HashSet();
	
	private java.util.Set ORM_funcionario = new java.util.HashSet();
	
	public void setIdCiudad(String value) {
		this.idCiudad = value;
	}
	
	public String getIdCiudad() {
		return idCiudad;
	}
	
	public String getORMID() {
		return getIdCiudad();
	}
	
	public void setNombre(int value) {
		this.nombre = value;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	public void setIdPais(orm.Pais value) {
		if (idPais != null) {
			idPais.ciudad.remove(this);
		}
		if (value != null) {
			value.ciudad.add(this);
		}
	}
	
	public orm.Pais getIdPais() {
		return idPais;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdPais(orm.Pais value) {
		this.idPais = value;
	}
	
	private orm.Pais getORM_IdPais() {
		return idPais;
	}
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	public final orm.ClienteSetCollection cliente = new orm.ClienteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CIUDAD_CLIENTE, orm.ORMConstants.KEY_CLIENTE_IDCIUDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Biblioteca(java.util.Set value) {
		this.ORM_biblioteca = value;
	}
	
	private java.util.Set getORM_Biblioteca() {
		return ORM_biblioteca;
	}
	
	public final orm.BibliotecaSetCollection biblioteca = new orm.BibliotecaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CIUDAD_BIBLIOTECA, orm.ORMConstants.KEY_BIBLIOTECA_IDCIUDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Funcionario(java.util.Set value) {
		this.ORM_funcionario = value;
	}
	
	private java.util.Set getORM_Funcionario() {
		return ORM_funcionario;
	}
	
	public final orm.FuncionarioSetCollection funcionario = new orm.FuncionarioSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CIUDAD_FUNCIONARIO, orm.ORMConstants.KEY_FUNCIONARIO_IDCIUDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCiudad());
	}
	
}
