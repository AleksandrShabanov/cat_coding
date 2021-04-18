package online_shop;

import java.util.Arrays;

/**
 * а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * в) Создать класс Basket, содержащий массив купленных товаров.
 * г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
 */
public class OnlineShop {
    private Product product;
    private Category category;
    private Basket basket;
    private User user;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void printInfo() {
        System.out.println("Пользователь " + user.getLogin() + " " + " заказал: " + user.getBasket() +
                " " + " из категории " + category.getCategoryName());
    }
}
