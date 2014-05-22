package entities;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Evento.class)
public abstract class Evento_ {

	public static volatile SingularAttribute<Evento, Date> fechaSubido;
	public static volatile SingularAttribute<Evento, String> titulo;
	public static volatile SingularAttribute<Evento, Integer> idEvento;
	public static volatile SingularAttribute<Evento, Usuario> usuarioCreador;
	public static volatile SingularAttribute<Evento, String> contenido;
	public static volatile SingularAttribute<Evento, String> descripcion;
	public static volatile SingularAttribute<Evento, Date> fechaFin;
	public static volatile SingularAttribute<Evento, Publicacion> publicacionRelacionada;
	public static volatile SingularAttribute<Evento, Date> fechaInicio;

}

