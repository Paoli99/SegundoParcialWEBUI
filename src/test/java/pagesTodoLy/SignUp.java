package pagesTodoLy;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUp {
    public TextBox fullNameTxtBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]"));
    public TextBox emailTxtBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]"));
    public Button tofBtn = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpBtn = new Button(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]"));
}
