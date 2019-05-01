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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "agendarconsulta", catalog = "clinicaatendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agendarconsulta_1.findAll", query = "SELECT a FROM Agendarconsulta_1 a")
    , @NamedQuery(name = "Agendarconsulta_1.findById", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.id = :id")
    , @NamedQuery(name = "Agendarconsulta_1.findByNome", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.nome = :nome")
    , @NamedQuery(name = "Agendarconsulta_1.findByMedico", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.medico = :medico")
    , @NamedQuery(name = "Agendarconsulta_1.findByHorario", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.horario = :horario")
    , @NamedQuery(name = "Agendarconsulta_1.findByData", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.data = :data")
    , @NamedQuery(name = "Agendarconsulta_1.findByConvenio", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.convenio = :convenio")
    , @NamedQuery(name = "Agendarconsulta_1.findByValor", query = "SELECT a FROM Agendarconsulta_1 a WHERE a.valor = :valor")})
public class Agendarconsulta_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "medico")
    private String medico;
    @Column(name = "horario")
    private String horario;
    @Column(name = "data")
    private String data;
    @Column(name = "convenio")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "valor")
    private int valor;

    public Agendarconsulta_1() {
    }

    public Agendarconsulta_1(Integer id) {
        this.id = id;
    }

    public Agendarconsulta_1(Integer id, String nome, int valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        String oldMedico = this.medico;
        this.medico = medico;
        changeSupport.firePropertyChange("medico", oldMedico, medico);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        String oldConvenio = this.convenio;
        this.convenio = convenio;
        changeSupport.firePropertyChange("convenio", oldConvenio, convenio);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        int oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
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
        if (!(object instanceof Agendarconsulta_1)) {
            return false;
        }
        Agendarconsulta_1 other = (Agendarconsulta_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinicaatendimento.Agendarconsulta_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
