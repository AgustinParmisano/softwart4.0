/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

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
 * @author agustin
 */
@Entity
@Table(name = "Voto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voto.findAll", query = "SELECT v FROM Voto v"),
    @NamedQuery(name = "Voto.findByIdVoto", query = "SELECT v FROM Voto v WHERE v.idVoto = :idVoto")})
public class Voto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVoto")
    private Integer idVoto;
    @JoinColumn(name = "usuario_votante", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioVotante;
    @JoinColumn(name = "publicacion_votada", referencedColumnName = "idPublicacion")
    @ManyToOne(optional = false)
    private Publicacion publicacionVotada;

    public Voto() {
    }

    public Voto(Integer idVoto) {
        this.idVoto = idVoto;
    }

    public Integer getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(Integer idVoto) {
        this.idVoto = idVoto;
    }

    public Usuario getUsuarioVotante() {
        return usuarioVotante;
    }

    public void setUsuarioVotante(Usuario usuarioVotante) {
        this.usuarioVotante = usuarioVotante;
    }

    public Publicacion getPublicacionVotada() {
        return publicacionVotada;
    }

    public void setPublicacionVotada(Publicacion publicacionVotada) {
        this.publicacionVotada = publicacionVotada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVoto != null ? idVoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voto)) {
            return false;
        }
        Voto other = (Voto) object;
        if ((this.idVoto == null && other.idVoto != null) || (this.idVoto != null && !this.idVoto.equals(other.idVoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Voto[ idVoto=" + idVoto + " ]";
    }
    
}
