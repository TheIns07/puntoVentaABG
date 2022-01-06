package Entidades;

import Entidades.Categorias;
import Entidades.Proveedores;
import Entidades.Rel_ProductosVentas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Proveedores> proveedores;
    public static volatile SingularAttribute<Productos, Categorias> categoria;
    public static volatile ListAttribute<Productos, Rel_ProductosVentas> detalleventa;
    public static volatile SingularAttribute<Productos, Integer> id;
    public static volatile SingularAttribute<Productos, Float> precioactual;
    public static volatile SingularAttribute<Productos, Integer> stock;
    public static volatile SingularAttribute<Productos, String> nombre;

}