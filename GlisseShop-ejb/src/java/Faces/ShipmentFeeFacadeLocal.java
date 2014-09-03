/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.ShipmentFee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sancassani
 */
@Local
public interface ShipmentFeeFacadeLocal {

    void create(ShipmentFee shipmentFee);

    void edit(ShipmentFee shipmentFee);

    void remove(ShipmentFee shipmentFee);

    ShipmentFee find(Object id);

    List<ShipmentFee> findAll();

    List<ShipmentFee> findRange(int[] range);

    int count();
    
}
