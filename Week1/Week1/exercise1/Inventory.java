import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    @Override
    public String toString() {
        return "Inventory: " + products.values();
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 50, 499.99);
        
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println(inventory);

        inventory.updateProduct("1", "Gaming Laptop", 8, 1299.99);
        System.out.println(inventory);

        inventory.deleteProduct("2");
        System.out.println(inventory);
    }
}

