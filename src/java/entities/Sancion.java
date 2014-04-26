/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author agustin
 */
@Entity
@Table(name = "Sancion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sancion.findAll", query = "SELECT s FROM Sancion s"),
    @NamedQuery(name = "Sancion.findByIdSancion", query = "SELECT s FROM Sancion s WHERE s.idSancion = :idSancion"),
    @NamedQuery(name = "Sancion.findByMotivo", query = "SELECT s FROM Sancion s WHERE s.motivo = :motivo"),
    @NamedQuery(name = "Sancion.findByPuntos", query = "SELECT s FROM Sancion s WHERE s.puntos = :puntos"),
    @NamedQuery(name = "Sancion.findByFechaInicio", query = "SELECT s FROM Sancion s WHERE s.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Sancion.findByFechaFinSancion", query = "SELECT s FROM Sancion s WHERE s.fechaFinSancion = :fechaFinSancion")})
public class Sancion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSancion")
    private Integer idSancion;
    @Column(name = "motivo")
    private String motivo;
    @Column(name = "puntos")
    private Integer puntos;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin_sancion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinSancion;
    @JoinColumn(name = "publicacion_relacionada", referencedColumnName = "idPublicacion")
    @ManyToOne
    private Publicacion publicacionRelacionada;
    @JoinColumn(name = "comentario_relacionado", referencedColumnName = "idComentario")
    @ManyToOne
    private Comentario comentarioRelacionado;

    public Sancion() {
    }

    public Sancion(Integer idSancion) {
        this.idSancion = idSancion;
    }

    public Integer getIdSancion() {
        return idSancion;
    }

    public void setIdSancion(Integer idSancion) {
        this.idSancion = idSancion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinSancion() {
        return fechaFinSancion;
    }

    public void setFechaFinSancion(Date fechaFinSancion) {
        this.fechaFinSancion = fechaFinSancion;
    }

    public Publicacion getPublicacionRelacionada() {
        return publicacionRelacionada;
    }

    public void setPublicacionRelacionada(Publicacion publicacionRelacionada) {
        this.publicacionRelacionada = publicacionRelacionada;
    }

    public Comentario getComentarioRelacionado() {
        return comentarioRelacionado;
    }

    public void setComentarioRelacionado(Comentario comentarioRelacionado) {
        this.comentarioRelacionado = comentarioRelacionado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSancion != null ? idSancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sancion)) {
            return false;
        }
        Sancion other = (Sancion) object;
        if ((this.idSancion == null && other.idSancion != null) || (this.idSancion != null && !this.idSancion.equals(other.idSancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sancion[ idSancion=" + idSancion + " ]";
    }
    
}
