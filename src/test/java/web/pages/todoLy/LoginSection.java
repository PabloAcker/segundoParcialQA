package web.pages.todoLy;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;
public class LoginSection {
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}
