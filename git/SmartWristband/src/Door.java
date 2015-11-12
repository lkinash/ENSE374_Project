import java.sql.*;

public class Door {

	private boolean locked;
	private boolean open;
	private Time doorTimer;
	
	public Door()
	{
		locked = false;
		open = false;
		doorTimer = null;
	}
	
	public void setLocked(boolean isLocked)
	{
		locked = isLocked;
		return;
	}
	
	public boolean getLocked()
	{
		return locked;
	}
	
	public void setOpen(boolean isOpen)
	{
		open = isOpen;
		return;
	}
	
	public boolean getOpen()
	{
		return open;
	}
	
	public void setDoorTimer(Time setTime)
	{
		doorTimer = setTime;
		return;
	}
	
	public Time getDoorTimer()
	{
		return doorTimer;
	}
	
	public boolean checkLockedWatcher()
	{
		return false;
	}
	
	public boolean checkOpenWatcher()
	{
		return false;
	}
	
}
