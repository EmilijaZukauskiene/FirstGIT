package lt.sdacademy.advanced_features_coding.advance.exercise2;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addProduct(new Product("TV", 1000));
        warehouse.addProduct(new Product("Phone", 400));
        warehouse.addProduct(new Product("Mobile", 450));
        warehouse.displayProducts();
        System.out.println();
        warehouse.deleteProduct("TV");
        warehouse.displayProducts();
        System.out.println();
        warehouse.updateProduct("Phone", 20);
        warehouse.displayProducts();
        warehouse.displayTotalPriceOfProducts();
    }
}
/*2. Warehouse
        User should be able to: add, display all of the details, update, delete an item
        Use composition and collections (The warehouse has products/items)
        Add possibility to display summaries, like sum of all of the products, their prices.
        *Add possibility to update number of items in a specific way, e.g.: "pliers:30" "scissors:4"*/
