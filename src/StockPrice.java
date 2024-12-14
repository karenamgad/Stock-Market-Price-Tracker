import java.util.ArrayList;
import java.util.List;

public class StockPrice implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    @Override
    public void AddObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void SetPrice(double price) {
        if (this.price != price) {  // Only notify if the price is actually changing
            this.price = price;
            NotifyObservers();  // Notify all observers when price changes
        }
    }
    public void NotifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
