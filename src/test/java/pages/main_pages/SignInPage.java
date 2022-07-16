package pages.main_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;
import utilities.property.PropertyManager;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    By emailBy = By.id("email-input");
    By passwordBy = By.id("password-input");
    By nextButtonBy = By.xpath("//button[contains(text(), 'Next')]");
    By signInButtonBy = By.xpath("//button[contains(@class, 'test-signInBtn')]");
    By signUpButtonBy = By.id("sign-up-pw-btn");
    By messageSignInFailed = By.xpath("//div[contains(text(), 'Your email or password was incorrect.')]");
    By forgotPasswordBtn = By.cssSelector("[class*=test-forgotPwBtn]");
    By createAccountBtn = By.cssSelector("[class*=test-signUpBtn]");
    By needHelpBtn = By.cssSelector("[class*=test-needHelpBtn]");
    By privacyPolicyLnk = By.xpath("//a[contains(@href, 'privacy-policy')]");
    By termsAndConditionsLnk = By.xpath("//a[contains(@href, 'terms-and-conditions')]");
    By asDifferentUserLnk = By.xpath("//a[contains(@class, 'test-signInDifferentBtn')]");
    By userEmailLbl = By.xpath("//a[contains(@class, 'test-signInDifferentBtn')]/preceding-sibling::b");
    By showPasswordCheckBox = By.xpath("//button[contains(@class, 'test-signInBtn')]/preceding-sibling::div/i[contains(@class, 'checkbox')]");
    By passwordErrMsgLbl = By.xpath("//input[contains(@class, 'test-passwordInput')]/following-sibling::div");

    String baseURL = PropertyManager.getInstance().getURL();

    public SignInPage basePage() {
        driver.get(baseURL);
        return this;
    }

    public SignInPage signIn(String email, String password) {

        writeText(emailBy, email);
        click(nextButtonBy);
        writeText(passwordBy, password);
        click(signInButtonBy);
        return this;
    }

    public void clickSignInButton() {
        click(signInButtonBy);
    }

    public void signUpButtonClick() {
        click(signUpButtonBy);
    }

    public SignInPage signInSAML(String email) {
        writeText(emailBy, email);
        click(nextButtonBy);
        return this;
    }

    public SignInPage verifyButtonDisabled(By elementBy, String attributeName, String expectedText) {
        assertEqualsAttributes(elementBy, attributeName, expectedText);
        return this;
    }

    public SignInPage signInWithWrongData(String email,String credentialsFormat, String password) {
        writeText(emailBy, email);
        if (credentialsFormat.equals("invalid email")) {
            verifyButtonDisabled(nextButtonBy,"disabled","true");
        } else if (credentialsFormat.equals("invalid password")) {
            click(nextButtonBy);
            writeText(passwordBy, password);
            verifyButtonDisabled(signInButtonBy,"disabled","true");
        } else {
            click(nextButtonBy);
            writeText(passwordBy,password);
            click(signInButtonBy);
            waitForElementToBeClickable(messageSignInFailed);
            assertEquals(messageSignInFailed, "Your email or password was incorrect. Please try again.");
        }
        return this;
    }

    public void verifyUserSignedOut() {
        boolean contains = wait.until(ExpectedConditions.urlContains("sign-in"));
        Assert.assertTrue(contains);
    }

//TODO
    public void signInEnterEmail(String s) {
        writeText(emailBy, s);
        ((JavascriptExecutor)driver).executeScript("arguments[0].dispatchEvent(new Event('input'))", getElement(emailBy));
    }
    public void signInEnterPassword(String password) {
        writeText(passwordBy, password);
        ((JavascriptExecutor)driver).executeScript("arguments[0].dispatchEvent(new Event('input'))", getElement(passwordBy));
    }

    public void verifyWrongEmail(String s) {
    }

    public void verifyBorderColorPasswordField(String s) {
    }

    public Boolean isForgotPasswordButtonDisplayed() {
        return getElement(forgotPasswordBtn).isDisplayed();
    }
    public Boolean isCreateAccountButtonDisplayed() {
        return getElement(createAccountBtn).isDisplayed();
    }
    public Boolean isNeedHelpButtonDisplayed() {
        return getElement(needHelpBtn).isDisplayed();
    }
    public Boolean isPrivacyPolicyLinkDisplayed() {
        return getElement(privacyPolicyLnk).isDisplayed();
    }
    public Boolean isTermsAndConditionsLinkDisplayed() {
        return getElement(termsAndConditionsLnk).isDisplayed();
    }
    public void clickPrivacyPolicyLink() {
        click(privacyPolicyLnk);
    }
    public void clickTermsAndConditionsLink() {
        click(termsAndConditionsLnk);
    }
    public void clickNeedHelpButton() {
        click(needHelpBtn);
    }
    public Boolean isPrivacyPolicyPageDisplayed() {
        switchTabs(1);
        try {
            return wait.until(ExpectedConditions.urlContains("/privacy-policy/"));
        } catch (TimeoutException e) {
            return false;
        }
    }
    public Boolean isTermsAndConditionsPageDisplayed() {
        switchTabs(1);
        try {
            return wait.until(ExpectedConditions.urlContains("/terms-and-conditions/"));
        } catch (TimeoutException e) {
            return false;
        }
    }
    public Boolean isNeedHelpSupportPageDisplayed() {
        switchTabs(1);
        try {
            return wait.until(ExpectedConditions.urlContains("/support/"));
        } catch (TimeoutException e) {
            return false;
        }
    }
    public String getValueFromEmailField() {
        return getElement(emailBy).getAttribute("value");
    }
    public String getEmailFieldBorderColor() {
        String hex = getFieldBorderColor(emailBy);
        if (hex.equals("#c9302c")) return "RED";
        if (hex.equals("#dddddd")) return "GRAY";
        if (hex.equals("#66afe9")) return "BLUE";
        return hex;
    }
    public String getPasswordFieldBorderColor() {
        String hex = getFieldBorderColor(passwordBy);
        if (hex.equals("#c9302c")) return "RED";
        if (hex.equals("#dddddd")) return "GRAY";
        if (hex.equals("#66afe9")) return "BLUE";
        return hex;
    }
    public String getValueFromPasswordField() {
        return getElement(passwordBy).getAttribute("value");
    }
    public String getTextFromUserEmailLabel() {
        return getElement(userEmailLbl).getText();
    }
    public void clickSignInAsDifferentUserLink() {
        click(asDifferentUserLnk);
    }
    public Boolean isPasswordFieldDisplayed() {
        return getElement(passwordBy).isDisplayed();
    }
    public Boolean isNextButtonEnabled() {
        return null == getElement(nextButtonBy).getAttribute("disabled");
    }
    public Boolean isSignInButtonEnabled() {
        return null == getElement(signInButtonBy).getAttribute("disabled");
    }
    public Boolean isShowPasswordCheckBoxDisplayed() {
        return getElement(showPasswordCheckBox).isDisplayed();
    }
    public void clickNext() {
        click(nextButtonBy);
    }
    public String getInvalidPasswordErrorMsg() {
        return getElement(passwordErrMsgLbl).getText().trim();
    }
    public void clickForgotPasswordButton() {
        click(forgotPasswordBtn);
    }
    public Boolean isSignInPageDisplayed() {
            return wait.until(ExpectedConditions.urlContains("sign-in"));
    }
}


