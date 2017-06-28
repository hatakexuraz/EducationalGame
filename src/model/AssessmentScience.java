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
@Table(name = "AssessmentScience", catalog = "Educational Game", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssessmentScience.findAll", query = "SELECT a FROM AssessmentScience a"),
    @NamedQuery(name = "AssessmentScience.findById", query = "SELECT a FROM AssessmentScience a WHERE a.id = :id"),
    @NamedQuery(name = "AssessmentScience.findByQuestion", query = "SELECT a FROM AssessmentScience a WHERE a.question = :question"),
    @NamedQuery(name = "AssessmentScience.findByAnswer", query = "SELECT a FROM AssessmentScience a WHERE a.answer = :answer")})
public class AssessmentScience implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "question")
    private String question;
    @Basic(optional = false)
    @Column(name = "answer")
    private String answer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assessmentId")
    private Collection<Score> scoreCollection;

    public AssessmentScience() {
    }

    public AssessmentScience(Integer id) {
        this.id = id;
    }

    public AssessmentScience(Integer id, String question, String answer) {
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
    public Collection<Score> getScoreCollection() {
        return scoreCollection;
    }

    public void setScoreCollection(Collection<Score> scoreCollection) {
        this.scoreCollection = scoreCollection;
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
        if (!(object instanceof AssessmentScience)) {
            return false;
        }
        AssessmentScience other = (AssessmentScience) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AssessmentScience[ id=" + id + " ]";
    }
    
}
