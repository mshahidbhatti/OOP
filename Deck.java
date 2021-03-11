class Deck{

Card deck[] = new Card[52];
String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
String suits[]={"Spades","Clubs","Diamonds","Hearts"};

Deck(){
  int counter=0;
  for(int j=0;j<4;j++)
    for(int i=0; i<13;i++)

      deck[counter++]=new Card(ranks[i],suits[j]);

}

public void displayDeck(){
  for(int i=0; i<52;i++)
    System.out.println(deck[i].toString());
}
public String toString(){


  return deck[0].toString();
}






}
