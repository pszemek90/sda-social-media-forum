package pl.pszemek.controller;

import pl.pszemek.model.User;

import javax.persistence.PersistenceException;

public class UserDAO {
    public void create(User user){
        EntityManagerProvider entityManagerProvider = EntityManagerProvider.getInstance();
        try{
            entityManagerProvider.getEntityManager().getTransaction().begin();
            entityManagerProvider.getEntityManager().persist(user);
            entityManagerProvider.getEntityManager().getTransaction().commit();
            System.out.println("User successfully added!");
        }catch (PersistenceException e){
            System.err.println("User already exists!");
        }

    }

    public User read(String login){
        EntityManagerProvider entityManagerProvider = EntityManagerProvider.getInstance();
        try{
            entityManagerProvider.getEntityManager().getTransaction().begin();

        }
        return new User();
    }

    public int update(){
        return 0;
    }

    public void delete(){

    }
}
