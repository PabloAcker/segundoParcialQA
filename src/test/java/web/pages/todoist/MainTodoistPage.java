package web.pages.todoist;

import web.controls.Button;
import org.openqa.selenium.By;
public class MainTodoistPage {
    public Button loginButton = new Button(By.xpath("//li//a[contains(text(), 'Iniciar')]"));
}
