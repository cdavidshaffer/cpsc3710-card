/*
 * Copyright (c) 2022. See LICENSE.txt for details.
 */

package edu.au.cpsc.carddemo.model;

import java.util.Scanner;

public class Blackjack {

  public static void main(String[] args) {
    new Blackjack().run();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);
    Deck d = new Deck();
    d.shuffle();

    // begin the game by dealing two cards to each player
    Hand[] hands = new Hand[2];
    for (int i = 0; i < hands.length; i++) {
      hands[i] = new Hand();
      hands[i].addCards(d.deal(2));
    }

    // the game is immediately over if anyone has blackjack
    boolean over = false;
    for (Hand h : hands) {
      if (h.blackjackBestValue() == 21) {
        over = true;
      }
    }
    while (!over) {
      int numberOfHits = 0;
      for (int playerNumber = 1; playerNumber <= hands.length; playerNumber++) {
        if (hands[playerNumber - 1].blackjackBestValue() < 21) {
          System.out.printf("Player %d hand:\n\t%s\n(h)it or (s)tand? ",
              playerNumber, hands[playerNumber - 1].toString());
          String choice = scanner.nextLine();
          if (choice.equals("h")) {
            hands[playerNumber - 1].addCard(d.deal(1));
            numberOfHits++;
          }
        }
      }

      // the game is over if anyone has 21 or no one "hit" during the last round
      for (Hand h : hands) {
        if (h.blackjackBestValue() == 21) {
          over = true;
        }
      }
      if (numberOfHits == 0) {
        over = true;
      }
    }
  }
}
