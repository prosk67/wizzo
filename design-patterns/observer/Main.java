//Implementation of OBSERVER pattern
//declare abstractions of observable and observer
//Observable has a list of observer
//Observable notifies observer when something changes
//Observer is updated when notified
// Usage
public class Main {
  public static void main(String[] args) {
    Observable station = new Observable();

    Observer phone = new Observer("Observer ");
    // Add more observers...

    station.registerObserver(phone);

    station.setTemperature(25); // Should notify and print
    station.setTemperature(30);
  }
}
