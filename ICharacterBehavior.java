public interface ICharacterBehavior {
    void attack(Character target);
    void defend(int damage);
    void castSpell(String spellName);
}