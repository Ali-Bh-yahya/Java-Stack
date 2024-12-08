package PuzzleJava;
import java.util.ArrayList;
import java.util.Random;

public class Puzzle{
	
	public ArrayList<Integer> gettenRolls(){
		ArrayList<Integer> array = new ArrayList<>();
		Random randNumber = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			int rand = randNumber.nextInt(25)+5;//5->30
			array.add(rand);
		}
		return array;
		
	}
}