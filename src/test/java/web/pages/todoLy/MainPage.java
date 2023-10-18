package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
public class MainPage {
    //xpath main page
    public Button loginButton = new Button(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]"));
    public Button signUpButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
}
