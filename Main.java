import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ICharacterBehavior magicalBehavior = new MagicalBehavior();
        ICharacterBehavior nonMagicalBehavior = new NonMagicalBehavior();

        Character wizard = new Character(nonMagicalBehavior, "Gandalf", 100, 20);
        Character warrior = new Character(magicalBehavior, "Aragorn", 120, 15);

        Item sword = new Item(new WeaponBehavior(), 50.0, "Sword");
        Item bag = new Item(new ContainerBehavior(), 0, "Bag");
        Item potion = new Item(new ConsumableBehavior(), 5.0, "Health Potion");
        wizard.addItem(sword);
        wizard.addItem(bag);
        wizard.addItem(potion);
        wizard.showItems();
    }
}