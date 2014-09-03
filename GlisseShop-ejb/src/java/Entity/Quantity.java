/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

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
@Table(name = "Quantity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quantity.findAll", query = "SELECT q FROM Quantity q"),
    @NamedQuery(name = "Quantity.findByIdQuantity", query = "SELECT q FROM Quantity q WHERE q.idQuantity = :idQuantity"),
    @NamedQuery(name = "Quantity.findByCount", query = "SELECT q FROM Quantity q WHERE q.count = :count")})
public class Quantity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idQuantity")
    private Integer idQuantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count")
    private int count;

    public Quantity() {
    }

    public Quantity(Integer idQuantity) {
        this.idQuantity = idQuantity;
    }

    public Quantity(Integer idQuantity, int count) {
        this.idQuantity = idQuantity;
        this.count = count;
    }

    public Integer getIdQuantity() {
        return idQuantity;
    }

    public void setIdQuantity(Integer idQuantity) {
        this.idQuantity = idQuantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuantity != null ? idQuantity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quantity)) {
            return false;
        }
        Quantity other = (Quantity) object;
        if ((this.idQuantity == null && other.idQuantity != null) || (this.idQuantity != null && !this.idQuantity.equals(other.idQuantity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Quantity[ idQuantity=" + idQuantity + " ]";
    }
    
}
