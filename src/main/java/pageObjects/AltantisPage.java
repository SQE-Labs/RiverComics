package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class AltantisPage extends BasePage{
	
	private By playButton= By.id("com.river.comics.us:id/motionPlayer");
	
	
	
	
	
	
	public void click_play_button_Episode1() throws InterruptedException
	{
		click(playButton);
	}

}
