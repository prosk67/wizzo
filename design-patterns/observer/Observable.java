import java.util.List;
import java.util.ArrayList;

public class Observable {
  private List<Observer> observers = new ArrayList<>();
  private int temperature;

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyObservers();
  }

  private void notifyObservers() {
    for (Observer o : observers) {
      o.update(temperature);
    }
  }
}
