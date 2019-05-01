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
@Table(name = "cadastro", catalog = "clinicaatendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findById", query = "SELECT c FROM Cadastro c WHERE c.id = :id")
    , @NamedQuery(name = "Cadastro.findByNome", query = "SELECT c FROM Cadastro c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastro.findByIdade", query = "SELECT c FROM Cadastro c WHERE c.idade = :idade")
    , @NamedQuery(name = "Cadastro.findByTelefone", query = "SELECT c FROM Cadastro c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Cadastro.findByEmail", query = "SELECT c FROM Cadastro c WHERE c.email = :email")
    , @NamedQuery(name = "Cadastro.findByEndereco", query = "SELECT c FROM Cadastro c WHERE c.endereco = :endereco")
    , @NamedQuery(name = "Cadastro.findByEstadocivil", query = "SELECT c FROM Cadastro c WHERE c.estadocivil = :estadocivil")
    , @NamedQuery(name = "Cadastro.findByConvenio", query = "SELECT c FROM Cadastro c WHERE c.convenio = :convenio")})
public class Cadastro implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "idade")
    private int idade;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "estadocivil")
    private String estadocivil;
    @Column(name = "convenio")
    private String convenio;

    public Cadastro() {
    }

    public Cadastro(Integer id) {
        this.id = id;
    }

    public Cadastro(Integer id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        String oldEstadocivil = this.estadocivil;
        this.estadocivil = estadocivil;
        changeSupport.firePropertyChange("estadocivil", oldEstadocivil, estadocivil);
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        String oldConvenio = this.convenio;
        this.convenio = convenio;
        changeSupport.firePropertyChange("convenio", oldConvenio, convenio);
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
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinicaatendimento.Cadastro[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
