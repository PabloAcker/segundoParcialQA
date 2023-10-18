package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class ProfileDialog {
    public TextBox fullNameTextBox = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));
}
