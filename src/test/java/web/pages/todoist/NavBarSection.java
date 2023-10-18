package web.pages.todoist;

import web.controls.Button;
import org.openqa.selenium.By;
public class NavBarSection {
    public Button openInfoButton = new Button(By.xpath("//img[@class='eFZ7q9V topBar _2a3b75a1 uoyuB7c e_yzyYk']"));
    public Button openSettingsButton = new Button(By.xpath("//span[contains(text(), 'Config')]"));

    public Button logoutButton = new Button(By.xpath("//span[contains(text(), 'Cerrar')]"));
}
