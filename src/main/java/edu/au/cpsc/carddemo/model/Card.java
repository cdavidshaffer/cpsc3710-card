/*
 * Copyright (c) 2022. See LICENSE.txt for details.
 */

package edu.au.cpsc.carddemo.model;

import java.io.IOException;

/**
 * I am a playing card from a standard 52 card deck.
 *
 * <p>A standard deck contains 52 unique cards differentiated by their face and suit.  See Suit and
 * Face classes for possible values.</p>
 *
 * <p>Cards are created using the two-argument constructor: {@code Card(Face, Suit)}.</p>
 *
 * <p>Example:</p>
 * <pre>Card c = new Card(Card.Face.ACE, Card.Suit.DIAMONDS);</pre>
 * <p>
 */
public class Card {

  private Face face;
  private Suit suit;

  public Card(Face face, Suit suit) {
    this.face = face;
    this.suit = suit;
  }

  public Face getFace() {
    return face;
  }

  public Suit getSuit() {
    return suit;
  }

  /**
   * The score value of this card in hodge-podge.
   *
   * @param foo the annotation for the card
   * @return the hodge-podge score
   * @throws IllegalArgumentException when foo is illegal
   * @deprecated will be removed in v2.0, call {@link #getValue(int)} instead
   */
  @Deprecated
  public int value(int foo) throws IOException {
    return getValue(foo);
  }

  /**
   * The score value of this card in hodge-podge.
   *
   * @param foo the annotation for the card
   * @return the hodge-podge score
   * @throws IllegalArgumentException when foo is illegal
   */
  public int getValue(int foo) {
    if (face == Face.ACE || (suit == Suit.HEARTS && face == Face.THREE)) {
      return 5;
    } else if (face == Face.TWO || ((suit == Suit.HEARTS || suit == Suit.DIAMONDS)
        || suit == Suit.DIAMONDS && face == Face.TEN)) {
      // TODO not sure!
      return 9;
    } else {
      return 22;
    }
  }

  public enum Face {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
  }

  public enum Suit {
    HEARTS, DIAMONDS, CLUBS,
    SPADES;
  }
}
