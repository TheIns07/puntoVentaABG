/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Arturo Cervantes 207003
 */
@Entity
@Table(name = "ventas")
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "descuento")
    private float descuento;

    @Column(name = "montofinal")
    private float montofinal;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Clientes cliente;

    @OneToMany(mappedBy = "ventas", cascade = CascadeType.ALL)
    private List<Rel_ProductosVentas> detallesventas;

    public Ventas() {
        detallesventas = new ArrayList<>();
    }

    public Ventas(Date fecha, float descuento, float montofinal, Clientes cliente) {
        this.fecha = fecha;
        this.descuento = descuento;
        this.montofinal = montofinal;
        this.cliente = cliente;
        detallesventas = new ArrayList<>();
    }

    public void agregarVentas(Rel_ProductosVentas registro) {

        detallesventas.add(registro);

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getMontofinal() {
        return montofinal;
    }

    public void setMontofinal(float montofinal) {
        this.montofinal = montofinal;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Rel_ProductosVentas> getDetallesventas() {
        return detallesventas;
    }

    public void setDetallesventas(List<Rel_ProductosVentas> detallesventas) {
        this.detallesventas = detallesventas;
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
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ventas{" + "id=" + id + ", fecha=" + fecha + ", descuento=" + descuento + ", montofinal=" + montofinal + ", cliente=" + cliente + ", detallesventas=" + detallesventas + '}';
    }

}
