package Customer;
import Products.IAdditionalService;
import Products.IDelivery;
import Products.IProduct;
import Products.Product;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Integer, IProduct> customerShoppingCart;
    private int totalPrice;

    protected ShoppingCart() {
        this.customerShoppingCart = new HashMap<>();
        this.totalPrice = 0;
    }

    public void addProductToCart (IProduct product){
        customerShoppingCart.put(product.getVendorCode(), product);
        totalPrice = totalPrice + product.getPrice();
    }

    public void addAdditionalService(int price) {
        System.out.println("Дополнительная услуга для стоит " + price + " рублей.");
        totalPrice = totalPrice + price;
    }

    @Override
    public String toString() {
        switch (totalPrice) {
            case (0) :
                return "Вы ещё ничего не заказали! Вперёд, за новыми покупками!";
            default :
                return "В вашей корзине следующие товары: \n" + customerShoppingCart
                    + "Итоговая стоимость корзины с учётом дополнительных услуг " + totalPrice;
        }
    }
}
