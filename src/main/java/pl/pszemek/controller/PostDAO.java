package pl.pszemek.controller;

import pl.pszemek.model.Post;

import javax.persistence.PersistenceException;

public class PostDAO {
    public void create(Post post){
        EntityManagerProvider entityManagerProvider = EntityManagerProvider.getInstance();
        try{
            entityManagerProvider.getEntityManager().getTransaction().begin();
            entityManagerProvider.getEntityManager().persist(post);
            entityManagerProvider.getEntityManager().getTransaction().commit();
            System.out.println("Post successfully added");
        }catch (Exception e){
            System.err.println("Something went terribly wrong!");
        }
    }

    public Post read(){
        return new Post();
    }

    public int update(){
        return 0;
    }

    public void delete(){

    }
}
