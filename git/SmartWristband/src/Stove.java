import java.sql.*;

public class Stove {

	private boolean stoveOnOff;
	private Time stoveTimer;
	private int preheatTemp;
	
	public Stove()
	{
		stoveOnOff = false;
		stoveTimer = null;
		preheatTemp = 0;
	}
	
	public void setPreheatTemp(int tempValue)
	{
		return;
	}
	
	public int getPreheatTemp()
	{
		return preheatTemp;
	}
	
	public void setStoveTimer(Time timeValue)
	{
		return;
	}
	
	public Time getStoveTimer()
	{
		return stoveTimer;
	}
	
	public void setStoveOnOff(boolean stoveON)
	{
		return;
	}
	
	public boolean getStoveOnOff()
	{
		return stoveOnOff;
	}

	
}
