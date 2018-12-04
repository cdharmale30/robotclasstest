package com.downlodfilebyrobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDownload {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");

		driver.findElement(By.xpath("//a[contains(text(),'animatedcolors.xlsm')]")).click();
		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("1111111111111111111");
				System.out.println("1111111111111111111");

	}

}
