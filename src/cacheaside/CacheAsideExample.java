package cacheaside;

import java.util.ArrayList;
import java.util.List;

public class CacheAsideExample {
    public static void main(String[] args) {
        // Создание списка продуктов
        List<Product> productList = createProductList();

        // Создание кэша для продуктов
        ProductCache productCache = new ProductCache();

        // Запрос продукта по ID
        int productId = 1;
        Product product = productCache.getProduct(productId, productList);
        System.out.println("Product from cache or list: " + product);

        // Обновление цены продукта
        product.setPrice(15.99);
        productCache.updateProduct(product, productList);

        // Запрос обновленного продукта по тому же ID
        product = productCache.getProduct(productId, productList);
        System.out.println("Updated product from cache or list: " + product);
    }

    // Создание списка продуктов для примера
    private static List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", 9.99));
        productList.add(new Product(2, "Product 2", 19.99));
        productList.add(new Product(3, "Product 3", 29.99));
        return productList;
    }
}

