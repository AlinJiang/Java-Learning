public class ex7_24 {
	public static void main(String[] args) {
		int[] cards = {-1,-1,-1,-1};
		String[] someCards = {"Jack", "Queen", "King"};
		String[] cardName = {"Spades", "Clubs", "Hearts", "Diamonds"};
		boolean notDone = true;
		int count = 0;
		do {
			count++;
			notDone = false;
			int pick = (int)(Math.random() * 52);
			cards[pick / 13] = pick % 13;
			for (int i = 0; i < 4; i++) 
				if (cards[i] == -1) notDone = true;
		}while(notDone);
		printCards(cards, cardName, someCards);
		System.out.println("Pick number is " + count);
	}

	public static void printCards(int[] cards, String[] cardName, String[] someCards) {
		for (int i = 0; i < 4; i++)
			if (cards[i] <= 9 && cards[i] >= 1) System.out.println((cards[i] + 1) + " of " + cardName[i]);
			else if (cards[i] == 0) System.out.println("Ace of " + cardName[i]);
			else System.out.println(someCards[cards[i] - 10] + " of " + cardName[i]);
	}
}
