import java.sql.*;

public class WristbandAlarm extends Mode {

	private Time time;
	private Time alarmTime;
	
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
	
	public void wakeUpTime()
	{
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
