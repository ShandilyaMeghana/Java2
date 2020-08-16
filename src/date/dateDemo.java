package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args){
	Date d = new Date();
	//Date of util package is required
	
	System.out.println(d.toString());
	SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
	//the simple date format is created for customised date format variations
	System.out.println(sdf.format(d));
}
}
