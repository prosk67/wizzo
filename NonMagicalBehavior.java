public class NonMagicalBehavior implements ICharacterBehavior {
    @Override
    public void attack(Character target) {
        System.out.println("Attacking " + target.name + " with a physical strike.");
        target.health -= 10; // Non-magical attack power
    }

    @Override
    public void defend(int damage) {
        System.out.println("Using armor to reduce damage.");
        int reducedDamage = damage - 2; 
        if (reducedDamage < 0) reducedDamage = 0;
        // Assuming there's a way to apply the reduced damage to the character's health
    }

    @Override
    public void castSpell(String spellName) {
        System.out.println("Cannot cast spells. This character is non-magical.");
    }
}