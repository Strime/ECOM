/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.Familly;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sancassani
 */
@Local
public interface FamillyFacadeLocal {

    void create(Familly familly);

    void edit(Familly familly);

    void remove(Familly familly);

    Familly find(Object id);

    List<Familly> findAll();

    List<Familly> findRange(int[] range);

    int count();
    
}
