package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
public class SettingsSection {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));
    public TextBox oldPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwOld']"));

    public TextBox newPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwNew']"));
    public Button accountButton = new Button(By.xpath("//a[@href='#settings_Account']"));

    public Button deleteAccountButton = new Button(By.xpath("//input[@name=\"DeleteAccountBtn\"]"));
}
