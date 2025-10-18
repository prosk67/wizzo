public class ConsumableBehavior extends IItemBehavior {
    @Override
    public void use() {
        System.out.println("Using consumable item.");
    }

    @Override
    public void discard() {
        System.out.println("Discarding consumable item.");
    }
    
}
