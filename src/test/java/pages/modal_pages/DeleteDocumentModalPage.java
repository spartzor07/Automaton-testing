package pages.modal_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;

public class DeleteDocumentModalPage extends BasePage {

    public DeleteDocumentModalPage(WebDriver driver) {
        super(driver);
    }

    By modalWindowBy = By.xpath("//div[@class='modal-content']");
    By reasonTextAreaBy = By.xpath("//textarea[@id='reason-input']");
    By deleteButtonBy = By.xpath("//button[@class='btn btn-danger test-destroyDocumentModalDeleteBtn']");

    public DeleteDocumentModalPage reasonAndDelete (String expectedText) {
        waitForElementToFadeIn(modalWindowBy,"opacity","1");
        writeText(reasonTextAreaBy, expectedText);
        click(deleteButtonBy);
        waitElementToDisappear(By.cssSelector("[class='test-destroyDocumentModal']"));
        return this;
    }

    public DeleteDocumentModalPage emptyReason (String expectedText,String hexColor) {
        waitForElementToFadeIn(modalWindowBy,"opacity","1");
        writeText(reasonTextAreaBy,expectedText);
        driver.findElement(reasonTextAreaBy).clear();
        click(deleteButtonBy);
        driver.findElement(modalWindowBy).sendKeys(Keys.ENTER);
        Assert.assertEquals(getElementColor(reasonTextAreaBy,"color"),hexColor);
        return this;
    }
}
