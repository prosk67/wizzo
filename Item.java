public class Item {
    public IItemBehavior itemBehavior;
    public double price;
    public String name;
    public Item(IItemBehavior itemBehavior, double price, String name) {
        this.itemBehavior = itemBehavior;
        this.price = price;
        this.name = name;
    }
}
