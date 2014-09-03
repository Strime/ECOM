/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.Carac;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sancassani
 */
@Local
public interface CaracFacadeLocal {

    void create(Carac carac);

    void edit(Carac carac);

    void remove(Carac carac);

    Carac find(Object id);

    List<Carac> findAll();

    List<Carac> findRange(int[] range);

    int count();
    
}
