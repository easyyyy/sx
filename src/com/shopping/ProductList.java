package com.shopping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductList {
    private List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public void showProductList(){
        for (Product product:productList){
            System.out.println(product);
        }
    }

    public void removeProduct(int productId){
        for (Product product:productList){
            if (product.getId() == productId){
                productList.remove(product);
                break;
            }
        }
    }

    public Set<String> showAllCategory(){
        Set<String> categorySet = new HashSet<>();
        for (Product product:productList){
            categorySet.add(product.getCategory());
        }
        return categorySet;
    }

    public void purchaseProduct(int productId){
        for (Product product:productList){
            if (product.getId() == productId){
                product.setNum(product.getNum()-1);
                break;
            }
        }
    }

}
