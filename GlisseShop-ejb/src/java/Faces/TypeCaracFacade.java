/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Faces;

import Entity.TypeCarac;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sancassani
 */
@Stateless
public class TypeCaracFacade extends AbstractFacade<TypeCarac> implements TypeCaracFacadeLocal {
    @PersistenceContext(unitName = "GlisseShop-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeCaracFacade() {
        super(TypeCarac.class);
    }
    
}
