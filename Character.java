import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Character {
    public ICharacterBehavior character;
    public String name;
    public int health;
    public int attackPower;
    public List<Item> items;

    public Character(ICharacterBehavior character,String name, int health, int attackPower) {
        this.character = character;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        if(items.size() >= 2) {
            System.out.println("Cannot add more items. Inventory full.");
            return;
        }
        boolean isAdded = items.add(item);
        if(!isAdded) {
            System.out.println("Failed to add item.");
        }
    }
    public void dropItem(Item item) {
        if(items.contains(item)) {
            items.remove(item);
            System.out.println("Item dropped: " + item.name);
        } else {
            System.out.println("Item not found in inventory.");
        }
    }
    public void showItems() {
        System.out.println("Items in inventory:");
        if(items.isEmpty()) {
            System.out.println("No items in inventory.");
            return;
        }
        for(Item item : items) {
            System.out.println("- " + item.name + " (Price: " + item.price + ")");
        }
    }
}