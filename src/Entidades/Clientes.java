/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Arturo Cervantes 207003
 */
@Entity 
@Table(name = "cliente")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
   
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Ventas> ventas;

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }
    
    public void agregarVentas(Ventas r) {

        this.ventas.add(r);
    }

 
    public Clientes() {
         ventas = new ArrayList<>();
    }

    public Clientes( String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
       
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id +  ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono  + '}';
    }

    
    
}
