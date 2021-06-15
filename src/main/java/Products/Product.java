package Products;

import Customer.Customer;
import Customer.ShoppingCart;

import java.util.Objects;

public class Product implements IProduct {
    private int vendorCode;
    private String name;
    private Integer price; //can be null if the product is sold out

    public static final int additionalServicePrice = 799;
    public static final int deliveryPrice = 399;

    public Product(Integer vendorCode, String name, Integer price) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.price = price;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorCode);
    }

    @Override
    public String toString() {
        return "Товар" + name + ", "
                + "Стоимость "+ price + "\n"
                + "Внутренний артикул товара " + vendorCode + " (назовите этот код сотруднику нашего call-центра" +
                "чтобы он смог быстрее найти товар в базе). \n ";
    }

    public int deliver () {
        System.out.println("Стоимость доставки товара " + name + " " + deliveryPrice + " рублей.");
        return deliveryPrice;
    }

}
