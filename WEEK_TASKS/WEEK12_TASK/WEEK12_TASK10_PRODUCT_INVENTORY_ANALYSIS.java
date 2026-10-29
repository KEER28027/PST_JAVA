import java.util.*;

public class WEEK12_TASK10_PRODUCT_INVENTORY_ANALYSIS {
    static class Product {
        int id;
        String name;
        int stock;
        double price;

        Product(int id, String name, int stock, double price) {
            this.id = id;
            this.name = name;
            this.stock = stock;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Product> inventory = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            inventory.put(id, new Product(id, sc.next(), sc.nextInt(), sc.nextDouble()));
        }

        int saleId = sc.nextInt();
        int quantity = sc.nextInt();
        Product soldProduct = inventory.get(saleId);
        if (soldProduct != null) {
            soldProduct.stock = Math.max(0, soldProduct.stock - quantity);
        }

        int threshold = sc.nextInt();
        ArrayList<Product> products = new ArrayList<>(inventory.values());
        products.sort(Comparator.comparingInt(product -> product.stock));

        for (Product product : products) {
            if (product.stock < threshold) {
                System.out.println(product.id + " " + product.name + " " + product.stock + " " + product.price);
            }
        }
    }
}
