package online_shop;

public class Product {
    private String productName;
    private double price;
    private String rating;
    private Category category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Название: " + productName + '\'' +
                ", цена: " + price +
                ", рэйтинг: " + rating + '\'' +
                ", категория: " + category;
    }
}
