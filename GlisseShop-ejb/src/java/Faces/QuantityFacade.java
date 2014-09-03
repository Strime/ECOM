/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.Quantity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sancassani
 */
@Stateless
public class QuantityFacade extends AbstractFacade<Quantity> implements QuantityFacadeLocal {
    @PersistenceContext(unitName = "GlisseShop-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuantityFacade() {
        super(Quantity.class);
    }
    
}
