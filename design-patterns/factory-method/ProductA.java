public class ProductA extends Product {
  int id;
  String name;

  public ProductA(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public void use() {
    System.out.println("Using Product A");
  }

  @Override
  public void yeet() {
    System.out.println("Yeeting Product A");
  }

}
