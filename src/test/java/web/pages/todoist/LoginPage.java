package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'email')]"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'contrase')]"));
    public TextBox nameTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, 'Por ej. Juan P\u00e9rez')]"));
    public Button loginButton = new Button(By.xpath("//button[@data-gtm-id]"));
    public Button continueButton = new Button(By.xpath("//button[@type='submit']"));
    public Button openTodoIstButton = new Button(By.xpath("//button[@aria-label='Abrir Todoist']"));
    public Button personalButton = new Button(By.xpath("(//button[@type='button'])[1]"));

}
