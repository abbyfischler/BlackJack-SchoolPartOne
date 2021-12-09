//define class
class Card {

    //define attributes
    int rank; // 1- ace 2 -10 - value 11 - J 12 -Q 13 - K
    String suit;
    AsciiArt image; //attribute that has the AsciiArt for this card


    // Constructor function that has the same name as the class and tells the computer how to make a new
    
    Card(int r, String s) {
      rank = r;
      suit = s;
    
      if(suit.equals("H")) {
         String[] heart = {
            "-----",
            "| " + getStringRank() + " |",
            "| ♥ |",
            "|   |",
            "-----"
        };

        image = new AsciiArt(heart);

      }
      if(suit.equals("C")) {
        String[] club = {
            "-----",
            "| " + getStringRank() + " |",
            "| ♣ |",
            "|   |",
            "-----"
        };
        image = new AsciiArt(club);
      }
      if(suit.equals("D")) {
         String[] diamond = {
            "-----",
            "| " + getStringRank() + " |",
            "| ♦ |",
            "|   |",
            "-----"
        };
        image = new AsciiArt(diamond);
      }
      if(suit.equals("S")) {
        String[] spade = {
            "-----",
            "| " + getStringRank() + " |",
            "| ♠ |",
            "|   |",
            "-----"
        };
        image = new AsciiArt(spade);
      }

      
    }
public String getStringRank(){
  if(rank == 1){
    return "A";
  }
  if(rank == 10){
    return "⑩";
  }
  if(rank == 11){
    return "J";
  }
  if(rank == 12){
    return "Q";
  }
  if(rank == 13){
    return "K";
  }
  return rank + "";
}
//method to dispay the attribute values of this object
    public String toString() { 
     return rank + suit;
    }

    public void draw(){
      //function that prints out the image for this card
     for(int counter = 0; counter < image.lines.length; counter++){
       System.out.println(image.lines[counter]);
     }
      }
  
}