public class Character {
    public ICharacterBehavior character;
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(ICharacterBehavior character,String name, int health, int attackPower) {
        this.character = character;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
}