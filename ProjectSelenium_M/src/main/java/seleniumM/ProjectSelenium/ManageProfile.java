package seleniumM.ProjectSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageProfile {
	WebDriver driver;
	
@FindBy(id="nav-link-accountList")
WebElement AccountLists;

@FindBy(xpath="//button[.='Manage Profiles']")
WebElement ManageProfile;

@FindBy(linkText="View")
WebElement viewB;

@FindBy(xpath="//button[.='Edit your details']")
WebElement EditProfile;

@FindBy(id="editProfileNameInputId")
WebElement EditProfileName;

@FindBy(xpath="//span[@id='editProfileContinueButton']")
WebElement Continue_Profile;

public void AccountsHover(WebDriver driver)
{
	Actions a1 = new Actions(driver);
	a1.moveToElement(AccountLists).perform();	
}
public void ManageProfileLink()
{
	ManageProfile.click();
}

public void WhoisShoppingW()
{
	viewB.click();
}
public void EditButton()
{
	EditProfile.click();
}

public void ProfileNamewindow()
{
	EditProfileName.clear();
	EditProfileName.sendKeys("Swati P Wandhare");
	Continue_Profile.click();
}

public void VerifywithAssert(WebDriver driver)
{
	Assert.assertEquals(driver.getTitle(), "Profile Hub", "You are not redirected to Profile page");
}

public ManageProfile(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
