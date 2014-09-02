/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sancassani
 */
@Entity
@Table(name = "Carac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carac.findAll", query = "SELECT c FROM Carac c"),
    @NamedQuery(name = "Carac.findByIdCarac", query = "SELECT c FROM Carac c WHERE c.idCarac = :idCarac")})
public class Carac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCarac")
    private Integer idCarac;

    public Carac() {
    }

    public Carac(Integer idCarac) {
        this.idCarac = idCarac;
    }

    public Integer getIdCarac() {
        return idCarac;
    }

    public void setIdCarac(Integer idCarac) {
        this.idCarac = idCarac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarac != null ? idCarac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carac)) {
            return false;
        }
        Carac other = (Carac) object;
        if ((this.idCarac == null && other.idCarac != null) || (this.idCarac != null && !this.idCarac.equals(other.idCarac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Carac[ idCarac=" + idCarac + " ]";
    }
    
}
