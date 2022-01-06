package Entidades;

import Entidades.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, String> telefono1;
    public static volatile ListAttribute<Clientes, Ventas> ventas;
    public static volatile SingularAttribute<Clientes, String> telefono2;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> rfc;

}