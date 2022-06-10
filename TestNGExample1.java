package com.TestNGAnnotations;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import com.FacebookAutomation.BaseTest;
	import com.FacebookAutomation.SignUpPage;
    import com.selenium.UploadDownload;

	public class TestNGExample1 extends BaseTest {

		private SignUpPage objSignUpPage;
		
		@BeforeClass
		public void initialialiseNewWeb() {
			objSignUpPage = new SignUpPage();
			objSignUpPage.intializationDriver("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9040245%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIme_306Gi-AIVFZ_CCh24fgt_EAAYASAAEgLO1PD_BwE");
		}
		

		
		@Test
		public void TC_01_VerifyFacebookFunctionality() {
			objSignUpPage.setFirstNameOfSignUpPage();
			objSignUpPage.setLastNameOfSignUpPage();
			objSignUpPage.passWord();
			
		}
		
		
		@Test
		public void TC_02_VerifyFileUploadAndDownload()  {
			UploadDownload objUploadDownload = new UploadDownload();
			objUploadDownload.intializationDriver("https://demoqa.com/upload-download");
			objUploadDownload.uploadFile();
	        objUploadDownload.fileDownload();
		}
		
		@AfterClass
		public void tearDown()  {
			objSignUpPage.tearDown();
			
		}
		
		
		
	}
