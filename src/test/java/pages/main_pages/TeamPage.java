package pages.main_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class TeamPage extends BasePage {

    public TeamPage(WebDriver driver) {
        super(driver);
    }

    By createBinderButtonBy = By.xpath("//button[contains(text(), 'Create Binder')]");
    By scheduleLongTermArchiveBy = By.xpath("//a[@class='test-editLink u-d-flex ng-scope']");
    By permissionsPageBy = By.xpath("//a[@class='test-permissionsLink ng-scope']");
    By globalViewPageBy = By.xpath("//a[@class='test-globalViewLink ng-scope']");
    By threeDotsDeleteBy = By.xpath("//ul[@class='dropdown-menu dropdown-menu ng-scope']//a[contains(@class,'test-deleteLink ng-scope')]");
    By threeDotsImportStructureBy = By.xpath("//ul[@class='dropdown-menu dropdown-menu ng-scope']//a[contains(@class,'test-importFStructureLink ng-scope')]");
    By threeDotsRenameBinderBy = By.xpath("//ul[@class='dropdown-menu dropdown-menu ng-scope']//a[contains(@class,'test-editLink ng-scope')]");
    By threeDotsDownloadBy = By.xpath("//ul[@class='dropdown-menu dropdown-menu ng-scope']//a[contains(@class,'test-downloadLink ng-scope')]");
    By actionsButtonBy = By.xpath("//button[@class='btn btn-default mr-3 test-manageSelectedLink dropdown-toggle']");
    By actionsAuditTrailBy = By.xpath("//a[@class='test-auditTrailLink ng-scope']");
    By filterBy = By.xpath("//input[@placeholder='Filter by...']");
    By nextSignatureButtonBy = By.xpath("//a[contains(text(),' My Signature Queue ')]/../following-sibling::a[@class='action-bar-item__banner-action']");
    By nextTaskButtonBy = By.xpath("//a[contains(text(),' My Task Queue ')]/../following-sibling::a[@class='action-bar-item__banner-action']");
    By jobTitleToSignature = By.xpath("//i[contains(@uib-tooltip,'Job title is included in all document signatures contained in this Binder') and contains(@aria-hidden,'false')]");
    By addJobTitleToSignatureAction = By.xpath("//span[contains(text(),'Add Job Title to Signature')]");
    By removeJobTitleFromSignatureAction = By.xpath("//span[contains(text(),'Remove Job Title from Signature')]");
    By emptyContentMessage = By.xpath("//p[contains(text(),'This Binder either has no content or you do not ha')]");
    By nextData = By.xpath("//md-virtual-repeat-container[1]/div[1]/div[2]/div[1]");
    By selectNextData = By.xpath("//md-virtual-repeat-container[1]/div[1]/div[2]/div[1]//i[@role='checkbox']");
    By nextDataFolderIcon = By.xpath("//md-virtual-repeat-container[1]/div[1]/div[2]/div[1]//i[@class='fa fa-fw far fa-folder-open']");
    By userMenuBy = By.id("user-menu");
    By editProfile = By.xpath("//li/a[contains(@class, 'test-editProfileLink-navBar')]");
    By longTermScheduleIcon = By.xpath("//archive-icon");

    public TeamPage auditTrail(String binderName) {
        String binder = "//a[contains(text(),'" + binderName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']";

        click(By.xpath(binder));
        click(actionsButtonBy);
        click(actionsAuditTrailBy);
        return this;
    }

    public TeamPage toTeamPage(String teamName) {
        String team = "//div[contains(text(),'" + teamName + "')]";

        click(By.xpath(team));
        return this;
    }

    public TeamPage queueBanner(String startLink) {
        String start = "//a[contains(text(),'" + startLink + "')]";

        waitVisibility(By.xpath(start));
        click(By.xpath(start));
        waitInMilliSeconds(1000);
        return this;
    }

    public TeamPage queueBannerDisplayed(String startLink, int number) {
        String start = "//a[contains(text(),'" + startLink + "')]";

        howManyElementsExists(By.xpath(start), number);
        return this;
    }

    public TeamPage queueBannerSignatureNext() {
        waitForElementToBeClickable(nextSignatureButtonBy);
        click(nextSignatureButtonBy);
        return this;
    }

    public TeamPage queueBannerTaskNext() {
        waitForElementToBeClickable(nextTaskButtonBy);
        click(nextTaskButtonBy);
        return this;
    }

//    public TeamPage checkBinderAndDeleteIt(String binder) {
//        String reason = "I am automated test";
//        DeleteBinderModalPage deleteBinderModalPage = new DeleteBinderModalPage(driver);
//        DeleteDocumentModalPage deleteDocumentModalPage = new DeleteDocumentModalPage(driver);
//        DeleteFolderModalPage deleteFolderModalPage = new DeleteFolderModalPage(driver);
//        BindersPage bindersPage = new BindersPage(driver);
//
//        implicitWait(1);
//        try {
//            if (driver.findElements(By.id(binder)).size() == 0) {
//                try {
//                    openBinder(binder);
//                    while(driver.findElements(By.id(binder)).size() > 0) {
//                        if (driver.findElements(emptyContentMessage).size() == 0) {
//                            driver.navigate().back();
//
//                        } else if (driver.findElements(nextData).contains(nextDataFolderIcon)) {
//                            bindersPage.threeDots(String.valueOf(selectNextData));
//                            bindersPage.deleteDocument();
//                            deleteFolderModalPage.deleteFolder(readValue(nextData), reason);
//                        } else {
//                            bindersPage.threeDots(String.valueOf(selectNextData));
//                            bindersPage.deleteDocument();
//                            deleteDocumentModalPage.reasonAndDelete(reason);
//                        }
//                    }
//                } catch (Exception e) {
//                    System.out.println("Data in binder was not displayed");
//                } finally {
//                    deleteBinder(binder);
//                    deleteBinderModalPage.deleteBinder(binder, reason);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Binder was not displayed");
//        }
//
//        implicitWait(45);
//        return this;
//    }

    public void selectBinder(String binderName)
    {
        By bindersCheckbox = By.xpath("//a[contains(text(),'" + binderName + "')]/../preceding-sibling::div");

        click(bindersCheckbox);
    }

    public void threeDots(String binderName)
    {
        String binder = "//a[contains(text(),'" + binderName + "')]";
        String binderMenu = binder + "/../following::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']/a/i[@class='fas fa-ellipsis-v']";

        waitForElementToBeClickable(By.xpath(binder));
        click(By.xpath(binderMenu));
    }

    public TeamPage createBinder() {
        waitForElementToBeClickable(createBinderButtonBy);
        click(createBinderButtonBy);
        return this;
    }

    public TeamPage openBinder(String binderName) {
        By binder = By.xpath("//a[contains(text(),'" + binderName + "')]");

        waitForElementToBeClickable(binder);
        click(binder);
        return this;
    }

    public void filterBinder(String binderName)
    {
        writeText(filterBy, binderName);
    }

    public TeamPage importStructure(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(threeDotsImportStructureBy);
        click(threeDotsImportStructureBy);
        return this;
    }

    public TeamPage deleteBinder(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(threeDotsDeleteBy);
        click(threeDotsDeleteBy);
        return this;
    }

    public TeamPage renameUpdateBinder(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(threeDotsRenameBinderBy);
        click(threeDotsRenameBinderBy);
        return this;
    }

    public TeamPage downloadBinder(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(threeDotsDownloadBy);
        click(threeDotsDownloadBy);
        return this;
    }

    public TeamPage addJobTitleToSignatureIcon(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(addJobTitleToSignatureAction);
        click(addJobTitleToSignatureAction);
        return this;
    }

    public TeamPage removeJobTitleFromSignatureIcon(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(removeJobTitleFromSignatureAction);
        click(removeJobTitleFromSignatureAction);
        return this;
    }

    public TeamPage addJobTitleToSignatureIconVerify() {
        howManyElementsExists(jobTitleToSignature, 1);
        return this;
    }

    public TeamPage removeJobTitleToSignatureIconVerify() {
        howManyElementsExists(jobTitleToSignature, 0);
        return this;
    }

    public void scheduleLongTermArchive(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(scheduleLongTermArchiveBy);
        click(scheduleLongTermArchiveBy);
    }

    public boolean isScheduleLongTermArchiveButtonVisible()
    {
        try {
            waitVisibility(scheduleLongTermArchiveBy);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    public void openPermissions(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(permissionsPageBy);
        click(permissionsPageBy);
    }

    public void openGlobalView(String binderName) {
        threeDots(binderName);
        waitForElementToBeClickable(globalViewPageBy);
        click(globalViewPageBy);
    }

    public void openEditProfile() {
        wait.until(ExpectedConditions.or(ExpectedConditions.urlContains("/app/teams/"), ExpectedConditions.urlContains("/app/user-profile")));
        click(userMenuBy);
        click(editProfile);
    }

    public boolean isScheduleLongTermArchiveIconVisible(String binderName) {
        By icon = By.xpath("//a[contains(text(),'" + binderName + "')]/../following-sibling::div[@class='u-d-flex u-flex-shrink-0 u-align-items-center']/div/archive-icon");
        return isDisplayed(icon);
    }
}
