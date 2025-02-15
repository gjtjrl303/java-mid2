package collection.compare.test;

import java.util.*;

public class MyCardGameMain {

    public static void main(String[] args) {

        MyDeck deck = new MyDeck();
        for (int i = 1; i <= 13; i++) {
            deck.add(new MyCard(i,"\u2660"));
            deck.add(new MyCard(i,"\u2665"));
            deck.add(new MyCard(i,"\u2666"));
            deck.add(new MyCard(i,"\u2663"));
        }

        List<MyCard> player1 = new LinkedList<>();
        List<MyCard> player2 = new LinkedList<>();

        Collections.shuffle(deck.deck);

        System.out.println(deck);
        for(int i=0;i<5;i++){
            player1.add(deck.choice());
        }


        for(int i=0;i<5;i++){
            player2.add(deck.choice());
        }

        player1.sort(null);
        player2.sort(null);

        int player1Sum = 0;
        for (MyCard card : player1) {
            player1Sum += card.getNum();
        }

        int player2Sum = 0;
        for (MyCard card : player2) {
            player2Sum += card.getNum();
        }

        System.out.println("플레이어1의 카드: " + player1 + ", 합계: " + player1Sum);
        System.out.println("플레이어2의 카드: " + player2 + ", 합계: " + player2Sum);

        System.out.println(player1Sum > player2Sum ? "플레이어1의 승리" : ((player1Sum == player2Sum)? "무승부" :"플레이어2의 승리"));

    }

}
