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
@Table(name = "Sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sistema.findAll", query = "SELECT s FROM Sistema s"),
    @NamedQuery(name = "Sistema.findByIdSistema", query = "SELECT s FROM Sistema s WHERE s.idSistema = :idSistema"),
    @NamedQuery(name = "Sistema.findByTituloDelSitio", query = "SELECT s FROM Sistema s WHERE s.tituloDelSitio = :tituloDelSitio"),
    @NamedQuery(name = "Sistema.findByDescripcionDelSitio", query = "SELECT s FROM Sistema s WHERE s.descripcionDelSitio = :descripcionDelSitio"),
    @NamedQuery(name = "Sistema.findByTagsDelSitio", query = "SELECT s FROM Sistema s WHERE s.tagsDelSitio = :tagsDelSitio"),
    @NamedQuery(name = "Sistema.findByUrisSemanticas", query = "SELECT s FROM Sistema s WHERE s.urisSemanticas = :urisSemanticas"),
    @NamedQuery(name = "Sistema.findByBanner", query = "SELECT s FROM Sistema s WHERE s.banner = :banner"),
    @NamedQuery(name = "Sistema.findByEstilo", query = "SELECT s FROM Sistema s WHERE s.estilo = :estilo"),
    @NamedQuery(name = "Sistema.findByHablitado", query = "SELECT s FROM Sistema s WHERE s.hablitado = :hablitado"),
    @NamedQuery(name = "Sistema.findByModerarPublicaciones", query = "SELECT s FROM Sistema s WHERE s.moderarPublicaciones = :moderarPublicaciones"),
    @NamedQuery(name = "Sistema.findByPuntosParaSancionar", query = "SELECT s FROM Sistema s WHERE s.puntosParaSancionar = :puntosParaSancionar"),
    @NamedQuery(name = "Sistema.findByTiempoDeSancion", query = "SELECT s FROM Sistema s WHERE s.tiempoDeSancion = :tiempoDeSancion"),
    @NamedQuery(name = "Sistema.findByFechaModificacion", query = "SELECT s FROM Sistema s WHERE s.fechaModificacion = :fechaModificacion")})
public class Sistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSistema")
    private Integer idSistema;
    @Column(name = "titulo_del_sitio")
    private String tituloDelSitio;
    @Column(name = "descripcion_del_sitio")
    private String descripcionDelSitio;
    @Column(name = "tags_del_sitio")
    private String tagsDelSitio;
    @Column(name = "uris_semanticas")
    private String urisSemanticas;
    @Column(name = "banner")
    private String banner;
    @Column(name = "estilo")
    private String estilo;
    @Column(name = "hablitado")
    private Boolean hablitado;
    @Column(name = "moderar_publicaciones")
    private Boolean moderarPublicaciones;
    @Column(name = "puntos_para_sancionar")
    private Integer puntosParaSancionar;
    @Column(name = "tiempo_de_sancion")
    private Integer tiempoDeSancion;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @JoinColumn(name = "usuario_modificacion", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioModificacion;

    public Sistema() {
    }

    public Sistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public String getTituloDelSitio() {
        return tituloDelSitio;
    }

    public void setTituloDelSitio(String tituloDelSitio) {
        this.tituloDelSitio = tituloDelSitio;
    }

    public String getDescripcionDelSitio() {
        return descripcionDelSitio;
    }

    public void setDescripcionDelSitio(String descripcionDelSitio) {
        this.descripcionDelSitio = descripcionDelSitio;
    }

    public String getTagsDelSitio() {
        return tagsDelSitio;
    }

    public void setTagsDelSitio(String tagsDelSitio) {
        this.tagsDelSitio = tagsDelSitio;
    }

    public String getUrisSemanticas() {
        return urisSemanticas;
    }

    public void setUrisSemanticas(String urisSemanticas) {
        this.urisSemanticas = urisSemanticas;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Boolean getHablitado() {
        return hablitado;
    }

    public void setHablitado(Boolean hablitado) {
        this.hablitado = hablitado;
    }

    public Boolean getModerarPublicaciones() {
        return moderarPublicaciones;
    }

    public void setModerarPublicaciones(Boolean moderarPublicaciones) {
        this.moderarPublicaciones = moderarPublicaciones;
    }

    public Integer getPuntosParaSancionar() {
        return puntosParaSancionar;
    }

    public void setPuntosParaSancionar(Integer puntosParaSancionar) {
        this.puntosParaSancionar = puntosParaSancionar;
    }

    public Integer getTiempoDeSancion() {
        return tiempoDeSancion;
    }

    public void setTiempoDeSancion(Integer tiempoDeSancion) {
        this.tiempoDeSancion = tiempoDeSancion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Usuario getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Usuario usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSistema != null ? idSistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.idSistema == null && other.idSistema != null) || (this.idSistema != null && !this.idSistema.equals(other.idSistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sistema[ idSistema=" + idSistema + " ]";
    }
    
}
