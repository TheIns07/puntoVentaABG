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
@Table(name = "rel_productosventas")
public class Rel_ProductosVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idrel_productosventas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "precio")
    private float precio;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "montototal")
    private float montototal;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Productos productos;

    @ManyToOne
    @JoinColumn(name = "idventa", nullable = false)
    private Ventas ventas;

    public Rel_ProductosVentas() {

    }

    public Rel_ProductosVentas(float precio, int cantidad, float montototal, Productos producto, Ventas venta) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.montototal = montototal;
        this.productos = producto;
        this.ventas = venta;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getMontototal() {
        return montototal;
    }

    public void setMontototal(float montototal) {
        this.montototal = montototal;
    }



    public int getId() {
        return id;
    }

    public Productos getProductos() {
        return productos;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
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
        if (!(object instanceof Rel_ProductosVentas)) {
            return false;
        }
        Rel_ProductosVentas other = (Rel_ProductosVentas) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rel_ProductosVentas{" + "id=" + id + ", precio=" + precio + ", cantidad=" + cantidad + ", montototal=" + montototal + ", producto=" + productos + ", venta=" + ventas + '}';
    }

}
