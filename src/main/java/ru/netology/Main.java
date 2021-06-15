package ru.netology;

import Customer.Customer;
import Products.Fridge;
import Products.HeadPhones;
import Products.Product;

public class Main {

    public static void main(String[] args) {
        //create some products
        Product fridgeMorozinator2000 = new Fridge(1000001, "Морозинатор 2000", 15000, 30);
        Product plateWithPatterns = new Product(10000003, "Тарелка с узорами", 50);
        Product headPhonesNotAirPods = new HeadPhones(10000045, "Просто наушники-капли",
                990, "20 гц - 20 000 гц");

        //create user
        Customer exampeUser = new Customer("Vasiliy@example.com");
        //trying to view the shopping cart
        System.out.println(exampeUser.getShoppingCart().toString());
        //add some products to cart
        exampeUser.getShoppingCart().addProductToCart(fridgeMorozinator2000);
        exampeUser.getShoppingCart().addProductToCart(plateWithPatterns);
        exampeUser.getShoppingCart().addProductToCart(headPhonesNotAirPods);
        //trying to view the shopping cart
        System.out.println(exampeUser.getShoppingCart().toString());
        //add deliver to shopping cart
        exampeUser.getShoppingCart().addAdditionalService(fridgeMorozinator2000.deliver());
        //again trying to view the shopping cart
        System.out.println(exampeUser.getShoppingCart().toString());
    }
}
