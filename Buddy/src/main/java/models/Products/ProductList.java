/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Products;

import java.util.ArrayList;

/**
 *
 * @author thomas
 */
public class ProductList {
    ArrayList<Product> productList;

    public ProductList() {
        productList=new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public void addProducttoList(Product product)
    {
        productList.add(product);
    }
            
    
    public void removeProductfromList(Product product){
        productList.remove(product);
    }
}
