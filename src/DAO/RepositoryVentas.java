/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
/**
 *
 * @author 207003
 */
public class RepositoryVentas extends BaseClienteRepository<Ventas>{
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("abgPU");
    EntityManager entityManager = managerFactory.createEntityManager();
    
    @Override
    public void Crear(Ventas entidad) {
         if (entidad != null) {

            entityManager.getTransaction().begin();
            entityManager.persist(entidad);
            entityManager.getTransaction().commit();
            System.out.println("La categoria se guardo exitosamente");
        } else {
            System.out.println("No se pudo guardar la categoria ");
        }

    }

    @Override
    public void Actualizar(int id, Ventas EntidadNueva) {
        entityManager.getTransaction().begin();
   
       Ventas entidad = entityManager.find(Ventas.class, id);

        if (entidad != null) {
            entidad.setDescuento(EntidadNueva.getDescuento());
            entidad.setMontofinal(EntidadNueva.getMontofinal());
            entidad.setCliente(EntidadNueva.getCliente());
            entidad.setFecha(EntidadNueva.getFecha());
            entidad.setDetallesventas(EntidadNueva.getDetallesventas());
            entityManager.persist(entidad);

            System.out.println("Venta Editada!");
        } else {
            System.out.println("No se encontro la Venta");
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void Eliminar(int id) {
        entityManager.getTransaction().begin();
        Ventas e = new Ventas();
        e = entityManager.find(Ventas.class, id);

        if (e != null) {

            entityManager.remove(e);

            System.out.println("Venta Removida!");

        } else {
            System.out.println("No se encontro la Venta");
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Ventas consultarPorID(int ID) {
        entityManager.getTransaction().begin();
       Ventas e = new Ventas();
        e = entityManager.find(Ventas.class, ID);

        if (e != null) {
            System.out.println(e);
            return e;
        } else {
            System.out.println("No se encontro la Venta");
        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<Ventas> consultarTodos() {
        entityManager.getTransaction().begin();
         CriteriaQuery query = entityManager.getCriteriaBuilder().createQuery();
        query.select(query.from(Ventas.class));
        Query qu = entityManager.createQuery(query);

        List<Ventas> venta = qu.getResultList();

        return venta;
    }
    
}
