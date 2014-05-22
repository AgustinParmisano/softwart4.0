package entities;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Tag.class)
public abstract class Tag_ {

	public static volatile SingularAttribute<Tag, String> texto;
	public static volatile SingularAttribute<Tag, Integer> cantidad;
	public static volatile SingularAttribute<Tag, Integer> idTag;
	public static volatile CollectionAttribute<Tag, Publicacion> publicacionCollection;

}

