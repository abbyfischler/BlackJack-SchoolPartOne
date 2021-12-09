class AsciiArt{

String[] lines;
int width;
int height;



AsciiArt(String[] s){

height = s.length;

width = 0;
lines = s;




for (int c = 0; c < s.length; c++){
if (s[c].length() > width){

  width = s[c].length();
}
  }
    }  



//AsciiArt[] art = new AsciiArt[4];

 public static String[] heart = {
            "-----",
            "| * |",
            "| ♥ |",
            "|   |",
            "-----"
        };
       public static String[] diamond = {
            "-----",
            "| * |",
            "| ♦ |",
            "|   |",
            "-----"
        };
       public static String[] club = {
            "-----",
            "| * |",
            "| ♣ |",
            "|   |",
            "-----"
        };
      public static String[] spade = {
            "-----",
            "| * |",
            "| ♠ |",
            "|   |",
            "-----"
        };
public void draw(){
for (int y = 0; y < lines.length; y++){
  System.out.println(lines[y]);
    }
  }
}

  

/*
 String[] cardTemplate = {
            "-----\n",
            "|   |\n",
            "| ? |\n",
            "|   |\n",
            "-----\n"
        }
        */