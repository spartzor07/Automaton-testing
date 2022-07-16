package pages.global_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.HashMap;

public class NotificationsPage extends BasePage {


    public NotificationsPage(WebDriver driver) {
        super(driver);
    }


    public NotificationsPage verifyNotification(String key) {

        HashMap<String, String> text = new HashMap<>();
        text.put("Tag Updated", "Tag Updated!");
        text.put("Tags Updated", "Tags Updated!");
        text.put("Document doesn't exist", "The requested document could not be found");
        text.put("Task Created", "Task Created!");
        text.put("Document annotated and draft saved", "Document annotated and draft saved successfully.");
        text.put("Draft Saved", "Saving draft, this may take a minute.");
        text.put("Task Updated", "Task Updated!");
        text.put("Send Reminder failed", "No User is related to specified Task(s)");
        text.put("Document annotated", "Document annotated successfully.");
        text.put("Document signed and annotated", "Document signed and annotated successfully.");
        text.put("Document type and status updated", "Document type and status updated.");
        text.put("Folder structure", "Folder structure successfully imported.");
        text.put("Project structure", "Project structure successfully imported.");
        text.put("Tag Created", "Tag Created!");
        text.put("User Roles Updated", "User Roles Updated!");
        text.put("Team name updated", "Team name updated.");
        text.put("Team timezone updated", "Team timezone updated.");
        text.put("Printer Updated", "Team printer upload binder updated.");
        text.put("Label Deleted", "Label successfully deleted.");
        text.put("Updated label", "Updated label.");
        text.put("Binder updated", "Binder updated.");
        text.put("Folder updated", "Folder updated.");
        text.put("Folder Created", "Folder created.");
        text.put("Folder deleted", "Folder deleted.");
        text.put("Document signed", "Document signed successfully.");
        text.put("Document stamp signed", "Document signed and annotated successfully.");
        text.put("Placeholder moved", "Placeholder moved.");
        text.put("Role duplicated", "Role duplicated!");
        text.put("Permissions Updated", "Permissions Updated!");
        text.put("Role Updated", "Role Updated!");
        text.put("Role Deleted", "Role Deleted!");
        text.put("Monitor review created", "Monitor review created!");
        text.put("Monitor review status updated", "Monitor review status updated!");
        text.put("Monitor review comment", "Monitor Review comment added!");
        text.put("Document Approved", "Document marked as approved!");
        text.put("Team form field text updated", "Team form field text updated.");
        text.put("Finalizing document", "Finalizing document, this may take a minute.");
        text.put("Document signed, annotated and finalized", "Document signed, annotated and finalized successfully.");
        text.put("Document annotated and finalized", "Document annotated and finalized successfully.");
        text.put("Document finalized", "Document finalized successfully.");
        text.put("Teammate Added", "1 member(s) added to the team!");
        text.put("Binder created", "Binder created.");
        text.put("Signature Request", "Document signatures requested successfully.");
        text.put("Not Empty Binder", "In order to delete a binder it must be empty");
        text.put("Log moved", "Log moved.");
        text.put("Log entry created", "Log entry successfully created.");
        text.put("Document expiration date", "Document expiration date updated.");
        text.put("Send signature request", "Document signatures: 1 requested");
        text.put("Send bulk signature request", "Document signatures: 2 requested");
        text.put("Send bulk signature request multiple documents", "Document signatures: 10 requested");
        text.put("Send bulk signature request from select documents", "Document signatures: 6 requested");
        text.put("Cancel signature request", "Document signatures: 1 canceled");
        text.put("Cancel and remind signature request", "Document signatures: 1 reminded, 1 canceled");
        text.put("Cancel bulk signature request", "Document signatures: 2 canceled");
        text.put("Cancel bulk signature request multiple documents", "Document signatures: 5 canceled");
        text.put("Send signature reminder", "Document signatures: 1 reminded");
        text.put("Log expiration date updated", "Document expiration date updated.");
        text.put("Log expiration date cleared", "Document expiration date cleared.");
        text.put("Send Announcement", "Announcement sent!");
        text.put("Log details updated", "Log details successfully updated");
        text.put("Team signature option updated", "Team addendum signature, annotation signature updated.");
        text.put("Document declined", "Document declined successfully.");
        text.put("Log declined", "1 Log row declined successfully.");
        text.put("Log entry comment added", "There are no changes to update log entry.");
        text.put("Log entry updated", "Log entry successfully updated.");
        text.put("Log information updated", "Success! Log Information updated!");
        text.put("Log legend updated", "Success! Legend updated!");
        text.put("Send log row signature request", "Log row signatures: 1 requested");
        text.put("Send log row signature reminder", "Log row signatures: 1 reminded");
        text.put("Send log row signature reminder via reports", "Log row signatures: 1 reminded.");
        text.put("Send multiple log row signature requests", "Log row signatures: 2 requested");
        text.put("Update eLog signature request", "Log row signatures: 1 reminded, 1 canceled");
        text.put("Log entry signed", "1 Log row signed successfully.");
        text.put("PHI is marked", "Document(s) marked as containing PHI.");
        text.put("PHI is unmarked", "Document(s) unmarked as containing PHI.");
        text.put("Due Date", "Document due date updated.");
        text.put("Due Date Clear", "Document due date cleared.");
        text.put("Document Date Cleared", "Document expiration date cleared.");
        text.put("Timeline Wrong Date", "Projected start date must be before projected end date.");
        text.put("Team support contact", "Team support contact updated.");
        text.put("Team Signing PIN updated", "Team Signing PIN policy updated.");
        text.put("Sites created", "Sites successfully created.");
        text.put("Study created", "Study successfully created.");
        text.put("Sites updated", "Sites successfully updated.");
        text.put("Study updated", "Study successfully updated.");
        text.put("Items connected", "Items successfully connected.");
        text.put("Monitor group created", "Monitor group successfully created.");
        text.put("Monitor group updated", "Monitor group successfully updated.");
        text.put("Monitor groups connected", "Monitor groups successfully connected.");
        text.put("Signature was added to Folder(s)", "Job Title Signature was added to the Folder(s)");
        text.put("Signature was added to Binder", "Job Title Signature was added to the Binder");
        text.put("Signature was removed from Folder(s)", "Job Title Signature was removed from the Folder(s)");
        text.put("Signature was removed from Binder", "Job Title Signature was removed from the Binder");
        text.put("User Profile updated", "User Profile Successfully updated!");
        text.put("Cookie preferences saved", "Your preferences have been saved. You can always update your communication and cookie preferences on your Profile Page under the Privacy Options tab.");
        text.put("Team support contact updated", "Team support contact updated.");
        text.put("Password updated", "User Password Successfully updated!");
        text.put("Incorrect old password", "Your email or password was incorrect. Please try again.");
        text.put("Old and New password can not be same", "Your new password must be different from the current one!");
        text.put("Scheduled long-term archive successfully", "Successfully scheduled long-term archive!");
        text.put("Email or Password incorrect", "Your email or password was incorrect. Please try again.");
        text.put("Email Activated!", "Email Successfully Activated!");
        text.put("Document Locked", "Document(s) successfully locked");
        text.put("Document Unlocked", "Document(s) successfully unlocked");
        text.put("Registration Failed", "Registration Failed. Please contact customer support for assistance.");
        text.put("Team monitor review", "Team monitor review options updated.");
        text.put("Document reviewed", "Document marked as reviewed!");
        text.put("Log Template Created", "Log template successfully created.");
        text.put("Log Template Updated", "Log template successfully updated.");
        text.put("Log Template Duplicated", "Log template duplicated");
        text.put("Log Template Made Active", "Log template made active.");
        text.put("Log Template Made Inactive", "Log template made inactive.");
        text.put("Log Template With Existing Name", "Your team already has a template with that name. Update to use a unique name and then create the template.");
        text.put("Log Template With Same Details Name", "All details names must be unique. Please update the details names to be unique");
        text.put("Log Template With Same Columns Name", "All column names must be unique. Please update the column names to be unique");
        text.put("Structure Template Imported", "New Template Structure imported");
        text.put("Structure Template With Existing Name", "There is already an existing template with this name.");

        String string = text.get(key);
        String xpath = "//div[contains(text(), '" + string + "')]";
        waitForElementToBeClickable(By.xpath(xpath));
        assertEquals(By.xpath(xpath), string);
        click(By.xpath(xpath));
        return this;

    }

