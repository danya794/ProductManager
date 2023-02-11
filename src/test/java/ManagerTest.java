import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void addBookTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByWhenFoundAFewBooksTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book3};
        Product[] actual = manager.searchBy("Маленький");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByWhenFoundOneTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);


        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("Денискины");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByWhenNothingFoundTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);


        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        //manager.add(book1);
        //manager.add(book2);
        //manager.add(book3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Денискины");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSmartphoneTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Smartphone smartphone1 = new Smartphone(1, "Galaxy S9", 10000, "Samsung");
        Smartphone smartphone2 = new Smartphone(2, "iPhone 7", 8000, "Apple");
        Smartphone smartphone3 = new Smartphone(3, "Galaxy S9+", 12000, "Samsung");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone1, smartphone2, smartphone3};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByWhenFoundAFewSmartphonesTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Smartphone smartphone1 = new Smartphone(1, "Galaxy S9", 10000, "Samsung");
        Smartphone smartphone2 = new Smartphone(2, "iPhone 7", 8000, "Apple");
        Smartphone smartphone3 = new Smartphone(3, "Galaxy S9+", 12000, "Samsung");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone1, smartphone3};
        Product[] actual = manager.searchBy("Galaxy");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchByWhenFoundOneSmartphoneTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Smartphone smartphone1 = new Smartphone(1, "Galaxy S9", 10000, "Samsung");
        Smartphone smartphone2 = new Smartphone(2, "iPhone 7", 8000, "Apple");
        Smartphone smartphone3 = new Smartphone(3, "Galaxy S9+", 12000, "Samsung");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("iPhone 7");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByWhenNothingFoundSmartphoneTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Smartphone smartphone1 = new Smartphone(1, "Galaxy S9", 10000, "Samsung");
        Smartphone smartphone2 = new Smartphone(2, "iPhone 7", 8000, "Apple");
        Smartphone smartphone3 = new Smartphone(3, "Galaxy S9+", 12000, "Samsung");

        //manager.add(smartphone1);
        //manager.add(smartphone2);
        //manager.add(smartphone3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("iPhone 7");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAuthorOfBookTest() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Book book1 = new Book(3, "Маленький принц 1", 400, "Антуан де Сент-Экзюпери");
        Book book2 = new Book(4, "Денискины рассказы", 500, "Виктор Драгунский");
        Book book3 = new Book(6, "Маленький принц 2", 700, "Антуан де Сент-Экзюпери");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
