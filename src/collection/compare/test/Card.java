package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        // 카드 순서를 비교하고 같다면 모양 비교
        if (this.rank != o.rank) {
            return Integer.compare(this.rank, o.rank);
        }
        // enum 자체의 순서를 가지고 비교함
        return this.suit.compareTo(o.suit);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
