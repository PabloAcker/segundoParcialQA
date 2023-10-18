package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Label;
import web.controls.TextBox;
public class ProjectSection {
    public Button addProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox projectNameTextBox = new TextBox(By.id("NewProjNameInput"));
    public Button projectNameButton = new Button(By.id("NewProjNameButton"));

    public Label projectLabel;

    public Button projectDropdownButton;
    public Button projectDropdownEditButton = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#edit']"));
    public TextBox projectEditNameTextbox = new TextBox(By.xpath("//td[@class='ProjItemContent UnderEditingItem']//div[@id='ProjectEditDiv']//input[@id='ItemEditTextbox']"));

    //public Label editedProjectLabel;

    public Button saveProjectNameButton = new Button(By.xpath("//td[@class='ProjItemContent UnderEditingItem']//div[@id='ProjectEditDiv']//img[@id='ItemEditSubmit']"));
    public Button projectDropdownDeleteButton = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#delete']"));

    public Button addNameToProjectDropdownButton(String nameProject) {
        projectDropdownButton = new Button(By.xpath("//ul[@id='mainProjectList']//li[last()]//td[text()='"+nameProject+"']/following-sibling::td//img[@src=\"/Images/dropdown.png\"]"));
        return projectDropdownButton;
    }

    public Label addNameToProjectLabel(String nameProject) {
        projectLabel = new Label(By.xpath("//ul[@id='mainProjectList']//li[last()]//td[text()='"+nameProject+"']"));
        return projectLabel;
    }
}
