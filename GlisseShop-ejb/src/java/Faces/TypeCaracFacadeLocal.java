/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.TypeCarac;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sancassani
 */
@Local
public interface TypeCaracFacadeLocal {

    void create(TypeCarac typeCarac);

    void edit(TypeCarac typeCarac);

    void remove(TypeCarac typeCarac);

    TypeCarac find(Object id);

    List<TypeCarac> findAll();

    List<TypeCarac> findRange(int[] range);

    int count();
    
}
