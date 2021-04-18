package online_shop;

import java.util.Arrays;

public class Basket {
    private Product myProducts[];

    public Product[] getMyProducts() {
        return myProducts;
    }

    public void setMyProducts(Product[] myProducts) {
        this.myProducts = myProducts;
    }

    @Override
    public String toString() {
        return Arrays.toString(myProducts);
    }

}
