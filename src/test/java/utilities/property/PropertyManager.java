package utilities.property;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String authUrl;
    private static String email;
    private static String email_password;
    private static String login_user_data;
    private static String email_config;


    private static String password;
    private static String email_SAML;
    private static String password_SAML;
    private static String reg_email;
    private static String reg_password;


    private static String reg_password_for_email;
    private static String chromeDriverPath;
    private static String ieDriverPath;
    private static String extentReportsPath;
    private static String testingFiles;
    private static String macChromeDriverPath;
    private static String testing_binder;
    private static String temp_binder;
    private static String testing_team;
    private static String device_farm_arn;
    private static String automation_accountName;
    private static String client_accountName;

    public static PropertyManager getInstance() {

        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/test/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        url = prop.getProperty("url");
        authUrl = prop.getProperty("authUrl");
        email = prop.getProperty("login_email");
        email_password = prop.getProperty("email_password");
        password = prop.getProperty("login_password");
        email_SAML = prop.getProperty("login_email_SAML");
        password_SAML = prop.getProperty("login_password_SAML");
        chromeDriverPath = prop.getProperty("chromeDriverPath");
        ieDriverPath = prop.getProperty("ieDriverPath");
        reg_email = prop.getProperty("reg_email");
        reg_password = prop.getProperty("reg_password");
        reg_password_for_email = prop.getProperty("reg_password_for_email");
        extentReportsPath = prop.getProperty("extent_reports");
        testingFiles = prop.getProperty("testing_files");
        macChromeDriverPath = prop.getProperty("macChromeDriverPath");
        testing_binder = prop.getProperty("testing_binder");
        temp_binder = prop.getProperty("temp_binder");
        testing_team = prop.getProperty("testing_team");
        device_farm_arn = prop.getProperty("device_farm_arn");
        login_user_data = prop.getProperty("login_user_data");
        email_config = prop.getProperty("email_client");
        automation_accountName = prop.getProperty("automation_accountName");
        client_accountName = prop.getProperty("client_accountName");

        return instance;
    }

    public String getURL() {
        return url;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }
    public String getIEDriverPath() {
        return ieDriverPath;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAutomation_accountName() {
        return automation_accountName;
    }

    public String getClient_accountName() {
        return client_accountName;
    }

    public String getEmailSAML() {
        return email_SAML;
    }

    public String getPasswordSAML() {
        return password_SAML;
    }

    public String getRegEmail() {
        return reg_email;
    }

    public String getTempBinder() {
        return temp_binder;
    }

    public String getRegPassword() {
        return reg_password;
    }

    public String getExtentReportsPath() {
        return extentReportsPath;
    }

    public String getTestingFiles() {
        return testingFiles;
    }

    public String getMacChromeDriverPath() {
        return macChromeDriverPath;
    }

    public String getTestingBinder() {
        return testing_binder;
    }

    public String getRegPasswordForEmail() {
        return reg_password_for_email;
    }

    public String getTestingTeam() {
        return testing_team;
    }

    public String getDeviceFarmArn() {
        return device_farm_arn;
    }

    public String getEmail_password() {
        return email_password;
    }

    public String getUserData(String key) {
        String[] userData = login_user_data.split(",");
        String value = "";
        for (String s : userData) {
            if (s.startsWith(key)) {
                value = s.split(":")[1].trim();
                break;
            }
        }
        return value;
    }

    public String getEmailConfig(String key) {
        String[] config = email_config.split(",");
        String value = "";
        for (String s : config) {
            if (s.startsWith(key)) {
                value = s.split(":")[1].trim();
                break;
            }
        }
        return value;
    }
}
