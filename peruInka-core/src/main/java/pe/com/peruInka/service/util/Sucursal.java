package pe.com.peruInka.service.util;
//@XmlRootElement(name = "sucursal")
public class Sucursal {

	private Long id;
	private String razonSocial;
	private String RUC;
	private String direccion;
	private String nrTelefono;
	private String status;
	
	
	public String getNrTelefono() {
		return nrTelefono;
	}

	public void setNrTelefono(String nrTelefono) {
		this.nrTelefono = nrTelefono;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
	public String getStatusMessage() {
		if(status.equals("1")){
			return "ACTIVO";
		}else{
			return "INACTIVO";
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
