package us.zachandes.shop.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDetail {

    private List<Product> productList = new ArrayList<>();

    public ProductDetail() {
            productList.add(new Product("00000001", "Servo 01", "Lorem ipsum", 5.66));
            productList.add(new Product("00000002", "Servo 02", "Lorem ipsum", 9.98));
            productList.add(new Product("00000003", "Servo 03", "Lorem ipsum", 2.55));
            productList.add(new Product("00000004", "Servo 04", "Lorem ipsum", 48.23));
    }
    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductFromUPC(String upc){
        Product currentProduct = null;
        for(Product product : productList){
            if(product.getUpc().equals(upc)){
                currentProduct = product;
            }
        }

        return currentProduct;
    }
}
