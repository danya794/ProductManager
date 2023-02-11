import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    @Test
    public void addProductsTest() {
        Repository repository = new Repository();

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addProductsWhenNothingFoundTest() {
        Repository repository = new Repository();

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        //repository.add(book1);
        //repository.add(book2);
        //repository.add(book3);

        Product[] expected = {};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeWhenIdExistedTest() {
        Repository repository = new Repository();

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.removeById(3);

        Product[] expected = {book2, book3};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
