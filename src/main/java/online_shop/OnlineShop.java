package online_shop;

import java.util.Arrays;

/**
 * а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * в) Создать класс Basket, содержащий массив купленных товаров.
 * г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
 */
public class OnlineShop {
    private Basket basket;
    private User user;

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
        System.out.println("Пользователь " + user.getLogin() + " " + " заказал: " + user.getBasket());
    }

}
