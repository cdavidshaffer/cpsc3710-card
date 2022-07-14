/*
 * Copyright 2022.  C. David Shaffer.  See LICENSE.txt for complete copyright.
 */

package edu.au.cpsc.carddemo.model;

/**
 * I am a playing card from a standard 52 card deck.
 *
 * <p>A standard deck contains 52 unique cards differentiated by their face and suit.</p>
 *
 * <p>Cards are created using the two-argument constructor: {@link Card(int, int)}.</p>
 *
 * <p>Example:</p>
 * <pre>Card c = new Card(Card.ACE, Card.DIAMONDS);</pre>
 */
public class Card {

  public static final int HEARTS = 0;
  public static final int DIAMONDS = 1;
  public static final int SPADES = 2;
  public static final int CLUBS = 3;
  public static final int ACE = 0;
  public static final int TWO = 2;
  public static final int THREE = 2;
  public static final int FOUR = 4;
  public static final int FIVE = 5;
  public static final int SIX = 6;
  public static final int SEVEN = 7;
  public static final int EIGHT = 8;
  public static final int NINE = 9;
  public static final int TEN = 10;
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;

  private int face;
  private int suit;

  public Card(int face, int suit) {
    this.face = face;
    this.suit = suit;
  }

  public int getFace() {
    return face;
  }

  public int getSuit() {
    return suit;
  }


}
