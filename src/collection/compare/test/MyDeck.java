package collection.compare.test;


import java.util.ArrayList;
import java.util.List;

public class MyDeck {

    List<MyCard> deck = new ArrayList<>();

    public void add(MyCard card){
        deck.add(card);
    }

    public MyCard choice() {
        MyCard card = deck.getFirst();
        deck.remove(0);
        return card;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
