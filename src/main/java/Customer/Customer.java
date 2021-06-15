package Customer;

public class Customer {
    private String email;
    private ShoppingCart shoppingCart;

    public Customer(String email) {
        this.email = email;
        this.shoppingCart = new ShoppingCart();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
