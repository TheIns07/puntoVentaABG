/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.*;
import Entidades.Clientes;
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
public class RepositoryRelacionVP extends BaseClienteRepository<Rel_ProductosVentas> {

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("abgPU");
    EntityManager entityManager = managerFactory.createEntityManager();
    

    @Override
    public void Crear(Rel_ProductosVentas entidad) {
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
    public void Actualizar(int id, Rel_ProductosVentas EntidadNueva) {
    
       entityManager.getTransaction().begin();
        Rel_ProductosVentas entidad = entityManager.find(Rel_ProductosVentas.class, id);

        if (entidad != null && EntidadNueva != null) {
            entidad.setMontototal(EntidadNueva.getMontototal());
            entidad.setPrecio(EntidadNueva.getPrecio());
            entidad.setCantidad(EntidadNueva.getCantidad());
            entidad.setProductos(EntidadNueva.getProductos());
            entidad.setVentas(EntidadNueva.getVentas());
            entityManager.persist(entidad);

            System.out.println("Relacion Editada!");
        } else {
            System.out.println("No se encontro la Relacion");
        }
        entityManager.getTransaction().commit();

    }

    @Override
    public void Eliminar(int id) {
         entityManager.getTransaction().begin();
      Rel_ProductosVentas e = new Rel_ProductosVentas();
        e = entityManager.find(Rel_ProductosVentas.class, id);

        if (e != null) {

            entityManager.detach(e);

            System.out.println("Relacion Removida!");

        } else {
            System.out.println("No se encontro la Relacion");
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Rel_ProductosVentas consultarPorID(int ID) {
         entityManager.getTransaction().begin();
        Rel_ProductosVentas e = new Rel_ProductosVentas();
        e = entityManager.find(Rel_ProductosVentas.class, ID);

        if (e != null) {
            System.out.println(e);
            return e;
        } else {
            System.out.println("No se encontro la Relacion");
        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<Rel_ProductosVentas> consultarTodos() {
         entityManager.getTransaction().begin();
        CriteriaQuery query = entityManager.getCriteriaBuilder().createQuery();
        query.select(query.from(Rel_ProductosVentas.class));
        Query qu = entityManager.createQuery(query);

        List<Rel_ProductosVentas> relacion = qu.getResultList();
 
        return  relacion;
    }

}
