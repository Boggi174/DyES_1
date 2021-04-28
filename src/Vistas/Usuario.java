package Vistas;

public class Usuario
{

	public String NombreMamalonMamalonzisimo;
	public String contraseniaMamalona;
	public String correoPerron;
	public Long telefonoPerron;
	public int tipoDeUsuario;
	
	
	public Usuario(String nombreMamalonMamalonzisimo, String contraseniaMamalona, String correoPerron,
			Long telefonoPerron, int tipoDeUsuario) {
		super();
		NombreMamalonMamalonzisimo = nombreMamalonMamalonzisimo;
		this.contraseniaMamalona = contraseniaMamalona;
		this.correoPerron = correoPerron;
		this.telefonoPerron = telefonoPerron;
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	
	public String getNombreMamalonMamalonzisimo() {
		return NombreMamalonMamalonzisimo;
	}
	public void setNombreMamalonMamalonzisimo(String nombreMamalonMamalonzisimo) {
		
		NombreMamalonMamalonzisimo = nombreMamalonMamalonzisimo;
	}
	public String getContraseniaMamalona() {
		return contraseniaMamalona;
	}
	public void setContraseniaMamalona(String contraseniaMamalona) {
		this.contraseniaMamalona = contraseniaMamalona;
	}
	public String getCorreoPerron() {
		return correoPerron;
	}
	public void setCorreoPerron(String correoPerron) {
		this.correoPerron = correoPerron;
	}
	public Long getTelefonoPerron() {
		return telefonoPerron;
	}
	public void setTelefonoPerron(Long telefonoPerron) {
		this.telefonoPerron = telefonoPerron;
	}
	public int getTipoDeUsuario() {
		return tipoDeUsuario;
	}
	public void setTipoDeUsuario(int tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	
	

}
