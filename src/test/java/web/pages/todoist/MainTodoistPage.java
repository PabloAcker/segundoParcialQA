package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
public class MainTodoistPage {

    public Button loginButton = new Button(By.xpath("//li//a[contains(text(), 'Iniciar')]"));
    public Button registerButton = new Button(By.xpath("//a[text()='Reg\u00edstrate']"));
}
