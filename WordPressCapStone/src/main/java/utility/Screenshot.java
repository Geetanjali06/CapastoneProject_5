package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;

public class Screenshot extends BaseClass{

	public static String takeScreenshot(String folderName, String screenshotName) {
		String destinationPath = System.getProperty("user.dir") + "//" + folderName + "//"
				+ DateAndTime.captureCurrentMonthAndYear() + "//" + DateAndTime.captureCurrentMonthAndYear() + "//"
				+ screenshotName + DateAndTime.captureCurrentDateAndTime() + ".png";

		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File(destinationPath));
		} catch (Exception e) {

			e.printStackTrace();
		}

		return destinationPath;

	}

}
