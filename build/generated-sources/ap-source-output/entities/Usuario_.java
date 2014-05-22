package entities;

import java.util.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> apellido;
	public static volatile SingularAttribute<Usuario, String> mail;
	public static volatile CollectionAttribute<Usuario, Voto> votoCollection;
	public static volatile CollectionAttribute<Usuario, Comentario> comentarioCollection1;
	public static volatile CollectionAttribute<Usuario, Evento> eventoCollection;
	public static volatile CollectionAttribute<Usuario, Sistema> sistemaCollection;
	public static volatile SingularAttribute<Usuario, String> avatar;
	public static volatile SingularAttribute<Usuario, Boolean> moderador;
	public static volatile CollectionAttribute<Usuario, Comentario> comentarioCollection;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile SingularAttribute<Usuario, String> legajo;
	public static volatile CollectionAttribute<Usuario, Publicacion> publicacionCollection1;
	public static volatile SingularAttribute<Usuario, String> clave;
	public static volatile CollectionAttribute<Usuario, Publicacion> publicacionCollection;
	public static volatile SingularAttribute<Usuario, String> dni;
	public static volatile SingularAttribute<Usuario, Date> fechaFinSancion;

}

