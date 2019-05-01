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
@Table(name = "estoque", catalog = "clinicaatendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Estoque_1.findAll", query = "SELECT e FROM Estoque_1 e")
    , @NamedQuery(name = "Estoque_1.findById", query = "SELECT e FROM Estoque_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Estoque_1.findByNome", query = "SELECT e FROM Estoque_1 e WHERE e.nome = :nome")
    , @NamedQuery(name = "Estoque_1.findByModelo", query = "SELECT e FROM Estoque_1 e WHERE e.modelo = :modelo")
    , @NamedQuery(name = "Estoque_1.findByMarca", query = "SELECT e FROM Estoque_1 e WHERE e.marca = :marca")
    , @NamedQuery(name = "Estoque_1.findByTipo", query = "SELECT e FROM Estoque_1 e WHERE e.tipo = :tipo")
    , @NamedQuery(name = "Estoque_1.findByFabricacao", query = "SELECT e FROM Estoque_1 e WHERE e.fabricacao = :fabricacao")
    , @NamedQuery(name = "Estoque_1.findByQuantidade", query = "SELECT e FROM Estoque_1 e WHERE e.quantidade = :quantidade")
    , @NamedQuery(name = "Estoque_1.findByVencimento", query = "SELECT e FROM Estoque_1 e WHERE e.vencimento = :vencimento")
    , @NamedQuery(name = "Estoque_1.findByDisponibilizacao", query = "SELECT e FROM Estoque_1 e WHERE e.disponibilizacao = :disponibilizacao")})
public class Estoque_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fabricacao")
    private String fabricacao;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "vencimento")
    private String vencimento;
    @Column(name = "disponibilizacao")
    private String disponibilizacao;

    public Estoque_1() {
    }

    public Estoque_1(Integer id) {
        this.id = id;
    }

    public Estoque_1(Integer id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        String oldFabricacao = this.fabricacao;
        this.fabricacao = fabricacao;
        changeSupport.firePropertyChange("fabricacao", oldFabricacao, fabricacao);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        String oldVencimento = this.vencimento;
        this.vencimento = vencimento;
        changeSupport.firePropertyChange("vencimento", oldVencimento, vencimento);
    }

    public String getDisponibilizacao() {
        return disponibilizacao;
    }

    public void setDisponibilizacao(String disponibilizacao) {
        String oldDisponibilizacao = this.disponibilizacao;
        this.disponibilizacao = disponibilizacao;
        changeSupport.firePropertyChange("disponibilizacao", oldDisponibilizacao, disponibilizacao);
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
        if (!(object instanceof Estoque_1)) {
            return false;
        }
        Estoque_1 other = (Estoque_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinicaatendimento.Estoque_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
