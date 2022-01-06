package Entidades;

import Entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, String> descripcion;
    public static volatile SingularAttribute<Categorias, Integer> id;
    public static volatile SingularAttribute<Categorias, String> nombre;
    public static volatile ListAttribute<Categorias, Productos> productos;

}