package org.example.DevSync2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.DevSync2.entity.Task;
import org.example.DevSync2.entity.Token;

import java.util.List;

public class TokenRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");


    public boolean save(Task task) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(task);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean update(Task task) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(task);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean delete(Task task) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(task);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public List<Token> findAll() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Token> tokens = em.createQuery("SELECT c FROM Token c ORDER BY c.id DESC", Token.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return tokens;
    }

    public Task findById(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Task task = em.find(Task.class, id);
        em.getTransaction().commit();
        em.close();
        return task;
    }

}
