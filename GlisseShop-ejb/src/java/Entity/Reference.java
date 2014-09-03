/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sancassani
 */
@Entity
@Table(name = "Reference")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reference.findAll", query = "SELECT r FROM Reference r"),
    @NamedQuery(name = "Reference.findByIdReference", query = "SELECT r FROM Reference r WHERE r.idReference = :idReference"),
    @NamedQuery(name = "Reference.findByProductidProduct", query = "SELECT r FROM Reference r WHERE r.productidProduct = :productidProduct")})
public class Reference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idReference")
    private Integer idReference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Product_idProduct")
    private int productidProduct;
    @JoinColumn(name = "Item_idItem", referencedColumnName = "idItem")
    @ManyToOne(optional = false)
    private Item itemidItem;
    @JoinColumn(name = "Carac_idCarac", referencedColumnName = "idCarac")
    @ManyToOne(optional = false)
    private Carac caracidCarac;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referenceidReference")
    private Collection<Stock> stockCollection;

    public Reference() {
    }

    public Reference(Integer idReference) {
        this.idReference = idReference;
    }

    public Reference(Integer idReference, int productidProduct) {
        this.idReference = idReference;
        this.productidProduct = productidProduct;
    }

    public Integer getIdReference() {
        return idReference;
    }

    public void setIdReference(Integer idReference) {
        this.idReference = idReference;
    }

    public int getProductidProduct() {
        return productidProduct;
    }

    public void setProductidProduct(int productidProduct) {
        this.productidProduct = productidProduct;
    }

    public Item getItemidItem() {
        return itemidItem;
    }

    public void setItemidItem(Item itemidItem) {
        this.itemidItem = itemidItem;
    }

    public Carac getCaracidCarac() {
        return caracidCarac;
    }

    public void setCaracidCarac(Carac caracidCarac) {
        this.caracidCarac = caracidCarac;
    }

    @XmlTransient
    public Collection<Stock> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(Collection<Stock> stockCollection) {
        this.stockCollection = stockCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReference != null ? idReference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reference)) {
            return false;
        }
        Reference other = (Reference) object;
        if ((this.idReference == null && other.idReference != null) || (this.idReference != null && !this.idReference.equals(other.idReference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Reference[ idReference=" + idReference + " ]";
    }
    
}
