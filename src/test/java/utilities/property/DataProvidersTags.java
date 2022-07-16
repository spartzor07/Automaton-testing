package utilities.property;

import org.testng.annotations.DataProvider;

public class DataProvidersTags {

    @DataProvider
    public static Object[][] baseTagDataProvider() {

        return new String[][]{

                {"Test_automation_tag"}
        };
    }

    @DataProvider
    public static Object[][] tagDataProviderNegative() {

        return new String[][]{
                {"#", ""},
                {"!", "Automated test"},
                {">", "Automated test"},
                {"^", "Automated test"},
                {"", "Automated test"}
        };
    }

    @DataProvider
    public static Object[][] tagReportsDataProvider() {

        return new String[][]{
                {"Test_automation_tag", "LogForTagReports"}
        };
    }
}

