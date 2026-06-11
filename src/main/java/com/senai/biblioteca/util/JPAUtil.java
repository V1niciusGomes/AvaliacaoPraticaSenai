package com.senai.biblioteca.util;
import javax.persistence.*;
public class JPAUtil {
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("bibliotecaPU");
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}