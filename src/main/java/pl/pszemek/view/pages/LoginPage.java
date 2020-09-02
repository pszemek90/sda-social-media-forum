package pl.pszemek.view.pages;

import pl.pszemek.controller.InputProvider;
import pl.pszemek.controller.LoginValidator;
import pl.pszemek.view.Viewer;

public class LoginPage implements Page {
    public static final LoginPage LOGIN_PAGE = new LoginPage();

    @Override
    public void displayPage() {

        System.out.print("Login: ");
        String login = InputProvider.getInstance().nextLine();
        System.out.print("Password: ");
        String password = InputProvider.getInstance().nextLine();
        if (LoginValidator.findUser(login, password)) {

            PostViewPage postViewPage = PostViewPage.retrievePage(login);
            Viewer.viewPage(postViewPage);
        } else {
            Viewer.viewPage(IndexPage.INDEX_PAGE);
        }
    }
}
