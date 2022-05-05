package edu.au.cpsc.carddemo.model;

public class Card {
    // f is the card's face value
    private int f;
    // s is the suit
      private int s;

      // make a card
      public Card(int f, int s) {
          this.f = f;
          this.s = s;
          }

 // get the face value
 public int getFace() {
     return f; // f is the face value
 }

      // get the suit
      public int getSuit() {
          return s; // s is the suit (0 = HEARTS, 1 = DIAMONDS, 2 = CLUBS, 3 = SPADES)
      }

      // get the value
      public int value() {
          if (f == 0 || (s == 0 && f == 2)) {
              return 5;
          } else if (f == 1 || (s < 2 || s == 4 && f == 9))
// not sure what to do in this case
              return 9;
          // else if (f == 9) {
             // return 2*f;
          //}
          else {
              return 22;
          }
      }
}
