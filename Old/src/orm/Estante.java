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

public class Estante {
	public Estante() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESTANTE_LIBRO) {
			return ORM_libro;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ESTANTE_IDBIBLIOTECA) {
			this.idBiblioteca = (orm.Biblioteca) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ESTANTE_IDCATEGORIA) {
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
	
	private String idEstante;
	
	private int capacidadAproximada;
	
	private orm.Biblioteca idBiblioteca;
	
	private orm.Categoria idCategoria;
	
	private java.util.Set ORM_libro = new java.util.HashSet();
	
	public void setIdEstante(String value) {
		this.idEstante = value;
	}
	
	public String getIdEstante() {
		return idEstante;
	}
	
	public String getORMID() {
		return getIdEstante();
	}
	
	public void setCapacidadAproximada(int value) {
		this.capacidadAproximada = value;
	}
	
	public int getCapacidadAproximada() {
		return capacidadAproximada;
	}
	
	public void setIdBiblioteca(orm.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.estante.remove(this);
		}
		if (value != null) {
			value.estante.add(this);
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
	
	public void setIdCategoria(orm.Categoria value) {
		if (idCategoria != null) {
			idCategoria.estante.remove(this);
		}
		if (value != null) {
			value.estante.add(this);
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
	
	private void setORM_Libro(java.util.Set value) {
		this.ORM_libro = value;
	}
	
	private java.util.Set getORM_Libro() {
		return ORM_libro;
	}
	
	public final orm.LibroSetCollection libro = new orm.LibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESTANTE_LIBRO, orm.ORMConstants.KEY_LIBRO_IDESTANTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEstante());
	}
	
}
