package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
public class AddProjectPopUp {
    public TextBox projectNameTextbox = new TextBox(By.xpath("//input[@name='name']"));

    public Button changeColorButton = new Button(By.xpath("//button[@class='color_dropdown_toggle form_field_control']"));

    public Button selectBlueColor = new Button(By.xpath("//li//span[text()='Azul']"));

    public Button submitNameButton = new Button(By.xpath("//button[@type='submit']"));

}
