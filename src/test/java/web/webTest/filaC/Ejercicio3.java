package web.webTest.filaC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import web.webTest.TestBaseTodoist;

import java.util.Random;

public class Ejercicio3 extends TestBaseTodoist {
    private static Random rand = new Random();

    @Test
    public void verifyUpdateNameAccount() throws InterruptedException {
        String nameUser = "Pablo"+rand.nextInt(10000)+"Nuevo";
        mainTodoistPage.loginButton.click();
        loginPage.emailTextBox.setText("pablo@pablo.com");
        loginPage.passwordTextBox.setText("P4bl0123");
        loginPage.loginButton.click();

        navBarSection.openInfoButton.click();
        navBarSection.openSettingsButton.click();
        settingsPopUp.nameProfileButton.click();
        settingsPopUp.nameProfileButton.clearSetText(nameUser);
        settingsPopUp.actualizarButton.click();
        settingsPopUp.exitSettingsButton.click();
        Thread.sleep(3000);

        navBarSection.openInfoButton.click();
        navBarSection.openSettingsButton.click();
        settingsPopUp.nameProfileButton.click();
        Assertions.assertEquals(settingsPopUp.nameProfileButton.getTextByAttribute("defaultValue"), nameUser, "ERROR! el usuario no se pudo actualizar.");
        Thread.sleep(5000);
    }
}
