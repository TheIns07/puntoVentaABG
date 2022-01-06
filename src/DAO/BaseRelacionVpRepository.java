/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arturo Cervantes 207003
 */
public abstract class BaseRelacionVpRepository<Rel_ProductosVentas> {

    public abstract void Crear(Rel_ProductosVentas entidad);

    public abstract void Actualizar(int id, Rel_ProductosVentas EntidadNueva);

    public abstract void Eliminar(int id);

    public abstract Rel_ProductosVentas consultarPorID(int ID);

    public abstract List<Rel_ProductosVentas> consultarTodos();

    public EntityManager createEntityManager() {
        EntityManagerFactory emFactory
                = Persistence.createEntityManagerFactory("abgPU");
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
}
