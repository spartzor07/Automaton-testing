package utilities.property;

import org.testng.annotations.DataProvider;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataProviderStore {

    @DataProvider
    public static Object[][] binderDataProvider() {

        return new String[][]{
                {PropertyManager.getInstance().getTestingBinder()},
                {PropertyManager.getInstance().getTempBinder()}
        };
    }

    @DataProvider
    public static Object[][] documentSetDataProvider() {

        return new Object[][]{

                {PropertyBasicData.florence_eBinder_User_PermissionsWithExtension},
                {PropertyBasicData.permissionsPDFformWithExtension},
                {PropertyBasicData.permissionsVersion2WithExtension},
                {PropertyBasicData.required_fieldsWithExtension},
                {PropertyBasicData.textualFileWithExtension}
        };
    }

    @DataProvider
    public static Object[][] documentReportDataProvider() {

        return new Object[][]{

                {PropertyBasicData.florence_eBinder_User_PermissionsWithoutExtension},
                {PropertyBasicData.permissionsPDFformWithoutExtension},
                {PropertyBasicData.permissionsVersion2WithoutExtension},
                {PropertyBasicData.required_fieldsWithoutExtension},
                {PropertyBasicData.textualFileWithoutExtension},
                {PropertyBasicData.one_mbWithoutExtension}
        };

    }

    @DataProvider
    public static Object[][] labelsAssignedReportDataProvider() {

        return new Object[][]{

                {"Labels - Assigned"}
        };
    }

    @DataProvider
    public static Object[][] documentExpiringReportDataProvider() {

        return new Object[][]{

                {"Documents Expiring - All", "Documents Expiring - In 2 Days", "Documents Expiring - In 14 Days", "Documents Expiring - In 30 Days", "Documents Expiring - In 60 Days"}
        };
    }

    @DataProvider
    public static Object[][] placeholderExpiringReportDataProvider() {

        return new Object[][]{

                {"Placeholders Due - All", "Placeholders Due - In 2 Days", "Placeholders Due - In 14 Days", "Placeholders Due - In 30 Days", "Placeholders Due - In 60 Days"}
        };
    }

    @DataProvider
    public static Object[][] documentTaskReportDataProvider() {

        return new Object[][]{

                {"Tasks - Closed", "Tasks - My Queue", "Tasks - Pending"}
        };
    }

    @DataProvider
    public static Object[][] documentSignaturesReportDataProvider() {

        return new Object[][]{

                {"Signatures - Completed", "Signatures - Declined", "Signatures - My Queue", "Signatures - Pending", "Signatures - Sign By Date"}
        };
    }

    @DataProvider
    public static Object[][] monitorReportDataProvider() {

        return new Object[][]{

                {"Monitor Reviews - Approved and Reviewed", "Monitor Reviews - Open Query"}
        };
    }

    @DataProvider
    public static Object[][] documentDifferentSizeSetDataProvider() {

        return new Object[][]{

                {PropertyBasicData.one_mbWithExtension},
                {PropertyBasicData.five_mbWithExtension},
                {PropertyBasicData.ten_mbWithExtension},
                {PropertyBasicData.twenty_mbWithExtension},
                {PropertyBasicData.mergedWithExtension},
        };
    }


    @DataProvider
    public static Object[][] placeholderDataProvider() {

        return new String[][]{

                {"New placeholder"}
        };
    }

    @DataProvider
    public static Object[][] placeholderDuplicateDataProvider() {

        return new String[][]{

                {"New placeholder", PropertyManager.getInstance().getTempBinder(), "I am automated test"}
        };
    }

    @DataProvider
    public static Object[][] duplicateNegativeTestDataProvider() {

        return new String[][]{

                {"New placeholder", "101"},
                {"/", "2"},
                {":", "2"},
                {">", "2"},
                {"<", "2"},
                {"\"", "2"},
                {"|", "2"},
                {"?", "2"},
                {"*", "2"},
        };
    }

    @DataProvider
    public static Object[][] folderDataProvider() {

        return new String[][]{

                {PropertyBasicData.folder}
        };
    }

    @DataProvider
    public static Object[][] logDataProvider() {

        return new String[][]{

                {"Placeholder 2", "I am automated test", PropertyManager.getInstance().getTempBinder(), "New log updated", "Automation template 1", "Downloaded", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), PropertyManager.getInstance().getClient_accountName()}
        };
    }

    @DataProvider
    public static Object[][] signatureRequestDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension, "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "Clinical"}
        };
    }

    @DataProvider
    public static Object[][] pendingFeaturesDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension, PropertyManager.getInstance().getAutomation_accountName(), "Addendum", "Approval", "Automated comment"}
        };
    }

    @DataProvider
    public static Object[][] baseLogDataProvider() {

        return new String[][]{

                {"Placeholder 2"}
        };
    }

    @DataProvider
    public static Object[][] logDetailsDataProvider() {

        return new String[][]{

                {"Placeholder 2", "Automation investigator", "Automation study", "123", "Automation investigator updated", "Automation study updated", "321"}
        };
    }

    @DataProvider
    public static Object[][] logEntryDataProvider() {

        return new String[][]{

                {"Placeholder 2", "Audit Trail", "Decline", "Edit", "Sign", "Request Signatures", "Automation log entry comment", "Automation entry", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "I am automated test"}
        };
    }

    @DataProvider
    public static Object[][] logEntryMultipleSignersDataProvider() {

        return new String[][]{

                {"New log 1", "Automation template", "Automation investigator", "Automation study", "123", "Request Signatures", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "Clinical", "Automation log entry comment", "Automation test", "Approval"}
        };
    }

    @DataProvider
    public static Object[][] dashboardDataProvider() {

        return new String[][]{

                {"Project", "ATimeline", PropertyManager.getInstance().getTestingBinder()}
        };
    }

    @DataProvider
    public static Object[][] dashboard2DataProvider() {

        return new String[][]{

                {"Protocol 1", "Timeline 1", PropertyManager.getInstance().getTestingBinder()}
        };
    }

    @DataProvider
    public static Object[][] dashboardXAxisDataProvider() {

        return new String[][]{

                {"Project", "2020", "2022", "Jan\n2020", "Dec\n2022", "Aug\n2021", "Oct\n2021"}
        };
    }

    @DataProvider
    public static Object[][] dashboardNegativeDataProvider() {

        return new String[][]{
                {"/", "Automated test"},
                {":", "Automated test"},
                {">", "Automated test"},
                {"<", "Automated test"},
                {"\"", "Automated test"},
                {"|", "Automated test"},
                {"?", "Automated test"},
                {"*", "Automated test"},
                {"", "Automated test"},
                {"Automated test", ":"},
                {"Automated test", ">"},
                {"Automated test", "<"},
                {"Automated test", "\""},
                {"Automated test", "|"},
                {"Automated test", "?"},
                {"Automated test", "*"},
                {"", "/"},
                {"", ""},
        };
    }

    @DataProvider
    public static Object[][] documentDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension}
        };
    }

    @DataProvider
    public static Object[][] sameDocumentDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension},
                {PropertyBasicData.permissionsPDFWithoutExtension},
                {PropertyBasicData.permissionsPDFWithoutExtension},
                {PropertyBasicData.permissionsPDFWithoutExtension}
        };
    }

    @DataProvider
    public static Object[][] reportMainBinderDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension},
                {PropertyBasicData.permissionsPDFformWithoutExtension},
                {PropertyBasicData.permissionsVersion2WithoutExtension},
                {PropertyBasicData.required_fieldsWithoutExtension},
                {PropertyBasicData.one_mbWithoutExtension},
                {PropertyBasicData.one_mbWithoutExtension + " - Shortcut"},
                {PropertyBasicData.permissionsPDFformWithoutExtension + " - Shortcut"}
        };
    }

    @DataProvider
    public static Object[][] reportTempBinderDataProvider() {

        return new String[][]{

                {"TextualFile"},
                {"Florence eBinder User Permissions"}
        };
    }

    @DataProvider
    public static Object[][] signersDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension, "Approval", "I Am Automated Test", PropertyBasicData.one_mbWithExtension, "VERSION (V2)", "2\nAutomated Tests\nApproval\n"}
        };
    }

    @DataProvider
    public static Object[][] assignTimelineToDocumentDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension, "Protocol/Timeline", "Wrong search"}
        };
    }

    @DataProvider
    public static Object[][] multipleAssignToTimelineDataProvider() {

        return new String[][]{

                {"Protocol/Timeline", "Protocol 1/Timeline 1", "Protocol 2/Timeline 2", "Protocol 3/Timeline 3", "Protocol 4/Timeline 4"}

        };
    }

    @DataProvider
    public static Object[][] setAssignToTimelineDataProvider() {

        return new String[][]{

                {"Project Name\n" +
                        "Timeline Name\n" +
                        "Protocol Timeline\n" +
                        "Protocol 1 Timeline 1\n" +
                        "Protocol 2 Timeline 2\n" +
                        "Protocol 3 Timeline 3\n" +
                        "Protocol 4 Timeline 4"}
        };
    }

    @DataProvider
    public static Object[][] setMonitorsDataProvider() {
        DateFormat localizedDateFormat = new SimpleDateFormat("dd-MMM-yyyy @ h:mm a zzz");
        return new String[][]{

                {"Unique Protocol ID Monitor Group Review Status Last Modified\n" +
                        "Neki 2 Test1 Open " + localizedDateFormat.format(new Date()) + "\n" +
                        "Neki Test1 Open " + localizedDateFormat.format(new Date()) + "\n" +
                        "[empty] Test1 Open " + localizedDateFormat.format(new Date()) + "\n" +
                        "Monitor Test1 Open " + localizedDateFormat.format(new Date())}
        };
    }

    @DataProvider
    public static Object[][] multipleTaskDataProvider() {

        return new String[][]{

                {"Automation Test"},
                {"Automation Test 1"},
                {"Automation Test 2"},
                {"Automation Test 3"},
                {"Automation Test 4"},
        };
    }

    @DataProvider
    public static Object[][] setTaskDataProvider() {

        return new String[][]{

                {"Name\n" +
                        "Automation Test 1\n" +
                        "Automation Test 2\n" +
                        "Automation Test 3\n" +
                        "Automation Test 4\n" +
                        "Automation Test 5"}
        };
    }

    @DataProvider
    public static Object[][] studyProfileDocumentDataProvider() {

        return new String[][]{

                {"Unique Protocol ID:\n" +
                        "100\n" +
                        "Nickname:\n" +
                        "100 - - pfizer-double-blind\n" +
                        "Sponsor:\n" +
                        "SpoName\n" +
                        "CRO:\n" +
                        "test cro name\n" +
                        "Device/Drug:\n" +
                        "test drug name\n" +
                        "Condition/Disease:\n" +
                        "test condition"}
        };
    }

    @DataProvider
    public static Object[][] breadCrumbMenuDataProvider() {

        return new String[][]{

                {"Global View"},
                {"Binders"},
                {"Reports"},
                {"Dashboard"},
                {"My Downloads"},
                {"Announcement"}
        };
    }

    @DataProvider
    public static Object[][] unSupportedFilesDataProvider() {

        return new String[][]{

                {"proba.bat"},
                {"proba.sh"},
                {"proba.exe"}
        };
    }

    @DataProvider
    public static Object[][] documentDuplicateDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension, PropertyManager.getInstance().getTempBinder(), "I am automated test"}
        };
    }


    @DataProvider
    public static Object[][] teamMembersAuditDataProvider() {

        return new String[][]{

                {"Teammate Added", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "clinicalpatientflo@gmail.com", "", "", "", "", "", "", ""},
                {"Teammate Removed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "clinicalpatientflo@gmail.com", "", "", "", "", "", "", ""},
                {"User Permissions Updated", PropertyManager.getInstance().getEmail(), "Clinical Patient", "", "", "", "", "", "", "", ""},
                {"Teammate(s) Added to Role", PropertyManager.getInstance().getEmail(), "Senior", "clinicalpatientflo@gmail.com", "", "", "", "", "", "", ""},
                {"Role Access Updated", PropertyManager.getInstance().getEmail(), "Senior", "", "", "", "", "clinicalpatientflo@gmail.com", "User was not assigned to role", "", ""},
                {"Teammate(s) Removed from Role", PropertyManager.getInstance().getEmail(), "Senior", "clinicalpatientflo@gmail.com", "", "", "", "", "", "", ""},
                {"All User Permissions Removed", "clinicalpatientflo@gmail.com", "clinicalpatientflo@gmail.com", "", "", "", "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] teamSettingsAuditDataProvider() {

        return new String[][]{

                {"Team Renamed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "", "", "", "", "", "", "", ""},
                {"Team Timezone Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "", "", "", "", "", "", "", ""},
                {"Label Created", PropertyManager.getInstance().getEmail(), "Test", "Values:\n" + "Ne values", "", "", "", "", "", "", ""},
                {"Label Updated", PropertyManager.getInstance().getEmail(), "Test2", "", "", "", "", "", "Updated Values:", "No values > Value 2", ""},
                {"Label Updated", PropertyManager.getInstance().getEmail(), "Test2", "", "", "", "Test > Test2", "", "", "", ""},
                {"Label Updated", PropertyManager.getInstance().getEmail(), "Test2", "", "", "Added Values:", "New value", "", "", "", ""},
                {"Label Updated", PropertyManager.getInstance().getEmail(), "Test2", "", "", "", "", "", "", "Removed Values:", "New value"},
                {"Label Deleted", PropertyManager.getInstance().getEmail(), "Test2", "", "", "", "", "", "", "", ""},
                {"Team Form Field Text Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "", "", "", "", "", "", "", ""},
                {"Team Signing PIN Policy Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "Enabled > Disabled", "", "", "", "", "", "", ""},
                {"Team Signing PIN Policy Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "", "", "", "Expiry Days: 1 to 80\nLogin Alert Days: 2 to 8", "", "", "", ""},
                {"Team Signature Policy Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "Addendum to Both", "", "", "", "", "", "", ""},
                {"Team Support Contact Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "Team Contact Email: \"mail123@gmail.com\" > \"mail@gmail.com\"", "", "", "", "", "", "", ""},
                {"Team Support Contact Changed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingTeam(), "", "", "", "Team Contact Phone: \"1234\" > \"1234567\"", "", "", "", ""},

        };
    }

    @DataProvider
    public static Object[][] binderAuditDataProvider() {

        return new String[][]{

                {"Binder Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", "", ""},
                {"Binder Renamed", PropertyManager.getInstance().getEmail(), "Main renamed", "", "", "", "Main renamed > " + PropertyManager.getInstance().getTestingBinder(), "", "", "", ""},
                {"Binder Labels Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder(), "", "Assigned Values:", "Unique Protocol ID: Monitor", "", "", "", "", ""},
                {"Binder Downloaded", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", "", ""},
                {"Job Title Added to Signature", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", "", ""},
                {"Job Title Removed from Signature", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", "", ""}

        };
    }


    @DataProvider
    public static Object[][] folderAuditDataProvider() {

        return new String[][]{

                {"Folder Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "", "", "", "", "", "", ""},
                {"Folder Renamed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "", "", "New folder updated > New folder", "", "", "", ""},
                {"Folder Labels Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "Assigned Values:", "Unique Protocol ID: Monitor", "", "", "", "", ""},
                {"Folder Downloaded", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "", "", "", "", "", "", ""},
                {"Folder Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "", "", PropertyManager.getInstance().getTempBinder() + "/New folder >   " + PropertyManager.getInstance().getTestingBinder() + "/New folder", "", "", "", ""},
                {"Folder Duplicated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder() + "/New folder", "", "", "", PropertyManager.getInstance().getTestingBinder() + "/New folder >   " + PropertyManager.getInstance().getTempBinder() + "/New folder", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] placeholderAuditDataProvider() {

        return new String[][]{

                {"Placeholder Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
                {"Placeholder Viewed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
                {"Placeholder Due Date Set", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
                {"Placeholder Downloaded", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
                {"Placeholder Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder() + "/New placeholder Version: 1", "", "", "", PropertyManager.getInstance().getTempBinder() + "/New placeholder >   " + PropertyManager.getInstance().getTestingBinder() + "/New placeholder", "", "", "", ""},
                {"Placeholder Tags Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "Assigned Tags:", "Chronical", "", "", "", "", ""},
                {"Document Type Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
                {"Placeholder Duplicated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "Duplicate Count: 1", PropertyManager.getInstance().getTestingBinder() + "/New placeholder > " + PropertyManager.getInstance().getTempBinder() + "/New placeholder", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] logEntryAuditDataProvider() {

        return new String[][]{

                {"Log Entry Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "", "", ""},
                {"Log Entry Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "Automation log entry comment", "", ""},
                {"Log Entry Signed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "Signed for Acknowledge", "", ""},
                {"Log Entry Signature Requested", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "", "", ""},
                {"Log Entry Signature Request Declined", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "I am automated test", "", ""},
                {"Log Entry Signature Request Reminder", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/Placeholder 2 Log Entry Row: 1", "", "", "", "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] logAuditDataProvider() {

        String binderName = PropertyManager.getInstance().getTestingBinder();
        return new String[][]{

                {"Log Created", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Viewed", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 3", "", "", "", "", "", "", "", ""},
                {"Log Downloaded", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 2", "", "", "", "", "", "", "", ""},
                {"Log Expiration Date Set", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder() + "/Placeholder 2 Version: 2", "", "", "", "", "", "", "", ""},
                {"Log Renamed", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Signature Requested", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 2", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Log", "None"},
                {"Log Tags Updated", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 2", "", "", "", "", "", "", "", ""},
                {"Log Details Updated", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 2", "Study Title: Automation study", "Unique Protocol ID: 123",
                        "Principal Investigator: Automation investigator", "Study Title: Automation study updated", "Unique Protocol ID: 321", "Principal Investigator: Automation investigator updated", "Automated test", ""},
                {"Log Signature Request Reminder", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 1", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Log", "None"},
                {"Log Signature Request Removed", PropertyManager.getInstance().getEmail(), binderName + "/Placeholder 2 Version: 2", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - automated.tests@florencehc.com", "", "Acknowledge", "Log", "None"}
        };
    }

    @DataProvider
    public static Object[][] placeholderFilledAuditDataProvider() {

        return new String[][]{

                {"Placeholder Filled", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "", "", "", "", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] placeholderFilledViaEmailAuditDataProvider() {

        return new String[][]{

                {"Placeholder Filled Via Email", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/New placeholder Version: 1", "Replaced document from email", "", "", "", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] assignTimelineToPlaceholderDataProvider() {

        return new String[][]{

                {"New placeholder", "Protocol/Timeline", "Wrong search"}
        };
    }

    @DataProvider
    public static Object[][] createTaskDataProvider() {

        return new String[][]{

                {"PermissionsPDF.pdf", "Automation Test", "Status: Todo", PropertyManager.getInstance().getAutomation_accountName()}
        };
    }

    @DataProvider
    public static Object[][] documentAuditDataProvider1() {

        return new String[][]{

                {"Document Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Viewed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 2", "", "", "", "", "", "", "", ""},
                {"Document Expiration Date Set", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Downloaded", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder() + "/PermissionsPDF Version: 1", "", "", "", PropertyManager.getInstance().getTempBinder() + "/PermissionsPDF >   " + PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF", "", "", "", ""},
                {"Document Tags Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "Assigned Tags:", "Chronical", "", "", "", "", ""},
                {"Document Type Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "Document Type: No Document Type Assigned", "Document Status: No Document Status Assigned", "Document Type: Black", "Document Status: One", "", "", ""},
                {"Document Signed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "Signed for Approval", "", "", "", "", "", "", ""},
                {"Document Marked as PHI", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Unmarked as PHI", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Duplicated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "Duplicate Count: 1", PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF > " + PropertyManager.getInstance().getTempBinder() + "/PermissionsPDF", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] documentAuditDataProvider3() {

        return new String[][]{

                {"Document Replaced", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 7", "I Am Automated Test", "", "", "", "", "", "", ""},
                {"Signature Placed on Document", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 3", "", "", "", "", "", "", "", ""},
                {"Document Highlighted", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 5", "", "", "", "", "", "", "", ""},
                {"Document Redacted", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 4", "", "", "", "", "", "", "", ""},
                {"Text Added to Document", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 8", "", "", "", "", "", "", "", ""},
                {"Document Signature Requested", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 8", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Any", "None"},
                {"Document Signature Request Reminder", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 8", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Any", "None"},
                {"Document Signature Request Removed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 8", "", "", "", "Clinical Patient - clinicalpatientflo@gmail.com", "", "Acknowledge", "Any", "None"},
                {"Signature Request Declined", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 8", "", "", "", "", "", "Acknowledge", "", ""},
        };
    }

    @DataProvider
    public static Object[][] formAuditDataProvider() {

        return new String[][]{

                {"Document Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/financialDisclosure Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Viewed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/financialDisclosure Version: 2", "", "", "", "", "", "", "", ""},
                {"Document Signed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/financialDisclosure Version: 2", "Signed for Approval", "", "", "", "", "", "", ""},
                {"Form Finalized", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/financialDisclosure Version: 2", "", "", "", "", "", "", "", ""},
                {"Signature Placed on Document", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/financialDisclosure Version: 2", "", "", "", "", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] documentAuditDataProvider2() {

        return new String[][]{

                {"Document Imported Via Email", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Document Replaced Via Email", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "Replaced document from email", "", "", "", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] taskAuditDataProvider() {

        return new String[][]{

                {"Task Created", PropertyManager.getInstance().getEmail(), "Task For Renaming", "", "", "", "", "", "", "", ""},
                {"Task Deleted", PropertyManager.getInstance().getEmail(), "Automation Test", "", "", "", "", "", "", "", ""},
                {"Task Reminder", PropertyManager.getInstance().getEmail(), "Automation Test", "Sent to:\nAutomated Tests - automated.tests@florencehc.com", "", "", "", "", "", "", ""},
                {"Task Updated", PropertyManager.getInstance().getEmail(), "Task For Renaming", "Status: Todo > Closed\nTitle: Renamed > Task For Renaming", "", "", "", "", "", "", ""},
                {"Task Assignee Removed", PropertyManager.getInstance().getEmail(), "Automation Test", "Assignee Removed:\nAutomated Tests - automated.tests@florencehc.com", "", "", "", "", "", "", ""},
                {"Task Assigned", PropertyManager.getInstance().getEmail(), "Task For Renaming", "Assigned to:\nAutomated Tests - automated.tests@florencehc.com", "", "", "", "", "", "", ""},
        };
    }


    @DataProvider
    public static Object[][] roleManageAuditDataProvider() {

        return new String[][]{

                {"Role Created", PropertyManager.getInstance().getEmail(), "Automated Test", "", "", "", "", "", "", "", ""},
                {"Role Permissions Updated", PropertyManager.getInstance().getEmail(), "Automated Test", "", "", "", "", "", "", "", ""},
                {"Teammate(s) Added to Role", PropertyManager.getInstance().getEmail(), "Automated Test", "", "", "", "", "", "", "", ""},
                {"Role Renamed", PropertyManager.getInstance().getEmail(), "Automated Test", "", "", "", "", "", "", "", ""},
                {"Role Access Updated", PropertyManager.getInstance().getEmail(), "Automated Test", "", "", "", "", "", "", "", ""}

        };
    }

    @DataProvider
    public static Object[][] teamSettingsStudyProfileAuditDataProvider() {

        return new String[][]{

                {"Site Created", PropertyManager.getInstance().getEmail(), "Unique Protocol ID: 100", "Site Name: CRO", "Principal Investigator: test cro name", "Lead Coordinator: Device Drug", "Site ID: test drug name", "Site Country: test condition", "", "", ""},
                {"Study Created", PropertyManager.getInstance().getEmail(), "Unique Protocol ID: 100", "Unique Protocol ID: Unique Protocol ID", "Study Nickname: 100", "Sponsor: Nickname", "CRO: 100 - - pfizer-double-blind", "Device/Drug: Sponsor", "Condition/Disease: SpoName", "", ""},
                {"Study Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "Unique Protocol ID: new unique > 100", "Study Nickname: new study > 100 - - pfizer-double-blind", "Sponsor: new sponsor > SpoName", "", "", "", "", ""},
                {"Site Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "", "", "", "", "Site Name: new site > site name", "Principal Investigator: new principalInvestigator > mister pi", "Lead Coordinator: new leadCoordinator > sally"},
                {"Study Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "Added Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", ""},
                {"Study Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "", "", "Removed Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", ""},
                {"Site Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "Added Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", "", "", "", ""},
                {"Site Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "", "", "Removed Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", ""},
                {"Study Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "Added Binders & Folders:\n" + PropertyManager.getInstance().getTempBinder(), "Removed Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", "", ""},
                {"Site Binders & Folders Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "Added Binders & Folders:\n" + PropertyManager.getInstance().getTempBinder(), "Removed Binders & Folders:\n" + PropertyManager.getInstance().getTestingBinder(), "", "", "", "", ""},
                {"Study Monitor Groups Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "Added Monitor Groups:\n" + "Alfa monitor", "", "", "", "", "", "", ""},
                {"Study Monitor Groups Updated", PropertyManager.getInstance().getEmail(), "100: 100 -  - pfizer-double-blind", "", "", "", "Removed Monitor Groups:\n" + "Alfa monitor", "", "", "", ""},
                {"Monitor Group Created", PropertyManager.getInstance().getEmail(), "Monitor name", "" + "", "", "", "", "", "", "", ""},
                {"Monitor Group Updated", PropertyManager.getInstance().getEmail(), "Monitor name", "", "", "", "", "", "", "", ""},

        };
    }

    @DataProvider
    public static Object[][] duplicatedRoleAuditDataProvider() {

        return new String[][]{

                {"Role Duplicated", PropertyManager.getInstance().getEmail(), "New duplicated role", "", "", "", "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] rolesAuditDataProvider() {

        return new String[][]{

                {"Automated Test", "I Am Automated Test", PropertyManager.getInstance().getAutomation_accountName()},
        };
    }

    @DataProvider
    public static Object[][] rolesDuplicatedDataProvider() {

        return new String[][]{

                {"Automated Test", "New duplicated role"},
        };
    }

    @DataProvider
    public static Object[][] rolesRenameDataProvider() {

        return new String[][]{

                {"Automated Test", "New renamed role"},
        };
    }

    @DataProvider
    public static Object[][] rolesPermissionsDataProvider() {

        return new String[][]{

                {"Automated Test", "Download Documents with PHI", "Manage Long-term Archive",
                        "Manage Monitor Reviews", "Manage Team and its Contents", "View Documents With PHI"},
        };
    }

    @DataProvider
    public static Object[][] monitorReviewShortcutAuditDataProvider() {

        return new String[][]{

                {"Monitor Review - Open Query", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Document Approved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Comment Added", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Closed Query", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] monitorReviewDocumentAuditDataProvider() {

        return new String[][]{

                {"Monitor Review - Open Query", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Document Approved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Comment Added", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""},
                {"Monitor Review - Closed Query", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Version: 1", "", "", "", "", "", "", "", ""}

        };
    }

    @DataProvider
    public static Object[][] shortcutAuditDataProvider() {

        return new String[][]{

                {"Shortcut Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Shortcut Viewed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Shortcut Tags Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 1", "", "Assigned Tags:", "Chronical", "", "", "", "", ""},
                {"Shortcut Downloaded", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 1", "", "", "", "", "", "", "", ""},
                {"Shortcut Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 2", "", "", "", PropertyManager.getInstance().getTempBinder() + "/PermissionsPDF - Shortcut >   " + PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut", "", "", "", ""},
                {"Shortcut Signed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 2", "Signed for Approval", "", "", "", "", "", "", ""},
                {"Shortcut Original Document Deleted", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 1", "I am automated test", "", "", PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF", "", "", "", ""},
                {"Shortcut Renamed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" + "Original Document Version: 2", "", "", "", "PermissionsPDF - Shortcut > RenamedFile", "", "", "", ""},
        };
    }

    @DataProvider
    public static Object[][] shortcutRequestSignatureAuditDataProvider() {

        return new String[][]{
                {"Document Signature Requested", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Addendum", "None"},
                {"Document Signature Request Reminder", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName() + " - ", "Acknowledge", "Addendum", "None"},
                {"Document Signature Request Removed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "Clinical Patient - clinicalpatientflo@gmail.com", "", "Acknowledge", "Addendum", "None"},
                {"Signature Request Declined", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF - Shortcut \n" +
                        "Original Document Version: 1", "", "", "", "", "", "Acknowledge", "", ""},
        };
    }

    @DataProvider
    public static Object[][] formDataProvider() {

        return new String[][]{

                {"financialDisclosure.pdf"}
        };
    }

    @DataProvider
    public static Object[][] signUpMandatoryFieldsProvider() {

        return new String[][]{

                {"fakeemail@email.com", "Nemanja", "Kosanovic", "Other", "Company", "Monitor", "Tester", "Password123", ""},
                {"fakeemail@email.com", "Nemanja", "Kosanovic", "Other", "Company", "Monitor", "Tester", "", "Password123"},
                {"fakeemail@email.com", "Nemanja", "Kosanovic", "Other", "Company", "Monitor", "", "Password123", "Password123"},
                {"fakeemail@email.com", "Nemanja", "Kosanovic", "Other", "Company", "", "Tester", "Password123", "Password123"},
                {"fakeemail@email.com", "Nemanja", "Kosanovic", "Other", "", "Monitor", "Tester", "Password123", "Password123"},
                {"fakeemail@email.com", "Nemanja", "Kosanovic", "", "Company", "Monitor", "Tester", "Password123", "Password123"},
                {"fakeemail@email.com", "Nemanja", "", "Other", "Company", "Monitor", "Tester", "Password123", "Password123"},
                {"fakeemail@email.com", "", "Kosanovic", "Other", "Company", "Monitor", "Tester", "Password123", "Password123"},
                {"", "Nemanja", "Kosanovic", "Other", "Company", "Monitor", "Tester", "Password123", "Password123"}

        };
    }

    @DataProvider
    public static Object[][] signInWrongDataProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getEmail(), "invalid password", ""},
                {PropertyManager.getInstance().getEmail(), "invalid password", "invalidpass"},
                {PropertyManager.getInstance().getEmail(), "invalid password", "123456"},
                {"fakeEmail@fakeEmail.fakeEmail", "incorrect signIn credentials", "Password123456"},
                {PropertyManager.getInstance().getEmail(), "incorrect signIn credentials", "Password123456"},
                {"", "invalid email", "Password123"},
                {"thisIsNotEmail@", "invalid email", "Password123"},
                {"123456", "invalid email", "Password123"},

        };
    }

    @DataProvider
    public static Object[][] taskNegativeDataProvider() {

        return new String[][]{

                {"Automation Title", "#e51c23", "#666666", "0", " "},
                {"Automation Title", "#666666", "#e51c23", "2001", "Automation Title"},
                {"Automation Title", "#e51c23", "#e51c23", "2001", " "},
                {"Automation Title", "#e51c23", "#666666", "0",
                        "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title"
                }

        };
    }

    @DataProvider
    public static Object[][] renameDocumentNegativeDataProvider() {

        return new String[][]{

                {"Permissions/", "#e51c23"},
                {"Permissions\\", "#e51c23"},
                {"Permissions:", "#e51c23"},
                {"Permissions>", "#e51c23"},
                {"Permissions<", "#e51c23"},
                {"Permissions\"", "#e51c23"},
                {"Permissions|", "#e51c23"},
                {"Permissions?", "#e51c23"},
                {"Permissions*", "#e51c23"},
                {" ", "#e51c23"},
                {
                        "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title" +
                                "Automation Title", "#666666"
                }
        };
    }

    @DataProvider
    public static Object[][] signDocumentAddendumNegativeProvider() {

        return new String[][]{

                {"", "", "#666666", ""},
                {"", "Florence20", "#666666", ""},
                {"Authorship", "twetrrtew", "#e51c23", ""},
                {"Approval", "", "#e51c23", ""},
                {"Authorship", "Florence20---", "#666666", "Invalid username, password combination."}

        };
    }

    @DataProvider
    public static Object[][] placeholderNegativeFillDataProvider() {

        return new String[][]{

                {"Permissions", "", "Permissions", ""},
                {"", "Document Move", "Permissions", ""},
                {"", "Document Duplicate", "Permissions", ""},
                {"", "Shortcut", "Permissions", ""},
                {"Permissions", "Document Move", "", "#e51c23"},
                {"PlaceholderDocument", "Document Move", "Permissions", ""}

        };
    }

    @DataProvider
    public static Object[][] announcementItemsDataProvider() {

        return new String[][]{

                {"Test Announcement"}

        };
    }


    @DataProvider
    public static Object[][] checkAnnouncementItemsFeaturesProvider() {

        return new String[][]{

                {"Test Announcement", "This is an automated test", PropertyManager.getInstance().getEmail(), "New placeholder"}

        };
    }

    @DataProvider
    public static Object[][] sendAnnouncementDataProvider() {

        return new String[][]{

                {"Test Announcement", "This is an automated test", PropertyManager.getInstance().getTestingBinder(),
                        PropertyManager.getInstance().getAutomation_accountName(), "New folder", "Permissions.jpg", "New placeholder"}

        };
    }

    @DataProvider
    public static Object[][] labelValuesProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getTestingBinder(), "Unique Protocol ID", "Monitor"}
        };
    }

    @DataProvider
    public static Object[][] tempBinderLabelValuesProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getTempBinder(), "Unique Protocol ID", "[empty]"}
        };
    }

    @DataProvider
    public static Object[][] setLabelValuesProvider() {

        return new String[][]{

                {"Unique Protocol ID", "Monitor"},
                {"Unique Protocol ID", "[empty]"},
                {"Unique Protocol ID", "Neki"},
                {"Unique Protocol ID", "Neki 2"},
        };
    }

    @DataProvider
    public static Object[][] documentLabelUploadProvider() {

        return new String[][]{

                {"Permissions.jpg", "Downloaded", "I Am Automated Test"}
        };
    }

    @DataProvider
    public static Object[][] tempBinderAndDocumentProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getTempBinder(), "PermissionsPDF.pdf"}
        };
    }


    @DataProvider
    public static Object[][] documentLabelRemoveProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getTestingBinder(), ": Monitor"}
        };
    }

    @DataProvider
    public static Object[][] tempBinderLabelRemoveProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getTempBinder(), ": [empty]"}
        };
    }

    @DataProvider
    public static Object[][] setDocumentLabelRemoveProvider() {

        return new String[][]{

                {": Monitor"},
                {": [empty]"},
                {": Neki"},
                {": Neki 2"},
        };
    }

    @DataProvider
    public static Object[][] setLabelsForQueryDataProvider() {

        return new String[][]{

                {"Monitor"},
                {"[empty]"},
                {"Neki"},
                {"Neki 2"},
        };
    }

    @DataProvider
    public static Object[][] assignTagToDocumentProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithExtension, "Chronical", "Wrong search"}
        };
    }

    @DataProvider
    public static Object[][] assignTagToDocumentShortcutProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension + " - Shortcut", "Chronical", "Wrong search"}
        };
    }

    @DataProvider
    public static Object[][] assignTimelineToDocumentShortcutProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension + " - Shortcut", "Protocol/Timeline", "Wrong search"}
        };
    }

    @DataProvider
    public static Object[][] teamMemberDataProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getClient_accountName(), PropertyManager.getInstance().getRegEmail(),
                        "Action Required! You've Been Invited to Join a Florence Team", "Senior"}
        };
    }

    @DataProvider
    public static Object[][] accessDatesReportDataProvider() {

        return new String[][]{

                {PropertyManager.getInstance().getClient_accountName(), "Senior", "Active"}
        };
    }

    @DataProvider
    public static Object[][] shortcutDataProvider() {

        return new String[][]{

                {PropertyBasicData.permissionsPDFWithoutExtension + " - Shortcut", PropertyManager.getInstance().getTestingBinder(), "I am automated test"}
        };
    }

    @DataProvider
    public static Object[][] multipleShortcutDataProvider() {

        return new String[][]{

                {"Florence eBinder User Permissions", "PermissionsPDFform", "PermissionsVersion2", "required-fields", "TextualFile", "Florence eBinder User Permissions - Shortcut", "PermissionsPDFform - Shortcut", "PermissionsVersion2 - Shortcut", "required-fields - Shortcut", "TextualFile - Shortcut"}
        };
    }

    @DataProvider
    public static Object[][] teamMemberUserPermissionsDataProvider() {

        return new String[][]{

                {"Clinical Patient", "Download Documents with PHI", "Manage Long-term Archive",
                        "Manage Monitor Reviews", "Manage Team and its Contents", "View Documents With PHI"}
        };
    }

    @DataProvider
    public static Object[][] queueBannerDataProvider() {

        return new String[][]{

                {"Start Signing", "Start Tasks", "My Signature Queue", "My Task Queue"}
        };
    }

    @DataProvider
    public static Object[][] textCSVDataProvider() {
        DateFormat localizedDateFormat = new SimpleDateFormat("dd-MMM-yyyy @ hh:mm a zzz");
        return new String[][]{

                {"Unique Protocol ID Item Name Location Last Modified By Last Modified Date Monitor PermissionsPDF " + PropertyManager.getInstance().getTestingBinder() + "/PermissionsPDF Automated Tests - automated.tests@florencehc.com " + localizedDateFormat.format(new Date()) + " "}
        };
    }


    @DataProvider
    public static Object[][] studyProfileDataProvider() {

        return new String[][]{

                {"Unique Protocol ID", "100", "Nickname", "100 - - pfizer-double-blind", "Sponsor", "SpoName", "CRO", "test cro name", "Device Drug", "test drug name", "Condition Disease", "test condition"}
        };
    }

    @DataProvider
    public static Object[][] invalidCharactersDataProvider() {

        return new String[][]{

                {"/"},
                {":"},
                {">"},
                {"<"},
                {"\""},
                {"|"},
                {"?"},
                {"*"},

        };
    }

    @DataProvider
    public static Object[][] invalidCharacters2DataProvider() {

        return new String[][]{

                {"/", "#e51c23"},
                {":", "#e51c23"},
                {">", "#e51c23"},
                {"<", "#e51c23"},
                {"\"", "#e51c23"},
                {"|", "#e51c23"},
                {"?", "#e51c23"},
                {"*", "#e51c23"},
                {"long", "#666666"},

        };
    }

    @DataProvider
    public static Object[][] invalidCharactersErrorMessages() {

        return new String[][]{

                {"/", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {":", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {">", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"<", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"\"", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"|", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"?", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"*", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"75486ynt75648ynt75yn5h748ynht754yht7546yth4576nyh57yhng7b" +
                        "65y4hg75647y5nb67yhn576ny5h67nyh5478hnyg5678yhng5678hygn657" +
                        "hygn57yhng578yh5ng7yn7ny575yh598hny79yg97nygh57yngh7yng" +
                        "579ytg56n7tyhg7b5tygnb75tygh5n79yg5nb9tyhb95tyn7g59byhg5n9by" +
                        "gnb579ybn59tybn9ygb579ybh79ybh579ybn579ybn79yb", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"Florence3", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"florence30", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"FlorenceFl", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"Florence!!", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"FLORENCE30", "RED", "Passwords must be at least 10 characters long, with an uppercase letter, a lowercase letter, and a number."},
                {"", "RED", "Password required."},
        };
    }

    @DataProvider
    public static Object[][] profileInvalidCharactersErrorMessages() {
        return new String[][]{
                {"75486ynt75648ynt75yn5h748ynht754yht7546yth4576nyh57yhng7b" +
                        "65y4hg75647y5nb67yhn576ny5h67nyh5478hnyg5678yhng5678hygn657" +
                        "hygn57yhng578yh5ng7yn7ny575yh598hny79yg97nygh57yngh7yng" +
                        "579ytg56n7tyhg7b5tygnb75tygh5n79yg5nb9tyhb95tyn7g59byhg5n9by" +
                        "gnb579ybn59tybn9ygb579ybh79ybh579ybn579ybn79yb", "RED"},
                {"", "RED"},
                {"/", "RED"},
                {":", "RED"},
                {">", "RED"},
                {"<", "RED"},
                {"\"", "RED"},
                {"|", "RED"},
                {"?", "RED"},
                {"*", "RED"},
        };
    }

    @DataProvider
    public Object[][] invalidCharacters() {
        return new String[][]{
                {"75486ynt75648ynt75yn5h748ynht754yht7546yth4576nyh57yhng7b" +
                        "65y4hg75647y5nb67yhn576ny5h67nyh5478hnyg5678yhng5678hygn657" +
                        "hygn57yhng578yh5ng7yn7ny575yh598hny79yg97nygh57yngh7yng" +
                        "579ytg56n7tyhg7b5tygnb75tygh5n79yg5nb9tyhb95tyn7g59byhg5n9by" +
                        "gnb579ybn59tybn9ygb579ybh79ybh579ybn579ybn79yb"},
                {""},
                {"/"},
                {":"},
                {">"},
                {"<"},
                {"\""},
                {"|"},
                {"?"},
                {"*"},
        };
    }
}

