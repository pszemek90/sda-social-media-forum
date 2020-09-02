package pl.pszemek.view.pages;

import pl.pszemek.controller.InputProvider;
import pl.pszemek.controller.PostDAO;
import pl.pszemek.controller.UserDAO;
import pl.pszemek.model.Post;
import pl.pszemek.model.User;

public class CreatePostPage implements Page{
    @Override
    public void displayPage() {
        System.out.println("Set post title: ");
        String title = InputProvider.getInstance().nextLine();
        System.out.println("Set post message: ");
        String message = InputProvider.getInstance().nextLine();
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read();
        PostDAO postDAO = new PostDAO();
        postDAO.create(new Post(title, message, user.getUsername()));
    }
}
