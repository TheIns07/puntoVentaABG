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
public abstract class BaseClienteRepository <Clientes> {
    
    public abstract void Crear(Clientes entidad);

    public abstract void Actualizar(int id, Clientes EntidadNueva);

    public abstract void Eliminar(int id);

    public abstract Clientes consultarPorID(int ID);

    public abstract List<Clientes> consultarTodos();

    public EntityManager createEntityManager() {
        EntityManagerFactory emFactory
                = Persistence.createEntityManagerFactory("abgPU");
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
}
