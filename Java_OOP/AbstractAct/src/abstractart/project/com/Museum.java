package abstractart.project.com;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
	ArrayList<Art> museum = new ArrayList<Art> ();
	
	Painting paint = new Painting(" Mona Lisa ","Leonardo da Vinci,","Starry Night by Vincent van Gogh","sdas");
	Painting paint1 = new Painting(" Mona Lisa ","Leonardo da Vinci,","Starry Night by Vincent van Gogh","sdas");
	Painting paint2= new Painting(" Mona Lisa ","Leonardo da Vinci,","Starry Night by Vincent van Gogh","sdas");
	Sculpture sculpture = new Sculpture("David","Michelangelo",": A masterpiece of Renaissance sculpture, depicting the biblical hero David.","Marble");
	Sculpture sculpture1 = new Sculpture("The Thinker","Auguste Rodin"," A contemplative figure often symbolizing philosophy and human introspection.","Bronze");
	
	museum.add(paint);
	museum.add(paint1);
	museum.add(paint2);
	museum.add(sculpture);
	museum.add(sculpture1);
	
	
	for(Art art : museum) {
		System.out.println(art.getTitle());
	}
	
	}

}
