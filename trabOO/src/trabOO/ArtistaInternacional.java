package trabOO;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class ArtistaInternacional extends Artista{
	private String pais;
	private String idioma;
	private String nome;
	private String bibliografia;
	private String foto;
	private String redeSocial;
	
	public ArtistaInternacional(String nome, String pais, String idioma) {
		this.nome = nome;
		this.pais = pais;
		this.idioma = idioma;
	}
	
	public String toString() {	
		return "Nome do artista internacional: " + nome;
	}
	//gets()
	public String getPais() {
		return pais;
	}
	public String getIdioma() {
		return idioma;
	}
	public String getNome(){
		return nome;
	}
	
	public String getBibliografia(){
		return bibliografia;
	}
	
	public String getFoto(){
		return foto;
	}
	
	public String getRedeSocial(){
		return redeSocial;
	}
	
	
	
	//-- sets()
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}
	
}