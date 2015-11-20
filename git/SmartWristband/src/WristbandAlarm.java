import java.sql.*;

public class WristbandAlarm extends Mode {

	private Time time;
	private Time alarmTime;
	private boolean alarmOnOff;
	
	public WristbandAlarm()
	{
		time = null;
		alarmTime = null;
		alarmOnOff = false;
	}
	
	public void setTime(Time timeValue)
	{
		time = timeValue;
		return;
	}
	
	public Time getTime()
	{
		return time;
	}
	
	public void setAlarmTime(Time timeValue)
	{
		alarmTime = timeValue;
		return;
	}
	
	public Time getAlarmTime()
	{
		return alarmTime;
	}
	
	public void setAlarmOnOff(boolean alarmOn)
	{
		alarmOnOff = alarmOn;
		return;
	}
	
	public boolean getAlarmOnOff()
	{
		return alarmOnOff;
	}
	
	public void wakeUpTime()
	{
		if(getAlarmOnOff() == true)
		{
			Time wakeTime = getAlarmTime();
			Time presentTime = getTime();
			if (wakeTime == presentTime)
			{
				alarm();
			}
		}
		return;
	}
	
	public void alarm()
	{
		return;
	}
	public void movementCalculation()
	{
		return;
	}
}
