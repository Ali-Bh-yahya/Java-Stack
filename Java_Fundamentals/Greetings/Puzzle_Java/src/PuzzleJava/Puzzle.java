package PuzzleJava;

import java.util.ArrayList;
import java.util.Random;

public class Puzzle {

	public ArrayList<Integer> gettenRolls() {
		ArrayList<Integer> array = new ArrayList<>();
		Random randNumber = new Random();
		for (int i = 0; i < 10; i++) {
			int rand = randNumber.nextInt(25) + 5;// 5->30
			array.add(rand);
		}
		return array;
	}

	public char getRandomLetter() {
		char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random rand = new Random();
		int randomIndex = rand.nextInt(26);
		return letter[randomIndex];
	}

	public String generatePassword() {
		String password = "";
		for (int i = 0; i < 8; i++) {
			password += getRandomLetter();
		}
		return password;
	}

	public ArrayList<String> getNewPasswordSet(int length) {
		ArrayList<String> passwordSet = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			passwordSet.add(generatePassword());
		}
		return passwordSet;
	}
	
	public void  shulleArray(int[] array){
		Random rand = new Random();
		for (int i = 0 ; i < array.length ; i++) {
			int randomIndex = rand.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp ; 
			
		}
	}

}