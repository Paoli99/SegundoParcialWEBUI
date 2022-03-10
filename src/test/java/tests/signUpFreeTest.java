package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoLy.MainPage;
import pagesTodoLy.MenuSection;
import pagesTodoLy.SignUp;

public class signUpFreeTest extends BaseTodoLy{
    MainPage mainPage = new MainPage();
    SignUp signUp = new SignUp();
    MenuSection menuSection = new MenuSection();
    String email = "paola3_api@api.com";
    @Test
    public void verifySignUpFreeTodoLy() throws InterruptedException{
        mainPage.singUpImage.click();
        Thread.sleep(1000);

        //sign up
        signUp.fullNameTxtBox.setText("Paola Vilaseca");
        signUp.emailTxtBox.setText(email);
        signUp.pwdTxtBox.setText("12345");
        signUp.tofBtn.click();
        signUp.signUpBtn.click();

        Thread.sleep(2000);

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR no se pudo inciar sesion");

    }

}


