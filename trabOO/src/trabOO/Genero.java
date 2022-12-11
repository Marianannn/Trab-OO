package trabOO;
import java.util.*;
public class Genero {
	private String descricao;
	private String genero;
	
	public Genero(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {	
		return "Nome do genero: " + genero;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
