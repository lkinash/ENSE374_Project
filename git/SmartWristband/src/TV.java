
public class TV {

	private int channel;
	private int volume;
	private boolean TVonOff;
	
	public void setChannel(int channelValue)
	{
		channel = channelValue;
		return;
	}
	
	public int getChannel()
	{
		return channel;
	}
	
	public void setVolume(int volumeValue)
	{
		volume = volumeValue;
		return;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setTVOnOff(boolean isTVOn)
	{
		TVonOff = isTVOn;
		return;
	}
	
	public boolean getTVOnOff()
	{
		return TVonOff;
	}
	
	public TV()
	{
		channel = 0;
		volume = 0;
		TVonOff = false;
	}
	
	public void connectToNetwork()
	{
		return;
	}
	
}
