package pages.modal_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class DeleteFolderModalPage extends BasePage {

    public DeleteFolderModalPage (WebDriver driver) {
        super(driver);
    }

    By folderNameInputBy = By.id("folder-name-input");
    By textAreaReasonBy = By.id("reason-input");
    By deleteButtonBy = By.xpath("//button[@class='btn btn-danger test-destroyFolderModalDeleteBtn']");
    By cancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    By deleteModalWindowBy = By.xpath("//h4[contains(text(),'Are you')]");

    public DeleteFolderModalPage deleteFolder(String folderName, String reason) {
        writeText(folderNameInputBy, folderName);
        writeText(textAreaReasonBy, reason);
        click(deleteButtonBy);
        return this;
    }

    public void cancelDeleteModal() {
        click(cancelButton);
    }

    public Boolean deleteModalIsDisplayed() {
        return isDisplayed(deleteModalWindowBy);
    }
}
