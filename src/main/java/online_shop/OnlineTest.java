package online_shop;

public class OnlineTest {
    public static void main(String[] args) {
        Product book1 = new Product();
        book1.setProductName("Преступление и наказание");
        book1.setPrice(500.0);
        book1.setRating("18+");

        Product book2 = new Product();
        book2.setProductName("Властелин колец");
        book2.setPrice(800.5);
        book2.setRating("12+");

        Category books = new Category();
        Category clothes = new Category();
        Category food = new Category();

        books.setCategoryName("Книги");
        books.setProducts(new Product[]{book1, book2});
        clothes.setCategoryName("Одежда");
        food.setCategoryName("Продукты");

        Basket basket = new Basket();
        basket.setMyProducts(new Product[]{book1});

        User user = new User();
        user.setLogin("alex");
        user.setPassword("qwerty");
        user.setBasket(basket);

        OnlineShop onlineShop = new OnlineShop();
        onlineShop.setCategory(books);
        onlineShop.setUser(user);
        onlineShop.printInfo();
    }
}
