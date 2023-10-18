package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
    public Button settingButton = new Button(By.xpath("//a[text()='Settings']"));
}
