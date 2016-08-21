/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import business.Komponent;
import business.KomponentList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Chuot Bach
 */
public class ProductDetailsTableModel extends AbstractTableModel {


    private KomponentList komponentList = null;
    private final String[] columnNames = {"Tên linh kiện","Serial"};

    public KomponentList getKomponentList() {
        return komponentList;
    }

    public void setKomponentList(KomponentList komponentList) {
        this.komponentList = komponentList;
    }

    public ProductDetailsTableModel() {
        this.komponentList = new KomponentList();
    }
    
    public ProductDetailsTableModel(KomponentList komponentList) {
        this.komponentList = komponentList;
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
        return komponentList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;        
    }

    @Override
    public Object getValueAt(int i, int j) {
        Object obj = null;
        if (i<komponentList.size()) {
            Komponent komponent = komponentList.get(i);
            switch(j) {
                case 0: obj = komponent.getName();
                    break;
                case 1: obj = komponent.getSerial();
                    break;
            }
        }
        return obj;
    }

    @Override
    public void setValueAt(Object o, int i, int j) {
        if (i<komponentList.size()) {
            Komponent komponent = komponentList.get(i);
            switch(j) {
                case 0: komponent.setName((String)o);
                    break;
                case 1: komponent.setSerial((String)o);
                    break;
            }
        }
    }
    
    
}
