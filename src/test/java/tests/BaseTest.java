package tests;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.devicefarm.DeviceFarmClient;
import software.amazon.awssdk.services.devicefarm.model.CreateTestGridUrlRequest;
import software.amazon.awssdk.services.devicefarm.model.CreateTestGridUrlResponse;
import utilities.property.PropertyManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setup (@Optional("chrome") String Browser) throws MalformedURLException {
        switch (Browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getChromeDriverPath());
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", PropertyManager.getInstance().getIEDriverPath());
                InternetExplorerOptions explorerOptions = new InternetExplorerOptions();
                explorerOptions.requireWindowFocus();
                explorerOptions.destructivelyEnsureCleanSession();
                explorerOptions.disableNativeEvents();
                driver = new InternetExplorerDriver(explorerOptions);
                break;
            case "mac_chrome":
                System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getMacChromeDriverPath());
                driver = new ChromeDriver();
                break;
            case "device_farm_windows_chrome":
                DeviceFarmClient client  = DeviceFarmClient.builder().region(Region.US_WEST_2).build();
                CreateTestGridUrlRequest request = CreateTestGridUrlRequest.builder()
                    .expiresInSeconds(300)
                    .projectArn(PropertyManager.getInstance().getDeviceFarmArn())
                    .build();

                URL testGridUrl = null;
                try {
                    CreateTestGridUrlResponse response = client.createTestGridUrl(request);
                    testGridUrl = new URL(response.url());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName","chrome");
                capabilities.setCapability("browserVersion", "latest");
                capabilities.setCapability("platform", "windows");

                driver = new RemoteWebDriver(testGridUrl, capabilities);
                //((RemoteWebDriver)driver).setFileDetector(new LocalFileDetector());
                break;
            default:
                System.out.print("Browser is not selected!\n");
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    public void browserBackButton() {
        driver.navigate().back();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void waitInMilliSeconds(int number) {
        try {
            Thread.sleep(number);
        } catch (InterruptedException ignored) {
        }
    }

    public void implicitWait(int i) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
    }


//    @AfterSuite(enabled = false)
//    public void afterSuiteCleanUp () throws EmailException {
//        EmailManager.SendEmail("automated.tests@florencehc.com","stefan.mitrovic@florencehc.com","Regression test","Regression test report",
//                "reports/SmokeTestReport.html","SmokeTestReport");
//    }

    @AfterClass(alwaysRun = true)
    public void teardown () {
        driver.quit();
    }
}
