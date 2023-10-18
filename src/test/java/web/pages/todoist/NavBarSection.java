package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Task;
import web.controls.TextBox;

public class NavBarSection {
    //xpath barra de navegacion section
    public Button openInfoButton = new Button(By.xpath("//img[@class='eFZ7q9V topBar _2a3b75a1 uoyuB7c e_yzyYk']"));
    //public Button openInfoButton = new Button(By.id(":r0:"));
    public Button openSettingsButton = new Button(By.xpath("//span[contains(text(), 'Config')]"));
    public Button logoutButton = new Button(By.xpath("//span[contains(text(), 'Cerrar')]"));
    public Button addTask = new Button(By.xpath("//li/button[@class]"));
    public TextBox taskName = new TextBox(By.xpath("//p[@data-placeholder='Nombre de la tarea']"));
    public Button buttonOk = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));
    public Button buttonCancel = new Button(By.xpath("//button[@aria-label='Cancelar']"));

}
