package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginSteps {
    WebDriver driver = setUpClass.driver;
    LoginPage loginpage = new LoginPage(driver);
    HomePage homepage = new HomePage(driver);

    @Given("The user enters to login page")
    public void user_on_login_page() {
        homepage.clickSignIn();
    }

    @When("The user enters username as {string}")
    public void username(String username) {
        loginpage.enter_user(username);

    }

    @When("The user enters password as {string}")
    public void password(String password) {
        loginpage.enter_password(password);
    }

    @When("The user clicks on sign in button")
    public void click_login(){
        loginpage.click_login();
    }

    @When("The user clicks the women menu")
    public void click_women_menu(){
        loginpage.click_women();
    }

    @When("A check-mark is displayed")
    public void checkmark_displayed(){
        loginpage.is_checkmark();
    }

    @Then("The user should be logged correctly")
    public void logged(){
        loginpage.verify_head();
    }

    @Then("Error message should be displayed")
    public void login_error(){
        loginpage.errorMessage_isDisplayed();
    }

    @Then("A red cross should be displayed")
    public void invalid_email(){
        loginpage.is_redCross();
    }
}