public class Main {
    public static void main(String[] args) {
        ICharacterBehavior magicalBehavior = new MagicalBehavior();
        ICharacterBehavior nonMagicalBehavior = new NonMagicalBehavior();

        Character wizard = new Character(nonMagicalBehavior, "Gandalf", 100, 20);
        Character warrior = new Character(magicalBehavior, "Aragorn", 120, 15);

        Item sword = new Item(new WeaponBehavior(), 50.0, "Sword");
        Item bread = new Item(new ConsumableBehavior(), 30.0, "Bread");

   
        wizard.addItem(sword);
        wizard.addItem(bread);
        wizard.items.get(1).itemBehavior.use();
        wizard.dropItem(sword);

    }
}