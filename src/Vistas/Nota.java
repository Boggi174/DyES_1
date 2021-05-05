package Vistas;

public class Nota {
	public int id_nota;
	public String nombre_nota;
	public String descripcion_nota;
	public int id_tipo_nota;
	public int id_importancia_nota;
	public int id_categoria_nota;
	public String fecha_nota;
	public int id_nivel_nota;
	public int id_usuario_nota;
	
	
	public Nota(int id_nota, String nombre_nota, String descripcion_nota, int id_tipo_nota, int id_importancia_nota,
			int id_categoria_nota, String fecha_nota, int id_nivel_nota, int id_usuario_nota) {
		super();
		this.id_nota = id_nota;
		this.nombre_nota = nombre_nota;
		this.descripcion_nota = descripcion_nota;
		this.id_tipo_nota = id_tipo_nota;
		this.id_importancia_nota = id_importancia_nota;
		this.id_categoria_nota = id_categoria_nota;
		this.fecha_nota = fecha_nota;
		this.id_nivel_nota = id_nivel_nota;
		this.id_usuario_nota = id_usuario_nota;
	}
	public int getId_nota() {
		return id_nota;
	}
	public void setId_nota(int id_nota) {
		this.id_nota = id_nota;
	}
	public String getNombre_nota() {
		return nombre_nota;
	}
	public void setNombre_nota(String nombre_nota) {
		this.nombre_nota = nombre_nota;
	}
	public String getDescripcion_nota() {
		return descripcion_nota;
	}
	public void setDescripcion_nota(String descripcion_nota) {
		this.descripcion_nota = descripcion_nota;
	}
	public int getId_tipo_nota() {
		return id_tipo_nota;
	}
	public void setId_tipo_nota(int id_tipo_nota) {
		this.id_tipo_nota = id_tipo_nota;
	}
	public int getId_importancia_nota() {
		return id_importancia_nota;
	}
	public void setId_importancia_nota(int id_importancia_nota) {
		this.id_importancia_nota = id_importancia_nota;
	}
	public int getId_categoria_nota() {
		return id_categoria_nota;
	}
	public void setId_categoria_nota(int id_categoria_nota) {
		this.id_categoria_nota = id_categoria_nota;
	}
	public String getFecha_nota() {
		return fecha_nota;
	}
	public void setFecha_nota(String fecha_nota) {
		this.fecha_nota = fecha_nota;
	}
	public int getId_nivel_nota() {
		return id_nivel_nota;
	}
	public void setId_nivel_nota(int id_nivel_nota) {
		this.id_nivel_nota = id_nivel_nota;
	}
	public int getId_usuario_nota() {
		return id_usuario_nota;
	}
	public void setId_usuario_nota(int id_usuario_nota) {
		this.id_usuario_nota = id_usuario_nota;
	}
	
	
	
	
	
}
