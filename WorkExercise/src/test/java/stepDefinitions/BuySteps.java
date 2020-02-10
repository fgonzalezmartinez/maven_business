package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WomenPage;

public class BuySteps {
    WebDriver driver = setUpClass.driver;
    HomePage homepage = new HomePage(driver);
    LoginPage loginpage = new LoginPage(driver);
    WomenPage womenpage = new WomenPage(driver);

    @Given("The user logs in as user {string} with password {string}")
    public void user_logs_in(String username, String password){
        homepage.clickSignIn();
        loginpage.enter_user(username);
        loginpage.enter_password(password);
        loginpage.click_login();
        loginpage.verify_head();
    }

    @When("The user adds a product to the cart")
    public void add_a_product(){
        womenpage.selectItem();
    }

    @When("The user proceeds to checkout")
    public void to_check_out(){
        womenpage.proceed_to_checkout();
    }
}
