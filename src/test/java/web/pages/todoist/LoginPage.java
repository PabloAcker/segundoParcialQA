package web.pages.todoist;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;
public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'email')]"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'contrase')]"));
    public Button loginButton = new Button(By.xpath("//button[@data-gtm-id]"));
}
