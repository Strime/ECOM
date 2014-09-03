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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ShipmentFee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShipmentFee.findAll", query = "SELECT s FROM ShipmentFee s"),
    @NamedQuery(name = "ShipmentFee.findByIdShipmentFee", query = "SELECT s FROM ShipmentFee s WHERE s.idShipmentFee = :idShipmentFee"),
    @NamedQuery(name = "ShipmentFee.findByProductidProduct", query = "SELECT s FROM ShipmentFee s WHERE s.productidProduct = :productidProduct")})
public class ShipmentFee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idShipmentFee")
    private Integer idShipmentFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Product_idProduct")
    private int productidProduct;
    @JoinColumn(name = "Supplier_idSupplier", referencedColumnName = "idSupplier")
    @ManyToOne(optional = false)
    private Supplier supplieridSupplier;

    public ShipmentFee() {
    }

    public ShipmentFee(Integer idShipmentFee) {
        this.idShipmentFee = idShipmentFee;
    }

    public ShipmentFee(Integer idShipmentFee, int productidProduct) {
        this.idShipmentFee = idShipmentFee;
        this.productidProduct = productidProduct;
    }

    public Integer getIdShipmentFee() {
        return idShipmentFee;
    }

    public void setIdShipmentFee(Integer idShipmentFee) {
        this.idShipmentFee = idShipmentFee;
    }

    public int getProductidProduct() {
        return productidProduct;
    }

    public void setProductidProduct(int productidProduct) {
        this.productidProduct = productidProduct;
    }

    public Supplier getSupplieridSupplier() {
        return supplieridSupplier;
    }

    public void setSupplieridSupplier(Supplier supplieridSupplier) {
        this.supplieridSupplier = supplieridSupplier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idShipmentFee != null ? idShipmentFee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentFee)) {
            return false;
        }
        ShipmentFee other = (ShipmentFee) object;
        if ((this.idShipmentFee == null && other.idShipmentFee != null) || (this.idShipmentFee != null && !this.idShipmentFee.equals(other.idShipmentFee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ShipmentFee[ idShipmentFee=" + idShipmentFee + " ]";
    }
    
}
