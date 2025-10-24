public class Singleton {
    public static Singleton singletonInstance;
    public int associatedValue;

    Singleton(){
        this.associatedValue = 0;
    }

    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
            return singletonInstance;
        }
        return singletonInstance;
    }
}
