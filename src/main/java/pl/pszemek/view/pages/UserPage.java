package pl.pszemek.view.pages;

public class UserPage implements Page{
    public static final UserPage USER_PAGE = new UserPage();
    @Override
    public void displayPage() {
        System.out.println("1 - Read recent posts");
        System.out.println("2 - Create post");
        System.out.println("3 - Logout");
    }
}
