package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WomenPage {

    WebDriver driver;
    WebDriverWait wait;
    public WomenPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
    List<WebElement> productList;
    @FindBy(xpath = "//span[text()='Add to cart']")
    List<WebElement> addCart;
    @FindBy(xpath = "//span[contains(text(),'Proceed to')]")
    WebElement proceedToCheckout;

    public void selectItem(/*int itemIndex*/) {
        int itemIndex = (int) (Math.random() * (productList.size()-1));
        System.out.println("Random Index: " +itemIndex);
        System.out.println("List size: " +productList.size());
        Actions ac = new Actions(driver);
//        System.out.println("Tamaño de la lista: " +productList.size());
        if (itemIndex <= productList.size()-1) {
            ac.moveToElement(productList.get(itemIndex)).perform();
            addCart.get(itemIndex).click();
        }
        else {
            System.out.println("Error");
        }
    }

    public void proceed_to_checkout(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
        proceedToCheckout.click();
    }
}
