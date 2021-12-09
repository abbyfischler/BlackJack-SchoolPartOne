class Player{
  
// The player’s hand attribute is an array that will hold the cards that the player has. Because we don’t know how many cards the player will draw we will set the size of this array to a reasonable number of likely cards, say 10. It is unlikely that the user will draw 10 cards without going over 21.  
Card[] hand = new Card[10];

int cardCount;
// Since the size of the hand array can be bigger than the number of cards in it we must keep track of how many cards are actually in the array. That is what this attribute does.  Whenever the player is dealt a card OR receives a card we will use the cardCount to keep track of the total number of cards that the player has received.


double balance = 1000;
//The amount of credit the player has. The default is 1000. In other words all Player objects should have a balance of 1000 when they are created unless the amount is overridden in the constructor.
Player(){
//The specification does not require that the constructor take any parameters. 

}
Player(double b){
  //The default balance for the player can be overwritten with this constructor.
  balance = b;
}



//handTotal(): int
public int handTotal(){
  int numAces = 0;
  int handTotal = 0;
  for(Card c:hand) {
    if(c == null) {
      break;
    }
    if(c.rank == 1){
    numAces++;
    }
  if (c.rank >= 11){
    handTotal += 10;
  }
  else{
    handTotal += c.rank;
  }
  }
if (handTotal <= 11 && numAces >= 1){
      handTotal += 10;
    }
return handTotal;
}
public void hit(Card card){
  //Add a card to the hand array. 
hand[cardCount] = card;
cardCount++;

}
public void showHand(){
  //Draw the cards in the player’s hand to the screen.
for( Card c: hand){
  if(c != null){
  c.draw();
  }
}
}

public void reset() {
  hand = new Card[10];
}

}
