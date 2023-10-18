package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class LeftSection {
    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox nameProjectTextBox = new TextBox(By.id("NewProjNameInput"));
    public Button addButton = new Button(By.id("NewProjNameButton"));
}
