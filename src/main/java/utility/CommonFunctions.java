package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;


public class CommonFunctions extends BaseClass {
    Actions action;


    public void click(String locator) {
        WebElement e = driver.findElement(By.xpath(locator));

        try {
            if (e.isEnabled())
                e.click();
            else
                System.out.println("The button is disabled");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void mouseHover(String locator) {
        action = new Actions(driver);
        WebElement e = driver.findElement(By.xpath(locator));
        action.moveToElement(e).perform();
    }

    public void dropDownList(String locator, String option) {
        WebElement e = driver.findElement(By.xpath(locator));
        Select select = new Select(e);
        select.selectByVisibleText(option);


    }

    public void typeText(String locator, String text) {
        WebElement e = driver.findElement(By.xpath(locator));
        e.clear();
        e.sendKeys(text);

    }


    public void assertion(String locator, String expectedText) {
        String actualText = driver.findElement(By.xpath(locator)).getText();
        Assert.assertEquals(actualText, expectedText, "Expected was " + expectedText + " but actual found was " + actualText);

    }

    public void if_else_Assertion(String locator, String expectedText) {
        String actualText = driver.findElement(By.xpath(locator)).getText();
        if (!(actualText.equals(expectedText))) {
            Assert.fail("Expected was " + expectedText + " but actual found was " + actualText);
        }

    }

    public void pressEnter() {
        action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
    }

    public List<WebElement> returnListOfWebElements(String locator) {
        return driver.findElements(By.xpath(locator));

    }


}
