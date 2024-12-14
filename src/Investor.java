public class Investor implements Observer {
    private String name;
    private int phone;
    private double price;

    public Investor(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
  @Override
public void update (double price){
        this.price = price;
        display();

  }
  public void display(){
        System.out.println(name  + " Received the updated StockPrice for the item " +price);
  }

    }


