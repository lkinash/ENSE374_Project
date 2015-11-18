import java.sql.*;

public class Door {

	private boolean locked;
	private boolean open;
	private Time doorTimer;
	private Time closeTimer;
	
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
	
	public void setCloseTimer(Time setTime)
	{
		closeTimer = setTime;
		return;
	}
	
	public Time getDoorTimer()
	{
		return closeTimer;
	}
	
	public boolean checkLockedWatcher()
	{
		open.addActionListener(new ActionListener(){		
			
			public void actionPerformed(ActionEvent e){
			
				if(getOpen())
				{
					setCloseTimer(currentTime);
					closeTimer.addActionListener(new ActionListener(){		
			
						public void actionPerformed(ActionEvent e){
							
							if((currentTime - getCloseTimer()) > 5 )		//implying if it has been more than 5 minutes
							notifyUser("Door Open");
						
						}
					} );
				}
			}
		} );
		return false;
	}
	
	
	public boolean checkOpenWatcher()
	{
		locked.addActionListener(new ActionListener(){		
			
			public void actionPerformed(ActionEvent e){
			
				if(!getLocked())
				{
					setDoorTimer(currentTime);
					doorTimer.addActionListener(new ActionListener(){		
			
						public void actionPerformed(ActionEvent e){
							
							if((currentTime - getDoorTimer()) > 10 )		//implying if it has been more than 10 minutes
							lockDoor();
						
						}
					} );
				}
			}
		} );
		return false;
	}
	
	public void connectToNetwork()
	{
		return;
	}
	
	public void lockDoor()
	{
		
		return;
	}
	
	public void notifyUser(String message)
	{
		System.out.println(message);
		return;
	}
	
}
