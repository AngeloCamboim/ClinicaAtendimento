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
@Table(name = "exames", catalog = "clinicaatendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Exames_1.findAll", query = "SELECT e FROM Exames_1 e")
    , @NamedQuery(name = "Exames_1.findById", query = "SELECT e FROM Exames_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Exames_1.findByNome", query = "SELECT e FROM Exames_1 e WHERE e.nome = :nome")
    , @NamedQuery(name = "Exames_1.findBySexo", query = "SELECT e FROM Exames_1 e WHERE e.sexo = :sexo")
    , @NamedQuery(name = "Exames_1.findByIdade", query = "SELECT e FROM Exames_1 e WHERE e.idade = :idade")
    , @NamedQuery(name = "Exames_1.findByEndereco", query = "SELECT e FROM Exames_1 e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Exames_1.findByData", query = "SELECT e FROM Exames_1 e WHERE e.data = :data")
    , @NamedQuery(name = "Exames_1.findByEntrega", query = "SELECT e FROM Exames_1 e WHERE e.entrega = :entrega")
    , @NamedQuery(name = "Exames_1.findByLaboratorio", query = "SELECT e FROM Exames_1 e WHERE e.laboratorio = :laboratorio")
    , @NamedQuery(name = "Exames_1.findByTelefone", query = "SELECT e FROM Exames_1 e WHERE e.telefone = :telefone")
    , @NamedQuery(name = "Exames_1.findByResultado", query = "SELECT e FROM Exames_1 e WHERE e.resultado = :resultado")})
public class Exames_1 implements Serializable {

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
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "data")
    private String data;
    @Column(name = "entrega")
    private String entrega;
    @Column(name = "laboratorio")
    private String laboratorio;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "resultado")
    private String resultado;

    public Exames_1() {
    }

    public Exames_1(Integer id) {
        this.id = id;
    }

    public Exames_1(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        Integer oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        String oldEntrega = this.entrega;
        this.entrega = entrega;
        changeSupport.firePropertyChange("entrega", oldEntrega, entrega);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        String oldResultado = this.resultado;
        this.resultado = resultado;
        changeSupport.firePropertyChange("resultado", oldResultado, resultado);
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
        if (!(object instanceof Exames_1)) {
            return false;
        }
        Exames_1 other = (Exames_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinicaatendimento.Exames_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
