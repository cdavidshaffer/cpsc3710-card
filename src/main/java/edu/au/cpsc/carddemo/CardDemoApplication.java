/*
 * Copyright (c) 2022. See LICENSE.txt for details.
 */

package edu.au.cpsc.carddemo;


import edu.au.cpsc.carddemo.model.Card;
import edu.au.cpsc.carddemo.model.Card.Face;
import edu.au.cpsc.carddemo.model.Card.Suit;
import java.io.IOException;

public class CardDemoApplication {

  public static void main(String[] args) throws IOException {
    Card c = new Card(Face.ACE, Suit.DIAMONDS);
    System.out.println(c.value(10));
  }

}
