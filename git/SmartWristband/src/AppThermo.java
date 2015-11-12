
public class AppThermo {

	private double newTemp; 
	private double averageUserTemp;
	
	public void setNewTemp(double tempValue)
	{
		newTemp = tempValue;
		return;
	}
	
	public void setAverageUserTemp(double temp)
	{
		averageUserTemp = temp;
		return;
	}
	
	public double getNewTemp()
	{
		return newTemp;
	}
	
	public double getAverageUserTemp()
	{
		return averageUserTemp;
	}
	
	public double calculateNewTemp()
	{
		return 1;
	}
	
	public void adjustThermo(double tempValue)
	{
		return;
	}
	
	public double calculateAverageUserTemp()
	{
		return 1;
	}
	
	
}
