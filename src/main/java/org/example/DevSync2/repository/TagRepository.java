package org.example.DevSync2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.DevSync2.entity.Tag;

import java.util.List;

public class TagRepository {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");


    public boolean save(Tag tag) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tag);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean update(Tag tag) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(tag);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean delete(Tag tag) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(tag);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public List<Tag> findAll() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Tag> tags = em.createQuery("SELECT c FROM Tag c ORDER BY c.id DESC", Tag.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return tags;
    }

    public Tag findById(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Tag tag = em.find(Tag.class, id);
        em.getTransaction().commit();
        em.close();
        return tag;
    }

}
