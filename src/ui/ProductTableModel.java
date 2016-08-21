/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import business.Product;
import business.ProductList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Chuot Bach
 */
public class ProductTableModel extends AbstractTableModel {

    private ProductList productList = null;
    private final String[] columnNames = {"Stt","Tên sản phẩm","Serials"};

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public ProductTableModel() {
        this.productList = new ProductList();
    }
    
    public ProductTableModel(ProductList productList) {
        this.productList = productList;
    }    

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public boolean isCellEditable(int i, int j) {
        return j >= 0;
    }    
    
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return 3;        
    }

    @Override
    public Object getValueAt(int i, int j) {
        Object obj = null;
        if (i<productList.size()) {
            Product product = productList.get(i);
            switch(j) {
                case 0: obj = i+1 + ""; 
                    break;
                case 1: obj = product.getName();
                    break;
                case 2: obj = product.getSerials();
                    break;
            }
        }
        return obj;
    }

    @Override
    public void setValueAt(Object o, int i, int j) {
        if (i<productList.size()) {
            Product product = productList.get(i);
            switch(j) {
                case 1: product.setName((String)o);
                    break;
                case 2: product.setSerials((String)o);
                    break;
            }
        }
    }
    
    
    
}
