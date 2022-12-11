package trabOO;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Musica {
	
	//atributos
	
	private String letra;
	private String linkMusica;
	private String nome;
	private Musica musica;
	private List<Genero> generos = new LinkedList<Genero>();
	private Biblioteca biblioteca;
	
	public Musica(String letra, String linkMusica) {
		this.letra = letra;
		this.linkMusica = linkMusica;
	}
	
	public String toString() {	
		return "Nome da musica: " + nome + "\n" + letra;
	}
	
	//get()
	
	public String getLetra() {
		return letra;
	}
	
	public String getLinkMusica() {
		return linkMusica;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Genero> getGeneros() {
		return Collections.unmodifiableList(generos);
	}	
	
	//set()
	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public void setLinkMusica(String linkMusica) {
		this.linkMusica = linkMusica;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//---
    public void adiciona(Genero generos) {
        this.generos.add(generos);
    }
}
