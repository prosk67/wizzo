import java.util.ArrayList;

public class ContainerBehavior extends  IItemBehavior {
    public ArrayList<Item> items;
    @Override
    public void use() {
        System.out.println("Using container item.");
        
    }

    @Override
    public void discard() {
        System.out.println("Discarding container item.");
    }

    public void addItem(Item item){
        items.add(item);
    }
    
}