package web.session;

import web.factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
public class Session {
    private static Session session = null;
    private WebDriver browser;

    private Session() {
        browser = FactoryBrowser.make("chrome").create();
    }

    public static Session getSession(){
        if(session == null) {
            session = new Session();
        }
        return session;
    }

    public void closeBrowser() {
        session = null;
        browser.quit();
    }

    public void goTo(String url) {
        browser.get(url);
    }

    public WebDriver getBrowser() {
        return browser;
    }
}
