package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoLy.LoginModal;
import pagesTodoLy.MainPage;
import pagesTodoLy.MenuSection;

public class logOutTest extends  BaseTodoLy{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();

    @Test
    public void verifyLogOutTodoLy() throws  InterruptedException{
        //login
        mainPage.loginImage.click();

        loginModal.emailTxtBox.setText("paola_api@api.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR no se pudo inciar sesion");

        //logout
        menuSection.logoutButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(mainPage.loginImage.isControlDisplayed(),"ERROR no se pudo cerrar sesion");

    }
}
