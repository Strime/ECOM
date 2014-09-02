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
@Table(name = "TypeCarac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeCarac.findAll", query = "SELECT t FROM TypeCarac t"),
    @NamedQuery(name = "TypeCarac.findByIdTypeCarac", query = "SELECT t FROM TypeCarac t WHERE t.idTypeCarac = :idTypeCarac")})
public class TypeCarac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTypeCarac")
    private Integer idTypeCarac;

    public TypeCarac() {
    }

    public TypeCarac(Integer idTypeCarac) {
        this.idTypeCarac = idTypeCarac;
    }

    public Integer getIdTypeCarac() {
        return idTypeCarac;
    }

    public void setIdTypeCarac(Integer idTypeCarac) {
        this.idTypeCarac = idTypeCarac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeCarac != null ? idTypeCarac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeCarac)) {
            return false;
        }
        TypeCarac other = (TypeCarac) object;
        if ((this.idTypeCarac == null && other.idTypeCarac != null) || (this.idTypeCarac != null && !this.idTypeCarac.equals(other.idTypeCarac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.TypeCarac[ idTypeCarac=" + idTypeCarac + " ]";
    }
    
}
