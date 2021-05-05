package Vistas;

public class Tipo {

	public int id_tipo;
	public String tipo_nota;
	public Tipo(int id_tipo, String tipo_nota) {
		super();
		this.id_tipo = id_tipo;
		this.tipo_nota = tipo_nota;
	}
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getTipo_nota() {
		return tipo_nota;
	}
	public void setTipo_nota(String tipo_nota) {
		this.tipo_nota = tipo_nota;
	}
	
	
}
