/*
 * Copyright 2022.  C. David Shaffer.  See LICENSE.txt for complete copyright.
 */

package edu.au.cpsc.carddemo.model;

/**
 * I am a playing card from a standard 52 card deck.
 *
 * <p>A standard deck contains 52 unique cards differentiated by their rank and suit.</p>
 *
 * <p>Cards are created using the two-argument constructor: {@link #Card(Rank, Suit)}.</p>
 *
 * <p>Example:</p>
 * <pre>Card c = new Card(Card.ACE, Card.DIAMONDS);</pre>
 */
public class Card {

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return getRankString() + " of " + getSuitString();
  }

  private String getSuitString() {
    return suit.name().toLowerCase();
  }

  private String getRankString() {
    return rank.name().toLowerCase();
  }

  /**
   * The suit of a card.
   */
  public enum Suit {
    HEARTS, DIAMONDS, SPADES, CLUBS
  }

  /**
   * The rank of a card.
   */
  public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
  }

}
