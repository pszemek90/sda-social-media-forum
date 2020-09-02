package pl.pszemek.controller;

import pl.pszemek.model.User;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class LoginValidator {
    public static boolean findUser(String login, String password) {

        EntityManagerProvider entityManagerProvider = EntityManagerProvider.getInstance();
        try {
            entityManagerProvider.getEntityManager().getTransaction().begin();
            TypedQuery<User> typedQuery = entityManagerProvider.getEntityManager().createQuery(
                    "SELECT u FROM User u WHERE u.username = :login", User.class);
            typedQuery.setParameter("login", login);
            User user = typedQuery.getSingleResult();
            entityManagerProvider.getEntityManager().getTransaction().commit();
            if (user.getUsername() != null) {
                return user.getPassword().equals(password);
            }
        } catch (NoResultException e) {
            System.err.println("Wrong username/password");
        }
        return false;
    }
}
