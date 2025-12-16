public class ProductB extends Product {
    int id;
    
    public ProductB(int id) {
        this.id = id;
    }
    
    @Override
    public void use() {
        System.out.println("Using Product B (ID: " + id + ")");
    }

    @Override
    public void yeet() {
        System.out.println("Yeeting Product B (ID: " + id + ")");
    }
}