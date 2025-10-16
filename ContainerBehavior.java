public class ContainerBehavior implements IItemBehavior {
    @Override
    public void use() {
        System.out.println("Using container item.");
    }

    @Override
    public void discard() {
        System.out.println("Discarding container item.");
    }
    
}