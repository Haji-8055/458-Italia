package com.xworkz.bus.boot;

import com.xworkz.bus.constructor.Song;

public class SongRunner {

	public static void main(String[] args) {

		Song song1=new Song();
		
		System.out.println("Printing default values");
		System.out.println("Name of song: "+song1.name);
		System.out.println("language of song: "+song1.language);
		System.out.println("singer of song: "+song1.singer);
		System.out.println("lyricist of song: "+song1.lyricist);
		System.out.println("type of song: "+song1.type);
		
		System.out.println("*********************************");
		System.out.println("Printing assigned values");
		song1.name="tu itni";
		song1.language="hindi";
		song1.singer="jubin nautiyal";
		song1.lyricist="Rahat fateh ali khan";
		song1.type="Romantic";
		System.out.println("Name of song: "+song1.name);
		System.out.println("language of song: "+song1.language);
		System.out.println("singer of song: "+song1.singer);
		System.out.println("lyricist of song: "+song1.lyricist);
		System.out.println("type of song: "+song1.type);


	}

}
