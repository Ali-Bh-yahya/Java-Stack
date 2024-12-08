package PuzzleJava;

import java.util.Array;
import java.util.ArrayList;

public class TestPuzzleJava {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		ArrayList<Integer> array = puzzle.gettenRolls();
		System.out.println("puzzle number is =" + " " + array);

		char randomLetter = puzzle.getRandomLetter();
		System.out.println("Random Letter: " + randomLetter);
		
		String password = puzzle.generatePassword();
		System.out.println("Your new Password is:  "+ password);
		
		int numOfPassword = 8 ;
		ArrayList<String> passwordNew = puzzle.getNewPasswordSet(numOfPassword);
		System.out.println("Your new Password is:  "+ passwordNew);
		
		int[] arrayIndex = {10,20,30,49,29};
		puzzle.shulleArray(arrayIndex);
		for(int i = 0; i < arrayIndex.length;i++)
			System.out.println(arrayIndex[i]);
	    
		
	}

}
