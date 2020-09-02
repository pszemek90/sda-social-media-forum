package pl.pszemek.view.pages;

import pl.pszemek.controller.InputProvider;
import pl.pszemek.model.User;
import pl.pszemek.view.Viewer;

public class IndexPage implements Page{
    public static final IndexPage INDEX_PAGE = new IndexPage();
    @Override
    public void displayPage() {
        System.out.println("Welcome to social media forum!");
        System.out.println("0 - Sign in");
        System.out.println("1 - Log in");
        System.out.println("2 - Quit");
        Integer option = Integer.parseInt(InputProvider.getInstance().nextLine());
        switchOptions(option);
    }

    private void switchOptions(Integer option) {
        switch (option){
            case 0:
                Viewer.viewPage(SignInPage.SIGN_IN_PAGE);
                break;
            case 1:
                Viewer.viewPage(LoginPage.LOGIN_PAGE);
                break;
            case 2:
                Viewer.viewPage(GoodbyePage.GOODBYE_PAGE);
                break;
            default:
                System.out.println("Wrong option!");
        }
    }
}
