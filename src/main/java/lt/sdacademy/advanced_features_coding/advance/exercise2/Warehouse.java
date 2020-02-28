package lt.sdacademy.advanced_features_coding.advance.exercise2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

    private Map<String, Product> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public void deleteProduct(String producteName) {
        products.remove(producteName);
    }

    public void displayProducts() {
        products.values().forEach(products -> System.out.println(products.toString()));
    }

    public void updateProduct(String producteName, double newPrice) {
        if (products.containsKey(producteName)) {
            products.replace(producteName, new Product(producteName, (int) newPrice));
        }
    }

    public void displayTotalPriceOfProducts() {
        double totalPriceOfProducts = products.values().stream()
                .mapToDouble(product -> product.getPrice())
                .sum();
        System.out.println("Total price of all products: " + totalPriceOfProducts);
    }
}


/*
2. Warehouse
        User should be able to: add, display all of the details, update, delete an item
        Use composition and collections (The warehouse has products/items)
        Add possibility to display summaries, like sum of all of the products, their prices.
        *Add possibility to update number of items in a specific way, e.g.: "pliers:30" "scissors:4"
*/
