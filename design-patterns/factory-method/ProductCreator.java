import java.util.HashMap;

public class ProductCreator extends Creator {
    private HashMap<Integer, Product> productMap;
    
    public ProductCreator() {
        productMap = new HashMap<>();
    }
    
    @Override
    public Product factoryMethod(int id) {
        // Check if product with this ID already exists
        if (productMap.containsKey(id)) {
            System.out.println("Product with ID " + id + " already exists. Returning existing instance.");
            return productMap.get(id);
        }
        
        // Create new product only if it doesn't exist
        Product newProduct = new ProductA(id, "Product A - ID: " + id);
        productMap.put(id, newProduct);
        System.out.println("Created new Product with ID " + id);
        return newProduct;
    }
    
    // Create product with custom name
    public Product factoryMethod(int id, String name) {
        if (productMap.containsKey(id)) {
            System.out.println("Product with ID " + id + " already exists. Returning existing instance.");
            return productMap.get(id);
        }
        
        Product newProduct = new ProductA(id, name);
        productMap.put(id, newProduct);
        System.out.println("Created new Product with ID " + id + " and name: " + name);
        return newProduct;
    }
    
    // Create ProductB type
    public Product createProductB(int id) {
        if (productMap.containsKey(id)) {
            System.out.println("Product with ID " + id + " already exists. Returning existing instance.");
            return productMap.get(id);
        }
        
        Product newProduct = new ProductB(id);
        productMap.put(id, newProduct);
        System.out.println("Created new ProductB with ID " + id);
        return newProduct;
    }
    
    public Product getProduct(int key) {
        return productMap.get(key);
    }
    
    public HashMap<Integer, Product> getProductMap() {
        return productMap;
    }
    
    public boolean hasProduct(int id) {
        return productMap.containsKey(id);
    }
    
}
