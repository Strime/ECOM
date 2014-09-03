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
@Table(name = "Familly")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Familly.findAll", query = "SELECT f FROM Familly f"),
    @NamedQuery(name = "Familly.findByIdFamilly", query = "SELECT f FROM Familly f WHERE f.idFamilly = :idFamilly")})
public class Familly implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFamilly")
    private Integer idFamilly;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "famillyidFamilly")
    private Collection<Familly> famillyCollection;
    @JoinColumn(name = "Familly_idFamilly", referencedColumnName = "idFamilly")
    @ManyToOne(optional = false)
    private Familly famillyidFamilly;

    public Familly() {
    }

    public Familly(Integer idFamilly) {
        this.idFamilly = idFamilly;
    }

    public Integer getIdFamilly() {
        return idFamilly;
    }

    public void setIdFamilly(Integer idFamilly) {
        this.idFamilly = idFamilly;
    }

    @XmlTransient
    public Collection<Familly> getFamillyCollection() {
        return famillyCollection;
    }

    public void setFamillyCollection(Collection<Familly> famillyCollection) {
        this.famillyCollection = famillyCollection;
    }

    public Familly getFamillyidFamilly() {
        return famillyidFamilly;
    }

    public void setFamillyidFamilly(Familly famillyidFamilly) {
        this.famillyidFamilly = famillyidFamilly;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFamilly != null ? idFamilly.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familly)) {
            return false;
        }
        Familly other = (Familly) object;
        if ((this.idFamilly == null && other.idFamilly != null) || (this.idFamilly != null && !this.idFamilly.equals(other.idFamilly))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Familly[ idFamilly=" + idFamilly + " ]";
    }
    
}
