package entities;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Sancion.class)
public abstract class Sancion_ {

	public static volatile SingularAttribute<Sancion, Integer> puntos;
	public static volatile SingularAttribute<Sancion, String> motivo;
	public static volatile SingularAttribute<Sancion, Comentario> comentarioRelacionado;
	public static volatile SingularAttribute<Sancion, Integer> idSancion;
	public static volatile SingularAttribute<Sancion, Publicacion> publicacionRelacionada;
	public static volatile SingularAttribute<Sancion, Date> fechaInicio;
	public static volatile SingularAttribute<Sancion, Date> fechaFinSancion;

}

