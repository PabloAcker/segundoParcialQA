package web.webTest.filaC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import web.session.Session;
import web.webTest.TestBaseTodoLy;

import java.util.Random;

public class Ejercicio4 extends TestBaseTodoLy {
    private static Random rand = new Random();
    static String user = "pablo"+rand.nextInt(10000)+"@pablo.com";

    @Test
    public void verifyCreateDeleteUser() throws InterruptedException {
        mainPage.signUpButton.click();
        signUpPage.fullNameTextbox.setText(user);
        signUpPage.emailTextbox.setText(user);
        signUpPage.passwordTextbox.setText("pablo123");
        signUpPage.acceptTermsButton.click();
        signUpPage.signUpButton.click();
        Assertions.assertTrue(centralSection.openSettingsButton.isControlDisplayed(), "ERROR! El usuario no se pudo crear.");

        menuSection.settingButton.click();
        Thread.sleep(2000);
        settingsSection.accountButton.click();
        Thread.sleep(1000);
        settingsSection.deleteAccountButton.click();
        Session.getSession().getBrowser().switchTo().alert().accept();
        Thread.sleep(3000);
        Assertions.assertTrue(mainPage.loginButton.isControlDisplayed(), "ERROR! el usuario no fue eliminado.");
    }
}
