package sec10.test.sol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck(){
        initCard();
        shuffle();
    }

    public void initCard(){
        for (int i = 1; i <= 13; i++){
            for (CardIcon cardIcon : CardIcon.values()){
                cards.add(new Card(i, cardIcon));
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
