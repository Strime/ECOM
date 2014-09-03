/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.Quantity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sancassani
 */
@Local
public interface QuantityFacadeLocal {

    void create(Quantity quantity);

    void edit(Quantity quantity);

    void remove(Quantity quantity);

    Quantity find(Object id);

    List<Quantity> findAll();

    List<Quantity> findRange(int[] range);

    int count();
    
}
