package entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Voto.class)
public abstract class Voto_ {

	public static volatile SingularAttribute<Voto, Publicacion> publicacionVotada;
	public static volatile SingularAttribute<Voto, Usuario> usuarioVotante;
	public static volatile SingularAttribute<Voto, Integer> idVoto;

}

