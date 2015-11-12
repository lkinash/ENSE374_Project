
public class WristbandThermostat extends Mode{

	private double userTemp;
	
	public void setUserTemp(double userTempValue)
	{
		userTemp = userTempValue;
		return;
	}
	
	public double getUserTemp()
	{
		return userTemp;
	}
	
	public void tempChecker()
	{
		return;
	}
}
