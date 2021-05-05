package Vistas;

public class Importancia {

	public int id_importancia;
	public String nombre_importancia;
	public Importancia(int id_importancia, String nombre_importancia) {
		super();
		this.id_importancia = id_importancia;
		this.nombre_importancia = nombre_importancia;
	}
	public int getId_importancia() {
		return id_importancia;
	}
	public void setId_importancia(int id_importancia) {
		this.id_importancia = id_importancia;
	}
	public String getNombre_importancia() {
		return nombre_importancia;
	}
	public void setNombre_importancia(String nombre_importancia) {
		this.nombre_importancia = nombre_importancia;
	}
	
	
	
}
