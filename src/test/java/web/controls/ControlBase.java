package web.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import web.session.Session;
public class ControlBase {
    protected By locator;
    protected WebElement control;

    public ControlBase(By locator) {
        this.locator = locator;
    }

    protected void findControl() {
        this.control = Session.getSession().getBrowser().findElement(locator);
    }

    public void click() {
        this.findControl();
        this.control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch(Exception e) {
            return false;
        }

    }

    public void hover() {
        this.findControl();
        Actions actions = new Actions(Session.getSession().getBrowser());
        actions.moveToElement(this.control).perform();
    }

    public String getTextValue() {
        this.findControl();
        return this.control.getText();
    }

    public String getTextByAttribute(String attr) {
        this.findControl();
        return this.control.getAttribute(attr);
    }
}
