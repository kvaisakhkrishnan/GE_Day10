import java.util.Arrays;

class Player {
    String name;
    Queue<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new Queue<>();
    }

    public void receiveCard(Card card) {
        cards.enqueue(card);
    }

    public void sortCardsByRank() {
        int n = cards.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare ranks using a custom comparison method
                if (compareRanks(cards.get(j), cards.get(j + 1)) > 0) {
                    // Swap cards
                    Card temp = cards.get(j);
                    cards.set(j, cards.get(j + 1));
                    cards.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Custom method to compare ranks of two cards
    private int compareRanks(Card card1, Card card2) {
        // Map ranks to integers for comparison
        String[] rankOrder = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int rank1 = Arrays.asList(rankOrder).indexOf(card1.rank);
        int rank2 = Arrays.asList(rankOrder).indexOf(card2.rank);

        // Compare ranks
        return Integer.compare(rank1, rank2);
    }

    public String toString() {
        return name;
    }

    public void printCards() {
        System.out.println(name + "'s cards:");
        cards.printQueue();
    }
}