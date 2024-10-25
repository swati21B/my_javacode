package poM.FBSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Source_FBLogin {
	WebDriver driver;
/*POM-> it is java design pattern. Which helps to prevent stale element reference exception. stale element means the element is no longer interactable and modified the html of the web page.
So that we can locate our element just once and utilise it many times.
Ex: UN field written in 50 scenarios and without POM we need to change element located to all scenarios where we used. With POM, we can write it once in single class and use it to different test cases*/
//In the source package all the web pages in the form of classes will be present here

//Step 1: locating each element with @FindBy annotation
@FindBy(xpath="//input[@name='email']")
WebElement username;
@FindBy(xpath="//input[@name='pass']")
WebElement password;
@FindBy(id="loginbutton")
WebElement loginButton;

//Step 2: create separate method for each element located to perform it's action
public void un()
{
	username.sendKeys("9881469855");
}
public void pwd()
{
	password.sendKeys("Test@12345");
}
public void buttonlogin()
{
	loginButton.click();;
}
/*
 In the POM concept, what will happen if we do not initialize the elements
Ans->We got the NullPointerException
 */
//Step 3: initialising the elements with PageFactory class inside the constructor
public Source_FBLogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
