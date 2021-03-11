class Book{
  private String title;
  private double price;

  Book(String title, double price){
    this.title=title;
    this.price=price;

  }

  public double getPrice(){
    return price;
  }


  public String toString(){
    return String.format("%s %.2f", title,price);
  }


}
