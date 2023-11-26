import java.util.Random;

class DeckOfCards {
    private Card[] deck;

    public DeckOfCards() {
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        deck = new Card[suits.length * ranks.length];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(suit, rank);
            }
        }
    }

    private void shuffleDeck() {
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap deck[i] and deck[j]
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card[] getDeck() {
        return deck;
    }
}
