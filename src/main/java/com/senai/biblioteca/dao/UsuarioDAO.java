package com.senai.biblioteca.dao;
import javax.persistence.*;
import com.senai.biblioteca.model.Usuario;
import java.util.List;

public class UsuarioDAO {
    private EntityManager em;
    public UsuarioDAO(EntityManager em){ this.em = em; }

    public void salvar(Usuario u){
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

    public List<Usuario> listar(){
        return em.createQuery("from Usuario", Usuario.class).getResultList();
    }
}