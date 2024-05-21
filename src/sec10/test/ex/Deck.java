package sec10.test.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    public void initCard(){
        for (int i = 1; i <= 13; i++){
            for (CardIcon icon : CardIcon.values()){
                cards.add(new Card(icon, i));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.remove(0);
    }
}
