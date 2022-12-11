package trabOO;
import java.util.*;
public class ArtistaNacional extends Artista{
	private String regiaoBrasil;
	private String nome;
	private String bibliografia;
	private String foto;
	private String redeSocial;
	
	public ArtistaNacional(String nome, String regiaoBrasil){
		this.nome = nome;
		this.regiaoBrasil = regiaoBrasil;
	}
	
	public String toString() {	
		return "Nome do artista nacional: " + nome;
	}
	
	
	//gets()
	public String getRegiaoBrasil() {
		return regiaoBrasil;
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
	
	
	//sets()
	public void setRegiaoBrasil(String regiaoBrasil) {
		this.regiaoBrasil = regiaoBrasil;
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