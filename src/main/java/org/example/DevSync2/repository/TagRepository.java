package org.example.DevSync2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.DevSync2.entity.Tag;
import org.example.DevSync2.entity.Task;

import java.util.List;

public class TagRepository {

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

    public List<Tag> findAll() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Tag> tags = em.createQuery("SELECT c FROM Task c ORDER BY c.id DESC", Tag.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return tags;
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
