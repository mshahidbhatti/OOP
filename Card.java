class Card{
  private  String rank;
  private String suit;

  Card(String rank, String suit){
    this.rank=rank;
    this.suit = suit;
  }

  public void display(){
      System.out.println(this.toString());
  }

  public String toString(){
    return String.format("%s of %s",rank,suit );
  }

}
