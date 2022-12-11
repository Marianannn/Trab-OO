package trabOO;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Biblioteca {
	
	
	//atributos
	
	private List<Artista> artistas = new LinkedList<Artista>();
	private List<Musica> musicas = new LinkedList<Musica>();
	private List<Album> albuns = new LinkedList<Album>();

	
	public Biblioteca(){
		
	}
	
	//gets()
	
	public List<Artista> getArtistas() {
		return Collections.unmodifiableList(artistas);
	}
	
	public List<Musica> getMusicas() {
		return Collections.unmodifiableList(musicas);
	}
	
	public List<Album> getAlbuns() {
		return Collections.unmodifiableList(albuns);
	}
	
	//----

    public void adiciona(Musica musicas) {
        this.musicas.add(musicas);
    }
    public void adiciona(Album albuns) {
        this.albuns.add(albuns);
    }
    public void adiciona(Artista artistas) {
        this.artistas.add(artistas);
    }
}
