/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import Entity.Familly;
import Faces.FamillyFacade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Sancassani
 */
public class DALFamily {
    FamillyFacade famillyFacade = lookupFamillyFacadeBean();

    private FamillyFacade lookupFamillyFacadeBean() {
        try {
            Context c = new InitialContext();
            return (FamillyFacade) c.lookup("java:global/GlisseShop/GlisseShop-ejb/FamillyFacade!Faces.FamillyFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    public Familly getFamily(Integer id) {
        return famillyFacade.findAll().get(id);
    }
}
