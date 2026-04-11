package collection.compare.test;

public class Card implements  Comparable<Card>{

    private final int rank; // 카드의 숫자
    private final Suit suit; // 카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교한다.
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            // suit은 Enum 타입이며, Enum은 Comparable을 구현하고 있다.
            // Enum의 compareTo()는 ordinal(선언 순서)을 기준으로 비교한다.
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
