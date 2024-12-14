public class Main {
    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        //Creating Investors
        Investor investor1 = new Investor("Samsung" , 199999);
        Investor investor2 = new Investor("Panasonic" , 20000);
        Investor investor3 = new Investor("Toshiba" , 345678);

        stockPrice.AddObserver(investor1);
        stockPrice.AddObserver(investor2);
        stockPrice.AddObserver(investor3);

        stockPrice.SetPrice(32456.500);


    }
}