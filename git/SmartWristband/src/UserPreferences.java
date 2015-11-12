import java.sql.*;

public class UserPreferences {

	private int user;
	private Time alarmTime;
	private int favoriteChannel;
	private double favoriteTemp;
	
	public int getUser()
	{
		return user;
	}
	
	public Time getAlarmTime()
	{
		return alarmTime;
	}
	
	public int getFavoriteChannel()
	{
		return favoriteChannel;
	}
	
	public double getFavoriteTemp()
	{
		return favoriteTemp;
	}
	
	public void setUser(int userNumber)
	{
		user = userNumber;
		return;
	}
	
	public void setAlarmTime(Time timeOfAlarm)
	{
		alarmTime = timeOfAlarm;
		return;
	}
	
	public void setFavoriteChannel(int favoriteChannelNumber)
	{
		favoriteChannel  = favoriteChannelNumber;
		return;
	}
	
	public void setFavoriteTemp(double favoriteTempNumber)
	{
		favoriteTemp = favoriteTempNumber;
		return;
	}
	
	public void connectToNetwork()
	{
		return;
	}
}
