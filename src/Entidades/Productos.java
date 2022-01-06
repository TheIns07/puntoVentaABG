/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Arturo Cervantes 207003
 */
@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "precioactual")
    private float precioactual;

    @OneToMany(mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Rel_ProductosVentas> detalleventa;
    
    
    public Productos() {
        detalleventa = new ArrayList<>();
    }
    
    public void agregarVentas(Rel_ProductosVentas registro) {

        detalleventa.add(registro);

    }

    public Productos(String nombre, float precioactual) {
 
        this.nombre = nombre;
        this.precioactual = precioactual;
        detalleventa = new ArrayList<>();
    }

    public List<Rel_ProductosVentas> getDetalleventa() {
        return detalleventa;
    }

    public void setDetalleventa(List<Rel_ProductosVentas> detalleventa) {
        this.detalleventa = detalleventa;
    }
    
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioactual() {
        return precioactual;
    }

    public void setPrecioactual(float precioactual) {
        this.precioactual = precioactual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    
 @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", nombre=" + nombre + ", precioactual=" + precioactual  + '}';
    }

    

   
    
}
