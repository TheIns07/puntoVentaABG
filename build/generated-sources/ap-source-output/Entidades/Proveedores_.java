package Entidades;

import Entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, String> paginaweb;
    public static volatile SingularAttribute<Proveedores, String> direccion;
    public static volatile SingularAttribute<Proveedores, Integer> id;
    public static volatile SingularAttribute<Proveedores, String> telefono;
    public static volatile SingularAttribute<Proveedores, String> nombre;
    public static volatile ListAttribute<Proveedores, Productos> productos;
    public static volatile SingularAttribute<Proveedores, String> rfc;

}