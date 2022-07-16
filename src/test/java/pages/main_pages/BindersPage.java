package pages.main_pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.global_pages.SideBarPage;
import pages.modal_pages.DeleteDocumentModalPage;
import pages.modal_pages.DeleteFolderModalPage;
import utilities.property.PropertyManager;


public class BindersPage extends BasePage {

    public BindersPage(WebDriver driver) {
        super(driver);
    }

    By downloadAction = By.xpath("//a[contains(@class,'test-downloadLink')]");
    By bindersHeader = By.xpath("//span[contains(text(),'Binders')]");
    By threeDotsDeleteBy = By.xpath("//a[contains(@class,'test-deleteLink ng-scope')]"); // this is for the three dot 'Delete' function for the Binders only/ Binders page
    By threeDotsCreateTaskBy = By.xpath("//a[contains(@class,'test-createTaskLink')]");
    By emptyBinderMessage = By.xpath("//p[contains(text(),'This Binder either has no content or you do not ha')]");
    By threeDotsCreateShortcutBy = By.xpath("//a[@class='test-createShortcutsLink']");
    By threeDotsRenameUpdateBy = By.xpath("//a[contains(@class,'test-editLink ng-scope')]");
    By threeDotsAssignTagsBy = By.xpath("//a[@class = 'test-assignTagsLink']");
    By threeDotsAssignTypeBy = By.xpath("//a[@class = 'test-assignCategoyLink']");
    By threeDotsLockDocumentBy = By.xpath("//a[@class = 'test-lockDropdownItem']");
    By threeDotsUnlockDocumentBy = By.xpath("//a[@class = 'test-unlockDropdownItem']");
    By duplicateAction = By.xpath("//a[contains(@class,'test-duplicateLink')]");
    By threeDotsMoveBy = By.xpath("//a[contains(@class,'test-moveLink ng-scope')]");
    By createNewButtonBy = By.xpath("//button[contains(text(), 'Create New')]");
    By newPlaceholderBy = By.xpath("//div[@class='mb-3 u-position-relative dropdown open']//a[@class='test-createPlaceholderLink ng-scope']");
    By newFolderBy = By.xpath("//a[@class='test-createFolderLink ng-scope']");
    By importShortcutBy = By.xpath("//a[@class='test-importShortcutsLink ng-scope']");
    By filterInputBy = By.xpath("//input[@class='form-control test-tableFilterInput']");
    By infiniteListBy = By.xpath("//div[@class='infinite-table__row u-user-select-none ng-scope folder-show__item--loaded']");
    By rootOfListBy = By.xpath("//div[@class='md-virtual-repeat-offsetter']");
    By bindersBreadCrumbBy = By.xpath("//a[@class='white-space-pre-wrap test-BindersLink']");
    By actionsButtonBy = By.xpath("//button[@class='btn btn-default mr-3 test-manageSelectedLink dropdown-toggle' and contains(text(),'Actions')]");
    By actionsAuditTrailBy = By.xpath("//a[@class='test-auditTrailLink']");
    By newLogBy = By.xpath("//a[@class='test-createLogLink ng-scope']");
    By deleteAction = By.xpath("//a[contains(@class,'test-deleteLink')]"); //this is for the three dot 'Delete' function for all documents inside the Binder/ Binders View page
    By actionMoveBy = By.xpath("//a[@class='test-moveLink ng-scope']");
    By actionRenameBy = By.xpath("//a[@class='test-editLink ng-scope']");
    By threeDotsAssignTimelinesBy = By.xpath("//a[@class='test-assignToTimelinesLink']");
    By threeDotsRequestSignatures = By.xpath("//a[@class='test-requestSignaturesDropdownItem']");
    By threeDotsUpdateExpirationDate = By.xpath("//span[contains(text(), 'Update Expiration Date')]");
    By bindersActionBy = By.xpath("//a[contains(text(), '" + PropertyManager.getInstance().getTestingBinder() + "')]");
    By lockedIconBy = By.xpath("//i[@class='fas fa-fw fa-lg fa-user-lock']");
    By markPHI = By.xpath("//a[@class='test-markPiiDropdownItem']");
    By unmarkPHI = By.xpath("//a[@class='test-unmarkPiiDropdownItem']");
    By updateDueDate = By.xpath("//a[@class='test-updateDateLink']");
    By phiIcon = By.xpath("//i[@class='fas fa-fw fa-lg fa-user-lock']");
    By timeLineIcon = By.xpath("//i[@class='far fa-fw fa-clock']");
    By dueDateIcon = By.xpath("//i[@class='far fa-fw fa-calendar-check text-muted']");
    By tagIcon = By.xpath("//i[@class='fa fa-fw fa-lg fa-tags ng-scope']");
    By signIcon = By.xpath("//i[@class='fas fa-fw fa-lg fa-pencil-alt']");
    By signatureIcon = By.xpath("//i[@class='fa fa-fw fa-lg fa-paper-plane ']");
    By signatureChangedIcon = By.xpath("//i[@class='fa fa-fw fa-lg fa-paper-plane text-warning']");
    By openQueryIcon = By.xpath("//i[@class='fa fa-fw fa-lg fa-comment-alt-exclamation folder-show__open-queries-icon ng-scope']");
    By approvedIcon = By.xpath("//i[@class='fa fa-fw fa-lg fa-comment-alt-check folder-show__approvals-icon ng-scope']");
    By reviewIcon = By.xpath("//i[@class='fa fa-eye folder-show__reviews-icon ng-scope']");
    By labelIcon = By.xpath("//a[contains(@class,'c-infinite-table__cell pl-2')]/following-sibling::div/a[contains(text(),'')]/parent::div/following-sibling::div/deadline-icon/following-sibling::i[contains(@ng-if,'item.labels')]");
    By importStructureAction = By.xpath("//a[contains(@class,'importFStructureLink')]");
    By moveAction = By.xpath("//a[contains(@class,'test-moveLink ng-scope')]");
    By permissionAction = By.xpath("//a[contains(@class,'permissionsLink')]");
    By renameUpdateAction = By.xpath("//a[contains(@class,'editLink')]");
    By signatureUpdateAction = By.xpath("//a[contains(@class,'AddJobTitleLink')]");
    By globalViewAction = By.xpath("//a[contains(@class,'test-globalViewLink ng-scope')]");
    By jobTitleToSignature = By.xpath("//i[contains(@uib-tooltip,'Job title is included in all document signatures contained in this Folder')]");
    By taskIconIsDisplayed = By.xpath("//i[contains(@class,'fa fa-fw fa-lg fa-thumbtack') and @aria-hidden='false']");
    By lockDocumentIcon = By.xpath("//i[@class='fas fa-lock fa-stack-1x file-lock-icon__lock test-lock file-lock-icon__lock--larger']");
    By folderCheckBoxBy = By.xpath("//i[@class='fa fa-fw far fa-folder-open']/ancestor::div/div/i[contains(@class, 'checkbox-icon')]");


