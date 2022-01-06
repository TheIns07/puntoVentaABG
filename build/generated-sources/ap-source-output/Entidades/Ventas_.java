package Entidades;

import Entidades.Clientes;
import Entidades.Rel_ProductosVentas;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:16:48")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Calendar> fecha;
    public static volatile SingularAttribute<Ventas, Float> montofinal;
    public static volatile SingularAttribute<Ventas, Clientes> cliente;
    public static volatile ListAttribute<Ventas, Rel_ProductosVentas> detallesventas;
    public static volatile SingularAttribute<Ventas, Float> descuento;
    public static volatile SingularAttribute<Ventas, Integer> id;

}