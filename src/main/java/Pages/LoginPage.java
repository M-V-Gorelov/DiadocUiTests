package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final String URL = "https://auth.kontur.ru/?customize=diadoc&back=https%3A%2F%2Fdiadoc.kontur.ru%2F";

    // Локаторы, видимые при выбранном способе авторизации "Пароль":
    private final By EMAIL_INPUT_FIELD = By.xpath(".//div[@class='App__fieldWrap2_2LZ7']//input");
    private final By PASSWORD_INPUT_FIELD = By.xpath(".//div[@class='react-ui-1swi574 App__grayScale_1d_t']//input");
    private final By I_FORGOT_PASSWORD_LINK = By.cssSelector("[data-tid='l-forgot-password']");
    private final By PASSWORD_LABEL = By.linkText("Пароль");
    private final By SHOW_PASSWORD_ICON = By.cssSelector("[data-tid='PasswordInputEyeIcon']");

    // Локаторы, видимые только при выбранном способе авторизации "Сертификат":
    private final By HOW_TO_COPY_PRIVATE_KEY_CONTAINER_LINK = By.xpath(".//div[2]/div/div/a");
    private final By CALL_TO_SERVICE_CENTER_LINK = By.linkText("обратитесь в техподдержку");
    private final By LOGIN_WITH_PASSWORD_LINK = By.xpath(".//div[2]/a");

    // Локаторы, видимые только при выбранном способе авторизации "Ссылка":
    private final By GET_ENTER_LINK_BUTTON = By.xpath(".//button[@class='react-ui-e5ttph']");

    // Локаторы, видимые только при выбранном способе авторизации "Телефон":
    private final By PHONE_NUMBER_INPUT_FIELD = By.xpath(".//input");
    private final By GET_ENTER_CODE = By.xpath(".//button[@class='react-ui-e5ttph']");
    private final By PHONE_LABEL = By.linkText("Телефон");

    // Общие локаторы страницы:
    private final By DIADOC_HEADER = By.xpath(".//header/div[@class='Header__caption_x3Tq Header__captionMargin_238W']"); // Получить текст заголовка и сравнить с "Вход в Диадок"
    private final By ENTER_BUTTON = By.cssSelector("[data-tid='Button__root']");
    private final By CERTIFICATE_CHAPTER = By.linkText("Сертификат");
    private final By PASSWORD_CHAPTER = By.linkText("Пароль");
    private final By LINK_CHAPTER = By.linkText("Ссылка");
    private final By PHONE_CHAPTER = By.linkText("Телефон");
    private final By KONTUR_HEADER = By.cssSelector("[href='/']" );
    private final By SING_UP_GLOBAL_LINK = By.cssSelector("[data-tid='l-registration-global']");
    private final By SUPPORT_CENTER_BUTTON_ICON = By.cssSelector("[data-tid='SupportCenter-buttonIconQuestion']");
    private final By EMAIL_LABEL = By.className("App__fieldLabel_1Aly");
    private final By REMEMBER_ME_CHECKBOX = By.xpath(".//span[@class='react-ui-1s41f47']");




    public void openPage() {
        webDriver.get(URL);
    }
    public void check_PASSWORD_CHAPTER_isEnable() {
        webDriver.findElement(PASSWORD_CHAPTER).isEnabled();
    }

    public void check_PASSWORD_CHAPTER_click() {
        webDriver.findElement(PASSWORD_CHAPTER).click();
    }
    public void check_CERTIFICATE_CHAPTER_isEnabled() {
        webDriver.findElement(CERTIFICATE_CHAPTER).isEnabled();
    }
    public void check_CERTIFICATE_CHAPTER_click() {
        webDriver.findElement(CERTIFICATE_CHAPTER).click();
    }
    public void check_ENTER_BUTTON_isEnabled() {
        webDriver.findElement(ENTER_BUTTON).isEnabled();
    }

    public void check_PASSWORD_INPUT_FIELD_idEnabled() {
        webDriver.findElement(PASSWORD_INPUT_FIELD).isEnabled();
    }

    public void check_REMEMBER_ME_CHECKBOX_idEnabled() {
        webDriver.findElement(REMEMBER_ME_CHECKBOX).isEnabled();
    }

    public void check_EMAIL_INPUT_FIELD_idEnabled() {
        webDriver.findElement(EMAIL_INPUT_FIELD).isEnabled();
    }

    public void check_DIADOC_HEADER_idEnabled() {
        webDriver.findElement(DIADOC_HEADER).isEnabled();
    }

    public void check_LINK_CHAPTER_idEnabled() {
        webDriver.findElement(LINK_CHAPTER).isEnabled();
    }

    public void check_PHONE_CHAPTER_idEnabled() {
        webDriver.findElement(PHONE_CHAPTER).isEnabled();
    }

    public void check_KONTUR_HEADER_idEnabled() {
        webDriver.findElement(KONTUR_HEADER).isEnabled();
    }

    public void check_I_FORGOT_PASSWORD_LINK_idEnabled() {
        webDriver.findElement(I_FORGOT_PASSWORD_LINK).isEnabled();
    }

    public void check_SING_UP_GLOBAL_LINK_idEnabled() {
        webDriver.findElement(SING_UP_GLOBAL_LINK).isEnabled();
    }

    public void check_SUPPORT_CENTER_BUTTON_ICON_idEnabled() {
        webDriver.findElement(SUPPORT_CENTER_BUTTON_ICON).isEnabled();
    }

    public void check_HOW_TO_COPY_PRIVATE_KEY_CONTAINER_LINK_idEnabled() {
        webDriver.findElement(HOW_TO_COPY_PRIVATE_KEY_CONTAINER_LINK).isEnabled();
    }

    public void check_CALL_TO_SERVICE_CENTER_LINK_idEnabled() {
        webDriver.findElement(CALL_TO_SERVICE_CENTER_LINK).isEnabled();
    }

    public void check_LOGIN_WITH_PASSWORD_LINK_idEnabled() {
        webDriver.findElement(LOGIN_WITH_PASSWORD_LINK).isEnabled();
    }

    public void check_EMAIL_LABEL_idEnabled() {
        webDriver.findElement(EMAIL_LABEL).isEnabled();
    }

    public void check_PASSWORD_LABEL_idEnabled() {
        webDriver.findElement(PASSWORD_LABEL).isEnabled();
    }

    public void check_SHOW_PASSWORD_ICON_idEnabled() {
        webDriver.findElement(SHOW_PASSWORD_ICON).isEnabled();
    }

    public void check_LINK_CHAPTER_click() {
        webDriver.findElement(LINK_CHAPTER).click();
    }
    public void check_GET_ENTER_LINK_BUTTON_isEnabled() {
        webDriver.findElement(GET_ENTER_LINK_BUTTON).isEnabled();
    }
    public void check_PHONE_NUMBER_INPUT_FIELD_isEnabled() {
        webDriver.findElement(PHONE_NUMBER_INPUT_FIELD).isEnabled();
    }
    public void check_GET_ENTER_CODE_isEnabled() {
        webDriver.findElement(GET_ENTER_CODE).isEnabled();
    }
    public void check_PHONE_LABEL_isEnabled() {
        webDriver.findElement(PHONE_LABEL).isEnabled();
    }
    public void check_PHONE_CHAPTER_click() {
        webDriver.findElement(PHONE_CHAPTER).click();
    }
}
