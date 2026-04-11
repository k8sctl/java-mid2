package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1 ; i <= 13 ; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        // return cards.remove(0); // Java21부터 removeFirst()도 가능
        return  cards.remove(cards.size() - 1); // Java21부터 removeLast()도 가능
    }
}
