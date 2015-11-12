import java.sql.*;

public class AppStove {

	private int preheatTemp;
	private Time stoveTimer;
	
	public void setPreheatTemp(int tempValue)
	{
		preheatTemp = tempValue;
		return;
	}
	
	public int getPreheatTemp()
	{
		return preheatTemp;
	}
	
	public void setStoveTimer(Time timerValue)
	{
		stoveTimer = timerValue;
		return;
	}
	
	public Time getStoveTimer()
	{
		return stoveTimer;
	}
	
	public AppStove()
	{
		preheatTemp = 0;
		stoveTimer = null;
	}
	
	public void stoveOff()
	{
		return;
	}
	
	public void preheatStove()
	{
		return;
	}
}
