public class Repository {
    private Product[] products = new Product[0];


    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int removeId) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : products) {
            if (item.getId() != removeId) {
                tmp[index] = item;
                index++;
            }
        }
        products = tmp;
    }
}
