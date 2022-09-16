package com.example.cards;

import java.util.*;

public class StandardDeck implements Deck {

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        Arrays.stream(Suit.values())
                .forEach(suit -> {

                    Arrays.stream(FaceValue.values())
                            .map(faceValue -> new Card(suit, faceValue))
                            .forEach(newDeck::add);

                });

        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
