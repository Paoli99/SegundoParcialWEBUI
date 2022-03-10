package pagesTodoLy;
import control.Image;
import org.openqa.selenium.By;

public class MainPage {
    public Image loginImage = new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Image singUpImage = new Image(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img"));
}
