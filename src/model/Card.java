package model;

public class Card {

    private String number;
    private CardSuit suit;

    public Card(String number, CardSuit suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }

}
