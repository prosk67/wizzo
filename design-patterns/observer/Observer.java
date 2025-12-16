abstract class IObserver {
  protected String displayName;

  public IObserver(String displayName) {
    this.displayName = displayName;
  }

  public abstract void update(int temperature); // must be abstract
}

public class Observer extends IObserver {

  public Observer(String displayName) {
    super(displayName);
  }

  @Override
  public void update(int temperature) {
    System.out.println(displayName + ": Temperature is now " + temperature + "°C");
  }
}
