import java.util.List;

public interface Subject {
    void AddObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void NotifyObservers();
    void SetPrice(double price);

}
