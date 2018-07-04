package crud;

import java.util.GregorianCalendar;

public class CreateData {
	
	
	public CreateData()
	{
		
	}
	
	
	public long dateToMilis(int year,int month, int date)
	{
		GregorianCalendar gc=new GregorianCalendar();
		gc.set(year, month,date);
		return gc.getTimeInMillis();
	}
}
