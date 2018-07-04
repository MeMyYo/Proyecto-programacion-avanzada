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

import java.io.Serializable;
public class ClienteDeBiblioteca implements Serializable {
	public ClienteDeBiblioteca() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof ClienteDeBiblioteca))
			return false;
		ClienteDeBiblioteca clientedebiblioteca = (ClienteDeBiblioteca)aObj;
		if (getId() != clientedebiblioteca.getId())
			return false;
		if (getClienteRUN() == null) {
			if (clientedebiblioteca.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(clientedebiblioteca.getClienteRUN()))
			return false;
		if (getBibliotecaidBiblioteca() == null) {
			if (clientedebiblioteca.getBibliotecaidBiblioteca() != null)
				return false;
		}
		else if (!getBibliotecaidBiblioteca().equals(clientedebiblioteca.getBibliotecaidBiblioteca()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getClienteRUN() != null) {
			hashcode = hashcode + (getClienteRUN().getORMID() == null ? 0 : getClienteRUN().getORMID().hashCode());
		}
		if (getBibliotecaidBiblioteca() != null) {
			hashcode = hashcode + (getBibliotecaidBiblioteca().getORMID() == null ? 0 : getBibliotecaidBiblioteca().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CLIENTEDEBIBLIOTECA_CLIENTERUN) {
			this.clienteRUN = (orm.Cliente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CLIENTEDEBIBLIOTECA_BIBLIOTECAIDBIBLIOTECA) {
			this.bibliotecaidBiblioteca = (orm.Biblioteca) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Cliente clienteRUN;
	
	private String clienteRUNId;
	
	private void setClienteRUNId(String value) {
		this.clienteRUNId = value;
	}
	
	public String getClienteRUNId() {
		return clienteRUNId;
	}
	
	private orm.Biblioteca bibliotecaidBiblioteca;
	
	private String bibliotecaidBibliotecaId;
	
	private void setBibliotecaidBibliotecaId(String value) {
		this.bibliotecaidBibliotecaId = value;
	}
	
	public String getBibliotecaidBibliotecaId() {
		return bibliotecaidBibliotecaId;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setClienteRUN(orm.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.clienteDeBiblioteca.remove(this);
		}
		if (value != null) {
			value.clienteDeBiblioteca.add(this);
		}
	}
	
	public orm.Cliente getClienteRUN() {
		return clienteRUN;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ClienteRUN(orm.Cliente value) {
		this.clienteRUN = value;
	}
	
	private orm.Cliente getORM_ClienteRUN() {
		return clienteRUN;
	}
	
	public void setBibliotecaidBiblioteca(orm.Biblioteca value) {
		if (bibliotecaidBiblioteca != null) {
			bibliotecaidBiblioteca.clienteDeBiblioteca.remove(this);
		}
		if (value != null) {
			value.clienteDeBiblioteca.add(this);
		}
	}
	
	public orm.Biblioteca getBibliotecaidBiblioteca() {
		return bibliotecaidBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_BibliotecaidBiblioteca(orm.Biblioteca value) {
		this.bibliotecaidBiblioteca = value;
	}
	
	private orm.Biblioteca getORM_BibliotecaidBiblioteca() {
		return bibliotecaidBiblioteca;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())) + " " + ((getBibliotecaidBiblioteca() == null) ? "" : String.valueOf(getBibliotecaidBiblioteca().getORMID())));
	}
	
}
