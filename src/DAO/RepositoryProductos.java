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
import javax.swing.JOptionPane;

/**
 *
 * @author 207003
 */
public class RepositoryProductos extends BaseClienteRepository<Productos> {
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("abgPU");
    EntityManager entityManager = managerFactory.createEntityManager();
    
    @Override
    public void Crear(Productos entidad) {
        try{
         if (entidad != null) {

            entityManager.getTransaction().begin();
            entityManager.persist(entidad);
            entityManager.getTransaction().commit();
            System.out.println("La categoria se guardo exitosamente");
        } else {
            System.out.println("No se pudo guardar la categoria ");
        }
        }catch(IllegalStateException ex){
        JOptionPane.showMessageDialog(null, "El producto no se pudo agregar.");
        }
    }

    @Override
    public void Actualizar(int id, Productos EntidadNueva) {
        Productos producto = entityManager.find(Productos.class, id);
        if (EntidadNueva != null || producto != null) {

            entityManager.getTransaction().begin();
            producto.setNombre(EntidadNueva.getNombre());
            producto.setPrecioactual(EntidadNueva.getPrecioactual());

            entityManager.getTransaction().commit(); 
          
   
        }
        
  
    }

    @Override
    public void Eliminar(int id) {
       entityManager.getTransaction().begin();
        Productos e = new Productos();
        e = entityManager.find(Productos.class, id);

        if (e != null) {

            entityManager.remove(e);

            System.out.println("Venta Removida!");

        } else {
            System.out.println("No se encontro la Venta");
        }
        entityManager.getTransaction().commit();
      
    }

    @Override
    public Productos consultarPorID(int ID) {
       entityManager.getTransaction().begin();
       Productos e = new Productos();
        e = entityManager.find(Productos.class, ID);

        if (e != null) {
            System.out.println(e);
            return e;
        } else {
            System.out.println("No se encontro al Producto");
        }
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public List<Productos> consultarTodos() {
         CriteriaQuery query = entityManager.getCriteriaBuilder().createQuery();
        List<Productos> productos = null;
        try {
        entityManager.getTransaction().begin();

        query.select(query.from(Productos.class));
        Query q = entityManager.createQuery(query);

        productos = q.getResultList();

        entityManager.getTransaction().commit();    
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        return productos;
    }
    

    
   

}