    public NotificationsPage verifyNotificationWithName(String name, String key) {

        HashMap<String, String> xpath = new HashMap<>();
        String documentWithoutExtension = substringBeforeDot(name);
        String extension = substringAfterDot(name);

        xpath.put("Announcement", "//div[starts-with(text(), '" + name + " send!')]");
        xpath.put("Role", "//div[contains(text(), 'Role " + name + " created!')]");
        xpath.put("Task deleted", "//div[contains(text(), 'Successfully deleted task " + name + "!')]");
        xpath.put("Duplicated to", "//div[contains(text(), 'Successfully duplicated to " + name + ".')]");
        xpath.put("Expiration Date", "//div[contains(text(), 'Document " + documentWithoutExtension + " expiration date updated.')]");
        xpath.put("Moved to", "//div[contains(text(), 'Successfully moved to " + name + ".')]");
        xpath.put("Renamed", "//div[contains(text(), 'Document name updated to \"" + documentWithoutExtension + "\".')]");
        xpath.put("Label Created", "//div[contains(text(), 'Created label " + name + ".')]");
        xpath.put("Unsupported file upload", "//div[contains(text(), 'Sorry! We don’t support ." + extension + " file types, so " + name + " could not be uploaded.')]");
        xpath.put("StartsName", "//div[starts-with(text(), '" + name + "')]");
        xpath.put("Permissions Removed", "//div[contains(text(), \"" + name + "\'s Permissions Removed!\")]");
        xpath.put("Delete Tag", "//div[contains(text(), 'Successfully deleted tag " + name + "!')]");
        xpath.put("Duplicate", "//div[starts-with(text(), '" + documentWithoutExtension + " successfully duplicated.')]");
        xpath.put("Move", "//div[starts-with(text(), '" + documentWithoutExtension + " successfully moved.')]");
        xpath.put("Deleted", "//div[contains(text(), '" + documentWithoutExtension + " deleted.')]");
        xpath.put("Teammate Removed", "//div[contains(text(), '" + name + " has been removed from the team.')]");
        xpath.put("Placeholder Created", "//div[contains(text(), '" + name + " placeholder created.')]");
        xpath.put("Log Created", "//div[contains(text(), '" + name + " Log document created.')]");
        xpath.put("Log Deleted", "//div[contains(text(), '" + name + " deleted.')]");
        xpath.put("Binder Deleted", "//div[contains(text(),'Binder " + name + " deleted.')]");
        xpath.put("Binder Name Exist", "//div[contains(text(),'Binder name " + name + " is not available. Please choose another binder name.')]");
        xpath.put("Folder Name Exist", "//div[contains(text(),'A folder with the name, " + name + ", already exists in this location')]");
        xpath.put("Folder Move Name Exist", "//div[contains(text(),'An error occurred for Folder, " + name + ". A folder with the name, " + name + ", already exists in this location')]");
        xpath.put("Invalid Move", "//div[contains(text(),'An error occurred for " + documentWithoutExtension + ". Cannot move into current location')]");
        xpath.put("Log Renamed", "//div[contains(text(), 'Document name updated to \"" + name + "\".')]");
        xpath.put("Assigned Timelines", "//div[contains(text(), \"Assigned Timelines updated for \'" + documentWithoutExtension + "\'!\")]");
        xpath.put("Timeline created", "//div[contains(text(),'Timeline \"" + name + "\" created!')]");
        xpath.put("Timeline updated", "//div[contains(text(),'Timeline \"" + name + "\" Updated!')]");
        xpath.put("Timeline deleted", "//div[contains(text(),'Timeline \"" + name + "\" Deleted!')]");
        xpath.put("Timeline duplicated", "//div[contains(text(), 'Successfully created new timeline " + name + ".')]");
        xpath.put("Duplicate same timeline", "//div[contains(text(),'Timeline name " + name + " is not available. Please choose another timeline name.')]");
        xpath.put("Project updated", "//div[contains(text(),\"Project '" + name + "' updated!\")]");
        xpath.put("Project created", "//div[contains(text(), \"Project '" + name + "' created!\")]");
        xpath.put("Project duplicated", "//div[contains(text(), \"Project '" + name + "' duplicated!\")]");
        xpath.put("Duplicate same project", "//div[contains(text(),'Project name " + name + " is not available. Please choose another project name.')]");
        xpath.put("Project deleted", "//div[contains(text(), \"Project '" + name + "' deleted!\")]");
        xpath.put("Duplicate custom number", "//div[starts-with(text(), '" + documentWithoutExtension + " successfully duplicated ')]");
        xpath.put("Modify completion date", "//div[starts-with(text(), 'Completion date updated for \"" + name + "\".')]");
        xpath.put("Remove timeline item", "//div[starts-with(text(), 'Item \"" + name + "\" removed from timeline!')]");
        xpath.put("Delete tag", "//div[contains(text(), 'Successfully deleted tag\"" + name + "\"!')]");
        xpath.put("Resend invitation", "//div[contains(text(), 'Invitation resent to " + name + ".')]");
        xpath.put("Task Reminder", "//div[contains(., 'reminder(s)')]");
        xpath.put("Structure Template Deleted", "//div[contains(text(), 'Structure Template "+ name +" deleted.')]");

        String message = xpath.get(key);
        waitForElementToFadeIn(By.xpath(message), "opacity", "1");

        return this;
    }

