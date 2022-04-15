package edu.au.cpsc.carddemo.model;

public class Card {
    private int f;
      private int s;

      public Card(int f, int s) {
          this.f = f;
          this.s = s;
          }

      public int getFace() {
          return f;
      }

      public int getSuit() {
          return s;
      }

      public int value() {
          if (f == 0) {
              return 5;
          } else if (f == 1)
              return 9;
          else {
              return 22;
          }
      }
}