    public enum ActionMenuItems {
        AuditTrailAction(By.xpath("//a[@class='test-auditTrailLink']")),
        DeleteAction(By.xpath("//a[@class='test-deleteLink']")),
        DownloadAction(By.xpath("//a[@class='test-downloadLink']")),
        DuplicateAction(By.xpath("//a[@class='test-duplicateLink']")),
        GlobalViewAction(By.xpath("//a[@class='test-globalViewLink ng-scope']")),
        ImportStructureAction(By.xpath("//a[@class='test-importFStructureLink ng-scope']")),
        MoveAction(By.xpath("//a[@class='test-moveLink ng-scope']")),
        PermissionAction(By.xpath("//a[@class='test-permissionsLink ng-scope']")),
        RenameAction(By.xpath("//a[@class='test-editLink ng-scope']")),
        MarkPHIAction(By.xpath("//a[@class='test-markPiiDropdownItem']")),
        AddJobTitleToSignature(By.xpath("//a[@class='test-AddJobTitleLink ng-scope']")),
        RemoveJobTitleToSignature(By.xpath("//a[@class='test-RemoveJobTitleLink ng-scope']")),
        CreateTaskAction(By.xpath("//a[@class='test-createTaskLink']")),
        SignatureUpdateAction(By.xpath("//a[@class='AddJobTitleLink']"));

        private final By value;

        ActionMenuItems(By item) {
            value = item;
        }
    }

