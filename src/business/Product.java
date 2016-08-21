/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;

/**
 *
 * @author Chuot Bach
 */
public class Product implements Serializable {
    private String code = "";
    private String name = "";
    private String note = "";
    private String serials = "";
    private double price = 0;
    private int qty = 0;
    private KomponentList komponentList = null;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the serials
     */
    public String getSerials() {
        String s = "";        
        for(Komponent komponent: komponentList) {
            s += ", " + komponent.getSerial();
        }
        if (s.isEmpty()==false) s = s.substring(1);
        this.serials = s;
        return s;
    }

    /**
     * @param serials the serials to set
     */
    public void setSerials(String serials) {
        this.serials = serials;
        String[] a = serials.split(",");
        komponentList = new KomponentList();
        for(String s: a) {
            Komponent komponent = new Komponent();
            komponent.setSerial(s.trim());
            komponentList.add(komponent);
        }
    }

    /**
     * @return the komponentList
     */
    public KomponentList getKomponentList() {
        return komponentList;
    }

    /**
     * @param komponentList the komponentList to set
     */
    public void setKomponentList(KomponentList komponentList) {
        this.komponentList = komponentList;
    }
        
}
