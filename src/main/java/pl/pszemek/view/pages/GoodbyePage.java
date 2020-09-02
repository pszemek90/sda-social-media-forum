package pl.pszemek.view.pages;

import pl.pszemek.controller.EntityManagerProvider;

public class GoodbyePage implements Page{
    public static final GoodbyePage GOODBYE_PAGE = new GoodbyePage();


    @Override
    public void displayPage() {
        System.out.println("Goodbye");
        EntityManagerProvider.getInstance().close();
    }
}