    public BindersPage clickThreeDotsItem(String folderName, ActionMenuItems item) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(folder));
        click(threeDotsRenameUpdateBy);
        click(item.value);
        return this;
    }

    public BindersPage clickActionItem(String folderName, ActionMenuItems item) {
        String actionsMenu = "//a[contains(text(),'" + folderName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']/i[contains(@class,'checkbox-icon')]";
        click(By.xpath(actionsMenu));
        waitForElementToBeClickable(actionsButtonBy);
        click(actionsButtonBy);
        click(item.value);
        return this;
    }

    public BindersPage clickAllActionItems(String folderName, ActionMenuItems item) {
        String actionsMenu = "//a[contains(text(),'" + folderName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']/i[contains(@class,'checkbox-icon')]";
        waitVisibility(By.xpath(actionsMenu));
        waitForElementToBeClickable(actionsButtonBy);
        click(actionsButtonBy);
        click(item.value);
        return this;
    }

// TODO ----------------------------------------------------------------

    public BindersPage bindersViewVisible() {
        waitVisibility(bindersHeader);
        return this;
    }

    public BindersPage auditTrail(String folderName) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']";
        click(By.xpath(folder));
        click(actionsButtonBy);
        click(actionsAuditTrailBy);
        return this;
    }

    public BindersPage validateLabelIconOnFolder(String folderName) {
        By labelIcon = By.xpath("//a[contains(@class,'c-infinite-table__cell pl-2')]/following-sibling::div/a[text()='" + folderName + "']/parent::div/following-sibling::div/deadline-icon/following-sibling::i[contains(@ng-if,'item.labels')]");
        waitVisibility(labelIcon);
        return this;
    }

    public BindersPage validateLabelIconRemovedFromFolder() {
        howManyElementsExists(labelIcon, 0);
        return this;
    }

    public BindersPage renameUpdateFolder(String folderName) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(folder));
        click(threeDotsRenameUpdateBy);
        return this;
    }

    public BindersPage moveFolder(String folderName) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";
        click(By.xpath(folder));
        click(threeDotsMoveBy);
        return this;
    }

    public BindersPage duplicateFolder(String folderName) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(folder));
        click(duplicateAction);
        return this;
    }

    public BindersPage bindersFilter(String searchString) {
        writeText(filterInputBy, searchString);
        return this;
    }

    public BindersPage checkDocumentPresent(String documentName) {
        String document = "//a[contains(text(),'" + documentName + "')]";

        waitVisibility(By.xpath(document));
        waitForElementToBeClickable(By.xpath(document));
        return this;
    }

    public BindersPage emptyList() {
        WebElement root = driver.findElement(rootOfListBy);
        int children = root.findElements(infiniteListBy).size();
        if (children == 0) {
            System.out.print("File is not in search list!");
        } else {
            System.out.print("Search found not empty list!");
        }
        return this;
    }

    public BindersPage createNewPlaceholder() {
        waitForElementToBeClickable(createNewButtonBy);
        click(createNewButtonBy);
        click(newPlaceholderBy);
        return this;
    }

    public BindersPage createNewFolder() {
        waitForElementToBeClickable(createNewButtonBy);
        click(createNewButtonBy);
        click(newFolderBy);
        return this;
    }

    public BindersPage createNewLog() {
        waitForElementToBeClickable(createNewButtonBy);
        click(createNewButtonBy);
        click(newLogBy);
        return this;
    }

    public BindersPage moveLog(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsMoveBy);
        return this;
    }

    public BindersPage moveLogFromActions(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']//i[@role='checkbox']";

        click(By.xpath(log));
        click(actionsButtonBy);
        click(actionMoveBy);
        return this;
    }

    public BindersPage renameLogFromActions(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']//i[@role='checkbox']";
        click(By.xpath(log));
        click(By.xpath(log));
        waitForElementToBeClickable(actionsButtonBy);
        click(actionsButtonBy);
        click(actionRenameBy);
        return this;
    }

    public BindersPage importShortcut() {
        waitForElementToBeClickable(createNewButtonBy);
        click(createNewButtonBy);
        click(importShortcutBy);
        return this;
    }

    public BindersPage viewDocument(String documentName) {
        By document = By.xpath("//a[contains(text(),'" + documentName + "')]");

        waitForElementToBeClickable(document);
        click(document);
        waitForAngular();
        implicitWait(2);
        if (driver.findElements(document).size() > 0) {
            click(document);
        }
        implicitWait(45);
        return this;
    }

    public BindersPage viewDocumentInNewTab(String documentName) {
        By document = By.xpath("//a[contains(text(),'" + documentName + "')]");

        waitForElementToBeClickable(document);
        openInNewTab(document);
        waitForAngular();
        implicitWait(2);
        if (driver.findElements(document).size() > 0) {
            openInNewTab(document);
        }
        switchTabs(1);
        implicitWait(45);
        return this;
    }

    public BindersPage viewFolderInNewTab(String documentName) {
        By document = By.xpath("//a[contains(text(),'" + documentName + "')]");

        waitForElementToBeClickable(document);
        openInNewTab(document);
        waitForAngular();
        implicitWait(2);
        if (driver.findElements(document).size() > 0) {
            openInNewTab(document);
        }
        switchTabs(1);
        implicitWait(45);
        return this;
    }

    public BindersPage threeDots(String elementName) {
        String nameBeforeDot = substringBeforeDot(elementName);
        String anyElement = "//a[contains(text(),'" + nameBeforeDot + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        waitForElementToBeClickable(By.xpath(anyElement));
        click(By.xpath(anyElement));
        return this;
    }

    public BindersPage duplicateDocument() {
        click(duplicateAction);
        return this;
    }

    public BindersPage createShortcut() {
        click(threeDotsCreateShortcutBy);
        return this;
    }

    public BindersPage moveDocument() {
        click(threeDotsMoveBy);
        return this;
    }

    public BindersPage clickNavBarBinder(String binderName) {
        String binder = "//a[contains(text(), ' " + binderName + " ')]";

        waitForElementToBeClickable(By.xpath(binder));
        click(By.xpath(binder));
        return this;
    }

    public BindersPage navigateToBindersView() {
        String navBar = "//a[contains(text(), 'Binder') and contains(@class,'white-space')]";
        click(By.xpath(navBar));
        return this;
    }

    public void assignType() {
        click(threeDotsAssignTypeBy);
    }

    public void lockDocuments() {
        click(threeDotsLockDocumentBy);
    }

    public void unlockDocuments() {
        click(threeDotsUnlockDocumentBy);
    }

    public void downloadDocument() {
        click(downloadAction);
    }

    public BindersPage downloadActionsMenu(String folderName) {
        String folder = "//a[contains(text(),'" + folderName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']";
        click(By.xpath(folder));
        click(By.xpath(folder));
        click(actionsButtonBy);
        click(downloadAction);
        return this;
    }

    public BindersPage createTask() {
        click(threeDotsCreateTaskBy);
        return this;
    }

    public BindersPage assignTags() {
        click(threeDotsAssignTagsBy);
        return this;
    }

    public BindersPage deleteDocument() {
        click(deleteAction);
        return this;
    }

    public BindersPage deleteInBulk(String elementName, int number) {
        String firstElement = "//a[contains(text(),'" + elementName + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']";
        String lastElement = "//a[contains(text(),'" + elementName + "(" + (number - 1) + ")" + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']";

        click(By.xpath(firstElement));
        scrollToTheBottomWithShiftClick();
        click(By.xpath(lastElement));
        waitForElementToBeClickable(actionsButtonBy);
        click(actionsButtonBy);
        click(deleteAction);
        return this;
    }

    public BindersPage renameUpdate() {
        click(threeDotsRenameUpdateBy);
        return this;
    }

    public BindersPage updateDueDate() {
        click(updateDueDate);
        return this;
    }

    public void waitForEmailImport(String documentName) {
        String document = "//a[contains(text(),'" + documentName + "')]";

        driver.navigate().refresh();
        driver.findElement(By.xpath(document));
    }


    public BindersPage renameUpdateLog(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsRenameUpdateBy);
        return this;
    }

    public BindersPage assignTagAction(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsAssignTagsBy);
        return this;
    }

    public BindersPage assignTimelineAction(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsAssignTimelinesBy);
        return this;
    }

    public BindersPage requestSignatures(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsRequestSignatures);
        return this;
    }

    public BindersPage updateExpirationDateAction(String logName) {
        String log = "//a[contains(text(),'" + logName + "')]/../following-sibling::div[@class='c-infinite-table__cell mr-3 dropdown-menu-right-nested dropdown']//i[@class='fas fa-ellipsis-v']";

        click(By.xpath(log));
        click(threeDotsUpdateExpirationDate);
        return this;
    }


    public BindersPage numberOfTagsIconsVisible(int numberOfIcons) {
        howManyElementsExists(tagIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfSignIconsVisible(int numberOfIcons) {
        howManyElementsExists(signIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfDueDateIconsVisible(int numberOfIcons) {
        howManyElementsExists(dueDateIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfTimelineIconsVisible(int numberOfIcons) {
        howManyElementsExists(timeLineIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfMarkPHIIconsVisible(int numberOfIcons) {
        howManyElementsExists(phiIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfSignatureRequestIconsVisible(int numberOfIcons) {
        howManyElementsExists(signatureIcon, numberOfIcons);
        return this;
    }

    public BindersPage numberOfSignatureRequestIconsWithDateVisible(int numberOfIcons) {
        howManyElementsExists(signatureChangedIcon, numberOfIcons);
        return this;
    }

    public BindersPage openQueryIconDisplayed(int numberOfIcons) {
        howManyElementsExists(openQueryIcon, numberOfIcons);
        return this;
    }

    public BindersPage approvedIconDisplayed(int numberOfIcons) {
        howManyElementsExists(approvedIcon, numberOfIcons);
        return this;
    }

    public Boolean isReviewIconDisplayed() {
        return isDisplayed(reviewIcon);
    }

    public Boolean isMarkPHIActionPresent() {
        return doesElementExist(markPHI, 1);
    }

    public Boolean isUnmarkPHIActionPresent() {
        return doesElementExist(unmarkPHI, 1);
    }

    public BindersPage markPHIActionNotDisplayed() {
        howManyElementsExists(markPHI, 0);
        return this;
    }

    public BindersPage unmarkPHIActionNotDisplayed() {
        howManyElementsExists(unmarkPHI, 0);
        return this;
    }

    public BindersPage addJobTitleToSignatureIcon() {
        howManyElementsExists(jobTitleToSignature, 1);
        return this;
    }

    public BindersPage removeJobTitleToSignatureIcon() {
        howManyElementsExists(jobTitleToSignature, 0);
        return this;
    }

    public BindersPage taskIconDisplayed() {
        howManyElementsExists(taskIconIsDisplayed, 1);
        return this;
    }

    public BindersPage unmarkPHIAction() {
        waitForElementToBeClickable(unmarkPHI);
        click(unmarkPHI);
        return this;
    }

    public BindersPage markPHIAction() {
        waitForElementToBeClickable(markPHI);
        click(markPHI);
        return this;
    }

    public BindersPage actionDropDownDelete() {
        click(actionsButtonBy);
        click(deleteAction);
        return this;
    }

    public BindersPage deleteClickOnActionsDrop() {
        click(deleteAction);
        return this;
    }

    public BindersPage actionDropDownDeleteVisible(int number) {
        howManyElementsExists(deleteAction, number);
        return this;
    }

    public BindersPage actionDropDownAssignToTimelinesVisible(int number) {
        howManyElementsExists(threeDotsAssignTimelinesBy, number);
        return this;
    }

    public BindersPage actionDropDownDownloadVisible(int number) {
        howManyElementsExists(downloadAction, number);
        return this;
    }

    public void documentLockIconVisible(int number) {
        howManyElementsExists(lockDocumentIcon, number);
    }

    public BindersPage actionDropDownMoveVisible(int number) {
        howManyElementsExists(threeDotsMoveBy, number);
        return this;
    }

    public BindersPage actionDropDownSignatureRequestVisible(int number) {
        howManyElementsExists(threeDotsRequestSignatures, number);
        return this;
    }

    public BindersPage actionDropDownDuplicate() {
        click(actionsButtonBy);
        click(duplicateAction);
        return this;
    }

    public BindersPage actionDropDownMove() {
        click(actionsButtonBy);
        click(threeDotsMoveBy);
        return this;
    }

    public BindersPage actionDropDownSignatureRequest() {
        click(actionsButtonBy);
        click(threeDotsRequestSignatures);
        return this;
    }

    public BindersPage actionDropDownPHIMark() {
        click(actionsButtonBy);
        click(markPHI);
        return this;
    }

    public BindersPage actionDropDownPHIUnmark() {
        click(actionsButtonBy);
        click(unmarkPHI);
        return this;
    }

    public BindersPage actionCreateShortcut() {
        click(actionsButtonBy);
        click(threeDotsCreateShortcutBy);
        return this;
    }

    public BindersPage actionsDropDown() {
        click(actionsButtonBy);
        return this;
    }

    public BindersPage actionsDropDownDisabled() {
        assertEqualsAttributes(actionsButtonBy, "disabled", "true");
        return this;
    }

    public BindersPage clickOnDocuments() {
        for (int i = 1; i < 6; i++) {
            selectDocuments(itemNamesSwitchCases(i));
        }
        return this;
    }

    public BindersPage selectDocuments(String... documentNames) {
        for (String documents : documentNames) {
            String document = "//a[contains(text(),'" + documents + "')]/../preceding-sibling::div[@class='c-infinite-table__cell']//i[@role='checkbox']";

            click(By.xpath(document));
        }
        return this;
    }

    public String itemNamesSwitchCases(int i) {
        String verify;

        switch (i) {
            case 1:
                verify = "Florence eBinder User Permissions";
                return verify;
            case 2:
                verify = "PermissionsPDFform";
                return verify;
            case 3:
                verify = "PermissionsVersion2";
                return verify;
            case 4:
                verify = "required-fields";
                return verify;
            case 5:
                verify = "TextualFile";
                return verify;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }

    private void spinnerToDisappear() {
        By spinner = By.id("loading-bar");
        waitElementToDisappear(spinner);
    }

    public BindersPage selectFile(String fileName) {
        By doc = By.xpath("//a[contains(.,'" + fileName + "')]/../../div/i[contains(@class, 'checkbox-icon')]");
        click(doc);
        return this;
    }

    // after test method that cleans binder from any data
    public void helperBinderCleanUp(String binderName) {

        DeleteDocumentModalPage deleteDocumentModalPage = new DeleteDocumentModalPage(driver);
        DeleteFolderModalPage deleteFolderModalPage = new DeleteFolderModalPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SideBarPage sideBarPage = new SideBarPage(driver);
        SelectTeamPage selectTeamPage = new SelectTeamPage(driver);

        By binder = By.xpath("//a[contains(text(),'" + binderName + "')]");
        By cancelButtonBy = By.xpath("//button[contains(text(), 'Cancel')]");
        By closeButtonBy = By.xpath("//button[contains(text(), 'Close')]");
        By signInTitle = By.xpath("//h1[contains(text(),'Sign In')]");
        By modalContentBy = By.xpath("//div[@class='modal-content']");
        By florenceImage = By.xpath("//img[@class='test-florenceImg']");
        By selectedCheckBox = By.xpath("//i[contains(@class, 'checkbox-icon--selected')]/ancestor::div/following-sibling::div/a[@line-clamp-text='item.name']");
        By firstElement = By.xpath("//md-virtual-repeat-container[1]/div[1]/div[2]/div[1]");
        By firstElementsIcon = By.xpath("//md-virtual-repeat-container[1]/div[1]/div[2]/div[1]/div[1]/following-sibling::a//span/i[@class='fa fa-fw far fa-folder-open']");

        String reason = "reason";

        waitForAngular();
        if (doesElementExist(signInTitle, 0)) {
            signInPage.signIn(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());
        }
        if (doesElementExist(modalContentBy, 0)) {
            try {
                implicitWait(1);
                click(cancelButtonBy);
            } catch (Exception e){
                click(closeButtonBy);
            }
        }
        waitForAngular();
        click(florenceImage);
        selectTeamPage.selectTeam(PropertyManager.getInstance().getTestingTeam());
        sideBarPage.bindersPage();
        waitForElementToBeClickable(binder);
        click(binder);

        if (!doesElementExist(emptyBinderMessage, 1)) {
            while (!doesElementExist(emptyBinderMessage, 0)) {
                if (doesElementExist(firstElementsIcon, 0)) {
                    javascriptClick(firstElement);
                    String name = driver.findElement(selectedCheckBox).getAttribute("uib-tooltip");
                    actionDropDownDelete();
                    deleteFolderModalPage.deleteFolder(name, reason);
                } else {
                    javascriptClick(firstElement);
                    actionDropDownDelete();
                    deleteDocumentModalPage.reasonAndDelete(reason);
                }
            }
        }
        Assert.assertTrue(doesElementExist(emptyBinderMessage, 1));
    }
}