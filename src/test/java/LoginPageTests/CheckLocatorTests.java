package LoginPageTests;

import java.util.concurrent.TimeUnit;

import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;

public class CheckLocatorTests {
    WebDriver webDriver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openPage();
    }

    @Test
    public void checkPageLocatorsWhen_PASSWORD_CHAPTER_clicked() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.check_PASSWORD_CHAPTER_click();
        loginPage.check_KONTUR_HEADER_idEnabled();
        loginPage.check_DIADOC_HEADER_idEnabled();
        loginPage.check_PASSWORD_CHAPTER_isEnable();
        loginPage.check_CERTIFICATE_CHAPTER_isEnabled();
        loginPage.check_LINK_CHAPTER_idEnabled();
        loginPage.check_PHONE_CHAPTER_idEnabled();
        loginPage.check_EMAIL_LABEL_idEnabled();
        loginPage.check_PASSWORD_LABEL_idEnabled();
        loginPage.check_EMAIL_INPUT_FIELD_idEnabled();
        loginPage.check_PASSWORD_INPUT_FIELD_idEnabled();
        loginPage.check_REMEMBER_ME_CHECKBOX_idEnabled();
        loginPage.check_SHOW_PASSWORD_ICON_idEnabled();
        loginPage.check_I_FORGOT_PASSWORD_LINK_idEnabled();
        loginPage.check_ENTER_BUTTON_isEnabled();
        loginPage.check_SING_UP_GLOBAL_LINK_idEnabled();
        loginPage.check_SUPPORT_CENTER_BUTTON_ICON_idEnabled();
    }

    @Test
    public void checkPageLocatorsWhen_CERTIFICATE_CHAPTER_clicked() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.check_CERTIFICATE_CHAPTER_click();
        loginPage.check_KONTUR_HEADER_idEnabled();
        loginPage.check_DIADOC_HEADER_idEnabled();
        loginPage.check_PASSWORD_CHAPTER_isEnable();
        loginPage.check_CERTIFICATE_CHAPTER_isEnabled();
        loginPage.check_LINK_CHAPTER_idEnabled();
        loginPage.check_PHONE_CHAPTER_idEnabled();
        loginPage.check_HOW_TO_COPY_PRIVATE_KEY_CONTAINER_LINK_idEnabled();
        loginPage.check_CALL_TO_SERVICE_CENTER_LINK_idEnabled();
        loginPage.check_LOGIN_WITH_PASSWORD_LINK_idEnabled();
        loginPage.check_SING_UP_GLOBAL_LINK_idEnabled();
        loginPage.check_SUPPORT_CENTER_BUTTON_ICON_idEnabled();
    }

    @Test
    public void checkPageLocatorsWhen_LINK_CHAPTER_clicked(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.check_LINK_CHAPTER_click();
        loginPage.check_KONTUR_HEADER_idEnabled();
        loginPage.check_DIADOC_HEADER_idEnabled();
        loginPage.check_PASSWORD_CHAPTER_isEnable();
        loginPage.check_CERTIFICATE_CHAPTER_isEnabled();
        loginPage.check_LINK_CHAPTER_idEnabled();
        loginPage.check_PHONE_CHAPTER_idEnabled();
        loginPage.check_EMAIL_LABEL_idEnabled();
        loginPage.check_EMAIL_INPUT_FIELD_idEnabled();
        loginPage.check_REMEMBER_ME_CHECKBOX_idEnabled();
        loginPage.check_GET_ENTER_LINK_BUTTON_isEnabled();
        loginPage.check_SING_UP_GLOBAL_LINK_idEnabled();
        loginPage.check_SUPPORT_CENTER_BUTTON_ICON_idEnabled();
    }

    @Test
    public void checkPageLocatorsWhen_PHONE_CHAPTER_clicked() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.check_PHONE_CHAPTER_click();
        loginPage.check_KONTUR_HEADER_idEnabled();
        loginPage.check_DIADOC_HEADER_idEnabled();
        loginPage.check_PASSWORD_CHAPTER_isEnable();
        loginPage.check_CERTIFICATE_CHAPTER_isEnabled();
        loginPage.check_LINK_CHAPTER_idEnabled();
        loginPage.check_PHONE_CHAPTER_idEnabled();
        loginPage.check_PHONE_LABEL_isEnabled();
        loginPage.check_PHONE_NUMBER_INPUT_FIELD_isEnabled();
        loginPage.check_GET_ENTER_CODE_isEnabled();
        loginPage.check_REMEMBER_ME_CHECKBOX_idEnabled();
        loginPage.check_SING_UP_GLOBAL_LINK_idEnabled();
        loginPage.check_SUPPORT_CENTER_BUTTON_ICON_idEnabled();
    }

    @After
    public void close() {
        webDriver.quit();
    }


}
