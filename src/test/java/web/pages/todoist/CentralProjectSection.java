package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Label;
public class CentralProjectSection {
    public Button moreOptionsProjectButton = new Button(By.xpath("//button[@aria-label='Men\u00fa de opciones del proyecto']"));
    public Button editProjectButton = new Button(By.xpath("//div[text()='Editar proyecto']"));

    public Label checkUpdatedProjectName;

    public Label addParameterCheckUpdatedProjectName(String parameter) {
        checkUpdatedProjectName = new Label(By.xpath("//span[@class='simple_content' and text()='"+parameter+"']"));
        return checkUpdatedProjectName;
    }

    public Button deleteProjectButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));

    public Button confirmDeleteProjectButton = new Button(By.xpath("//button//span[text()='Eliminar']/.."));
}
