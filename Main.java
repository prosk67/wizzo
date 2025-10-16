public class Main {
    public static void main(String[] args) {
        ICharacterBehavior magicalBehavior = new MagicalBehavior();
        ICharacterBehavior nonMagicalBehavior = new NonMagicalBehavior();

        Character wizard = new Character(magicalBehavior, "Gandalf", 100, 20);
        Character warrior = new Character(nonMagicalBehavior, "Aragorn", 120, 15);

        wizard.character.attack(warrior);
        warrior.character.defend(15);
        wizard.character.castSpell("Fireball");

        warrior.character.attack(wizard);
        wizard.character.defend(10);
        warrior.character.castSpell("Heal");
    }
}