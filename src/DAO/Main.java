/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.*;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 207003
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fecha = new GregorianCalendar((Calendar.YEAR), (Calendar.MONTH), Calendar.DAY_OF_MONTH);
        

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("abgPU");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        
        RepositoryCliente Re1 = new RepositoryCliente();
        Clientes cl1 = new Clientes("Jesus Manuel Garcia Mora", "Villa Bonita",  "6622321256");
        Clientes cl2 = new Clientes("Julia Liliana Fierro", "Villa Bonita",  "3231535342");
        Clientes cl3 = new Clientes("Manuel Jusaino", "Alameda", "4234216534");
       

        RepositoryProductos RP1 = new RepositoryProductos();
        Productos pr1 = new Productos("Garrafon Domicilio", 15);
        Productos pr2 = new Productos("Garrafon Local", 15);
        Productos pr3 = new Productos("Botellas", 5);
        Productos pr4 = new Productos("Refilll Local", 5);
        
       
        
       

        entityManager.getTransaction().commit();

    }

}
