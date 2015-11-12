
public class Mode{

	private int ledColour;
	private char mode;
	private boolean ledSecondaryOnOff;
	
	public void setLedColour(int colour)
	{
		ledColour = colour;
		return;
	}
	
	public int getLedColour()
	{
		return ledColour;
	}
	
	public void set ledSecondaryOnOff(boolean onOffLed)
	{
		ledSecondaryOnOff = onOffLed;
		return;
	}
	
	public boolean getLedSecondaryOnOff()
	{
		return ledSecondaryOnOff;
	}
	
	public void setMode(char modeName)
	{
		mode = modeName;
		return;
	}
	public char getMode()
	{
		return mode;
	}
	
	public void changeMode(char modeName)
	{
		return;
	}
	
	public void ledChange(int colour)
	{
		return;
	}
	
	public void buttonUpPress()
	{
		return;
	}
	
	public void buttonDownPress()
	{
		return;
	}
	
	public void buttonPlusPress()
	{
		return;
	}
	
	public void buttonMinusPress()
	{
		return;
	}
	
	public void buttonModePress()
	{
		return;
	}
	
}
