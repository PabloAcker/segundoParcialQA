package web.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class TextBox extends ControlBase{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String text) {
        this.findControl();
        this.control.sendKeys(text);
    }

    public void clearSetText(String text) {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(text);
    }

    public void setTextEnter(String text) {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(text+ Keys.ENTER);
    }
}
