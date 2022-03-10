package pagesTodoLy;

import control.Button;
import org.openqa.selenium.By;


public class MenuSection {

    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));

    public Button settingsButton = new Button(By.xpath("//html/body/form/div[3]/table/tbody/tr[1]/td/div[1]/div/div/div/a[1]"));

}