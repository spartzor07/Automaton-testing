package pages.main_pages;

import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utilities.property.PropertyManager;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentPage extends BasePage {

    public DocumentPage(WebDriver driver) {
        super(driver);
    }

    public static String documentModifiedDate;
    public static String documentExpirationDate;
    public static String currentUrl;

    By documentAnnotateButtonBy = By.xpath("//button[contains(text(), 'Annotate')]");
    By yellowBannerOldVersion = By.xpath("//span[@class='warning-item ng-scope']");
    By manageButtonBy = By.xpath("//button[contains(text(), ' Manage ')]");
    By viewFullAuditTrailBy = By.xpath("//button[contains(text(), 'View Full Audit Trail')]");
    By requestSignatureBy = By.xpath("//a[contains(text(), 'Request Signatures')]");
    By deleteDocumentBy = By.xpath("//a[contains(text(), 'Delete')]");
    By redactBy = By.xpath("//li[@class='test-toolbarDropdownRedactBtn ng-scope']");
    By highlightBy = By.xpath("//li[@class='test-toolbarDropdownHiglightBtn ng-scope']");
    By textBy = By.xpath("//li[@class='test-toolbarDropdownTextBtn ng-scope']");
    By timestampBy = By.xpath("//li[@class='test-toolbarDropdownTimestampBtn ng-scope']");
    By createMonitorQueryBy = By.xpath("//li[@class='test-monitorCreateDropdownItem ng-scope']");
    By approveMonitorBy = By.xpath("//li[@ng-click='vm.openApproveModal()']");
    By reviewMonitorBy = By.xpath("//li[@ng-click='vm.openReviewModal()']");
    By documentViewportBy = By.xpath("//div[@class='document-viewer-page-wrapper ng-scope']");
    By textBoxBy = By.xpath("//div[@class='text-box h-100']");
    By pageLoadedBy = By.xpath("//img[@class='page loaded']");
    By documentExtensionBy = By.xpath("//p[contains(text(),'PermissionsPDF.pdf')]");
    // By signButtonBy = By.xpath("//button[@class='document-toolbar__signature-button btn btn-primary m-0 dropdown-toggle']");
    By addendumPageBy = By.xpath("//i[@class='fa fa-paste mr-2']");
    By declineButtonBy = By.xpath("//button[@class='btn btn-primary document-toolbar__signature-button document-toolbar__signature-button--margin ml-2 ng-scope']");
    By versionButtonBy = By.xpath("//button[@class='btn btn-primary dropdown-toggle test-documentVersionsDropdownBtn ng-binding']");
    By versionButton = By.xpath("//button[@class='btn btn-primary dropdown-toggle test-documentVersionsDropdownBtn']");
    By oldVersionBy = By.xpath("//p[contains(text(),' Version 1 ')]");
    By uploadNewVersionBy = By.xpath("//li[@class='test-uploadNewVersionDropdownItem']");
    By uploadNewVersionViaEmailBy = By.xpath("//li[@class='test-emailNewVersionDropdownItem']");
    By actionButtonBy = By.xpath("//button[@class='document-viewer__page-actions-toggle test-documentViewerPageActionsBtn']");
    By setExpirationDateButtonBy = By.xpath("//button[@class='u-d-block btn btn-primary btn-xs test-setOrChangeExpirationDateBtn']");
    By monitorButtonBy = By.xpath("//button[@class='btn btn-primary test-monitorDropdownBtn ng-scope dropdown-toggle']");
    By saveButtonBy = By.xpath("//button[@ng-click='vm.handleOnSave()']");
    By fontSizeBy = By.xpath("//a[@class='toolbar-dropdown-btn-a test-fontSizeDropdownBtn ng-binding ng-scope']");
    By returnToDocumentButtonBy = By.xpath("//button[@class='btn btn-primary test-signatureCompleteModalCancelBtn ng-scope']");
    By activeQueryLinkBy = By.xpath("//a[@class='strong col-xs-10']");
    By renameButtonBy = By.xpath("//button[contains(text(),'Rename')]");
    By saveDocumentButtonBy = By.xpath("//button[@class='btn btn-primary document-edit__save-button ng-scope']");
    By binderRootBreadcrumbLink = By.xpath("//span/span/a[contains(@class, 'white-space-pre-wrap test')]");
    By breadCrumbMenuBy = By.xpath("//span/../span[@id='breadcrumb-menu']");
    By signButtonBy = By.xpath("//button[@class='document-toolbar__signature-button btn btn-primary m-0 dropdown-toggle']");
    By signAddendumButtonBy = By.xpath("//button[@class='document-toolbar__signature-button btn btn-primary m-0 ml-2']");
    By signButtonAnnotateBy = By.xpath("//button[@class='document-toolbar__signature-button btn btn-primary m-0 ml-2']");
    By doneButtonBy = By.xpath("//button[contains(text(), ' Done ')]");
    By addendumActionBy = By.xpath("//a[@class='pl-4 document-toolbar__addendum-sign-button']");
    By stampActionBy = By.xpath("//a[@class='pl-4 document-toolbar__stamp-sign-button']");
    By shortcutFromActionBy = By.xpath("//a[@class='u-d-block ng-binding']");
    By shortcutLink = By.xpath("//a[contains(text(),'View Shortcut Details')]");
    By closeButtonBy = By.xpath("//button[contains(text(),'Close')]");
    By loadingSpinner = By.xpath("//i[@class='fa fa-2x fa-pulse fa-spinner blueText']");
    By markPHI = By.xpath("//p[@aria-hidden='false']");
    By chooseBackgroundColor = By.xpath("//div[@ng-if='!vm.options.text']");
    By backgroundColor = By.xpath("//span[1]/color-option[1]//div[@class='color-option test-neutralColorOption-#000000']");
    By chooseTextColor = By.xpath("//div[@ng-if='vm.options.text']");
    By textColor = By.xpath("//span[2]/color-option[1]//div[@class='color-option test-colorOption-#800080']");
    By chooseFontSize = By.xpath("//a[@class='toolbar-dropdown-btn-a test-fontSizeDropdownBtn ng-binding ng-scope']");
    By fontSize = By.xpath("//a[contains(text(),'60')]");
    By trashCan = By.xpath("//div[@ng-class='{selected: vm.isSelected}']");
    By clearAll = By.xpath("//button[@class='btn btn-default ml-2 ng-scope']");
    By cancelButtonBy = By.xpath("//button[contains(text(),'Cancel')]");
    By viewAllSignersButtonBy = By.xpath("//button[contains(text(),'View All Signers')]");
    By noPreview = By.xpath("//h5[@class='no-preview-title ng-scope']");
    By fileSizeLabel = By.xpath("//p[contains(text(),'File Size:')]");
    By viewDocumentSideTrack = By.xpath("//a[contains(text(),'View Related Document Details')]");
    By latestVersionSelect = By.xpath("//a[contains(text(),'See the latest')]");
    By viewTimelinesBy = By.xpath("//button[contains(text(),'View All Timelines')]");
    By viewTasksBy = By.xpath("//button[contains(text(),'View All Tasks')]");
    By viewMonitorsBy = By.xpath("//button[contains(text(),'View All Monitor Reviews')]");
    By studyProfileTextBy = By.xpath("//li[@class='u-list-style-none']");
    By studyProfileDropDownBy = By.xpath("//p[contains(text(),'Study Profile ')]");
    By fileAttachmentDate = By.xpath("//p[contains(text(),'File Attachment Date:')]");
    By lastModifiedDate = By.xpath("//p[contains(text(),'Last Modified:')]");
    By attachmentDate = By.xpath("//date-time[@class='test-fileAttachmentDate']");
    By dropDownButton = By.xpath("//button[@class='document-viewer__page-actions-toggle test-documentViewerPageActionsBtn']");
    By optionsBar = By.xpath("//document-page-actions[@class='ng-isolate-scope']");
    By rotateLeft = By.xpath("//a[@class='btn btn-primary mr-1 test-rotateCounterClockwiseBtn']");
    By rotateRight = By.xpath("//a[@class='btn btn-primary test-rotateClockwiseBtn']");
    By firstPage = By.xpath("//a[@class='btn btn-primary test-firstPageBtn']");
    By previousPage = By.xpath("//a[@class='btn btn-primary test-previousPageBtn']");
    By nextPage = By.xpath("//a[@class='btn btn-primary test-nextPageBtn']");
    By lastPage = By.xpath("//a[@class='btn btn-primary test-lastPageBtn']");
    By zoomOut = By.xpath("//a[@class='btn btn-primary test-zoomOutBtn']");
    By zoomIn = By.xpath("//a[@class='btn btn-primary u-position-relative test-zoomInBtn']");
    By inputForPageNumber = By.xpath("//input[@type='text']");
    By percentMenu = By.xpath("//a[@class='btn btn-primary u-border-radius-0 test-currentZoomDropdownBtn ng-binding dropdown-toggle']");
    By fiftyPercent = By.xpath("//li[@class='test-zoomOneHalfBtn']");
    By hundredPercent = By.xpath("//li[@class='test-zoomTwoBtn']");
    By fillToWidth = By.xpath("//li[@class='test-zoomZeroBtn']");
    By deleteAnnotate = By.xpath("//div[@aria-label='Delete']");
    By formInput1 = By.xpath("//form-field[13]/div[1]/textbox-form-field[1]/div[1]/page-region[1]/div[1]/div[1]/div[1]");
    By formInputField = By.xpath("//div/span/div[@class='text-annotation h-100 ng-scope selectable']/div");
    By formInput2 = By.xpath("//form-field[2]/div[1]/textbox-form-field[1]/div[1]/page-region[1]/div[1]/div[1]/div[1]");
    By formInput3 = By.xpath("//form-field[23]/div[1]/signature-form-field[1]/div[1]/page-region[1]/div[1]/div[1]/div[1]");
    By formInput4 = By.xpath("//form-field[4]/div[1]/textbox-form-field[1]/div[1]/page-region[1]/div[1]/div[1]/div[1]");
    By formInput5 = By.xpath("//form-field[15]/div[1]/textbox-form-field[1]/div[1]/page-region[1]/div[1]/div[1]/div[1]");
    By signatureRequestTitleBy = By.xpath("//strong[contains(text(),'Signature(s) Requested:')]");
    By signatureRequestTextBy = By.xpath("//div[@class='col-xs-10 ng-binding']");
    By lastModifiedDateBy = By.xpath("//p[@class='strong test-lastModifiedText']/parent::div//span");
    By expirationDateBy = By.xpath("//div[@ng-if='vm.doc.expirationDate']//span");
    By dueDateBy = By.xpath("//div[@ng-if='vm.doc.dueDate']//date-time/span");



    public DocumentPage zoomRotatePage() {
        Actions action = new Actions(driver);
        waitVisibility(pageLoadedBy);
        waitForElementToBeClickable(dropDownButton);
        click(dropDownButton);
        waitVisibility(optionsBar);
        click(rotateLeft);
        click(rotateRight);
        click(nextPage);
        click(previousPage);
        click(lastPage);
        click(firstPage);
        click(zoomIn);
        click(zoomOut);
        writeText(inputForPageNumber,String.valueOf(2));
        action.sendKeys(Keys.ENTER);
        click(percentMenu);
        click(fiftyPercent);
        click(percentMenu);
        click(hundredPercent);
        click(percentMenu);
        click(fiftyPercent);
        click(percentMenu);
        click(fillToWidth);
        return this;
    }


    public boolean isOldVersionYellowBannerDisplayed(){
        return isDisplayed(yellowBannerOldVersion);
    }

    public DocumentPage returnToDocument() {
        waitForElementToBeClickable(returnToDocumentButtonBy);
        click(returnToDocumentButtonBy);
        return this;
    }

    public String readCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public DocumentPage checkFileAttachmentDate() {
        DateFormat localizedDateFormat = new SimpleDateFormat("dd-MMM-yyyy");

        waitVisibility(fileAttachmentDate);
        assertEquals(attachmentDate, localizedDateFormat.format(new Date()));
        return this;
    }

    public DocumentPage lastModifiedCheck() {
        DateFormat localizedDateFormat = new SimpleDateFormat("dd-MMM-yyyy @ h:mm a zzz");
        By lastModifiedDate = By.xpath("//span[contains(text(),'" + localizedDateFormat.format(new Date()) + "')]");

        waitVisibility(lastModifiedDate);
        return this;
    }

    public String lastModifiedRead() {
        String text = readText(lastModifiedDateBy);
        if (substringAfterMonkey(text).substring(1,3).contains("10") || substringAfterMonkey(text).substring(1,3).contains("11") || substringAfterMonkey(text).substring(1,3).contains("12")) {
            return text;
        }else{
            return substringBeforeMonkey(text) + "@ 0" + substringAfterMonkey(text).substring(1);
        }
    }

    public String expirationDateRead() {
        return readText(expirationDateBy);
    }

    public String dueDateDateRead() {
        return readText(dueDateBy);
    }

    public Boolean isOriginalFileNameDisplayed() {
        return isDisplayed(documentExtensionBy);
    }

    public DocumentPage declineAction() {
        click(declineButtonBy);
        return this;
    }

    public DocumentPage manageActionClick() {
        waitForElementToBeClickable(manageButtonBy);
        click(manageButtonBy);
        return this;
    }

    public DocumentPage signFormWithInputFieldToSign() {
        waitForElementToBeClickable(formInput3);
        click(formInput3);
        return this;
    }

    public DocumentPage fontSize(String size) {
        String font = "//li[@class='test-fontSizeDropdownOption-" + size + "']";

        click(fontSizeBy);
        click(By.xpath(font));
        return this;
    }

    public DocumentPage saveDocument() {
        waitForElementToBeClickable(saveButtonBy);
        click(saveButtonBy);
        return this;
    }

    public DocumentPage markAsApproved() {
        waitForElementToBeClickable(monitorButtonBy);
        click(monitorButtonBy);
        click(approveMonitorBy);
        return this;
    }

    public DocumentPage openMonitorQuery() {
        scrollToTheTop();
        waitForElementToBeClickable(monitorButtonBy);
        click(monitorButtonBy);
        click(createMonitorQueryBy);
        return this;
    }

    public void openMonitorMenuButton() {
        waitForElementToBeClickable(monitorButtonBy);
        click(monitorButtonBy);
    }

    public void monitorReviewOptionClick() {
        waitForElementToBeClickable(monitorButtonBy);
        click(reviewMonitorBy);
    }

    public Boolean isMonitorReviewOptionPresent() {
        return doesElementExist(reviewMonitorBy,2);
    }

    public Boolean isMonitorApproveOptionPresent() {
        return doesElementExist(approveMonitorBy,2);
    }

    public DocumentPage openActiveQuery() {
        click(activeQueryLinkBy);
        return this;
    }

    public DocumentPage verifyPlaceholderFilledViaEmail(String placeholderFillDate, String placeholderMovedVia, String originalFileName) {
        String date = "//div[@class='u-flex-basis-100 u-d-flex u-flex-wrap']/div[@class='py-3 u-flex-basis-100 u-sm-flex-basis-50 u-md-flex-basis-100']/p/date-time/span";
        String via = "//div[@class='u-flex-basis-100 u-d-flex u-flex-wrap']/div[2]/p[@class='ng-binding']";
        String document = "//div[@class='u-flex-basis-100 u-d-flex u-flex-wrap']/div[@ng-if='vm.rawFilename']/p[@class='ng-binding']";

        assertEquals(By.xpath(date), placeholderFillDate);
        assertEquals(By.xpath(via), placeholderMovedVia);
        assertEquals(By.xpath(document), originalFileName);
        return this;
    }

    public DocumentPage verifyPlaceholderFilled(String placeholderFillDate, String placeholderMovedVia, String originalFileName) {
        String date = "//div[@ng-if='vm.hasPlaceholderData && vm.doc.dateRawFileUploaded']/p[2]/date-time/span";
        String via = "//div[@class='u-flex-basis-100 u-d-flex u-flex-wrap']/div[@ng-if='vm.hasPlaceholderData && vm.doc.dateRawFileUploaded']/following-sibling::div/p[@class='ng-binding']";
        String document = "//div[@class='u-flex-basis-100 u-d-flex u-flex-wrap']/div[@ng-if='vm.rawFilename']/p[@class='ng-binding']";

        assertEquals(By.xpath(date), placeholderFillDate);
        assertEquals(By.xpath(via), placeholderMovedVia);
        assertEquals(By.xpath(document), originalFileName);
        return this;
    }

    public DocumentPage verifyExpirationDateVisible(String expirationDate) {
        String date = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//span[contains(text(),'" + expirationDate + "')]";
        assertEquals(By.xpath(date), expirationDate);
        return this;
    }

    public DocumentPage setExpirationDate() {
        click(setExpirationDateButtonBy);
        return this;
    }

    public DocumentPage checkVersion(String version) {
        waitVisibility(versionButton);
        assertEquals(versionButton, version);
        return this;
    }

    public DocumentPage uploadNewVersionViaEmail() {
        waitForElementToBeClickable(versionButton);
        click(versionButton);
        click(uploadNewVersionViaEmailBy);
        return this;
    }

    public DocumentPage importViaEmailDone() {
        waitForElementToBeClickable(doneButtonBy);
        click(doneButtonBy);
        return this;
    }

    public DocumentPage viewRelatedDocuments() {
        waitForElementToBeClickable(viewDocumentSideTrack);
        click(viewDocumentSideTrack);
        return this;
    }

    public DocumentPage uploadNewVersion() {
        scrollToTheTop();
        waitForElementToBeClickable(versionButton);
        click(versionButton);
        click(uploadNewVersionBy);
        return this;
    }

    public String emailToName() {
        String email = PropertyManager.getInstance().getEmail();
        return WordUtils.capitalizeFully(email.substring(0, email.length() - 15).replace(".", " "));
    }

    public DocumentPage verifySigners(String signerName, String reason) {
        String signer = "//div[@id='signatures']//div[contains(text(),'" + signerName + " for " + reason + "')]";

        assertEquals(By.xpath(signer), signerName + " for " + reason);
        return this;
    }

    public DocumentPage signDocumentPage() {
        waitForElementToBeClickable(pageLoadedBy);
        waitVisibility(signButtonBy);
        click(signButtonBy);
        return this;
    }

    public DocumentPage signAddendumDocumentPage() {
        waitForElementToBeClickable(pageLoadedBy);
        waitVisibility(signAddendumButtonBy);
        waitForElementToBeClickable(signAddendumButtonBy);
        click(signAddendumButtonBy);
        return this;
    }

    public DocumentPage signAddendumDocumentWithoutPreviewPage() {
        waitVisibility(signAddendumButtonBy);
        waitForElementToBeClickable(signAddendumButtonBy);
        click(signAddendumButtonBy);
        return this;
    }

    public DocumentPage signAnnotateDocumentPage() {
        waitForElementToBeClickable(pageLoadedBy);
        waitVisibility(signButtonAnnotateBy);
        waitForElementToBeClickable(signButtonAnnotateBy);
        click(signButtonAnnotateBy);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        click(documentViewportBy);
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage addendumActionClick() {
        waitForElementToBeClickable(pageLoadedBy);
        waitForElementToBeClickable(addendumActionBy);
        click(addendumActionBy);
        return this;
    }

    public DocumentPage stampActionClick() {
        waitForElementToBeClickable(pageLoadedBy);
        click(stampActionBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage clickAndHold() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        return this;
    }

    public DocumentPage highlightAndStampOnDocument() {
        waitForElementToBeClickable(pageLoadedBy);
        Actions actions = new Actions(driver);
        click(documentAnnotateButtonBy);
        click(highlightBy);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        actions.moveByOffset(-400, -100).click().build().perform();
        click(signButtonBy);
        click(stampActionBy);
        waitForElementToBeClickable(documentViewportBy);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage redactAndStampOnDocument() {
        waitVisibility(pageLoadedBy);
        waitForElementToBeClickable(pageLoadedBy);
        Actions actions = new Actions(driver);
        click(documentAnnotateButtonBy);
        click(redactBy);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 60, 90).build().perform();
        actions.moveByOffset(-300, -150).click(driver.findElement(documentViewportBy)).build().perform();
        click(signButtonBy);
        click(stampActionBy);
        waitForElementToBeClickable(documentViewportBy);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage timeStampAndStampOnDocument() {
        waitForElementToBeClickable(pageLoadedBy);
        Actions actions = new Actions(driver);
        click(documentAnnotateButtonBy);
        click(timestampBy);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(signButtonBy);
        click(stampActionBy);
        waitForElementToBeClickable(documentViewportBy);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage textAndStampOnDocument(String text) {
        waitForElementToBeClickable(pageLoadedBy);
        Actions actions = new Actions(driver);
        click(documentAnnotateButtonBy);
        click(textBy);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        writeText(textBoxBy, text);
        click(signButtonBy);
        click(stampActionBy);
        waitForElementToBeClickable(documentViewportBy);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage timestampDocument() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(timestampBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage timestampDocumentWithModifications() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(timestampBy);
        click(chooseBackgroundColor);
        click(backgroundColor);
        click(chooseTextColor);
        click(textColor);
        click(chooseFontSize);
        click(fontSize);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage textDocument(String text) {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(textBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        writeText(textBoxBy, text);
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage redactDocument() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(redactBy);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 35, 50).build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage highlightDocument() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(highlightBy);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        actions.moveByOffset(-400, -100).click().build().perform();
        click(saveDocumentButtonBy);
        return this;
    }

    public DocumentPage highlightDocumentSaveButtonCheck() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(highlightBy);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        actions.moveByOffset(-400, -100).build().perform();
        waitInMilliSeconds(1000);
        click(deleteAnnotate);
        howManyElementsExists(saveDocumentButtonBy,0);
        return this;
    }

    public DocumentPage textDocumentSaveButtonCheck() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(textBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        writeText(textBoxBy, "text");
        click(deleteAnnotate);
        howManyElementsExists(saveDocumentButtonBy,0);
        return this;
    }

    public DocumentPage redactDocumentSaveButtonCheck() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(redactBy);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(documentViewportBy), 12, 50).build().perform();
        waitInMilliSeconds(1000);
        click(deleteAnnotate);
        howManyElementsExists(saveDocumentButtonBy,0);
        return this;
    }

    public DocumentPage timestampDocumentSaveButtonCheck() {
        waitForElementToBeClickable(pageLoadedBy);
        click(documentAnnotateButtonBy);
        click(timestampBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(documentViewportBy), 0, 0);
        actions.moveByOffset(-400, -100).click().build().perform();
        click(deleteAnnotate);
        howManyElementsExists(saveDocumentButtonBy,0);
        return this;
    }

    public DocumentPage viewAuditTrail() {
        waitForElementToBeClickable(viewFullAuditTrailBy);
        click(viewFullAuditTrailBy);
        return this;
    }

    public DocumentPage requestSignature() {
        waitVisibility(documentViewportBy);
        click(manageButtonBy);
        click(requestSignatureBy);
        return this;
    }

    public DocumentPage deleteDocument() {
        waitVisibility(manageButtonBy);
        waitForElementToBeClickable(manageButtonBy);
        click(manageButtonBy);
        waitForElementToBeClickable(deleteDocumentBy);
        click(deleteDocumentBy);
        return this;
    }

    public DocumentPage oldVersionSelect() {
        waitForElementToBeClickable(versionButton);
        click(versionButton);
        waitForElementToBeClickable(oldVersionBy);
        click(oldVersionBy);
        return this;
    }

    public DocumentPage signButtonVisible() {
        waitVisibility(pageLoadedBy);
        return this;
    }

    public DocumentPage annotateButtonVisible() {
        waitVisibility(documentAnnotateButtonBy);
        return this;
    }

    public DocumentPage loadingSpinnerVisible() {
        waitVisibility(loadingSpinner);
        return this;
    }

    public DocumentPage viewShortcutDetails() {
        click(shortcutLink);
        return this;
    }

    public DocumentPage verifyShortcutName(String shortcut) {
        String shortcutVerify = "//a[contains(text(),'" + shortcut + "')]";

        assertEquals(By.xpath(shortcutVerify), shortcut);
        click(closeButtonBy);
        return this;
    }

    public DocumentPage actionButtonVisible() {
        waitVisibility(actionButtonBy);
        waitForElementToBeClickable(actionButtonBy);
        return this;
    }

    public DocumentPage renameDocument() {
        click(renameButtonBy);
        return this;
    }

    public DocumentPage requestSignatureButtonVisible(int number) {
        howManyElementsExists(requestSignatureBy, number);
        return this;
    }

    public DocumentPage backToBinderRoot() {
        scrollToTheTop();
        waitForElementToBeClickable(binderRootBreadcrumbLink);
        click(binderRootBreadcrumbLink);
        return this;
    }

    public DocumentPage shortcutFromLink() {
        waitForElementToBeClickable(shortcutFromActionBy);
        click(shortcutFromActionBy);
        return this;
    }

    public DocumentPage documentImageLoad() {
        waitVisibility(pageLoadedBy);
        return this;
    }

    public DocumentPage noPreviewAvailable(String fileName) {
        File file = new File(fileName);
        long fileSize = file.length();

        if (fileSize > 0) {
            By fileSizeBy = By.xpath("//h6[contains(text(),'Size: " + getSizeInKB(fileSize) + "')]");
            System.out.println(getSizeInKB(fileSize));
            waitVisibility(fileSizeBy);
        }
        waitVisibility(noPreview);
        return this;
    }

    public DocumentPage signButtonDisplayed(int numberOfButtons) {
        howManyElementsExists(signButtonAnnotateBy, numberOfButtons);
        return this;
    }

    public DocumentPage breadCrumbMenu(String menuItem) {
        By item = By.xpath("//a[contains(text(),'" + menuItem + "')]");

        waitForElementToBeClickable(breadCrumbMenuBy);
        click(breadCrumbMenuBy);
        click(item);
        return this;
    }

    public DocumentPage manageMenuActions(String actionName) {
        String action = "//li/a[contains(text(),'" + actionName + "')]";

        click(manageButtonBy);
        waitForElementToBeClickable(By.xpath(action));
        click(By.xpath(action));
        return this;
    }

    public DocumentPage verifyTypeVisible(String documentStatus, String documentType) {
        String type = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//p[contains(text(),'" + documentType + "')]";
        String status = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//p[contains(text(),'" + documentStatus + "')]";

        assertEquals(By.xpath(type), documentType);
        assertEquals(By.xpath(status), documentStatus);
        return this;
    }

    public DocumentPage verifyDocTypeVisibleWithoutStatus(String documentType) {
        String type = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//p[contains(text(),'" + documentType + "')]";

        assertEquals(By.xpath(type), documentType);
        return this;
    }

    public DocumentPage verifyTimelines(String projectTimelineStatus, String projectTimelineName) {
        String projectStatus = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//a[contains(text(),'" + projectTimelineStatus + "')]";
        String projectName = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//a[contains(text(),'" + projectTimelineName + "')]";

        assertEquals(By.xpath(projectStatus), projectTimelineStatus);
        assertEquals(By.xpath(projectName), projectTimelineName);
        return this;
    }

    public DocumentPage verifyTask(String taskName, String taskStatus) {
        String name = "//div[contains(text(),'" + taskName + "')]";
        String status = "//div[contains(text(),'" + taskStatus + "')]";

        assertEquals(By.xpath(name), taskName);
        assertEquals(By.xpath(status), taskStatus);
        return this;
    }

    public DocumentPage verifyTags(String tagsAssigned) {
        String date = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//span[contains(text(),'" + tagsAssigned + "')]";

        assertEquals(By.xpath(date), tagsAssigned);
        return this;
    }

    public DocumentPage verifyDueDateVisible(String expirationDate) {
        String date = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//span[contains(text(),'" + expirationDate + "')]";

        assertEquals(By.xpath(date), expirationDate);
        return this;
    }

    public DocumentPage verifyMonitorStatus(String statusText) {
        String status = "//div[contains(text(), '" + statusText + "')]";

        assertEquals(By.xpath(status), statusText);
        return this;
    }

    public DocumentPage clickOnMonitorStatus(String statusText) {
        String status = "//div[contains(text(), '" + statusText + "')]";

        click(By.xpath(status));
        return this;
    }

    public DocumentPage numberOfMarkPHIIconsVisible(int numberOfIcons) {
        howManyElementsExists(markPHI, numberOfIcons);
        return this;
    }

    public DocumentPage updateTasks(String taskName) {
        By tasks = By.xpath("//a[@ng-click='vm.doc.permissions.manageDocTasks && vm.openTask({ task })']/div[contains(text(),'" + taskName + "')]");

        waitForElementToBeClickable(tasks);
        click(tasks);
        return this;
    }

    public DocumentPage viewAllSigners() {
        waitForElementToBeClickable(viewAllSignersButtonBy);
        click(viewAllSignersButtonBy);
        return this;
    }

    public DocumentPage clickLeftSideProject(String project) {
        String projectStatus = "//section[@class='u-d-flex u-flex-wrap mb-4 document-details test-documentDetailsSection']//a[contains(text(),'" + project + "')]";

        click(By.xpath(projectStatus));
        return this;
    }

    public boolean isFileSizeSameAsWhenUploaded(String fileName) {

        File file = new File(fileName);
        long fileSize = file.length();

        By documentSize = By.xpath("//p[contains(text(),'" + getSizeInKB(fileSize) + "')]");
        return isDisplayed(documentSize);
    }

    public DocumentPage latestVersionClick() {
        waitForElementToBeClickable(latestVersionSelect);
        click(latestVersionSelect);
        waitInMilliSeconds(2000);
        return this;
    }

    public DocumentPage viewAllTimelines() {
        waitForElementToBeClickable(viewTimelinesBy);
        click(viewTimelinesBy);
        return this;
    }

    public DocumentPage viewAllTasks() {
        waitForElementToBeClickable(viewTasksBy);
        click(viewTasksBy);
        return this;
    }

    public DocumentPage viewAllMonitors() {
        waitForElementToBeClickable(viewMonitorsBy);
        click(viewMonitorsBy);
        return this;
    }

    public DocumentPage studyProfile(String text) {
        click(studyProfileDropDownBy);
        waitVisibility(studyProfileTextBy);
        assertEquals(studyProfileTextBy, text);
        return this;
    }

    public DocumentPage populatingFormFirstPart() {
        click(formInput1);
        waitVisibility(formInputField);
        writeText(formInputField, "form1");
        click(formInput2);
        waitVisibility(formInputField);
        writeText(formInputField, "form2");
        return this;
    }

    public DocumentPage populatingFormSecondPart() {
        click(formInput4);
        waitVisibility(formInputField);
        writeText(formInputField, "form1");
        click(formInput5);
        waitVisibility(formInputField);
        writeText(formInputField, "form2");
        return this;
    }

    public DocumentPage saveForm() {
        click(saveDocumentButtonBy);
        return this;
    }
    public DocumentPage signatureRequestOnLeftSide(String expectedText) {
        waitVisibility(signatureRequestTitleBy);
        assertEquals(signatureRequestTextBy, expectedText);
        return this;
    }
}
