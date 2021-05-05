package Vistas;

public class Nivel {

	public int id_nivel;
	public String nivel_nota;
	public Nivel(int id_nivel, String nivel_nota) {
		super();
		this.id_nivel = id_nivel;
		this.nivel_nota = nivel_nota;
	}
	public int getId_nivel() {
		return id_nivel;
	}
	public void setId_nivel(int id_nivel) {
		this.id_nivel = id_nivel;
	}
	public String getNivel_nota() {
		return nivel_nota;
	}
	public void setNivel_nota(String nivel_nota) {
		this.nivel_nota = nivel_nota;
	}
	
	
}
