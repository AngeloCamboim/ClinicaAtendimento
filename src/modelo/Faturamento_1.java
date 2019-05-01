/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Angelo
 */
@Entity
@Table(name = "faturamento", catalog = "clinicaatendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Faturamento_1.findAll", query = "SELECT f FROM Faturamento_1 f")
    , @NamedQuery(name = "Faturamento_1.findById", query = "SELECT f FROM Faturamento_1 f WHERE f.id = :id")
    , @NamedQuery(name = "Faturamento_1.findByMes", query = "SELECT f FROM Faturamento_1 f WHERE f.mes = :mes")
    , @NamedQuery(name = "Faturamento_1.findByDia", query = "SELECT f FROM Faturamento_1 f WHERE f.dia = :dia")
    , @NamedQuery(name = "Faturamento_1.findByTotal", query = "SELECT f FROM Faturamento_1 f WHERE f.total = :total")
    , @NamedQuery(name = "Faturamento_1.findByTotalmes", query = "SELECT f FROM Faturamento_1 f WHERE f.totalmes = :totalmes")})
public class Faturamento_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "mes")
    private String mes;
    @Column(name = "dia")
    private String dia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "totalmes")
    private Double totalmes;

    public Faturamento_1() {
    }

    public Faturamento_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        String oldMes = this.mes;
        this.mes = mes;
        changeSupport.firePropertyChange("mes", oldMes, mes);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        Double oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Double getTotalmes() {
        return totalmes;
    }

    public void setTotalmes(Double totalmes) {
        Double oldTotalmes = this.totalmes;
        this.totalmes = totalmes;
        changeSupport.firePropertyChange("totalmes", oldTotalmes, totalmes);
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
        if (!(object instanceof Faturamento_1)) {
            return false;
        }
        Faturamento_1 other = (Faturamento_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinicaatendimento.Faturamento_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
