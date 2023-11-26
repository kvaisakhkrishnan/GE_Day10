import java.util.Arrays;
import java.util.Random;

class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data = data;
    }

    public void printQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}

public class DeckOfCardsGame {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();

        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3"),
                new Player("Player 4")
        };

        int cardIndex = 0;
        for (Player player : players) {
            for (int i = 0; i < 9; i++) {
                Card card = deckOfCards.getDeck()[cardIndex++];
                player.receiveCard(card);
            }

            // Sort the player's cards after receiving
            player.sortCardsByRank();
        }

        for (Player player : players) {
            player.printCards();
        }
    }
}
