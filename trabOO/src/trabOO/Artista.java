package trabOO;
import java.util.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
public abstract class Artista {
	
	//atributos
	
	private String nome;
	private String bibliografia;
	private String foto;
	private String redeSocial;
	private List<Album> albuns = new LinkedList<Album>();
	private List<Musica> musicas = new LinkedList<Musica>();
	private List<Genero> generos = new LinkedList<Genero>();
	private Biblioteca biblioteca;
	
	
	public void cadastrarMusica() {
		//return true;
	}
	public boolean cadastrarAlbum() {
		return true;
	}

	
	//gets()
	
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
	
	
	//-----
	public List<Musica> getMusicas() {
		return Collections.unmodifiableList(musicas);
	}
	
	public List<Album> getAlbuns() {
		return Collections.unmodifiableList(albuns);
	}
	
	public List<Genero> getGeneros() {
		return Collections.unmodifiableList(generos);
	}	
	
	//sets()

	public void setNome(final String nome) {
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
	
	// ----
    public void adiciona(Musica musicas) {
        this.musicas.add(musicas);
    }
    public void adiciona(Album albuns) {
        this.albuns.add(albuns);
    }
    public void adiciona(Genero generos) {
        this.generos.add(generos);
    }
}
