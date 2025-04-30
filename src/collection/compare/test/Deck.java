package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (int i=1; i<13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(i, value));
            }
        }

        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
