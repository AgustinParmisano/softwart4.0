package entities;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Sistema.class)
public abstract class Sistema_ {

	public static volatile SingularAttribute<Sistema, String> tituloDelSitio;
	public static volatile SingularAttribute<Sistema, String> tagsDelSitio;
	public static volatile SingularAttribute<Sistema, String> descripcionDelSitio;
	public static volatile SingularAttribute<Sistema, Usuario> usuarioModificacion;
	public static volatile SingularAttribute<Sistema, String> urisSemanticas;
	public static volatile SingularAttribute<Sistema, Integer> idSistema;
	public static volatile SingularAttribute<Sistema, Integer> puntosParaSancionar;
	public static volatile SingularAttribute<Sistema, Integer> tiempoDeSancion;
	public static volatile SingularAttribute<Sistema, String> estilo;
	public static volatile SingularAttribute<Sistema, Date> fechaModificacion;
	public static volatile SingularAttribute<Sistema, Boolean> moderarPublicaciones;
	public static volatile SingularAttribute<Sistema, Boolean> hablitado;
	public static volatile SingularAttribute<Sistema, String> banner;

}

