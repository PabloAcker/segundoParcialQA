package web.controls;

import org.openqa.selenium.By;

public class Task extends ControlBase{
    private String name;

    public Task(By locator) {
        super(locator);
    }
}
