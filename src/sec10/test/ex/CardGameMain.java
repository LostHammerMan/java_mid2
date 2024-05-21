package sec10.test.ex;

public class CardGameMain {

    public static void main(String[] args) {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        Deck deck = new Deck();

        for (int i = 0 ; i< 5; i++){
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();




    }
}
