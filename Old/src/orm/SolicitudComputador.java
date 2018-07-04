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
public class SolicitudComputador implements Serializable {
	public SolicitudComputador() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof SolicitudComputador))
			return false;
		SolicitudComputador solicitudcomputador = (SolicitudComputador)aObj;
		if (getIdSolicitud() != solicitudcomputador.getIdSolicitud())
			return false;
		if (getClienteRUN() == null) {
			if (solicitudcomputador.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(solicitudcomputador.getClienteRUN()))
			return false;
		if (getIdComputador() == null) {
			if (solicitudcomputador.getIdComputador() != null)
				return false;
		}
		else if (!getIdComputador().equals(solicitudcomputador.getIdComputador()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdSolicitud();
		if (getClienteRUN() != null) {
			hashcode = hashcode + (getClienteRUN().getORMID() == null ? 0 : getClienteRUN().getORMID().hashCode());
		}
		if (getIdComputador() != null) {
			hashcode = hashcode + (getIdComputador().getORMID() == null ? 0 : getIdComputador().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_SOLICITUDCOMPUTADOR_CLIENTERUN) {
			this.clienteRUN = (orm.Cliente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_SOLICITUDCOMPUTADOR_IDCOMPUTADOR) {
			this.idComputador = (orm.Computador) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idSolicitud;
	
	private java.util.Date fechaDeSolicitud;
	
	private java.sql.Time horaSolicitud;
	
	private orm.Cliente clienteRUN;
	
	private String clienteRUNId;
	
	private void setClienteRUNId(String value) {
		this.clienteRUNId = value;
	}
	
	public String getClienteRUNId() {
		return clienteRUNId;
	}
	
	private orm.Computador idComputador;
	
	private String idComputadorId;
	
	private void setIdComputadorId(String value) {
		this.idComputadorId = value;
	}
	
	public String getIdComputadorId() {
		return idComputadorId;
	}
	
	public void setIdSolicitud(int value) {
		this.idSolicitud = value;
	}
	
	public int getIdSolicitud() {
		return idSolicitud;
	}
	
	public void setFechaDeSolicitud(java.util.Date value) {
		this.fechaDeSolicitud = value;
	}
	
	public java.util.Date getFechaDeSolicitud() {
		return fechaDeSolicitud;
	}
	
	public void setHoraSolicitud(java.sql.Time value) {
		this.horaSolicitud = value;
	}
	
	public java.sql.Time getHoraSolicitud() {
		return horaSolicitud;
	}
	
	public void setClienteRUN(orm.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.solicitudComputador.remove(this);
		}
		if (value != null) {
			value.solicitudComputador.add(this);
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
	
	public void setIdComputador(orm.Computador value) {
		if (idComputador != null) {
			idComputador.solicitudComputador.remove(this);
		}
		if (value != null) {
			value.solicitudComputador.add(this);
		}
	}
	
	public orm.Computador getIdComputador() {
		return idComputador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdComputador(orm.Computador value) {
		this.idComputador = value;
	}
	
	private orm.Computador getORM_IdComputador() {
		return idComputador;
	}
	
	public String toString() {
		return String.valueOf(getIdSolicitud() + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())) + " " + ((getIdComputador() == null) ? "" : String.valueOf(getIdComputador().getORMID())));
	}
	
}