    By downloadStartedMessageBy = By.xpath("//div[@class='ui-notification ng-scope info']//div[@class='message ng-binding']//a[@class='page-action u-d-inline']");
    //TODO find out way to include whole sentence with apostrophe "My download's page"
    By documentReadyToDownloadBy = By.xpath("//a[contains(text(), 'My Downloads')]");
    By shortcutCreatedBy = By.xpath("//a[contains(text(),'CLICK HERE FOR DETAILS')]");
    By congratsMessageBy = By.xpath("//h4[contains(text(), 'Congrats')]");
    By yellowStripMessage = By.xpath("//span[contains(text(), 'Official signature applied.')]");
    By logVersion = By.xpath("//button[contains(text(), ' Version ')]");
    By mySignatureBlueBar = By.xpath("u-d-flex u-flex-wrap document-show__action-bar");
    By yellowBanner = By.xpath("//span[@class='warning-item ng-scope']");
    By userReminded = By.xpath("//div[@class='message ng-binding']");


    public NotificationsPage verifyDownloadStarted() {
        waitForElementToBeClickable(downloadStartedMessageBy);
        assertEquals(downloadStartedMessageBy, "MY DOWNLOADS");
        return this;
    }

    public NotificationsPage verifyReminderOnReports() {
        waitForElementToBeClickable(userReminded);
        assertEquals(userReminded, "Successfully sent 1 reminder(s)!\n" + "CLICK HERE FOR DETAILS");
        return this;
    }

    public NotificationsPage verifyGreenMessageDownloadComplete() {
        waitVisibility(documentReadyToDownloadBy);
        waitForElementToBeClickable(documentReadyToDownloadBy);
        assertEquals(documentReadyToDownloadBy, "My Downloads");
        return this;
    }

    public void verifyShortcutCreated() {
        waitForElementToBeClickable(shortcutCreatedBy);
        assertEquals(shortcutCreatedBy, "CLICK HERE FOR DETAILS");
    }

    public NotificationsPage verifyCongratsMessage() {
        assertEquals(congratsMessageBy, "Congrats - Your document is signed!");
        return this;
    }

    public NotificationsPage verifyOfficialSignatureAppliedNote() {
        assertEquals(yellowStripMessage, "Official signature applied.");
        return this;
    }

    public NotificationsPage verifyOldVersionYellowBanner() {
        waitVisibility(yellowBanner);
        assertEquals(yellowBanner, "This is an old version. See the latest");
        return this;
    }
}