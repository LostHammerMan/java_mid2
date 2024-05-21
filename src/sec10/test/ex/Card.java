package sec10.test.ex;

public class Card implements Comparable<Card>{
    private final CardIcon icon;
    private final Integer rank;

    public Card(CardIcon icon, Integer rank) {
        this.icon = icon;
        this.rank = rank;
    }

    public CardIcon getIcon() {
        return icon;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 문양 무관, 적은 숫자 부터 비교
        if (this.rank != anotherCard.rank){
            return Integer.compare(this.rank , anotherCard.rank);
        }else {
            return this.icon.compareTo(anotherCard.icon);
        }
    }

    @Override
    public String toString() {
        return icon.getIcon() + "(" + rank + ")";
    }
}
