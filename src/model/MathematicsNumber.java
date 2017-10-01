/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hatake_47
 */
@Entity
@Table(name = "MathematicsNumber", catalog = "Educational Game", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MathematicsNumber.findAll", query = "SELECT m FROM MathematicsNumber m"),
    @NamedQuery(name = "MathematicsNumber.findById", query = "SELECT m FROM MathematicsNumber m WHERE m.id = :id"),
    @NamedQuery(name = "MathematicsNumber.findByQuestion", query = "SELECT m FROM MathematicsNumber m WHERE m.question = :question"),
    @NamedQuery(name = "MathematicsNumber.findByAnswer", query = "SELECT m FROM MathematicsNumber m WHERE m.answer = :answer")})
public class MathematicsNumber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @Column(name = "answer")
    private String answer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "queNo")
    private Collection<MathematicsNumberOption> mathematicsNumberOptionCollection;

    public MathematicsNumber() {
    }

    public MathematicsNumber(Integer id) {
        this.id = id;
    }

    public MathematicsNumber(Integer id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @XmlTransient
    public Collection<MathematicsNumberOption> getMathematicsNumberOptionCollection() {
        return mathematicsNumberOptionCollection;
    }

    public void setMathematicsNumberOptionCollection(Collection<MathematicsNumberOption> mathematicsNumberOptionCollection) {
        this.mathematicsNumberOptionCollection = mathematicsNumberOptionCollection;
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
        if (!(object instanceof MathematicsNumber)) {
            return false;
        }
        MathematicsNumber other = (MathematicsNumber) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MathematicsNumber[ id=" + id + " ]";
    }
    
}
