package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
public class AddProjectPopUp {
    public TextBox projectNameTextbox = new TextBox(By.xpath("//input[@name='name']"));

    public Button submitNameButton = new Button(By.xpath("//button[@type='submit']"));

}
