package pages.global_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.File;
import java.time.Duration;

public class
SideBarPage extends BasePage {

    public SideBarPage(WebDriver driver) {
        super(driver);
    }


    By dragAndDropAreaBy = By.xpath("//upload-dropzone[@class='text-center nav-menu__dropzone test-navMenu-dropzone']");
    By importViaEmailBy = By.xpath("//button[@class='btn btn-block nav-menu__dropzone-action test-importViaEmailBtn']");
    By myDownloadsBy = By.xpath("//a[@class='test-myDownloadsLink-navMenu']");
    By bindersBy = By.xpath("//a[@class='test-bindersLink-navMenu']");
    By dashboardBy = By.xpath("//a[@class='test-dashboardLink-navMenu']");
    By needHelpLinkBy = By.xpath("//a[@class='test-needHelpLink-navMenu']");
    By inputFieldForUploadBy = By.xpath("//upload-link[@class='u-font-weight-bold test-importBrowse']");
    By inputFieldBy = By.id("upload-link-input");
    By announcementBy = By.className("test-announcementsLink-navMenu");
    By reportsBy = By.xpath("//a[@class='test-reportsLink-navMenu']");
    By globalBy = By.xpath("//a[@class='test-globalViewLink-navMenu']");


    public SideBarPage changeDisplayAttribute() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(inputFieldForUploadBy);
        jse.executeScript("arguments[0].children[1].style.setProperty('display','block', 'important');", element);
        return this;
    }

    public SideBarPage uploadFile(String fileName) {
        writeText(inputFieldBy, fileName);
        return this;
    }

    public SideBarPage uploadFileWithDifferentMemory(String fileName) {
        File file = new File(fileName);
        long fileSize = file.length();
        if (fileSize <= 1048576) {
            implicitWait(50);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");

        } else if (fileSize <= 5242880) {
            implicitWait(120);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");

        } else if (fileSize <= 10485760) {
            implicitWait(180);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");

        } else if (fileSize <= 20971520) {
            implicitWait(250);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");

        } else if (fileSize <= 52428800 ) {
            implicitWait(300);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");

        } else {
            implicitWait(600);
            writeText(inputFieldBy, fileName);
            System.out.format("The size of the file: " + fileSize + " bytes \n");
        }

        return this;
    }

    public SideBarPage myDownloadsPage() {
        click(myDownloadsBy);
        return this;
    }

    public SideBarPage bindersPage() {
        waitForElementToBeClickable(bindersBy);
        click(bindersBy);
        return this;
    }

    public SideBarPage globalViewPage() {
        click(globalBy);
        return this;
    }

    public SideBarPage importViaEmail() {
        waitForElementToBeClickable(importViaEmailBy);
        click(importViaEmailBy);
        return this;
    }


    public SideBarPage needHelpPage() {
        click(needHelpLinkBy);
        return this;
    }

    public void dragAndDrop(String... fileNamePath) {
        for (String file: fileNamePath) {
            DropFile(new File(file), driver.findElement(dragAndDropAreaBy), 30, 30);
        }
    }

    public static void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
        if (!filePath.exists())
            throw new WebDriverException("File not found: " + filePath.toString());

        WebDriver driver = ((RemoteWebElement) target).getWrappedDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));

        String JS_DROP_FILE =
                "var target = arguments[0]," +
                        "    offsetX = arguments[1]," +
                        "    offsetY = arguments[2]," +
                        "    document = target.ownerDocument || document," +
                        "    window = document.defaultView || window;" +
                        "" +
                        "var input = document.createElement('INPUT');" +
                        "input.type = 'file';" +
                        "input.style.display = 'none';" +
                        "input.onchange = function () {" +
                        "  var rect = target.getBoundingClientRect()," +
                        "      x = rect.left + (offsetX || (rect.width >> 1))," +
                        "      y = rect.top + (offsetY || (rect.height >> 1))," +
                        "      dataTransfer = { files: this.files, types: ['Files'], items: [{ kind: 'file'}] };" +
                        "" +
                        "  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
                        "    var evt = document.createEvent('MouseEvent');" +
                        "    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
                        "    evt.dataTransfer = dataTransfer;" +
                        "    target.dispatchEvent(evt);" +
                        "  });" +
                        "" +
                        "  setTimeout(function () { document.body.removeChild(input); }, 25);" +
                        "};" +
                        "document.body.appendChild(input);" +
                        "return input;";

        WebElement input = (WebElement) jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
        input.sendKeys(filePath.getAbsoluteFile().toString());
        wait.until(ExpectedConditions.stalenessOf(input));
    }

    public SideBarPage announcement() {
        waitForElementToBeClickable(announcementBy);
        click(announcementBy);
        return this;
    }

    public SideBarPage reportsPageNavBar() {
        waitForElementToBeClickable(reportsBy);
        click(reportsBy);
        return this;
    }

    public SideBarPage dashboardNavBar() {
        waitForElementToBeClickable(dashboardBy);
        click(dashboardBy);
        return this;
    }
}
