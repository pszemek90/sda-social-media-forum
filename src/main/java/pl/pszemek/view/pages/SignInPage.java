package pl.pszemek.view.pages;

import pl.pszemek.controller.InputProvider;
import pl.pszemek.controller.UserDAO;
import pl.pszemek.model.User;
import pl.pszemek.view.Viewer;

public class SignInPage implements Page{
    public static final SignInPage SIGN_IN_PAGE = new SignInPage();

    @Override
    public void displayPage() {
        System.out.print("Login: ");
        String login = InputProvider.getInstance().nextLine();
        System.out.print("Password: ");
        String password = InputProvider.getInstance().nextLine();
        UserDAO userDAO = new UserDAO();
        userDAO.create(new User(login, password));
        Viewer.viewPage(IndexPage.INDEX_PAGE);
    }
}
