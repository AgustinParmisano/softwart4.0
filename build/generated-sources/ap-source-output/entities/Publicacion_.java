package entities;

import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Publicacion.class)
public abstract class Publicacion_ {

	public static volatile SingularAttribute<Publicacion, Boolean> habilitada;
	public static volatile CollectionAttribute<Publicacion, Sancion> sancionCollection;
	public static volatile SingularAttribute<Publicacion, String> contenido;
	public static volatile SingularAttribute<Publicacion, String> descripcion;
	public static volatile CollectionAttribute<Publicacion, Voto> votoCollection;
	public static volatile CollectionAttribute<Publicacion, Evento> eventoCollection;
	public static volatile SingularAttribute<Publicacion, Usuario> usuarioPublicador;
	public static volatile CollectionAttribute<Publicacion, Tag> tagCollection;
	public static volatile CollectionAttribute<Publicacion, Comentario> comentarioCollection;
	public static volatile SingularAttribute<Publicacion, Boolean> comentariosHabilitados;
	public static volatile SingularAttribute<Publicacion, Integer> vistas;
	public static volatile SingularAttribute<Publicacion, String> titulo;
	public static volatile SingularAttribute<Publicacion, Date> fechaSubida;
	public static volatile SingularAttribute<Publicacion, Date> fechaBaja;
	public static volatile SingularAttribute<Publicacion, Usuario> moderadoPor;
	public static volatile SingularAttribute<Publicacion, Integer> idPublicacion;

}

