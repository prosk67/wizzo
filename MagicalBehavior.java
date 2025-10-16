public class MagicalBehavior implements ICharacterBehavior {
    @Override
    public void attack(Character target) {
        System.out.println("Casting a spell on " + target.name);
        target.health -= 15; // Magical attack power
    }

    @Override
    public void defend(int damage) {
        System.out.println("Using a magical shield to reduce damage.");
        int reducedDamage = damage - 5; 
        if (reducedDamage < 0) reducedDamage = 0;
   }

    @Override
    public void castSpell(String spellName) {
        System.out.println("Casting spell: " + spellName);
    }
}