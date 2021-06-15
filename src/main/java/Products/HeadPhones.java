package Products;

public class HeadPhones extends Product implements IAdditionalService{
    private String Range;

    public HeadPhones(int vendorCode, String name, Integer price, String range) {
        super(vendorCode, name, price);
        Range = range;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    @Override
    public String toString() {
        return "Товар " + getName() + ", "
                + "Стоимость "+ getPrice() + "\n"
                + ". Диапазон воспроизводимых частот " + getRange() + ", \n"
                + " К данному товару мы можем предложить дополнительный сервис. Стоимость " + Product.additionalServicePrice
                + "\n"
                + " Внутренний артикул товара " + getVendorCode() + " (назовите этот код сотруднику нашего call-центра" +
                "чтобы он смог быстрее найти товар в базе). \n ";
    }

}
