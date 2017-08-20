package com.example.edgar.deckofcards;

import java.util.Random;

/**
 * Created by edgar on 8/19/17.
 */

public class Deck {
    public enum Cards {
        ACE_SPADES,
        ACE_CLUBS,
        ACE_DIAMONDS,
        ACE_HEARTS,
        TWO_SPADES,
        TWO_CLUBS,
        TWO_DIAMONDS,
        TWO_HEARTS,
        THREE_SPADES,
        THREE_CLUBS,
        THREE_DIAMONDS,
        THREE_HEARTS,
        FOUR_SPADES,
        FOUR_CLUBS,
        FOUR_DIAMONDS,
        FOUR_HEARTS,
        FIVE_SPADES,
        FIVE_CLUBS,
        FIVE_DIAMONDS,
        FIVE_HEARTS,
        SIX_SPADES,
        SIX_CLUBS,
        SIX_DIAMONDS,
        SIX_HEARTS,
        SEVEN_SPADES,
        SEVEN_CLUBS,
        SEVEN_DIAMONDS,
        SEVEN_HEARTS,
        EIGHT_SPADES,
        EIGHT_CLUBS,
        EIGHT_DIAMONDS,
        EIGHT_HEARTS,
        NINE_SPADES,
        NINE_CLUBS,
        NINE_DIAMONDS,
        NINE_HEARTS,
        TEN_SPADES,
        TEN_CLUBS,
        TEN_DIAMONDS,
        TEN_HEARTS,
        JACK_SPADES,
        JACK_CLUBS,
        JACK_DIAMONDS,
        JACK_HEARTS,
        QUEEN_SPADES,
        QUEEN_CLUBS,
        QUEEN_DIAMONDS,
        QUEEN_HEARTS,
        KING_SPADES,
        KING_CLUBS,
        KING_DIAMONDS,
        KING_HEARTS,
        END
    }
    public final int DECKSIZE = 52;
    public Deck.Cards deck[] = new Deck.Cards[DECKSIZE];
    public int current;

    /** Constructor */
    public Deck() {
        newOrderedDeck();
    }

    /**
     * Suffle Deck
     * Shuffles the deck and returns an array of integers
     * in random order with values 0 - 51
     */
    public void newShuffleDeck() {
        current = 0;
        Random random = new Random();
        int index;
        Deck.Cards swap;
        for (int i = deck.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            swap = deck[index];
            deck[index] = deck[i];
            deck[i] = swap;
        }
    }

    public void newOrderedDeck() {
        current = 0;
        for (int i = 0; i < DECKSIZE; i++) {
            deck[i] = Deck.Cards.values()[i];
        }
    }

    public Deck.Cards getNextCard() {
        if (current >= DECKSIZE)
            return Cards.END;
        else
            return deck[current++];
    }
}

