package org.example.HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void removeProductExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "кекс", 100);
        Product product2 = new Product(2, "сок", 250);
        Product product3 = new Product(16, "торт", 800);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeProductNotExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "кекс", 100);
        Product product2 = new Product(2, "сок", 250);
        Product product3 = new Product(16, "торт", 800);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(22);

        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}