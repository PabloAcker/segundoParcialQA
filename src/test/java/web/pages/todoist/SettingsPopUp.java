package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class SettingsPopUp {
    public Button changePasswordButton = new Button(By.xpath("//a[@href='/app/settings/account/password']"));
    public Button exitSettingsButton = new Button(By.xpath("//button[contains(@aria-label, 'Cerrar config')]"));
    public Button accountSection = new Button(By.id(":r3j:"));
    public TextBox nameProfileButton = new TextBox(By.xpath("//input[@name='name']"));
    public Button actualizarButton = new Button(By.xpath("//button[@type='submit']"));
}
