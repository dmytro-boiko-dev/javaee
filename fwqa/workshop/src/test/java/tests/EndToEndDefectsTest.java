package tests;

import com.cumulus.driver.DriverManager;
import com.cumulus.pages.defects.*;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.pages.main.MainPage;
import com.cumulus.utils.reporting.AllureListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.cumulus.constants.Constants.BASE_WORKSHOP_URL;


@Listeners(AllureListener.class)
public class EndToEndDefectsTest {

    private FleetDetailsSectionPage fleetDetailsSectionPage;
    private ComponentrySectionPage componentrySectionPage;
    private ReasonsSectionPage reasonsSectionPage;
    private NotesSectionPage notesSectionPage;
    private JobCardAssignmentSectionPage jobCardAssignmentSectionPage;
    private SaveSectionPage saveSectionPage;
    private MainPage mainPage;
    private LoginPage loginPage;


    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        fleetDetailsSectionPage = new FleetDetailsSectionPage(driver);
        componentrySectionPage = new ComponentrySectionPage(driver);
        reasonsSectionPage = new ReasonsSectionPage(driver);
        notesSectionPage = new NotesSectionPage(driver);
        jobCardAssignmentSectionPage = new JobCardAssignmentSectionPage(driver);
        saveSectionPage = new SaveSectionPage(driver);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        driver.get(BASE_WORKSHOP_URL);
    }

    @AfterClass
    public void close() {
        DriverManager.closeDriver();
    }

    @Test
    public void fleetDetailsSectionVerification() throws InterruptedException {
        loginPage.loginToPlatform("freesup", "obscure");
        mainPage.openDefectsMenu();
        // First Step
        testFleetDetailsSectionPage();
        // Second Step
        testComponentrySectionPage();
        // Third Step
        testReasonsSectionPage();
        // Forth Step
        testNotesSectionPage();
        // Fifth Step
        testJobCardAssigmentSectionPage();
        // Final Step
        testSaveSectionPage();
    }

    @Step("Fleet details selection step")
    private void testFleetDetailsSectionPage() throws InterruptedException {
        final String mileage = "2000";
        fleetDetailsSectionPage.chooseDefectType();
        fleetDetailsSectionPage.selectDriver();
        fleetDetailsSectionPage.selectFleetNumber();
        fleetDetailsSectionPage.typeMileage(mileage);
        fleetDetailsSectionPage.clickNextButton();
    }

    @Step("Componentry details selection step")
    private void testComponentrySectionPage() throws InterruptedException {
        componentrySectionPage.selectType();
        componentrySectionPage.selectSubType();
        componentrySectionPage.selectComponent();
        componentrySectionPage.selectPosition();
        componentrySectionPage.clickNextButton();
    }

    @Step("Reasons details selection step")
    private void testReasonsSectionPage() throws InterruptedException {
        reasonsSectionPage.selectFirstReason();
        reasonsSectionPage.selectSecondReason();
        reasonsSectionPage.selectCriticality();
        reasonsSectionPage.selectTask();
        reasonsSectionPage.clickNextButton();
    }

    @Step("Notes details selection step")
    private void testNotesSectionPage() throws InterruptedException {
        final String estimatedValue = "15",
                runningCardValue = "Test Running Card",
                dutyNumberValue = "Duty No",
                roadNumberValue = "Test Road Number";
        notesSectionPage.enterEstimatedValue(estimatedValue);
        notesSectionPage.enterRunningCard(runningCardValue);
        notesSectionPage.enterDutyNumber(dutyNumberValue);
        notesSectionPage.enterRoadNumber(roadNumberValue);
        notesSectionPage.clickNextButton();
    }

    @Step("JobCard details selection step")
    private void testJobCardAssigmentSectionPage() throws InterruptedException {
        final String jobCardAssignmentValue = "Create new jobcard";
        jobCardAssignmentSectionPage.chooseJobCardAssignment(jobCardAssignmentValue);
        jobCardAssignmentSectionPage.chooseJobCardStyle();
        jobCardAssignmentSectionPage.clickNextButton();
    }

    @Step("Final Defect saving step")
    private void testSaveSectionPage() throws InterruptedException {
        saveSectionPage.clickFinishButton();
    }
}
