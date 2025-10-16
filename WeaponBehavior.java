public class WeaponBehavior implements IItemBehavior {
    @Override
    public void use() {
        System.out.println("Using weapon item.");
    }

    @Override
    public void discard() {
        System.out.println("Discarding weapon item.");
    }
}
