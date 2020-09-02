package pl.pszemek.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class EntityManagerProvider implements AutoCloseable{
    private static final EntityManagerProvider INSTANCE = new EntityManagerProvider();
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    private EntityManagerProvider(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa.hibernate");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static EntityManagerProvider getInstance(){
        return INSTANCE;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void close() throws NoResultException {
        entityManager.close();
        entityManagerFactory.close();
    }
}
