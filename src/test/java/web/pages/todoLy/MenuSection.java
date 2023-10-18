package web.pages.todoLy;

import web.controls.Button;
import org.openqa.selenium.By;
public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
    public Button settingButton = new Button(By.xpath("//a[text()='Settings']"));
}
