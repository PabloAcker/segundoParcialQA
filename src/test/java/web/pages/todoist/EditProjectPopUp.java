package web.pages.todoist;


import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Label;
import web.controls.TextBox;
public class EditProjectPopUp {
    public TextBox projectNameTextbox = new TextBox(By.xpath("//input[@name='name']"));

    public Button changeColorButton = new Button(By.xpath("//button[@class='color_dropdown_toggle form_field_control']"));
    public Button changeYellowColorButton = new Button(By.xpath("//li//span[text()='Amarillo']"));

    public Button submitNameButton = new Button(By.xpath("//button[@type='submit']"));

    public Button cancelButton = new Button(By.xpath("//button//span[text()='Cancelar']/.."));

    public Label verifyColorLabel;

    public Label addParameterVerifyColorLabel(String parameter) {
        verifyColorLabel = new Label(By.xpath("//button[@class='color_dropdown_toggle form_field_control']//span[text()='"+parameter+"']"));
        return verifyColorLabel;
    }
}
