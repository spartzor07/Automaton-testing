package pages.main_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class SelectTeamPage extends BasePage {

    public SelectTeamPage(WebDriver driver) {
        super(driver);
    }

    By userMenuBy = By.id("user-menu");
    By signOutButtonBy = By.xpath("//a[@class='test-signOutLink']");
    By sessionActivityLog = By.xpath("//li/a[@class='test-sessionLogLink-navBar' and contains(@href, 'session-activity')]");
    By editProfile = By.xpath("//a[contains(@href, 'user-profile')]");
    By settingsMenuBy = By.id("admin-menu");
    By manageTeamMembersBy = By.xpath("//a[@class='test-manageMembersLink-navBar']");
    By manageTeamSettingsBy = By.xpath("//a[@class='test-manageProfileLink-navBar']");
    By manageTagsBy = By.xpath("//a[@class='test-manageTagsLink-navBar']");
    By manageRolesBy = By.xpath("//a[@class='test-manageRolesLink-navBar']");
    By teamNameLink = By.xpath("//a[@class='text-center no-print u-cursor-pointer ng-binding']");
    By manageProjectsBy = By.xpath("//a[@class='test-manageProjectsLink-navBar']");
    By needHelpBy = By.xpath("//li/a[@class='test-needHelpLink-navBar']");
    By selectTeamLbl = By.xpath("//section/div/h5[contains(., 'Select Team')]");
    By logTemplatesBy = By.xpath("//a[@class='test-logTemplatesLink-navBar']");
    By structureTemplatesBy = By.xpath("//a[@class='test-manageStudyStartupLink-navBar']");


    public SelectTeamPage verifySignIn(String expectedText) {
        click(userMenuBy);
        assertEquals(signOutButtonBy, expectedText);
        return this;
    }

    public SelectTeamPage selectTeam(String teamName) {
        String team = "//div[contains(text(),'" + teamName + "')]";

        waitForElementToBeClickable(By.xpath(team));
        click(By.xpath(team));
        return this;
    }

    public SelectTeamPage manageTeamSettings() {
        click(settingsMenuBy);
        click(manageTeamSettingsBy);
        return this;
    }

    public SelectTeamPage manageTeamMembers() {
        click(settingsMenuBy);
        click(manageTeamMembersBy);
        return this;
    }

    public SelectTeamPage manageTags() {
        click(settingsMenuBy);
        click(manageTagsBy);
        return this;
    }

    public SelectTeamPage manageRoles() {
        click(settingsMenuBy);
        click(manageRolesBy);
        return this;
    }

    public SelectTeamPage clickOnTeamName (){
        click(teamNameLink);
        return this;
    }

    public SelectTeamPage manageProjects (){
        waitForElementToBeClickable(settingsMenuBy);
        click(settingsMenuBy);
        waitForElementToBeClickable(manageProjectsBy);
        click(manageProjectsBy);
        return this;
    }

    public void signOut() {
        click(userMenuBy);
        click(signOutButtonBy);
    }

    public void openSessionActivityLogs() {
        click(userMenuBy);
        for (int i=0; i<20; i++) {
            try {
                click(sessionActivityLog);
                break;
            } catch (ElementClickInterceptedException e) {
                waitInMilliSeconds(1000);
            }
        }
    }

    public SelectTeamPage openlogTemplates() {
        click(settingsMenuBy);
        click(logTemplatesBy);
        return this;
    }

    public SelectTeamPage openStructureTemplates() {
        click(settingsMenuBy);
        click(structureTemplatesBy);
        return this;
    }

    public void openEditProfile() {
        wait.until(ExpectedConditions.or(ExpectedConditions.urlContains("/app/select-team"), ExpectedConditions.urlContains("/app/user-profile")));
        click(userMenuBy);
        click(editProfile);
    }

    public void openNeedHelp() {
        click(userMenuBy);
        click(needHelpBy);
//        for (int i=0; i<20; i++) {
//            try {
//                click(needHelpBy);
//                break;
//            } catch (ElementClickInterceptedException e) {
//                waitInMilliSeconds(1000);
//            }
//        }
    }

    public Boolean isSelectTeamPageDisplayed() {
        return wait.until(ExpectedConditions.urlContains("/app/select-team")) && driver.findElements(selectTeamLbl).size() > 0;
    }
}