package infra.selenium;

public class SingletonSelenium {
    private static Selenium selenium = new Selenium();

    public Selenium getInstance() {
        return selenium;
    }
}
