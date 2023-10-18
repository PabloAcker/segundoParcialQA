package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Label;
import web.controls.TextBox;

public class CentralSection {
    public Button openSettingsButton = new Button(By.xpath("//a[text()='Settings']"));
    public Label projectNameLabel = new Label(By.id("CurrentProjectTitle"));
    public TextBox nameItemTextBox = new TextBox(By.id("NewItemContentInput"));
    public Button addButton = new Button(By.id("NewItemAddButton"));

    public TextBox nameUpdateTextBox = new TextBox(By.id("ItemEditTextbox"));

}
