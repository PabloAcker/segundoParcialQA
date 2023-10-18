package web.webTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import web.pages.todoist.*;
import web.session.Session;
public class TestBaseTodoist {

    protected MainTodoistPage mainTodoistPage = new MainTodoistPage();
    protected LoginPage loginPage = new LoginPage();


    protected AddProjectPopUp addProjectPopUp = new AddProjectPopUp();

    protected LateralProjectSection lateralProjectSection = new LateralProjectSection();

    protected CentralProjectSection centralProjectSection = new CentralProjectSection();

    protected EditProjectPopUp editProjectPopUp = new EditProjectPopUp();
    protected NavBarSection navBarSection = new NavBarSection();

    protected SettingsPopUp settingsPopUp = new SettingsPopUp();

    protected ChangePasswordSection changePasswordSection = new ChangePasswordSection();



    @BeforeEach
    public void openBroswer() {
        Session.getSession().goTo("https://todoist.com/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getSession().closeBrowser();

    }
}
