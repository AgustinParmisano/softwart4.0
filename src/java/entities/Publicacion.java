/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author agustin
 */
@Entity
@Table(name = "Publicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicacion.findAll", query = "SELECT p FROM Publicacion p"),
    @NamedQuery(name = "Publicacion.findByIdPublicacion", query = "SELECT p FROM Publicacion p WHERE p.idPublicacion = :idPublicacion"),
    @NamedQuery(name = "Publicacion.findByTitulo", query = "SELECT p FROM Publicacion p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Publicacion.findByDescripcion", query = "SELECT p FROM Publicacion p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Publicacion.findByContenido", query = "SELECT p FROM Publicacion p WHERE p.contenido = :contenido"),
    @NamedQuery(name = "Publicacion.findByFechaSubida", query = "SELECT p FROM Publicacion p WHERE p.fechaSubida = :fechaSubida"),
    @NamedQuery(name = "Publicacion.findByHabilitada", query = "SELECT p FROM Publicacion p WHERE p.habilitada = :habilitada"),
    @NamedQuery(name = "Publicacion.findByFechaBaja", query = "SELECT p FROM Publicacion p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Publicacion.findByComentariosHabilitados", query = "SELECT p FROM Publicacion p WHERE p.comentariosHabilitados = :comentariosHabilitados"),
    @NamedQuery(name = "Publicacion.findByVistas", query = "SELECT p FROM Publicacion p WHERE p.vistas = :vistas")})
public class Publicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPublicacion")
    private Integer idPublicacion;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "fecha_subida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSubida;
    @Column(name = "habilitada")
    private Boolean habilitada;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "comentarios_habilitados")
    private Boolean comentariosHabilitados;
    @Column(name = "vistas")
    private Integer vistas;
    @JoinTable(name = "Tag_has_Publicacion", joinColumns = {
        @JoinColumn(name = "idPublicacion", referencedColumnName = "idPublicacion")}, inverseJoinColumns = {
        @JoinColumn(name = "idTag", referencedColumnName = "idTag")})
    @ManyToMany
    private Collection<Tag> tagCollection;
    @OneToMany(mappedBy = "publicacionRelacionada")
    private Collection<Evento> eventoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacionVotada")
    private Collection<Voto> votoCollection;
    @JoinColumn(name = "usuario_publicador", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioPublicador;
    @JoinColumn(name = "moderado_por", referencedColumnName = "idUsuario")
    @ManyToOne
    private Usuario moderadoPor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacionComentada")
    private Collection<Comentario> comentarioCollection;
    @OneToMany(mappedBy = "publicacionRelacionada")
    private Collection<Sancion> sancionCollection;

    public Publicacion() {
    }

    public Publicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public Boolean getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Boolean getComentariosHabilitados() {
        return comentariosHabilitados;
    }

    public void setComentariosHabilitados(Boolean comentariosHabilitados) {
        this.comentariosHabilitados = comentariosHabilitados;
    }

    public Integer getVistas() {
        return vistas;
    }

    public void setVistas(Integer vistas) {
        this.vistas = vistas;
    }

    @XmlTransient
    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    @XmlTransient
    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @XmlTransient
    public Collection<Voto> getVotoCollection() {
        return votoCollection;
    }

    public void setVotoCollection(Collection<Voto> votoCollection) {
        this.votoCollection = votoCollection;
    }

    public Usuario getUsuarioPublicador() {
        return usuarioPublicador;
    }

    public void setUsuarioPublicador(Usuario usuarioPublicador) {
        this.usuarioPublicador = usuarioPublicador;
    }

    public Usuario getModeradoPor() {
        return moderadoPor;
    }

    public void setModeradoPor(Usuario moderadoPor) {
        this.moderadoPor = moderadoPor;
    }

    @XmlTransient
    public Collection<Comentario> getComentarioCollection() {
        return comentarioCollection;
    }

    public void setComentarioCollection(Collection<Comentario> comentarioCollection) {
        this.comentarioCollection = comentarioCollection;
    }

    @XmlTransient
    public Collection<Sancion> getSancionCollection() {
        return sancionCollection;
    }

    public void setSancionCollection(Collection<Sancion> sancionCollection) {
        this.sancionCollection = sancionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicacion != null ? idPublicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.idPublicacion == null && other.idPublicacion != null) || (this.idPublicacion != null && !this.idPublicacion.equals(other.idPublicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Publicacion[ idPublicacion=" + idPublicacion + " ]";
    }
    
}
