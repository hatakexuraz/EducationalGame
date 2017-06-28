/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hatake_47
 */
@Entity
@Table(name = "GKOptions", catalog = "Educational Game", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GKOptions.findAll", query = "SELECT g FROM GKOptions g"),
    @NamedQuery(name = "GKOptions.findById", query = "SELECT g FROM GKOptions g WHERE g.id = :id"),
    @NamedQuery(name = "GKOptions.findByOptions", query = "SELECT g FROM GKOptions g WHERE g.options = :options")})
public class GKOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "options")
    private String options;
    @JoinColumn(name = "que_no", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private GKChapter queNo;

    public GKOptions() {
    }

    public GKOptions(Integer id) {
        this.id = id;
    }

    public GKOptions(Integer id, String options) {
        this.id = id;
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public GKChapter getQueNo() {
        return queNo;
    }

    public void setQueNo(GKChapter queNo) {
        this.queNo = queNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GKOptions)) {
            return false;
        }
        GKOptions other = (GKOptions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.GKOptions[ id=" + id + " ]";
    }
    
}
