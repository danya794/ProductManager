import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product product1 = new Book(3, "Маленький принц", 400, "Антуан де Сент-Экзюпери");
    Product product2 = new Smartphone(7, "Galaxy S9", 10000, "Samsung");
    Product product3 = new Book(20, "Денискины рассказы", 800, "Виктор Драгунский");
    Product product4 = new Smartphone(421, "iPhone7", 15000, "Apple");

    @Test
    public void saveProductsTest() {
        ProductManager manager = new ProductManager();
        ProductRepository repository = new ProductRepository();

        ProductRepository.save(product1);
        ProductRepository.save(product2);
        ProductRepository.save(product3);
        ProductRepository.save(product4);

        Product[] expected = {product1, product2, product3, product4};
        Product[] actual = ProductRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdTest() {
        ProductManager manager = new ProductManager();
        ProductRepository repository = new ProductRepository();

        ProductRepository.save(product1);
        ProductRepository.save(product2);
        ProductRepository.save(product3);
        ProductRepository.save(product4);
        ProductRepository.removeById(product2.id);
        ProductRepository.removeById(product4.id);

        Product[] expected = {product1, product3};
        Product[] actual = ProductRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
