/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Chuot Bach
 */
public class ProductList extends ArrayList<Product> implements Serializable {

    public ProductList() {
        super();
    }
    
    public void swap(int i, int j) {
        if (i<0 || i>=this.size() || j<0 || j>=this.size()) return;
        Product tmp = this.get(i);
        this.set(i, this.get(j));
        this.set(j, tmp);
    }
    
    public ProductList searchBySerial(String serial) {
        ProductList result = new ProductList();
        for(Product p: this) {
            if (p.getSerials().contains(serial)) {
                result.add(p);
            }
        }
        return result;
    }
    
}
