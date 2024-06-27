package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//a[@href='https://wordpress.org/download/']/child::span")
	private WebElement wordpress;
	
	@FindBy(xpath="//h1[text()='Get WordPress']")
	private WebElement wordpressText;
	
	@FindBy(xpath="//a[text()='Download WordPress 6.5.4']")
	private WebElement downloadwordpress;
	
	@FindBy(xpath="//button[@class='wp-block-navigation-item__content wp-block-navigation-submenu__toggle']/child::span[text()='Community']")
	private WebElement communityTab;
	
	@FindBy(xpath="//a[@href='https://wordpress.org/photos/']")
	private WebElement photoDirectory;
	
	@FindBy(xpath="//a[text()='Photos'][@href='https://wordpress.org/photos/']")
	private WebElement photos;
	
	@FindBy(xpath="//input[@id='s']")
	private WebElement searchphotos;
	
	@FindBy(css=".photo-listing img")
	private List<WebElement> pictures;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	// Get the visible text on the page
	public void clickOnGetWordPress(){
		wordpress.click();

	}
//	Get text
	public String visibleText() {
		
		 return wordpressText.getText();
	}
	// Get the actual title of the page
	public String getTitle() {
		 return driver.getTitle();
	}
	public void hoverOnDownload() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(downloadwordpress).build().perform();
		Thread.sleep(5000);
	}
	
	public void clickcommunityTab() {
		communityTab.click();
		
	}
	public String clickOnPicture() {
		photoDirectory.click();
		return photos.getText();
		
	}
	public void searchPhoto() throws InterruptedException {
		
		searchphotos.sendKeys("Coffee");
		searchphotos.submit();
		Thread.sleep(5000);
	}
	public int seePictures() {
	
	return pictures.size();
	}
    
	
}
