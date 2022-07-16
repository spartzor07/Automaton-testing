package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }

    protected void dragAndDropFromOnePlaceToAnother(By sourceLocator, By destinationLocator) {
        Actions builder = new Actions(driver);
        WebElement fromElement = driver.findElement(sourceLocator);
        WebElement toElement = driver.findElement(destinationLocator);
        Action dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();
        dragAndDrop.perform();
    }

    protected void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    protected void waitForElementToBeClickable(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public String substringBeforeDot(String document) {
        String[] array = document.split("\\.");
        return array[0];
    }

    public String substringAfterDot(String document) {
        if (document.contains(".")) {
            String[] array = document.split("\\.");
            return array[1].trim();
        }
        return null;
    }

    public String substringBeforeTwoDots(String document) {
        String[] array = document.split(":");
        return array[0];
    }

    public String substringBeforeMonkey(String document) {
        if (document.contains("@")) {
            String[] array = document.split("@");
            return array[0];
        }
        return null;
    }

    public String substringAfterMonkey(String document) {
        if (document.contains("@")) {
            String[] array = document.split("@");
            System.out.println(Arrays.toString(array));
            return array[1];
        }
        return null;
    }

    public String substringAfterTwoDots(String document) {
        if (document.contains(":")) {
            String[] array = document.split(":");
            return array[1].trim();
        }
        return null;
    }

    public void waitInMilliSeconds(int number) {
        try {
            Thread.sleep(number);
        } catch (InterruptedException ignored) {
        }
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    protected void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    protected void howManyElementsExists(By elementBy, int number) {
        implicitWait(3);
        Assert.assertEquals(driver.findElements(elementBy).size(), number, "Expected number of elements not found!");
        implicitWait(45);
    }

    //for past date set negative number, for today set 0, for future date set positive number
    public void selectDate(By datePickerElementBy, int daysFromToday) {

        //taking current dates of days, month and year
        int currentDateDay = LocalDateTime.now().getDayOfMonth();
        int currentDateMonth = LocalDateTime.now().getMonthValue();
        int switchMonthCounter = LocalDateTime.now().getMonthValue();
        int currentDateYear = LocalDateTime.now().getYear();

        int day = 0, monthNumber = 0, year = 0, monthCounter = 0, yearCounter = 0;
        String monthString;

        //daysFromToday >= 0
        if (daysFromToday >= 0) {
            day = currentDateDay + daysFromToday;
            //getting the day
            while (day > daysInMonth(switchMonthCounter)) {
                day -= daysInMonth(switchMonthCounter);
                monthCounter++;
                switchMonthCounter++;
            }

            monthNumber = currentDateMonth + monthCounter;
            //getting the month
            while (monthNumber > 12) {
                monthNumber -= 12;
                yearCounter++;
            }
            //getting the year
            year = currentDateYear + yearCounter;
        }

        //daysFromToday < 0
        if (daysFromToday < 0) {
            day = currentDateDay + daysFromToday;
            //getting the day
            while (day < 0) {
                day += daysInMonth(switchMonthCounter);
                monthCounter++;
                switchMonthCounter--;
            }

            monthNumber = currentDateMonth - monthCounter;
            //getting the month
            while (monthNumber < 0) {
                monthNumber += 12;
                yearCounter++;
            }
            //getting the year
            year = currentDateYear - yearCounter;
        }

        By dateYear = By.xpath("//span[text()='" + year + "']");
        By monthAndYearButton = By.xpath("//button[@class='btn btn-default btn-sm uib-title']");
        By leftArrow = By.xpath("//button[@class='btn btn-default btn-sm pull-left uib-left']");
        By rightArrow = By.xpath("//button[@class='btn btn-default btn-sm pull-right uib-right']");

        click(datePickerElementBy);

        //set year
        click(monthAndYearButton);
        waitForAngular();
        click(monthAndYearButton);
        if (year < 2021) {
            click(leftArrow);
            waitForElementToBeClickable(dateYear);
            click(dateYear);
        } else if (year > 2040) {
            click(rightArrow);
            waitForElementToBeClickable(dateYear);
            click(dateYear);
        } else {
            waitForElementToBeClickable(dateYear);
            click(dateYear);
        }

        //set month
        By dateMonth;
        switch (monthNumber) {
            case 1:
                monthString = "January";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 2:
                monthString = "February";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 3:
                monthString = "March";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 4:
                monthString = "April";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 5:
                monthString = "May";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 6:
                monthString = "June";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 7:
                monthString = "July";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 8:
                monthString = "August";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 9:
                monthString = "September";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 10:
                monthString = "October";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 11:
                monthString = "November";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
            case 12:
                monthString = "December";
                dateMonth = By.xpath("//span[text()='" + monthString + "']");
                click(dateMonth);
                break;
        }

        //set day
        By dateDay;
        if (daysFromToday == 0 && day < 10) {
            dateDay = By.xpath("//span[@class='ng-binding text-info' and text()='0" + day + "']");
            waitForElementToBeClickable(dateDay);
            click(dateDay);
        } else if (day > 0 && day < 10) {
            dateDay = By.xpath("//span[@class='ng-binding' and text()='0" + day + "']");
            waitForElementToBeClickable(dateDay);
            click(dateDay);
        } else {
            dateDay = By.xpath("//span[@class='ng-binding' and text()='" + day + "']");
            waitForElementToBeClickable(dateDay);
            click(dateDay);
        }
    }

    public int daysInMonth(int i) {
        int months = 0;
        switch (i) {
            case 1:
                months = 31;
                break;
            case 2:
                int year = LocalDateTime.now().getYear();
                months = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? 29 : 28;
                break;
            case 3:
                months = 31;
                break;
            case 4:
                months = 30;
                break;
            case 5:
                months = 31;
                break;
            case 6:
                months = 30;
                break;
            case 7:
                months = 31;
                break;
            case 8:
                months = 31;
                break;
            case 9:
                months = 30;
                break;
            case 10:
                months = 31;
                break;
            case 11:
                months = 30;
                break;
            case 12:
                months = 31;
                break;

        }
        return months;
    }

    public void implicitWait(int i) {
        driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }

    protected void clear(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    protected void clearTextWithBackspace(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
    }

    protected boolean isDisplayed(By elementBy) {
        return driver.findElement(elementBy).isDisplayed();
    }

    protected boolean doesElementExist(By elementBy, int timeout) {
        implicitWait(timeout);
        boolean elementExist = driver.findElements(elementBy).size() > 0;
        implicitWait(45);
        return elementExist;
    }

    protected void writeText(By elementBy, String text) {
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    protected String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    protected String readValue(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("value");
    }

    protected void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    protected void assertEqualsAttributes(By elementBy, String attributeName, String status) {
        Assert.assertEquals(driver.findElement(elementBy).getAttribute(attributeName), status);
    }

    protected void softAssertEquals(By elementBy, String expectedText, SoftAssert softAssert) {
        waitVisibility(elementBy);
        softAssert.assertEquals(readText(elementBy), expectedText);
    }

    protected String getAttribute(By elementBy, String attributeName) {
        return driver.findElement(elementBy).getAttribute(attributeName);
    }

    protected void selectOption(By elementBy, String selectOption) {
        waitVisibility(elementBy);
        new Select(driver.findElement(elementBy)).selectByVisibleText(selectOption);
    }

    protected void selectAllOption(By elementBy) {
        waitVisibility(elementBy);
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        driver.findElement(elementBy).sendKeys(selectAll);
    }

    public void switchTabs(int tabNumber) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber));
    }

    protected void openInNewTab(By locator) {
        String selectLinkOpenInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(locator).sendKeys(selectLinkOpenInNewTab);
    }

    protected void waitForElementToFadeIn(final By elementBy, final String cssValue, final String equals) {
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(elementBy).getCssValue(cssValue).equals(equals);
            }
        });
    }

    protected String getElementColor(By elementBy, String cssValue) {
        return Color.fromString(driver.findElement(elementBy).getCssValue(cssValue)).asHex();
    }

    protected static String getAlphaNumericString(int n) {

        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index = (int) (alphaNumericString.length() * Math.random());
            sb.append(alphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public void refreshPage() {
        driver.navigate().refresh();

    }

    public void scrollToTheBottomWithShiftClick() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).keyDown(Keys.LEFT_SHIFT).build().perform();
        waitInMilliSeconds(500);
    }

    public void scrollToTheBottom() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).build().perform();
        waitInMilliSeconds(500);
    }

    public void scrollToTheTop() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.HOME).build().perform();
        waitInMilliSeconds(500);
    }

    public void quitTestCase(String message) {
        System.out.println(message);
        driver.quit();
    }

    public static String getSizeInKB(long size) {
        long kilo = 1024;
        double kb = (double) size / kilo;

        return String.format("%.2f", kb) + " KB";
    }

    protected WebElement getElement(By element) throws TimeoutException {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException e) {
            throw new TimeoutException(e);
        }
    }

    protected void hoverElement(By elementBy) {
        Actions actions = new Actions(driver);
        waitVisibility(elementBy);
        actions.moveToElement(this.getElement(elementBy)).build().perform();
    }

    protected void waitElementToDisappear(By locator) {
        wait.until(ExpectedConditions.stalenessOf(wait.until(ExpectedConditions.presenceOfElementLocated(locator))));
    }

    protected void javascriptClick(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getElement(locator));
    }

    protected void javascriptScrollToElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(locator));
    }

    protected void javascriptScrollByAmountOfPixels(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    protected String getFieldBorderColor(By locator) {
        int i = 0;
        String hex = "";
        while (!hex.equals(getElementColor(locator, "border-color")) && i < 5) {
            hex = getElementColor(locator, "border-color");
            waitInMilliSeconds(100);
            i++;
        }
        return hex;
    }

    public void numberOfItemsByText(String name, int expectedNumber) {
        By item = By.xpath("//*[contains(text(),'" + name + "')]");

        howManyElementsExists(item, expectedNumber);
    }

    public void waitForAngular() {
        String getAngularVersionScript = "return getAllAngularRootElements()[0].attributes['ng-version']";
        String isAngularPageLoadedScript = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1";
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);

        try {
            Object isAngular = javascriptExecutor.executeScript(getAngularVersionScript);
            if (isAngular != null) {
                Boolean isPageLoaded = (Boolean) javascriptExecutor.executeScript(isAngularPageLoadedScript);
                if (!isPageLoaded) {
                    waitInMilliSeconds(20);
                    try {
                        ExpectedCondition<Boolean> angularLoad = driver -> Boolean.valueOf(((JavascriptExecutor) driver)
                                .executeScript(isAngularPageLoadedScript).toString());
                        boolean angularReady = Boolean.parseBoolean(javascriptExecutor.executeScript(isAngularPageLoadedScript).toString());
                        if (!angularReady) {
                            wait.until(angularLoad);
                        }
                    } catch (WebDriverException ignored) {
                        System.out.println("Exception happened inner");
                    }
                    waitInMilliSeconds(20);
                }
            }
        } catch (WebDriverException ignored) {
            System.out.println("Exception happened outer");
        }
    }

}