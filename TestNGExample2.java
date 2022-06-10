package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.FacebookAutomation.BaseTest;
import com.selenium.CheckBox;
import com.selenium.SliderEx;

public class TestNGExample2 extends BaseTest {

	private SliderEx objSliderEx;

	@BeforeTest
	public void initialialiseNewWeb() {
		SliderEx objSliderEx= new SliderEx();
		objSliderEx.intializationDriver("https://jqueryui.com/slider/");
	}

	
	
	@Test
	public void TC_01_slider()  {
		objSliderEx.slider();
	}
	
	@Test
	public void TC_02_VerifyCheckbox() {
	CheckBox objCheckBox = new CheckBox();
	objCheckBox.intializationDriver("https://demoqa.com/checkbox");
	objCheckBox.selectHomeButton();
	objCheckBox.selectDesktopButton();
	objCheckBox.selectDocumentsButton();
	objCheckBox.checkDocuments();
	objCheckBox.verifyIsDisplayedAction();
	objCheckBox.verifyIsEnabledAction();
	objCheckBox.verifyIsSelectedAction();
	
}

		
	@AfterTest
	public void tearDown()  {
		
		objSliderEx.tearDown();
		
	}
	}
	
	
	
