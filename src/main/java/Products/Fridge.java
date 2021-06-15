package Products;

public class Fridge extends Product implements IDelivery, IAdditionalService {
    private double weight;

    public Fridge(int vendorCode, String name, Integer price, double weight) {
        super(vendorCode, name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Товар " + getName() + ", "
                + " Стоимость "+ getPrice() + "\n"
                + ". Вес товара составляет " + getWeight() + ", \n"
                + " К данному товару мы можем предложить доставку. Стоимость " + Product.deliveryPrice + "\n"
                + " Внутренний артикул товара " + getVendorCode() + " (назовите этот код сотруднику нашего call-центра" +
                "чтобы он смог быстрее найти товар в базе). \n";
    }

}
