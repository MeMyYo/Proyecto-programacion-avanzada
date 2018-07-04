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

public class Categoria {
	public Categoria() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CATEGORIA_ESTANTE) {
			return ORM_estante;
		}
		else if (key == orm.ORMConstants.KEY_CATEGORIA_LIBRO) {
			return ORM_libro;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String idCategoria;
	
	private int nombre;
	
	private java.util.Set ORM_estante = new java.util.HashSet();
	
	private java.util.Set ORM_libro = new java.util.HashSet();
	
	public void setIdCategoria(String value) {
		this.idCategoria = value;
	}
	
	public String getIdCategoria() {
		return idCategoria;
	}
	
	public String getORMID() {
		return getIdCategoria();
	}
	
	public void setNombre(int value) {
		this.nombre = value;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	private void setORM_Estante(java.util.Set value) {
		this.ORM_estante = value;
	}
	
	private java.util.Set getORM_Estante() {
		return ORM_estante;
	}
	
	public final orm.EstanteSetCollection estante = new orm.EstanteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CATEGORIA_ESTANTE, orm.ORMConstants.KEY_ESTANTE_IDCATEGORIA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Libro(java.util.Set value) {
		this.ORM_libro = value;
	}
	
	private java.util.Set getORM_Libro() {
		return ORM_libro;
	}
	
	public final orm.LibroSetCollection libro = new orm.LibroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CATEGORIA_LIBRO, orm.ORMConstants.KEY_LIBRO_IDCATEGORIA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCategoria());
	}
	
}
