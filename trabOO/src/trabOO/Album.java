package trabOO;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Album {
	
	//atributos
	
	private String descricao;
	private String foto;
	private Artista artista;
	private String titulo;
	private List<Musica> musicas = new LinkedList<Musica>();
	private List<Genero> generos = new LinkedList<Genero>();
	private Biblioteca biblioteca;
	
	
	public Album(String descricao, String foto) {
		this.descricao = descricao;
		this.foto = foto;
	}
	
	public String toString() {	
		return "Nome do album: " + titulo;
	}
	
	//gets()
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getFoto(){
		return foto;
	}
	
	public String getTitulo(){
		return titulo;
	}
		
	public List<Musica> getMusicas() {
		return Collections.unmodifiableList(musicas);
	}
	
	public List<Genero> getGeneros() {
		return Collections.unmodifiableList(generos);
	}
	
	
	//sets()
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//---
    public void adiciona(Musica musicas) {
        this.musicas.add(musicas);
    }
    public void adiciona(Genero generos) {
        this.generos.add(generos);
    }
}
