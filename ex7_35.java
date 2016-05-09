import java.util.*;
public class ex7_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = {"write", "that", "apple", "pear", "pine", "letter", "linux", "program"};
		answer = createWord(words);
		int word = (int)(Math.random() * 8);
		boolean[] guess = new boolean[words[word].length()];
		char letter = 0;
		System.out.print("(Guess) Enter a letter in a word: ");
		do {
			letter = input.next().length() = 1 ? input.next().charAt(0) : '$';
			if (letter == '$') System.out.println("You inputted more than one characters, try again: ");
		while(letter != '$');
		for (int i = 0; i < words[word].length(); i++) {
			if (words[word].contains(letter)) {
				if (letter == words[word].charAt(i))
					System.out.print(letter);
				else
					System.out.print("*");
			}
			else {
				System.out.
		System.out.print(" > ");

		for (int i = 0; i < words[word].length(); i++)


	public static String createWord(String[] words) {
		int word = (int) (Math.random() * words.length);
		return words[word];
	}
