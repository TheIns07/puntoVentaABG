package Entidades;

import Entidades.Productos;
import Entidades.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Rel_ProductosVentas.class)
public class Rel_ProductosVentas_ { 

    public static volatile SingularAttribute<Rel_ProductosVentas, Float> precio;
    public static volatile SingularAttribute<Rel_ProductosVentas, Ventas> ventas;
    public static volatile SingularAttribute<Rel_ProductosVentas, Integer> id;
    public static volatile SingularAttribute<Rel_ProductosVentas, Integer> cantidad;
    public static volatile SingularAttribute<Rel_ProductosVentas, Float> montototal;
    public static volatile SingularAttribute<Rel_ProductosVentas, Productos> productos;

}