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
public class KomponentList extends ArrayList<Komponent> implements Serializable {
    public KomponentList search(String serial) {
        KomponentList result = new KomponentList();
        for(Komponent kom: this) {
            if (kom.getSerial().equals(serial)) {
                result.add(kom);
            }
        }
        return result;
    }

    
}
