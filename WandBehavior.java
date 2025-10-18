public class WandBehavior extends IItemBehavior {
    @Override
    public void use() {
        System.out.println("Casting a spell with the wand.");
    }

    @Override
    public void discard() {
        System.out.println("Discarding the wand.");
    }
}