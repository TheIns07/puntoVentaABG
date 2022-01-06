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
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author 207003
 */
public class RepositoryCliente extends BaseClienteRepository<Clientes> {

    EntityManagerFactory em = Persistence.createEntityManagerFactory("abgPU");
    EntityManager entityManager = em.createEntityManager();
    CriteriaQuery query = em.getCriteriaBuilder().createQuery();

    @Override
    public void Crear(Clientes entidad) {
        if (entidad != null) {
         
                entityManager.getTransaction().begin();
                entityManager.persist(entidad);
                entityManager.getTransaction().commit();
                System.out.println("El cliente se guardo exitosamente");
            
        } else {
            System.out.println("No se pudo guardar la categoria ");
        }
    }

    @Override
    public void Actualizar(int id, Clientes EntidadNueva) {

        Clientes entidad = entityManager.find(Clientes.class, id);

        if (entidad != null && EntidadNueva != null) {
            
                entityManager.getTransaction().begin();

                entidad.setNombre(EntidadNueva.getNombre());
                entidad.setDireccion(EntidadNueva.getDireccion());
                entityManager.persist(entidad);

                System.out.println("Cliente Editado!");
            

        } else {
            System.out.println("No se encontro al Cliente");
        }
        entityManager.getTransaction().commit();

    }

    @Override
    public void Eliminar(int id) {
        entityManager.getTransaction().begin();
        Clientes e = entityManager.find(Clientes.class, id);

        if (e != null) {

            entityManager.remove(e);
            entityManager.getTransaction().commit();
            System.out.println("Cliente Removido");

        } else {
            System.out.println("Cliente no encontrado");
        }

    }

    @Override
    public Clientes consultarPorID(int ID) {
        entityManager.getTransaction().begin();
        Clientes e = new Clientes();
        e = entityManager.find(Clientes.class, ID);

        if (e != null) {
            System.out.println(e);
            return e;
        } else {
            System.out.println("No se encontro al Cliente");
        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<Clientes> consultarTodos() {
        CriteriaQuery query = entityManager.getCriteriaBuilder().createQuery();
        query.select(query.from(Clientes.class));
        Query qu = entityManager.createQuery(query);

        List<Clientes> cliente = qu.getResultList();

        return cliente;
    }
}
