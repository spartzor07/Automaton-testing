package utilities.property;

import org.testng.annotations.DataProvider;

public class DataProvidersLog {

    @DataProvider
    public static Object[][] baseLogDataProvider() {

        return new String[][]{

                {"Automation_test_Log"}
        };
    }

    @DataProvider
    public static Object[][] logBasicDetailsDataProvider() {

        return new String[][]{

                {"Automation_test_Log", "Automation investigator", "Automation study", "123", "Automation investigator updated", "Automation study updated", "321"}
        };
    }

    @DataProvider
    public static Object[][] logDetailsDataProvider() {

        return new String[][]{

                {"Automation_test_Log", "Automation investigator", "Automation study", "123", "Automation investigator updated", "Automation study updated", "321"}
        };
    }

    @DataProvider
    public static Object[][] logEntryDataProvider() {

        return new String[][]{

                {"Automation_test_Log", "Audit Trail", "Decline", "Edit", "Sign", "Request Signatures", "Automation log entry comment", "Automation entry", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "I am automated test"}
        };
    }

    @DataProvider
    public static Object[][] logEntryMultipleSignersDataProvider() {

        return new String[][]{

                {"Multiple Signatures Log", "Automation template", "Automation investigator", "Automation study", "123", "Request Signatures", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "Clinical Patient", "Automation log entry comment", "Automation test", "Approval"}
        };
    }

    @DataProvider
    public static Object[][] logDataProvider() {

        return new String[][]{

                {"Automation_test_Log", "I am automated test", PropertyManager.getInstance().getTempBinder(), "New log updated", "Automation template", "Downloaded", "Acknowledge", PropertyManager.getInstance().getAutomation_accountName(), "Clinical Patient"}
        };
    }

    @DataProvider
    public static Object[][] logCustomDetailsAndColumnDataProvider() {

        return new String[][]{

                {"Custom Details and Columns log", "Automation Custom Template", "Custom Detail 1", "Custom Column 2"}
        };
    }

    @DataProvider
    public static Object[][] logEntryAuditDataProvider() {

        return new String[][]{

                {"Log Entry Created", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "", "", ""},
                {"Log Entry Updated", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "Automation log entry comment", "", ""},
                {"Log Entry Signed", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "Signed for Acknowledge", "", ""},
                {"Log Entry Signature Requested", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "", "", ""},
                {"Log Entry Signature Request Declined", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "I am automated test", "", ""},
                {"Log Entry Signature Request Reminder", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTestingBinder()+"/Automation_test_Log Log Entry Row: 1", "", "", "", "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] logAuditDataProvider() {

        String binderName = PropertyManager.getInstance().getTestingBinder();
        return new String[][]{

                {"Log Created", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Viewed", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 7", "", "", "", "", "", "", "", ""},
                {"Document Marked as PHI", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 7", "", "", "", "", "", "", "", ""},
                {"Document Unmarked as PHI", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 7", "", "", "", "", "", "", "", ""},
                {"Log Downloaded", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 7", "", "", "", "", "", "", "", ""},
                {"Log Expiration Date Set", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Moved", PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getTempBinder()+"/Automation_test_Log Version: 2", "", "", "", "", "", "", "", ""},
                {"Log Renamed", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 1", "", "", "", "", "", "", "", ""},
                {"Log Signature Requested", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 2", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName()+" - ", "Acknowledge", "Log", "None"},
                {"Log Tags Updated", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 2", "", "", "", "", "", "", "", ""},
                  {"Log Details Updated", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 2", "Study Title: Automation study", "Unique Protocol ID: 123",
                        "Principal Investigator: Automation investigator", "Study Title: Automation study updated", "Unique Protocol ID: 321", "Principal Investigator: Automation investigator updated", "reason", ""},
                {"Log Signature Request Reminder", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 1", "", "", "", "", PropertyManager.getInstance().getAutomation_accountName()+" - ", "Acknowledge", "Log", "None"},
                {"Log Signature Request Removed", PropertyManager.getInstance().getEmail(), binderName + "/Automation_test_Log Version: 2", "", "", "", PropertyManager.getInstance().getAutomation_accountName()+" - automated.tests@florencehc.com", "", "Acknowledge", "Log", "None"}
        };
    }

    @DataProvider
    public static Object[][] assignTagToLogDataProvider() {

        return new String[][]{

                {"Automation_test_Log", "Chronical", "Wrong search"}
        };
    }
}

