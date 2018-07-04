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
public class RegistroSalaLectura implements Serializable {
	public RegistroSalaLectura() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof RegistroSalaLectura))
			return false;
		RegistroSalaLectura registrosalalectura = (RegistroSalaLectura)aObj;
		if (getIdRegistro() != registrosalalectura.getIdRegistro())
			return false;
		if (getClienteRUN() == null) {
			if (registrosalalectura.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(registrosalalectura.getClienteRUN()))
			return false;
		if (getSalaDeLecturaidSala() == null) {
			if (registrosalalectura.getSalaDeLecturaidSala() != null)
				return false;
		}
		else if (!getSalaDeLecturaidSala().equals(registrosalalectura.getSalaDeLecturaidSala()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdRegistro();
		if (getClienteRUN() != null) {
			hashcode = hashcode + (getClienteRUN().getORMID() == null ? 0 : getClienteRUN().getORMID().hashCode());
		}
		if (getSalaDeLecturaidSala() != null) {
			hashcode = hashcode + (getSalaDeLecturaidSala().getORMID() == null ? 0 : getSalaDeLecturaidSala().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_REGISTROSALALECTURA_CLIENTERUN) {
			this.clienteRUN = (orm.Cliente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_REGISTROSALALECTURA_SALADELECTURAIDSALA) {
			this.salaDeLecturaidSala = (orm.SalaDeLectura) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idRegistro;
	
	private java.util.Date fechaRegistro;
	
	private String tipoRegistro;
	
	private java.sql.Time horaRegistro;
	
	private orm.Cliente clienteRUN;
	
	private String clienteRUNId;
	
	private void setClienteRUNId(String value) {
		this.clienteRUNId = value;
	}
	
	public String getClienteRUNId() {
		return clienteRUNId;
	}
	
	private orm.SalaDeLectura salaDeLecturaidSala;
	
	private String salaDeLecturaidSalaId;
	
	private void setSalaDeLecturaidSalaId(String value) {
		this.salaDeLecturaidSalaId = value;
	}
	
	public String getSalaDeLecturaidSalaId() {
		return salaDeLecturaidSalaId;
	}
	
	public void setIdRegistro(int value) {
		this.idRegistro = value;
	}
	
	public int getIdRegistro() {
		return idRegistro;
	}
	
	public void setFechaRegistro(java.util.Date value) {
		this.fechaRegistro = value;
	}
	
	public java.util.Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setTipoRegistro(String value) {
		this.tipoRegistro = value;
	}
	
	public String getTipoRegistro() {
		return tipoRegistro;
	}
	
	public void setHoraRegistro(java.sql.Time value) {
		this.horaRegistro = value;
	}
	
	public java.sql.Time getHoraRegistro() {
		return horaRegistro;
	}
	
	public void setClienteRUN(orm.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
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
	
	public void setSalaDeLecturaidSala(orm.SalaDeLectura value) {
		if (salaDeLecturaidSala != null) {
			salaDeLecturaidSala.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
		}
	}
	
	public orm.SalaDeLectura getSalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SalaDeLecturaidSala(orm.SalaDeLectura value) {
		this.salaDeLecturaidSala = value;
	}
	
	private orm.SalaDeLectura getORM_SalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	public String toString() {
		return String.valueOf(getIdRegistro() + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())) + " " + ((getSalaDeLecturaidSala() == null) ? "" : String.valueOf(getSalaDeLecturaidSala().getORMID())));
	}
	
}
