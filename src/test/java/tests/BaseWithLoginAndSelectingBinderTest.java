package tests;

import org.testng.annotations.BeforeClass;
import pages.main_pages.SelectTeamPage;
import pages.main_pages.TeamPage;
import utilities.property.PropertyManager;

public class BaseWithLoginAndSelectingBinderTest extends BaseWithLoginTest {


    public SelectTeamPage selectTeamPage;
    public TeamPage teamPage;

    @BeforeClass
    public void selectTeamAndBinder() {

        selectTeamPage = new SelectTeamPage(driver);
        teamPage = new TeamPage(driver);

        selectTeamPage.selectTeam(PropertyManager.getInstance().getTestingTeam());
        teamPage.waitForAngular();
        teamPage.openBinder(PropertyManager.getInstance().getTestingBinder());
    }
}
