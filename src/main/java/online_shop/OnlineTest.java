package online_shop;

public class OnlineTest {
    public static void main(String[] args) {
        Category books = new Category();
        Category clothes = new Category();
        Category food = new Category();

        books.setCategoryName("Книги");
        clothes.setCategoryName("Одежда");
        food.setCategoryName("Продукты");

        Product book1 = new Product();
        book1.setProductName("Преступление и наказание");
        book1.setPrice(500.0);
        book1.setRating("18+");
        book1.setCategory(books);

        Product book2 = new Product();
        book2.setProductName("Властелин колец");
        book2.setPrice(800.5);
        book2.setRating("12+");
        book2.setCategory(books);

        Basket basket = new Basket();
        basket.setMyProducts(new Product[]{book1});

        User user = new User();
        user.setLogin("alex");
        user.setPassword("qwerty");
        user.setBasket(basket);

        OnlineShop onlineShop = new OnlineShop();
        onlineShop.setUser(user);
        onlineShop.setBasket(basket);
        onlineShop.printInfo();
    }
}
