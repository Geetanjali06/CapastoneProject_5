package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import baseLayer.BaseClass;

public class DateAndTime extends BaseClass{
	public static String captureCurrentYear() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}

	public static String captureCurrentMonthAndYear() {
		return new SimpleDateFormat("MMyyyy").format(new Date());
	}

	public static String captureCurrentDateAndTime() {
		return new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
	}

}
