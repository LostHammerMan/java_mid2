package sec10.test.sol;

public class Card implements Comparable<Card> {

    private final int rank;
    private final CardIcon cardIcon;

    public Card(int rank, CardIcon cardIcon) {
        this.rank = rank;
        this.cardIcon = cardIcon;
    }

    public int getRank() {
        return rank;
    }

    public CardIcon getDeckIcon() {
        return cardIcon;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank){
            return Integer.compare(this.rank, anotherCard.rank);
        }else {
            return this.cardIcon.compareTo(anotherCard.cardIcon);
        }

    }

    @Override
    public String toString() {
        return cardIcon.getIcon() + "(" + rank + ")";
    }
}
