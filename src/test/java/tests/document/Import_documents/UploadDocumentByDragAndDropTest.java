package tests.document.Import_documents;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.global_pages.NotificationsPage;
import pages.global_pages.SideBarPage;
import pages.main_pages.BindersPage;
import pages.main_pages.DocumentPage;
import tests.BaseWithLoginAndSelectingBinderTest;
import utilities.property.PropertyManager;

import static utilities.property.PropertyBasicData.permissionsPDFWithExtension;
import static utilities.property.PropertyBasicData.permissionsPDFWithoutExtension;

public class UploadDocumentByDragAndDropTest extends BaseWithLoginAndSelectingBinderTest {

    public SideBarPage sideBarPage;
    public NotificationsPage notificationsPage;
    public BindersPage bindersPage;
    public DocumentPage documentPage;

    //https://florencehc.atlassian.net/browse/EBS-7599
    //https://florencehc.atlassian.net/browse/EBS-7511
    @Test
    public void uploadDocumentByDragAndDrop() {

        sideBarPage = new SideBarPage(driver);
        notificationsPage = new NotificationsPage(driver);
        bindersPage = new BindersPage(driver);
        documentPage = new DocumentPage(driver);

        sideBarPage.dragAndDrop(PropertyManager.getInstance().getTestingFiles() + permissionsPDFWithExtension);

        try {
            notificationsPage.verifyNotificationWithName(permissionsPDFWithoutExtension, "StartsName");
            System.out.print("Document uploaded!\n");
        } catch (Exception e) {
            Assert.fail("Document isn't uploaded!\n" + e);
        }
        bindersPage.viewDocument(permissionsPDFWithoutExtension);
        documentPage.lastModifiedCheck();
        documentPage.documentImageLoad();
        documentPage.checkFileAttachmentDate();

    }

    @AfterMethod
    public void tearDown(){
        bindersPage.helperBinderCleanUp(PropertyManager.getInstance().getTestingBinder());
    }
}
