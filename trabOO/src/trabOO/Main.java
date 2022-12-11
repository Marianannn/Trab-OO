package trabOO;

import java.util.*;

public class Main {
	
	static ArtistaInternacional artista1;
	static ArtistaNacional artista2;
	static Album album1;
	static Musica musica1;
	static Genero genero1;

	
	
	public static void main(String[] args) {
		
		artista1 = new ArtistaInternacional("Coldplay","Inglaterra", "inglês");
		
		artista2 = new ArtistaNacional("Skank","Belo Horizonte");
		
		album1 = new Album("O nome do álbum contém uma expressão "
				+ "espanhola \"Viva la Vida\" que se traduz como \"Viva a vida!", "foto");
		
		musica1 = new Musica("I used to rule the world[...]", 
				"https://www.youtube.com/watch?v=dvgZkm1xWPE&ab_channel=Coldplay");
		
		genero1 = new Genero("rock alternativo é bom");
		
		
		album1.setTitulo("Viva la Vida or Death and All His Friends");
		genero1.setGenero("rock alternativo");
		musica1.setNome("Viva la vida");
		musica1.setLetra("I used to rule the world\r\n"
				+ "Seas would rise when I gave the word\r\n"
				+ "Now in the morning I sleep alone\r\n"
				+ "Sweep the streets I used to own\r\n"
				+ "I used to roll the dice\r\n"
				+ "Feel the fear in my enemy's eyes\r\n"
				+ "Listened as the crowd would sing\r\n"
				+ "Now the old king is dead!\r\n"
				+ "Long live the king!\r\n"
				+ "One minute I held the key\r\n"
				+ "Next the walls were closed on me\r\n"
				+ "And I discovered that my castles stand\r\n"
				+ "Upon pillars of salt and pillars of sand\r\n"
				+ "I hear Jerusalem bells are ringing\r\n"
				+ "Roman Cavalry choirs are singing\r\n"
				+ "Be my mirror, my sword and shield\r\n"
				+ "My missionaries in a foreign field\r\n"
				+ "For some reason I can't explain\r\n"
				+ "Once you'd gone, there was never\r\n"
				+ "Never an honest word\r\n"
				+ "That was when I ruled the world\r\n"
				+ "It was the wicked and wild wind\r\n"
				+ "Blew down the doors to let me in\r\n"
				+ "Shattered windows and the sound of drums\r\n"
				+ "People couldn't believe what I'd become\r\n"
				+ "Revolutionaries wait\r\n"
				+ "For my head on a silver plate\r\n"
				+ "Just a puppet on a lonely string\r\n"
				+ "Oh, who would ever want to be king?\r\n"
				+ "I hear Jerusalem bells are ringing\r\n"
				+ "Roman Cavalry choirs are singing\r\n"
				+ "Be my mirror, my sword and shield\r\n"
				+ "My missionaries in a foreign field\r\n"
				+ "For some reason I can't explain\r\n"
				+ "I know Saint Peter won't call my name\r\n"
				+ "Never an honest word\r\n"
				+ "But that was when I ruled the world\r\n"
				+ "Ooh, ooh, ooh, ooh\r\n"
				+ "Hear Jerusalem bells are ringing\r\n"
				+ "Roman Cavalry choirs are singing\r\n"
				+ "Be my mirror, my sword and shield\r\n"
				+ "My missionaries in a foreign field\r\n"
				+ "For some reason I can't explain\r\n"
				+ "I know Saint Peter won't call my name\r\n"
				+ "Never an honest word\r\n"
				+ "But that was when I ruled the world\n\n");
		
		
		System.out.println(artista1.toString());
		System.out.println(album1.toString());
		System.out.println(genero1.toString());
		System.out.println(musica1.toString());
		System.out.println(artista2.toString());

	}
}
