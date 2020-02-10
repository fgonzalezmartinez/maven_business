package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "email")
    WebElement usernameLbl;

    @FindBy(how = How.ID, using = "passwd")
    WebElement passwordLbl;

    @FindBy(how = How.NAME, using = "SubmitLogin")
    WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group form-ok']")
    WebElement checkmark;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    WebElement pageAssertion;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger']/p")
    WebElement errorMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group form-error']")
    WebElement redCross;

    @FindBy(how= How.XPATH, using = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
    WebElement womenMenu;


    public void enter_user(String username){
        usernameLbl.sendKeys(username);
    }

    public void enter_password(String password){
        passwordLbl.sendKeys(password);
    }

    public void click_login(){
        buttonLogin.click();
    }

    public void is_checkmark(){
        Assert.assertTrue(checkmark.isDisplayed());
    }

    public void verify_head(){
        Assert.assertEquals(pageAssertion.getText(),"MY ACCOUNT");
    }

    public void errorMessage_isDisplayed(){
        Assert.assertEquals(errorMessage.getText(), "There is 1 error");
    }

    public void is_redCross(){
        Assert.assertTrue(redCross.isDisplayed());
    }

    public void click_women(){
        womenMenu.click();
    }
}
