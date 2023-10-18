package web.pages.todoist;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;
public class ChangePasswordSection {
    public TextBox oldPasswordTextBox = new TextBox(By.xpath("//form//input[@autocomplete='off']"));
    public TextBox newPasswordTextBox = new TextBox(By.xpath("//form//span[text()='Nueva contrase\u00f1a']//ancestor::span/following-sibling::div//input"));
    public TextBox repeatNewPasswordTextBox = new TextBox(By.xpath("//form//span[text()='Confirmar nueva contrase\u00f1a']//ancestor::span/following-sibling::div//input"));
    public Button changePasswordButton = new Button(By.xpath("//button[@type='submit']"));
}
