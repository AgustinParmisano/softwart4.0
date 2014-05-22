package entities;

import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Comentario.class)
public abstract class Comentario_ {

	public static volatile SingularAttribute<Comentario, Publicacion> publicacionComentada;
	public static volatile CollectionAttribute<Comentario, Sancion> sancionCollection;
	public static volatile SingularAttribute<Comentario, String> titulo;
	public static volatile SingularAttribute<Comentario, Integer> idComentario;
	public static volatile SingularAttribute<Comentario, Date> fechaSubida;
	public static volatile SingularAttribute<Comentario, Usuario> usuario;
	public static volatile SingularAttribute<Comentario, Date> fechaBaja;
	public static volatile SingularAttribute<Comentario, String> contenido;
	public static volatile SingularAttribute<Comentario, Usuario> moderadoPor;

}

